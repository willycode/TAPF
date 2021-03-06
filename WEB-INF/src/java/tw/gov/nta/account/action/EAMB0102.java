/**
 * @author LinusTseng
 * @date 2006/3/8
 * 處理新增程式，並導向清單
 */

package tw.gov.nta.account.action;

import gov.dnt.tame.common.DefaultAction;
import gov.dnt.tame.util.DateUtil;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;

import tw.gov.nta.account.form.Eamb0101Form;
import tw.gov.nta.debt.account.common.DebtAccountManager;
import tw.gov.nta.sql.debt.IssueExchangeTicketMain;
import tw.gov.nta.sql.debt.IssueMain;
import tw.gov.nta.sql.debt.dao.IssueExchangeTicketMainDAO;
import tw.gov.nta.sql.debt.dao.IssueMainDAO;


public class EAMB0102 extends DefaultAction
{

	@Override
	public void executeQuery(ActionForm form, HttpServletRequest request,
			Connection connection) throws Exception
	{
		Eamb0101Form myform = (Eamb0101Form)form;
		HttpSession session = request.getSession();
		String debtTypeCode = (String)request.getSession().getAttribute("debtTypeCode");
		String chargeType = myform.getChargeType();
		IssueMainDAO dao = IssueMainDAO.getInstance();
		Criteria criteria = dao.getSession().createCriteria(IssueMain.class,"m");
		criteria.add(Expression.eq("m.debtType",request.getSession().getAttribute("debtTypeCode")));
		if(!request.getSession().getAttribute("debtTypeCode").equals("D"))
			criteria.add(Expression.ne("budgetCode",4));
		else
			criteria.add(Expression.ne("debtCode",25));

		if (null!=myform.getAccountYear() && !"".equals(myform.getAccountYear()))
			criteria.add(Expression.eq("m.accountYear",myform.getAccountYear()));
		
		if (null!=myform.getSerialNo() && !"".equals(myform.getSerialNo()))
			criteria.add(Expression.eq("m.serialNo",myform.getSerialNo()));
		
		if (null!=myform.getMonth() && !"".equals(myform.getMonth())) {
			Date monthStartDate = DateUtil.str2Date(myform.getAccountYear()+myform.getMonth()+"01");
			Date monthEndDate = DateUtil.getLastDateOfMonth(monthStartDate);
			criteria.add(Expression.ge("m.issueDate",monthStartDate));
			criteria.add(Expression.le("m.issueDate",monthEndDate));
		}
		
		if (myform.getBudgetCode() !=0)
			criteria.add(Expression.eq("m.budgetCode",myform.getBudgetCode()));
		
		if (myform.getDebtCode()!=0)
			criteria.add(Expression.eq("m.debtCode",myform.getDebtCode()));

		if (null!=myform.getDebtName() && !"".equals(myform.getDebtName()))
			criteria.add(Expression.like("m.debtName","%"+myform.getDebtName()+"%"));

		if (null!=myform.getIssueKind() && !"".equals(myform.getIssueKind()))
			criteria.add(Expression.eq("m.issueKind",myform.getIssueKind()));

		try {
			if (null!=myform.getStartIssueDate() && !"".equals(myform.getStartIssueDate())) {
				Date startIssueDate = DateUtil.str2Date(myform.getStartIssueDate());
				if (startIssueDate == null)
					throw new Exception("發行開始日期有誤");
				criteria.add(Expression.ge("m.issueDate",startIssueDate));	
			}

			if (null!=myform.getEndIssueDate() && !"".equals(myform.getEndIssueDate())) {
				Date endIssueDate = DateUtil.str2Date(myform.getEndIssueDate());
				if (endIssueDate == null)
					throw new Exception("發行結束日期有誤");
				criteria.add(Expression.le("m.issueDate",endIssueDate));	
			}
			
			if (null!=myform.getStartDueDate() && !"".equals(myform.getStartDueDate())) {
				Date startDueDate = DateUtil.str2Date(myform.getStartDueDate());
				if (startDueDate == null)
					throw new Exception("到期開始日期有誤");
				criteria.add(Expression.ge("m.dueDate",startDueDate));	
			}
			
			if (null!=myform.getEndDueDate() && !"".equals(myform.getEndDueDate())) {
				Date endDueDate = DateUtil.str2Date(myform.getEndDueDate());
				if (endDueDate == null)
					throw new Exception("到期結束日期有誤");
				criteria.add(Expression.le("m.dueDate",endDueDate));	
			}
			
			if("A".equals(debtTypeCode)) {
				//如果為增額公債，且預算別和債務別等於原始公債就不顯示
				//因為增額公債的傳票和原始公債要開在一起
				//0980320資訊服務申請單，要求在list清單分開一般&增額分開
				String addSql = "((id = source_issue_id) or " +
						"(not exists(select 1 from issue_main n " +
						"where {alias}.source_issue_id = n.id " +
						"and n.id = n.source_issue_id))) ";
//				criteria.add(Expression.sql(addSql));
			}
			
			if("C".equals(debtTypeCode)){
				String addSql = "(ISNUMERIC({alias}.serial_no) = 1)";
				criteria.add(Expression.sql(addSql));
			}
			
			String startRepayDate = myform.getStartRepayDate();
			String endRepayDate = myform.getEndRepayDate();
			if(null==startRepayDate | startRepayDate.trim().equals("")) {
				startRepayDate="";
			}else{
				if (session.getAttribute("voucherType")=="3")
				{
					if (Integer.parseInt(startRepayDate.substring(3,5))<=6){
						startRepayDate = startRepayDate.substring(0,3)+"01"+startRepayDate.substring(5,7);
					}else {
						startRepayDate = startRepayDate.substring(0,3)+"06"+startRepayDate.substring(5,7);
					}
				}

			}
			
			if(null==endRepayDate) {
				endRepayDate="";
			}

			Integer voucherType = (Integer)request.getSession().getAttribute("voucherType");
			
			if(!("".equals(startRepayDate)||"".equals(endRepayDate))) {
				String addSql = "";
				
				if(!"A".equals(debtTypeCode)||"2".equals(chargeType)||(voucherType.intValue()!=3&&voucherType.intValue()!=4)){
					addSql = "(exists(select 1 from payment_main n where {alias}.id = n.issue_id " ;
					if(!("".equals(startRepayDate))) {
						addSql = addSql+" and n.repay_date >='"+DateUtil.date2Str(DateUtil.str2Date(startRepayDate),"yyyy/mm/dd")+"'";
					}
					
					if(!("".equals(endRepayDate))) {
						addSql = addSql+ " and n.repay_date <='"+DateUtil.date2Str(DateUtil.str2Date(endRepayDate),"yyyy/mm/dd")+"'";
					}

				}else{
					addSql = "(exists(select 1 from debt_plan_det m where {alias}.id = m.issue_id " ;
					if(!("".equals(startRepayDate))) {
						addSql = addSql+" and m.repay_date >='"+DateUtil.date2Str(DateUtil.str2Date(startRepayDate),"yyyy/mm/dd")+"'";
					}
					
					if(!("".equals(endRepayDate))) {
						addSql = addSql+ " and m.repay_date <='"+DateUtil.date2Str(DateUtil.str2Date(endRepayDate),"yyyy/mm/dd")+"'";
					}	
					
				}
				
				//手續費傳票不帶入超過截止兌付日期的發行
				
				if(voucherType.equals(DebtAccountManager.Charge) || voucherType.equals(DebtAccountManager.PayCharge)) {
					addSql = addSql+ " and '"+DateUtil.date2Str(DateUtil.str2Date(endRepayDate),"yyyy/mm/dd")+"' <= {alias}.cash_due_date ";
				}	
				addSql = addSql+") )";
				
				criteria.add(Expression.sql(addSql));
			}
			
			Date startExchangeDate = DateUtil.str2Date(myform.getStartExchangeDate());
			Date endExchangeDate = DateUtil.str2Date(myform.getEndExchangeDate());
			if( !"".equals(myform.getStartExchangeDate()) && !"".equals(myform.getEndExchangeDate()) && "A".equals(debtTypeCode)) {
				String addSql = "";
				addSql = "(exists(select 1 from issue_exchange_ticket_main e where e.debt_id in (select id from debt_main d where d.issue_id = {alias}.id )";
				addSql = addSql+" and e.exchange_Date >='"+DateUtil.date2Str(startExchangeDate,"yyyy/mm/dd")+"'";
				addSql = addSql+" and e.exchange_Date <='"+DateUtil.date2Str(endExchangeDate,"yyyy/mm/dd")+"'";
				addSql = addSql+") )";
				criteria.add(Expression.sql(addSql));
			}
			
			criteria.addOrder(Order.asc("issueSerial"));
			criteria.addOrder(Order.asc("issueDate"));
			criteria.addOrder(Order.asc("budgetCode"));			

			System.out.print(criteria.toString());			
			List collection = criteria.list();			
			request.setAttribute("collection",collection);

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			setAlertMessage(request,ex.getMessage());
		}
		
		if("A".equals(debtTypeCode)&&chargeType!=null){
			if("1".equals(chargeType)){
				request.getSession().setAttribute("voucherType",3);
			}else{
				request.getSession().setAttribute("voucherType",4);
			}
		}
	}


}
