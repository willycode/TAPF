<%@ page pageEncoding="Big5" %>
<%@ include file="/common/taglibs.jsp"%>

<table class='table_1' width='100%'>
	<tr>
		<td class='table_function' align='right'>								   
			<html:submit styleClass='formcss_rbutton' property='doUpd' value='��s' onclick="return checkForm(this.form);"/>
			<html:submit styleClass='formcss_rbutton' property='doDel' value='�R��'/>
			<html:reset  styleClass='formcss_rbutton' property='reset' value='�_��'/>
			<html:submit styleClass='formcss_rbutton' property='goAdd' value='��s�W'/>
			<html:submit styleClass='formcss_rbutton' property='doQry' value='��d��'/>
		</td>
	</tr>
</table>