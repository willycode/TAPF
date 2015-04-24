package tw.gov.nta.surplusage.action;

import gov.dnt.tame.common.PageSize;
import gov.dnt.tame.util.DateUtil;
import gov.dnt.tame.util.ExcelReportAction;
import gov.dnt.tame.util.JacobReportAction;
import gov.dnt.tame.util.ReportManager;

import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import tw.gov.nta.surplusage.form.Gara2001Form;
import tw.gov.nta.system.common.CodeDetManage;

public class GARA2002 extends JacobReportAction {

	@Override
	protected Map<String,Object> getReportParameter(ActionForm form, HttpServletRequest request) {
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		
		//String createDate = DateUtil.date2Str(new Date(),"yyyy/mm/dd");
		//String createDate = DateUtil.date2ChineseROC(DateUtil.date());
		String createDate = DateUtil.date2ChineseROC(DateUtil.date());	
		String memo = request.getAttribute("memo").toString();//���oGARA2001QForm��memo��
		Gara2001Form myForm = (Gara2001Form)form;
		
		//System.out.println("1���G�s�x��==>"+myForm.getAmountUnit().toString());	
		//System.out.println("2���G�s�x��==>"+CodeDetManage.getCodeName("BU",myForm.getAmountUnit().toString()));	
		//System.out.println("3���G�s�x��==>"+myForm.getAmountUnitLabel());	
		
		map.put("A4","���إ���"+myForm.getIssueYear()+"�~��");
		map.put("G5","���G�s�x��"+CodeDetManage.getCodeName("BU",myForm.getAmountUnit().toString()));	
		map.put("Z200",memo);
		map.put("A5","�s������G"+DateUtil.date2ROCStr(new Date(),"yyy.MM.dd" ));
	
		
		//map.put("A3","�s������G"+createDate);
		//map.put("B5",myForm.getIssueSdate());
		//map.put("C5",yearStr_1);
		//map.put("D5",yearStr_2);
		
		return map;
	}

	@Override
	protected ReportManager getReportManager(ActionForm form, HttpServletRequest request)
	{
		return new ReportManager(getProgramId(request),getReportParameter(form, request),getRealPath());
	}

	@Override
	protected String getProgramId(HttpServletRequest request)
	{
		return "GARA20";
	}
}