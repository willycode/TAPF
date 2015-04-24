/*
 * �b 2006/2/27 �إ�
 *
 * TODO �p�G�n�ܧ�o�Ӳ��ͪ��ɮת��d���A�в���
 * ���� - �ߦn�]�w - Java - �{���X�˦� - �{���X�d��
 */
package tw.gov.nta.exchequer.form;

import gov.dnt.tame.common.SupportForm;

import java.util.Date;

/**
 * @author Jack Du
 *
 * TODO �p�G�n�ܧ�o�Ӳ��ͪ����O���Ѫ��d���A�в���
 * ���� - �ߦn�]�w - Java - �{���X�˦� - �{���X�d��
 */
public class Bira1401Form extends SupportForm  {
	private static final long serialVersionUID = 1L;
	private String unit="1";
	private Date issueSdate;
	private Date issueEdate;
	private String accountSYear;
	private String accountEYear;
	private Integer issueId;

	public Integer getIssueId() {
		return issueId;
	}
	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return �Ǧ^ issueEdate�C
	 */
	public Date getIssueEdate() {
		return issueEdate;
	}
	/**
	 * @param issueEdate �n�]�w�� issueEdate�C
	 */
	public void setIssueEdate(Date issueEdate) {
		this.issueEdate = issueEdate;
	}
	/**
	 * @return �Ǧ^ issueSdate�C
	 */
	public Date getIssueSdate() {
		return issueSdate;
	}
	/**
	 * @param issueSdate �n�]�w�� issueSdate�C
	 */
	public void setIssueSdate(Date issueSdate) {
		this.issueSdate = issueSdate;
	}
	public String getAccountEYear() {
		return accountEYear;
	}
	public void setAccountSYear(String accountSYear) {
		accountSYear=accountSYear.trim();
		if (accountSYear.length() < 3 && !"".equals(accountSYear)){
			for (int i = 0 ; i < 3-accountSYear.length() ; i++){
				accountSYear = "0" + accountSYear;
			}	
		}
		this.accountSYear = accountSYear;
	}
	public String getAccountSYear() {
		return accountSYear;
	}
	public void setAccountEYear(String accountEYear) {
		accountEYear=accountEYear.trim();
		if (accountEYear.length() < 3 && !"".equals(accountEYear)){
			for (int i = 0 ; i < 3-accountEYear.length() ; i++){
				accountEYear = "0" + accountEYear;
			}	
		}
		this.accountEYear = accountEYear;
	}
}