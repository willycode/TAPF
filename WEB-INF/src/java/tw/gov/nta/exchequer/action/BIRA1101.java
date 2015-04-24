package tw.gov.nta.exchequer.action;

import gov.dnt.tame.common.ExcelReportBaseAction;

import java.math.BigDecimal;
import java.sql.Connection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.struts.action.ActionForm;

import tw.gov.nta.exchequer.form.Bira1101Form;

import com.kangdainfo.ast.sql.ConnectionSQLRunner;
import com.kangdainfo.ast.sql.SQLJob;
import com.kangdainfo.ast.sql.SQLRunner;

public class BIRA1101 extends ExcelReportBaseAction{
	
	protected SQLJob delTemp(ActionForm form,String usrId){
		SQLJob sqljob = new SQLJob();
		sqljob.appendSQL("DELETE FROM BIRA11_RPT ");
		//sqljob.appendSQL("WHERE USRID=?");
		System.out.println(sqljob.toString());
		return sqljob;
	}
	
	//�Dsql
	protected SQLJob SQL1(ActionForm form){
		Bira1101Form myForm = (Bira1101Form)form;
		
		SQLJob sqljob = new SQLJob();
		sqljob.appendSQL("select datediff(dd,��.repay_date,i.due_date) as date_period,"); //�Ѵ�
		sqljob.appendSQL("datediff(dd,i.issue_date,i.due_date) as due_period,");//�o��Ѵ�
		sqljob.appendSQL("isNull(c.sell_amount,0) as issue_amount, "); //�o���B
		sqljob.appendSQL("isNull(c.sell_rate,0)/100 as account_rate, "); //�Ц^�Q�v
		sqljob.appendSQL("b.bank_name as unit_code, "); //�X����Ȧ�W�r
		sqljob.appendSQL("c.issue_price as issue_price, "); //�o�����
		sqljob.appendSQL("c.free_amount as free_amount, "); //�K�|�B
		sqljob.appendSQL("b.id as bank_id, "); //�X����N�X
		sqljob.appendSQL("i.debt_name as debt_name, "); //�o����O
		sqljob.appendSQL("i.issue_date as issue_date, "); //�o����
		sqljob.appendSQL("i.due_date as due_date, "); //������
		sqljob.appendSQL("(select min(repay_date) from payment_main p where p.issue_id = i.id) as repay_date "); //�����R�^���
				
		sqljob.appendSQL("from issue_main i, central_debt_det c, central_bank_ref b, payment_main p");
		if (!"".equals(myForm.getIssueId()))	{
			sqljob.appendSQL("where i.id = ?");
			sqljob.addParameter(myForm.getIssueId());
		}
		sqljob.appendSQL("and c.unit_code = b.id");
		sqljob.appendSQL("and c.issue_id = i.id");
		sqljob.appendSQL("and p.issue_id = i.id");
		sqljob.appendSQL("and p.repay_date < i.due_date and p.capital_serial=(select min(p.capital_serial) from payment_main p where p.issue_id = i.id and p.capital_serial <> 0)");
		sqljob.appendSQL("and interest_days = (select min(interest_days) from payment_main p where p.issue_id = i.id)");
		sqljob.appendSQL("Order by account_rate DESC, issue_price DESC");
		System.out.println(sqljob);
		return sqljob;
	}
	@SuppressWarnings("unchecked")
	public void executeQuery(ActionForm form, HttpServletRequest request,
			Connection connection) throws Exception {
		
		Bira1101Form myForm =(Bira1101Form) form;
		
		//���o�ϥΪ̱b��
		String usrId = this.getUserId(request);
		//���oSQLRunner
		SQLRunner run = new ConnectionSQLRunner(connection); 
		//���� delete 
		run.update(connection,delTemp(form,usrId)); 
		//����insert
		List tList = (List) run.query(SQL1(myForm), new MapListHandler());
		Map tMap = null;
		
		
		for(Iterator tIterator = tList.iterator(); tIterator.hasNext(); )
		{
			//���Map
			tMap = (Map) tIterator.next();
			Map dMap = new HashMap();
			BigDecimal tmp3_1 = new BigDecimal(0);
			BigDecimal tmp7_1 = new BigDecimal(0);
			BigDecimal tmp8_1 = new BigDecimal(0);
			BigDecimal tmp8_2 = new BigDecimal(0);
			BigDecimal tmp10_1 = new BigDecimal(0);
			BigDecimal tmp10_2 = new BigDecimal(0);
			BigDecimal tmp13_1 = new BigDecimal(0);
			BigDecimal tmp13_2 = new BigDecimal(0);
			BigDecimal tmp13_3 = new BigDecimal(0);
			BigDecimal tmp13_4 = new BigDecimal(0);
			BigDecimal tmp14_1 = new BigDecimal(0);
			BigDecimal tmp14_2 = new BigDecimal(0);
			BigDecimal tmp14_3 = new BigDecimal(0);
			BigDecimal tmp14_4 = new BigDecimal(0);

			dMap.putAll(getCommonMap(usrId));

					
			//(1)�X����
			dMap.put("bank_name",(String)tMap.get("unit_code"));
					
			//(2)���B
			dMap.put("getbid_amount",(BigDecimal)tMap.get("issue_amount"));
					
			//(3)�C�U������ 10000*(1-SQL1.average_rate*Date_period/365)
			//--SQL1.average_rate*Date_period/365
			tmp3_1 = ((BigDecimal)tMap.get("issue_price"));
			dMap.put("issue_price",tmp3_1);
					
			//(4)�ֿn�K�|�B 
			dMap.put("free_amount",((BigDecimal)tMap.get("free_amount")));
					
			//(5)�Ц^�Q�v 
			dMap.put("account_rate",(((BigDecimal) tMap.get("account_rate"))));

			
			//(6)��l���� (2)*(3)/10000
			dMap.put("orginal_amount",((BigDecimal)dMap.get("getbid_amount")).multiply((BigDecimal)dMap.get("issue_price")).divide(new BigDecimal(10000),4,5));		

			//(7)�ХX�Q�v 365/SQL1.due_period*((2)/(6)-1)*100
			//--((2)/(6)-1)
			tmp7_1 = ((BigDecimal)dMap.get("getbid_amount")).divide((BigDecimal)dMap.get("orginal_amount"),20,5).subtract(new BigDecimal(1));
			dMap.put("repay_rate",(new BigDecimal(365)).divide(new BigDecimal((Integer)tMap.get("due_period")),20,5).multiply(tmp7_1).multiply(new BigDecimal(100)).divide(new BigDecimal(100),20,5));
			
			//(8)�R�^��(���ХX�Q�v) ((2)-((2)-(6))*0.2+(4)) / (1+(7)*0.8*SQL1.date_period/365)		
			if (((Integer)tMap.get("bank_id"))== 64){		
				//--(2)
				tmp8_1 = ((BigDecimal)dMap.get("getbid_amount"));
				//--(7)*SQL1.data_period/365
				tmp8_2 = ((BigDecimal)dMap.get("repay_rate")).multiply(new BigDecimal((Integer)tMap.get("date_period"))).divide(new BigDecimal(365),20,5);
				
				dMap.put("buy_price1",((BigDecimal)dMap.get("getbid_amount")).divide((new BigDecimal(1).add(tmp8_2)),4,5));
	
			}
			else{
			//--((2)-(6))*0.2
			tmp8_1 = (((BigDecimal)dMap.get("getbid_amount")).subtract((BigDecimal)dMap.get("orginal_amount"))).multiply(new BigDecimal(0.2));
			//--(7)*0.8*SQL1.data_period/365
			tmp8_2 = ((BigDecimal)dMap.get("repay_rate")).multiply((new BigDecimal(0.8))).multiply(new BigDecimal((Integer)tMap.get("date_period"))).divide(new BigDecimal(365),20,5);
			dMap.put("buy_price1",(((BigDecimal)dMap.get("getbid_amount")).subtract(tmp8_1).add((BigDecimal)dMap.get("free_amount"))).divide((new BigDecimal(1).add(tmp8_2)),4,5));
			}
			
			//(10)�R�^��(���Ц^�Q�v) ((2)-((2)-(6))*0.2+(4)) / (1+(5)*0.8*SQL1.data_period/365)
			if (((Integer)tMap.get("bank_id"))== 64){	
				//--((2)-(6))
				tmp10_1 = ((BigDecimal)dMap.get("getbid_amount"));
				//--(5)*SQL1.data_period/365
				tmp10_2 = ((BigDecimal)dMap.get("account_rate")).multiply(new BigDecimal((Integer)tMap.get("date_period"))).divide(new BigDecimal(365),20,5);
				dMap.put("buy_price2",((BigDecimal)dMap.get("getbid_amount")).divide((new BigDecimal(1).add(tmp10_2)),4,5));
			}
			else{
				//--((2)-(6))*0.2
				tmp10_1 = (((BigDecimal)dMap.get("getbid_amount")).subtract((BigDecimal)dMap.get("orginal_amount"))).multiply(new BigDecimal(0.2));
				//--(5)*0.8*SQL1.data_period/365
				tmp10_2 = ((BigDecimal)dMap.get("account_rate")).multiply((new BigDecimal(0.8))).multiply(new BigDecimal((Integer)tMap.get("date_period"))).divide(new BigDecimal(365),20,5);
				dMap.put("buy_price2",(((BigDecimal)dMap.get("getbid_amount")).subtract(tmp10_1).add((BigDecimal)dMap.get("free_amount"))).divide((new BigDecimal(1).add(tmp10_2)),4,5));
			}
			
			//(12)�ꥻ�Q�o�ηl�� (8)-(10)
			dMap.put("sub_price",((BigDecimal)dMap.get("buy_price1")).subtract((BigDecimal)dMap.get("buy_price2")));
			
			//(13)�e��|��(���ХX�Q�v)((8)-(6)-(4)*5)/4
			if (((Integer)tMap.get("bank_id")) == 64)
				dMap.put("pre_tax1",new BigDecimal(0));
			else
			{
				tmp13_1=((BigDecimal)dMap.get("buy_price1")).subtract((BigDecimal)dMap.get("orginal_amount"));
				tmp13_4=((BigDecimal)dMap.get("free_amount")).multiply(new BigDecimal(5));
				tmp13_2=(tmp13_1.subtract(tmp13_4));
				tmp13_3=tmp13_2.divide(new BigDecimal(4),4,5);
				dMap.put("pre_tax1",tmp13_3);
			}
			
			//(14)�e��|��(���Ц^�Q�v)((10)-(6)-(4)*5)/4
			if (((Integer)tMap.get("bank_id")) == 64)
				dMap.put("pre_tax2",new BigDecimal(0));
			else
				tmp14_1=((BigDecimal)dMap.get("buy_price2")).subtract((BigDecimal)dMap.get("orginal_amount"));
				tmp14_4=((BigDecimal)dMap.get("free_amount")).multiply(new BigDecimal(5));
				tmp14_2=(tmp14_1.subtract(tmp14_4));
				tmp14_3=tmp14_2.divide(new BigDecimal(4),4,5);
				dMap.put("pre_tax2",tmp14_3);

			
			//(15)�|�t(13)-(14)
			dMap.put("tax",((BigDecimal)dMap.get("pre_tax1")).subtract((BigDecimal)dMap.get("pre_tax2")));
			
			//(16)�R�i�`����(���ХX�Q�v)(8)+(13)
			dMap.put("buy1",((BigDecimal)dMap.get("buy_price1")).add((BigDecimal)dMap.get("pre_tax1")));
			
			//(17)�R�i�`����(���Ц^�Q�v)(10)+(14)
			dMap.put("buy2",((BigDecimal)dMap.get("buy_price2")).add((BigDecimal)dMap.get("pre_tax2")));
			
			//(18)�R�i�`�����t�B(16)-(17)
			dMap.put("buy",((BigDecimal)dMap.get("buy1")).subtract((BigDecimal)dMap.get("buy2")));
			
			//(9)�Q�����J(���ХX�Q�v) (2)-(16)
			dMap.put("income1",((BigDecimal)dMap.get("getbid_amount")).subtract((BigDecimal)dMap.get("buy1")));
			
			//(11)�Q�����J(���Ц^�Q�v) (2)-(17)
			dMap.put("income2",((BigDecimal)dMap.get("getbid_amount")).subtract((BigDecimal)dMap.get("buy2")));
			
			run.update(connection,insTemp("BIRA11_RPT",dMap));
			
			request.setAttribute("debt_name", tMap.get("debt_name")); //�o����O�W��
			request.setAttribute("issue_date", tMap.get("issue_date")); //�o����
			request.setAttribute("cash_due_date", tMap.get("due_date")); //������
			request.setAttribute("due_date", tMap.get("repay_date")); //�����R�^���
			request.setAttribute("early_due_date", tMap.get("date_period")); //�Z�����
		}
	}
}