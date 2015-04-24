<!--
�{���ت��GAIMA01��r
�{���N���GAIMA01
�{������G0950306
�{���@�̡GFormBean Generator
--------------------------------------------------------
�ק�@�̡@�@�ק����@�@�@�ק�ت�
--------------------------------------------------------
-->

<%@ page language="java" contentType="text/html;charset=Big5" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/displaytag" prefix="display" %>
<table class='table_1' width='100%'>
	<tr>
		<table width="100%">
			<tr>
				<td width="132" class='table_item'>���ťN���G</td>
				<td width="132" colspan="2" class='table_td'><bean:write name='Aima0302LForm' property='issueSerial'/></td>
				<td width="131" class='table_item'>�o�����G</td>
				<td width="131" class='table_td'><bean:write name='Aima0302LForm' property='DateFormat(issueDate)'/></td>
				<td width="131" colspan="2" class='table_item'>�o����B�G</td>
				<td width="131" class='table_td'><bean:write name='Aima0302LForm' property='BigDecimal(issueAmount)' format="#,###"/></td>
			</tr>
		</table>
	</tr>
	<tr>
		<td>
			<display:table class="table_list" name="collection" id="row">
				<display:column title="�w��O">
				<bean:define id="debtId" name="row" property="id" type="java.lang.Integer"/>
				<bean:define id="issueMain" name="row" property="issue" type="tw.gov.nta.sql.debt.IssueMain"/>
				<bean:define id="issueMainId" name="issueMain" property="id" type="java.lang.Integer"/>
				
				<%
					String	myLink	=	"AIMA0322?";
					myLink	+= "debtId=" + debtId;
					myLink += "&issueMainId=" + issueMainId;
				%>
				<A href="<%=myLink%>">
					<%
					tw.gov.nta.sql.debt.DebtMain tDebtMain = (tw.gov.nta.sql.debt.DebtMain)row;
					if(tDebtMain != null && tDebtMain.getBudgetCode() != null)
						out.print(tw.gov.nta.system.common.BudgetCodeManager.findBudgetName(tDebtMain.getBudgetCode().intValue()));
					%>
				</A>
				</display:column>
				<display:column title="�ŰȧO">
					<%
					tw.gov.nta.sql.debt.DebtMain tDebtMain = (tw.gov.nta.sql.debt.DebtMain)row;
					if(tDebtMain != null && tDebtMain.getDebtCode() != null)
						out.print(tw.gov.nta.system.common.DebitCodeManage.findDebitName(tDebtMain.getDebtCode().intValue()));
					%>
				</display:column>
				<display:column title="�o���B">
					<bean:write name='row' property='issueAmount' format="#,###"/>
				</display:column>
			</display:table>
		</td>
	</tr>
</table>
<html:hidden name='Aima0302LForm' property='issueMainId' />