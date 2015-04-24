<!--	CIRA0601QForm.jsp
�{���ت��GCIRA0601
�{���N���GCIRA0601
�{������G0950316
�{���@�̡GERIC CHEN
--------------------------------------------------------
�ק�@�̡@�@�ק����@�@�@�ק�ت�
--------------------------------------------------------
-->

<%@ page language="java" contentType="text/html;charset=Big5" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<table class='table_1' width='100%'>
	<tr>
		<td class='table_item'><font color="red">*</font>�v�٪��A</td>
		<td class='table_td'>
			<%pageContext.setAttribute("statusList",tw.gov.nta.system.common.CodeDetManage.getCodeDet("RS")); %>
			<html:select name='Cira0601Form' property='status'>
				<html:option value="">�п��</html:option>
				<html:options collection="statusList" labelName="valuess" labelProperty='label' property="valuess"/>
			</html:select>
		</td>
	</tr>
	<tr>
		<td class='table_item'>�~�װ_��</td>
		<td class='table_td'>
			<html:text name='Cira0601Form' property='startYear' size='10' maxlength='3'/>~
			<html:text name='Cira0601Form' property='endYear' size='10' maxlength='3'/>
		</td>
	</tr>
	<tr>
		<td class='table_item'>�ɴڤ���_��</td>
		<td class='table_td'>
			<html:text name='Cira0601Form' property='date(startDate)' size='10' maxlength='7' onblur=""/>~
			<%=gov.dnt.tame.util.CommonFun.addCalendar("date(startDate)",new Integer(0))%>
			<html:text name='Cira0601Form' property='date(endDate)' size='10' maxlength='7' onblur=""/>
			<%=gov.dnt.tame.util.CommonFun.addCalendar("date(endDate)",new Integer(1))%>
		</td>
	</tr>
	<tr>
		<td class='table_item'>�w��O</td>
		<td class='table_td'>
			<html:select name='Cira0601Form' property='budgetCode' onchange="changeValue(this.form)">
					<html:option value="">�п��</html:option>
					<html:optionsCollection name="Cira0601Form" property="budgetList" label="budgetName" value="id"/>
			</html:select>
			<html:hidden name="Cira0601Form" property="budgetLabel" />
		</td>
	</tr>
	<tr>
		<td class='table_item'>�ŰȧO</td>
		<td class='table_td'>
			<html:select name='Cira0601Form' property='debtCode' onchange="getLabel(this.form)">
					<html:option value="">�п��</html:option>
					<logic:notEmpty name="Cira0601Form" property="debtCodeList">
						<html:optionsCollection name="Cira0601Form" property="debtCodeList" label="debitName" value="id"/>
					</logic:notEmpty>
			</html:select>
			<html:hidden name="Cira0601Form" property="debtLabel" />
		</td>
	</tr>
	<tr>
		<td class='table_item'>���O</td>
		<td class='table_td'>
			<html:text name='Cira0601Form' property='startSerial' size='10' maxlength='5'/>~
			<html:text name='Cira0601Form' property='endSerial' size='10' maxlength='5'/>
		</td>
	</tr>
	<tr>
		<td class='table_item'>�Ȧ�O</td>
		<td class='table_td'>
			<%pageContext.setAttribute("bankCodeList",tw.gov.nta.system.common.BankCodeManage.getBankInfo()); %>
			<html:select name='Cira0601Form' property='bankCode'>
				<html:option value="">�п��</html:option>
				<html:options collection="bankCodeList" labelName="valuess" labelProperty='label' property="valuess"/>
			</html:select>
		</td>
	</tr>
	<tr>
		<td class='table_item'><font color="red">*</font>�Q�v��Ǥ�</td>
		<td class='table_td'>
			<html:text name='Cira0601Form' property='date(baseDate)' size='10' maxlength='7' onblur=""/>
			<%=gov.dnt.tame.util.CommonFun.addCalendar("date(baseDate)",new Integer(2))%>
		</td>
	</tr>
	<tr>
		<td class='table_item'><font color="red">*</font>���B���</td>
		<td class='table_td'>
			<%pageContext.setAttribute("collectionCodeDet",tw.gov.nta.system.common.CodeDetManage.getCodeDet("BU")); %>
			<html:select name='Cira0601Form' property='baseUnit' onchange="getSelectValue(this.form)">
				<html:option value="">�п��</html:option>
				<html:options collection="collectionCodeDet" labelName="valuess" labelProperty='label' property="valuess"/>
			</html:select>
			<html:hidden name='Cira0601Form' property='baseUnitValue'/>
		</td>
	</tr>
</table>