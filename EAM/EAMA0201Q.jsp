<!--
�{���ت��GEAMA02��r
�{���N���GEAMA02
�{������G0950301
�{���@�̡GFormBean Generator
--------------------------------------------------------
�ק�@�̡@�@�ק����@�@�@�ק�ت�
--------------------------------------------------------
-->

<%@ page language="java" contentType="text/html;charset=Big5" %>
<%@ taglib uri="/tags/struts-tiles" prefix="tiles" %>
<tiles:insert definition=".condition.masterDetailBody" flush="true">
	<tiles:put name='scripts' value='/common/blankScript.jsp'/>
	<tiles:put name='title' value='<%=gov.dnt.tame.util.CommonFun.getTitle((String)(session.getAttribute("SYSID")))%>'/>
	<tiles:put name='action' value='EAMA0201F'/>
	<tiles:put name='mform' value='/EAM/EAMA0201QForm.jsp'/>
	<tiles:put name='mbar' value='/EAM/EAMA0201QBar.jsp'/>
	<tiles:put name='dform' value='/EAM/EAMA0201LForm.jsp'/>
	<tiles:put name='dbar' value='/EAM/EAMA0201LBar.jsp'/>
</tiles:insert>