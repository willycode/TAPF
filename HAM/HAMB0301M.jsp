<!-- HAMB0301M.jsp
程式目的：HAMB03
程式代號：HAMB03
程式日期：0950221
程式作者：Eric.Chen
--------------------------------------------------------
修改作者　　修改日期　　　修改目的
--------------------------------------------------------
-->

<%@ page language="java" contentType="text/html;charset=Big5" %>
<%@ taglib uri="/tags/struts-tiles" prefix="tiles" %>
<tiles:insert definition=".condition.formBaseBody" flush="true">
	<tiles:put name='scripts' value='/HAM/HAMB0301MScript.jsp'/>
	<tiles:put name='title' value='<%=gov.dnt.tame.util.CommonFun.getTitle("HAMB03")%>'/>
	<tiles:put name='action' value='HAMB0301M'/>
	<tiles:put name='form' value='/HAM/HAMB0301MForm.jsp'/>
	<tiles:put name='bar' value='/HAM/HAMB0301MBar.jsp'/>
</tiles:insert>
