<!--	CIRA0501QScript.jsp
�{���ت��GCIRA0501�������ɴڶŰȷ��p�`��
�{���N���GCIRA0501
�{������G0950316
�{���@�̡GERIC CHEN
--------------------------------------------------------
�ק�@�̡@�@�ק����@�@�@�ק�ت�
--------------------------------------------------------
-->

<%@ page language="java" contentType="text/html;charset=Big5" %>
<script language="Javascript">
<!--
function doBodyOnLoad(document)
{
  //nothing
}
function getSelectValue(obj)
{
	if( obj.baseUnit.value!="" )
		obj.baseUnitValue.value = obj.baseUnit.options[obj.baseUnit.selectedIndex].text;
	else
		obj.baseUnitValue.value = "";
}
function getLabel(obj)
{
	if( obj.debtCode.value!="" )
		obj.debtLabel.value = obj.debtCode.options[obj.debtCode.selectedIndex].text;
	else
		obj.debtLabel.value = "";
		
	if( obj.budgetCode.value!="" )
		obj.budgetLabel.value = obj.budgetCode.options[obj.budgetCode.selectedIndex].text;
	else
		obj.budgetLabel.value = "";	
}
function changeValue(form)
{
	getLabel(form);
	form.action = "CIRA05";
	form.submit();
}
function checkValue(form)
{
	var cols = new Array("status" , "date(baseDate)" , "baseUnit");
	var colNames = new Array("�i�v�٪��A�j" , "�i�Q�v��Ǥ�j" , "�i���B���j");
	var result = checkFormEmpty(form, cols);
	if(result >= 0){
		alert(colNames[result] + "���i�ť�!!");
	}

	return (result < 0);
}

//-->
</script>