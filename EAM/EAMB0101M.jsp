<!--
�{���ت��GEAMA02��r
�{���N���GEAMA02
�{������G0950310
�{���@�̡GFormBean Generator
--------------------------------------------------------
�ק�@�̡@�@�ק����@�@�@�ק�ت�
--------------------------------------------------------
-->

<%@ page language="java" contentType="text/html;charset=Big5" %>
<%@ taglib uri="/tags/struts-tiles" prefix="tiles" %>
<tiles:insert definition=".condition.masterDetailBody" flush="true">
	<tiles:put name='scripts' value='/EAM/EAMA0201AScript.jsp'/>
	<tiles:put name='title' value='<%=gov.dnt.tame.util.CommonFun.getTitle((String)(session.getAttribute("SYSID"))) %>'/>
	<tiles:put name='action' value='EAMB0101F'/>
	<tiles:put name='mform' value='/EAM/EAMB0101MForm.jsp'/>
	<tiles:put name='mbar' value='/EAM/EAMB0101MBar.jsp'/>
	<tiles:put name='dform' value='/EAM/EAMB0102LForm.jsp'/>
	<tiles:put name='dbar' value='/EAM/EAMB0102LBar.jsp'/>
</tiles:insert>
