<%@ page pageEncoding="Big5" %>
<%@ include file="/common/taglibs.jsp"%>

<table class='table_1' width='100%'>
	<tr>
		<td class='table_item'>�ŰȦW��</td>
		<td class='table_td'>
			<input type="text" name="issueYear" value='<c:out value="${AccountQueryForm.issueYear}"/>' onchange="form.action='<c:out value="${SYSID}"/>'; form.submit();" SIZE = "3" />�~
			<html:select name="AccountQueryForm" property="issueId">
				<html:optionsCollection name='AccountQueryForm' property='issueList' label="debtName" value="id" />
			</html:select>
		</td>
	</tr>
	<tr>
		<td class='table_item'>������ܤ覡</td>
		<td class='table_td'>
			<html:select name="AccountQueryForm" property="reportType">
				<html:option value="����">����</html:option>
				<html:option value="�̦~��">�̦~��</html:option>
				<html:option value="�̴��O">�̴��O</html:option>
			</html:select>
		</td>
	</tr>
</table>