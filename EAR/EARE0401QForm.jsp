<%@ page language="java" contentType="text/html;charset=Big5" %>
<%@taglib uri="/tags/struts-bean" prefix="bean" %>
<%@taglib uri="/tags/struts-html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> 

<table class='table_1' width='100%'>
	<tr>
		<td class='table_item'>�|�p�~��</td>
		<td class='table_td'>
			<input type="text" name="accountYear" value='<c:out value="${AccountQueryForm.accountYear}"/>' />
		</td> 
	</tr>

	<tr>
		<td class='table_item'>�|�p���</td>
		<td class='table_td'>	
			<select name="month" >		    
				<c:forEach var="month" begin="1" end="12">
					<c:choose>
					    <c:when test="${month eq AccountQueryForm.month}">
					    	<option value='<c:out value="${month}"/>' selected = true>
						</c:when>
					    <c:otherwise>
			        		<option value='<c:out value="${month}"/>'>
						</c:otherwise>
					</c:choose>
					<c:out value="${month}"/>
					</option>		 
				</c:forEach>		
			</select>
		</td>
	</tr>	
	<tr>
		<td class='table_item'>�|�p���O</td>
		<td class='table_td'>
			<html:select name="AccountQueryForm" property="voucherType">
				<html:optionsCollection name='AccountQueryForm' property='phaseTypes' label="value" value="key" />
			</html:select>
		</td>
	</tr>	
	<c:if test="${debtTypeCode eq 'A'}">
		<tr>
			<td class='table_item'>��������</td>
			<td class='table_td'>
				<html:select name="AccountQueryForm" property="issueKind">
					<option value="0">�n��</option>
					<option value="1">�Ų�</option>
				</html:select>
			</td>
		</tr>
	</c:if>	
</table>