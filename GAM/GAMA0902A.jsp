<!-- GAMA0902A.jsp
�{���ت��GGAMA09
�{���N���GGAMA09
�{������G0980409
�{���@�̡GChris
--------------------------------------------------------
�ק�@�̡@�@�ק����@�@�@�ק�ت�
--------------------------------------------------------
-->


<%@ page language="java" contentType="text/html;charset=Big5" %>
<%@ taglib uri="/tags/struts-tiles" prefix="tiles" %>
<tiles:insert definition=".condition.formBaseBody" flush="true">
	<tiles:put name='scripts' value='/GAM/GAMA0902AScript.jsp'/>
	<tiles:put name='title' value='<%=gov.dnt.tame.util.CommonFun.getTitle("GAMA09")%>'/>
	<tiles:put name='action' value='GAMA09F'/>
	<tiles:put name="form" value="/GAM/GAMA0902AForm.jsp"/>
	<tiles:put name="bar" value="/GAM/GAMA0902ABar.jsp"/>
</tiles:insert>