<!--
�{���ت��GHAMB04��r
�{���N���GHAMB04
�{������G0950223
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

<html:hidden name="Hamb0401Form" property="page"/>
<input type='hidden' name='xaction' value='HAMB0401'>

<table class='table_function' width='100%'>
	<tr>
		<td align="right">
		<!--
			<html:submit styleClass='formcss_rbutton' property='doPrt' value='�s�@�Ϥ�'/>
		-->
<%
		String PAGEBAR = (String) request.getAttribute("PAGEBAR");
		if(null != PAGEBAR)
		{
%>
			<%=PAGEBAR%>
<% 
		}
%>
		<!--
			<html:submit styleClass='formcss_rbutton' property='doPrt' value='�}��Excel'/>
		-->
		</td>
	</tr>
</table>