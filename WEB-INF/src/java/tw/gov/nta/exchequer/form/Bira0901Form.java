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
public class Bira0901Form extends SupportForm  {
	private static final long serialVersionUID = 1L;
	private Date issueSdate;
	private Date issueEdate;
	private Date printDate;
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
	public Date getPrintDate() {
		return printDate;
	}
	public void setPrintDate(Date printDate) {
		this.printDate = printDate;
	}
	
}