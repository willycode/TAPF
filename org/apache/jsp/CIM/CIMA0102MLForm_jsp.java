package org.apache.jsp.CIM;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gov.dnt.tame.util.DateUtil;

public final class CIMA0102MLForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/WEB-INF/taglibs/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/taglibs/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/taglibs/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/taglibs/displaytag-12.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_table_name_id_class;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_display_column_title;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_empty_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_name_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_name_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_display_table_name_id_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_display_column_title = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_empty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_name_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_display_table_name_id_class.release();
    _jspx_tagPool_display_column_title.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
    _jspx_tagPool_bean_define_type_property_name_id_nobody.release();
    _jspx_tagPool_logic_empty_property_name.release();
    _jspx_tagPool_html_link_name_action.release();
    _jspx_tagPool_html_hidden_value_property_name_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=Big5");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- CIMA0102MLForm.jsp\r\n");
      out.write("程式目的：CIMA01\r\n");
      out.write("程式代號：CIMA01\r\n");
      out.write("程式日期：0950306\r\n");
      out.write("程式作者：Eric.Chen\r\n");
      out.write("--------------------------------------------------------\r\n");
      out.write("修改作者　　修改日期　　　修改目的\r\n");
      out.write("--------------------------------------------------------\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table class='table_1' width='100%'>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");
      //  display:table
      org.displaytag.tags.TableTag _jspx_th_display_table_0 = (org.displaytag.tags.TableTag) _jspx_tagPool_display_table_name_id_class.get(org.displaytag.tags.TableTag.class);
      _jspx_th_display_table_0.setPageContext(_jspx_page_context);
      _jspx_th_display_table_0.setParent(null);
      _jspx_th_display_table_0.setClass("table_list");
      _jspx_th_display_table_0.setName(new String("caplist"));
      _jspx_th_display_table_0.setUid("row");
      int _jspx_eval_display_table_0 = _jspx_th_display_table_0.doStartTag();
      if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_table_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_table_0.doInitBody();
        }
        row = (java.lang.Object) _jspx_page_context.findAttribute("row");
        row_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("row_rowNum");
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  display:column
          org.displaytag.tags.ColumnTag _jspx_th_display_column_0 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.ColumnTag.class);
          _jspx_th_display_column_0.setPageContext(_jspx_page_context);
          _jspx_th_display_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
          _jspx_th_display_column_0.setTitle("還本付息日");
          int _jspx_eval_display_column_0 = _jspx_th_display_column_0.doStartTag();
          if (_jspx_eval_display_column_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_display_column_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_display_column_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_display_column_0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t<input type=\"hidden\" name=\"capindex\" value=\"");
              out.print(row_rowNum);
              out.write("\" />\r\n");
              out.write("\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_notEmpty_0.setName("Cima0101Form");
              _jspx_th_logic_notEmpty_0.setProperty("id");
              int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
              if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
                  _jspx_th_bean_define_0.setId("id");
                  _jspx_th_bean_define_0.setName("Cima0101Form");
                  _jspx_th_bean_define_0.setProperty("id");
                  _jspx_th_bean_define_0.setType("java.lang.Integer");
                  int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
                  if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
                  java.lang.Integer id = null;
                  id = (java.lang.Integer) _jspx_page_context.findAttribute("id");
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
request.setAttribute("id",id);
                  out.write("\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_0);
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_1 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_1.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_notEmpty_1.setName("Cima0101Form");
              _jspx_th_logic_notEmpty_1.setProperty("debtId");
              int _jspx_eval_logic_notEmpty_1 = _jspx_th_logic_notEmpty_1.doStartTag();
              if (_jspx_eval_logic_notEmpty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_1);
                  _jspx_th_bean_define_1.setId("debtId");
                  _jspx_th_bean_define_1.setName("Cima0101Form");
                  _jspx_th_bean_define_1.setProperty("debtId");
                  _jspx_th_bean_define_1.setType("java.lang.Integer");
                  int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
                  if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
                  java.lang.Integer debtId = null;
                  debtId = (java.lang.Integer) _jspx_page_context.findAttribute("debtId");
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
request.setAttribute("debtId",debtId);
                  out.write("\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_1);
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_2 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_2.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_notEmpty_2.setName("Cima0101Form");
              _jspx_th_logic_notEmpty_2.setProperty("issueDate");
              int _jspx_eval_logic_notEmpty_2 = _jspx_th_logic_notEmpty_2.doStartTag();
              if (_jspx_eval_logic_notEmpty_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_2 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_2.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_2);
                  _jspx_th_bean_define_2.setId("issueDate");
                  _jspx_th_bean_define_2.setName("Cima0101Form");
                  _jspx_th_bean_define_2.setProperty("issueDate");
                  _jspx_th_bean_define_2.setType("java.util.Date");
                  int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
                  if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_2);
                  java.util.Date issueDate = null;
                  issueDate = (java.util.Date) _jspx_page_context.findAttribute("issueDate");
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
request.setAttribute("issueDate",issueDate);
                  out.write("\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_2);
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_3 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_3.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_notEmpty_3.setName("Cima0101Form");
              _jspx_th_logic_notEmpty_3.setProperty("dueDate");
              int _jspx_eval_logic_notEmpty_3 = _jspx_th_logic_notEmpty_3.doStartTag();
              if (_jspx_eval_logic_notEmpty_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_3 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_3.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_3);
                  _jspx_th_bean_define_3.setId("dueDate");
                  _jspx_th_bean_define_3.setName("Cima0101Form");
                  _jspx_th_bean_define_3.setProperty("dueDate");
                  _jspx_th_bean_define_3.setType("java.util.Date");
                  int _jspx_eval_bean_define_3 = _jspx_th_bean_define_3.doStartTag();
                  if (_jspx_th_bean_define_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_3);
                  java.util.Date dueDate = null;
                  dueDate = (java.util.Date) _jspx_page_context.findAttribute("dueDate");
                  out.write("\t\r\n");
                  out.write("\t\t\t\t\t");
request.setAttribute("dueDate",dueDate);
                  out.write("\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_3);
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_4 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_4.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_notEmpty_4.setName("Cima0101Form");
              _jspx_th_logic_notEmpty_4.setProperty("bankId");
              int _jspx_eval_logic_notEmpty_4 = _jspx_th_logic_notEmpty_4.doStartTag();
              if (_jspx_eval_logic_notEmpty_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_4 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_4.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_4);
                  _jspx_th_bean_define_4.setId("bankId");
                  _jspx_th_bean_define_4.setName("Cima0101Form");
                  _jspx_th_bean_define_4.setProperty("bankId");
                  _jspx_th_bean_define_4.setType("java.lang.Integer");
                  int _jspx_eval_bean_define_4 = _jspx_th_bean_define_4.doStartTag();
                  if (_jspx_th_bean_define_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_4);
                  java.lang.Integer bankId = null;
                  bankId = (java.lang.Integer) _jspx_page_context.findAttribute("bankId");
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
request.setAttribute("bankId",bankId);
                  out.write("\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_4);
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_5 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_5.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_notEmpty_5.setName("row");
              _jspx_th_logic_notEmpty_5.setProperty("repayDate");
              int _jspx_eval_logic_notEmpty_5 = _jspx_th_logic_notEmpty_5.doStartTag();
              if (_jspx_eval_logic_notEmpty_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_5 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_5.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_5);
                  _jspx_th_bean_define_5.setId("repayDate");
                  _jspx_th_bean_define_5.setName("row");
                  _jspx_th_bean_define_5.setProperty("repayDate");
                  _jspx_th_bean_define_5.setType("java.util.Date");
                  int _jspx_eval_bean_define_5 = _jspx_th_bean_define_5.doStartTag();
                  if (_jspx_th_bean_define_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_5);
                  java.util.Date repayDate = null;
                  repayDate = (java.util.Date) _jspx_page_context.findAttribute("repayDate");
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
request.setAttribute("repayDate",repayDate);
                  out.write("\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_5);
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  logic:empty
              org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_0 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
              _jspx_th_logic_empty_0.setPageContext(_jspx_page_context);
              _jspx_th_logic_empty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_empty_0.setName("row");
              _jspx_th_logic_empty_0.setProperty("repayDate");
              int _jspx_eval_logic_empty_0 = _jspx_th_logic_empty_0.doStartTag();
              if (_jspx_eval_logic_empty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
request.setAttribute("repayDate","000/00/00");
                  out.write("\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_empty_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_empty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_0);
              out.write("\t\r\n");
              out.write("\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_6 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_6.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_notEmpty_6.setName("row");
              _jspx_th_logic_notEmpty_6.setProperty("capitalAmount");
              int _jspx_eval_logic_notEmpty_6 = _jspx_th_logic_notEmpty_6.doStartTag();
              if (_jspx_eval_logic_notEmpty_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_6 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_6.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_6);
                  _jspx_th_bean_define_6.setId("capitalAmount");
                  _jspx_th_bean_define_6.setName("row");
                  _jspx_th_bean_define_6.setProperty("capitalAmount");
                  _jspx_th_bean_define_6.setType("java.math.BigDecimal");
                  int _jspx_eval_bean_define_6 = _jspx_th_bean_define_6.doStartTag();
                  if (_jspx_th_bean_define_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_6);
                  java.math.BigDecimal capitalAmount = null;
                  capitalAmount = (java.math.BigDecimal) _jspx_page_context.findAttribute("capitalAmount");
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
request.setAttribute("capitalAmountFuture",capitalAmount.setScale(4,5));
                  out.write("\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_6);
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  logic:empty
              org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_1 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
              _jspx_th_logic_empty_1.setPageContext(_jspx_page_context);
              _jspx_th_logic_empty_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_empty_1.setName("row");
              _jspx_th_logic_empty_1.setProperty("capitalAmount");
              int _jspx_eval_logic_empty_1 = _jspx_th_logic_empty_1.doStartTag();
              if (_jspx_eval_logic_empty_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
request.setAttribute("capitalAmountFuture",new java.math.BigDecimal(0));
                  out.write("\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_empty_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_empty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_1);
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_7 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_7.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_notEmpty_7.setName("row");
              _jspx_th_logic_notEmpty_7.setProperty("id");
              int _jspx_eval_logic_notEmpty_7 = _jspx_th_logic_notEmpty_7.doStartTag();
              if (_jspx_eval_logic_notEmpty_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_7 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_7.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_7);
                  _jspx_th_bean_define_7.setId("id");
                  _jspx_th_bean_define_7.setName("row");
                  _jspx_th_bean_define_7.setProperty("id");
                  _jspx_th_bean_define_7.setType("java.lang.Integer");
                  int _jspx_eval_bean_define_7 = _jspx_th_bean_define_7.doStartTag();
                  if (_jspx_th_bean_define_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_7);
                  java.lang.Integer id = null;
                  id = (java.lang.Integer) _jspx_page_context.findAttribute("id");
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
 
								tw.gov.nta.debt.common.PayManager myPay = new tw.gov.nta.debt.common.PayManager();
								java.math.BigDecimal capitalAmountDPT = myPay.getCapitalByPlan(id.intValue());
								if(null == capitalAmountDPT )
								{
									capitalAmountDPT = new java.math.BigDecimal(0);
								}
								request.setAttribute("capitalAmountDPT",capitalAmountDPT.setScale(4,5));
							
                  out.write("\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_7.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_7);
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  logic:empty
              org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_2 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
              _jspx_th_logic_empty_2.setPageContext(_jspx_page_context);
              _jspx_th_logic_empty_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_empty_2.setName("row");
              _jspx_th_logic_empty_2.setProperty("id");
              int _jspx_eval_logic_empty_2 = _jspx_th_logic_empty_2.doStartTag();
              if (_jspx_eval_logic_empty_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
request.setAttribute("capitalAmountDPT",new java.math.BigDecimal(0));
                  out.write("\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_empty_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_empty_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_2);
              out.write("\r\n");
              out.write("\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_8 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_8.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_notEmpty_8.setName("row");
              _jspx_th_logic_notEmpty_8.setProperty("id");
              int _jspx_eval_logic_notEmpty_8 = _jspx_th_logic_notEmpty_8.doStartTag();
              if (_jspx_eval_logic_notEmpty_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
                  //  bean:define
                  org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_8 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                  _jspx_th_bean_define_8.setPageContext(_jspx_page_context);
                  _jspx_th_bean_define_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_8);
                  _jspx_th_bean_define_8.setId("id");
                  _jspx_th_bean_define_8.setName("row");
                  _jspx_th_bean_define_8.setProperty("id");
                  _jspx_th_bean_define_8.setType("java.lang.Integer");
                  int _jspx_eval_bean_define_8 = _jspx_th_bean_define_8.doStartTag();
                  if (_jspx_th_bean_define_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_8);
                  java.lang.Integer id = null;
                  id = (java.lang.Integer) _jspx_page_context.findAttribute("id");
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
 
								tw.gov.nta.debt.common.PayManager myPay = new tw.gov.nta.debt.common.PayManager();
								java.math.BigDecimal interestAmountDPT = myPay.getInterestByPlan(id.intValue());
								if(null == interestAmountDPT )
								{
									interestAmountDPT = new java.math.BigDecimal(0);
								}	
								java.util.Date trueDate = myPay.getMaxDateByPlan(id);
								String showDate = new String();
								if(null != DateUtil.date2ROCStr(trueDate))
								{
									showDate = DateUtil.date2ROCStr(trueDate);
								}
								request.setAttribute("showDate",showDate);
								request.setAttribute("interestAmountDPT",interestAmountDPT.setScale(4,5));
							
                  out.write("\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_8.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_8);
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  logic:empty
              org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_3 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
              _jspx_th_logic_empty_3.setPageContext(_jspx_page_context);
              _jspx_th_logic_empty_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_empty_3.setName("row");
              _jspx_th_logic_empty_3.setProperty("id");
              int _jspx_eval_logic_empty_3 = _jspx_th_logic_empty_3.doStartTag();
              if (_jspx_eval_logic_empty_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
request.setAttribute("interestAmountDPT",new java.math.BigDecimal(0));
                  out.write("\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_empty_3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_empty_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_3);
              out.write("\r\n");
              out.write("\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_9 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_9.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_notEmpty_9.setName("row");
              _jspx_th_logic_notEmpty_9.setProperty("id");
              int _jspx_eval_logic_notEmpty_9 = _jspx_th_logic_notEmpty_9.doStartTag();
              if (_jspx_eval_logic_notEmpty_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
 
							java.math.BigDecimal capital = ((java.math.BigDecimal)request.getAttribute("capitalAmountDPT"));
							java.math.BigDecimal interest = ((java.math.BigDecimal)request.getAttribute("interestAmountDPT"));
							java.math.BigDecimal total = capital.add(interest);
							if(null == total)
							{
								request.setAttribute("totalAmount",new java.math.BigDecimal(0)); 
							}
							else
							{
								request.setAttribute("totalAmount",total); 
							}
						
                  out.write("\t\t\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_9.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_9);
              out.write("\r\n");
              out.write("\t\t\t\t");
              //  logic:empty
              org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_empty_4 = (org.apache.struts.taglib.logic.EmptyTag) _jspx_tagPool_logic_empty_property_name.get(org.apache.struts.taglib.logic.EmptyTag.class);
              _jspx_th_logic_empty_4.setPageContext(_jspx_page_context);
              _jspx_th_logic_empty_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_logic_empty_4.setName("row");
              _jspx_th_logic_empty_4.setProperty("id");
              int _jspx_eval_logic_empty_4 = _jspx_th_logic_empty_4.doStartTag();
              if (_jspx_eval_logic_empty_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
request.setAttribute("totalAmount",new java.math.BigDecimal(0));
                  out.write("\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_empty_4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_empty_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_empty_property_name.reuse(_jspx_th_logic_empty_4);
              out.write("\t\t\t\r\n");
              out.write("\t\t\t\t");
		
						
						java.util.Map paramMap = new java.util.HashMap();
							if(null != (request.getAttribute("id")))
							{
								paramMap.put("id",request.getAttribute("id"));
							}
							if(null != row_rowNum)
							{
								paramMap.put("nowindex",row_rowNum);
							}
							if(null != request.getAttribute("debtId"))
							{
								paramMap.put("debtId",request.getAttribute("debtId"));
							}
							if(null != request.getAttribute("bankId"))
							{
								paramMap.put("bankId",request.getAttribute("bankId"));
							}
							if(null != (java.util.Date)(request.getAttribute("issueDate")))
							{
								paramMap.put("date(issueDate)",DateUtil.date2ROCStr((java.util.Date)(request.getAttribute("issueDate"))));
							}
							if(null != (java.util.Date)(request.getAttribute("dueDate")))
							{
								paramMap.put("date(dueDate)",DateUtil.date2ROCStr((java.util.Date)(request.getAttribute("dueDate"))));
							}
							if(null != (java.util.Date)(request.getAttribute("repayDate")))
							{ 
								paramMap.put("date(repayDate)",DateUtil.date2ROCStr(((java.util.Date)(request.getAttribute("repayDate")))));
							}
							if(null != (java.math.BigDecimal)(request.getAttribute("capitalAmountFuture")))
							{ 
								paramMap.put("capitalAmount",(java.math.BigDecimal)(request.getAttribute("capitalAmountFuture")));
							}
							if(null != (java.math.BigDecimal)(request.getAttribute("capitalAmountDPT")))
							{ 
								paramMap.put("capitalAmountDPT",(java.math.BigDecimal)(request.getAttribute("capitalAmountDPT")));
							}
							if(null != (java.math.BigDecimal)(request.getAttribute("interestAmountDPT")))
							{
								paramMap.put("interestAmountDPT",(java.math.BigDecimal)(request.getAttribute("interestAmountDPT")));
							}
							if(null != (java.math.BigDecimal)(request.getAttribute("totalAmount")))
							{ 
								paramMap.put("totalAmount",(java.math.BigDecimal)(request.getAttribute("totalAmount")));
							}
							if(null != (java.lang.String)(request.getAttribute("showDate")))
							{ 
								paramMap.put("showDate",(java.lang.String)(request.getAttribute("showDate")));
							}
						pageContext.setAttribute("paramMap", paramMap);
				
              out.write("  \r\n");
              out.write("\t\t\t\t\t");
              //  html:link
              org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_name_action.get(org.apache.struts.taglib.html.LinkTag.class);
              _jspx_th_html_link_0.setPageContext(_jspx_page_context);
              _jspx_th_html_link_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_0);
              _jspx_th_html_link_0.setAction("/CIMA0125");
              _jspx_th_html_link_0.setName("paramMap");
              int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
              if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_link_0.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
                  out.print(DateUtil.date2ROCStr((java.util.Date)(request.getAttribute("repayDate"))));
                  out.write("\t\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_html_link_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_link_name_action.reuse(_jspx_th_html_link_0);
              out.write("\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_display_column_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_display_column_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_display_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_0);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  display:column
          org.displaytag.tags.ColumnTag _jspx_th_display_column_1 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.ColumnTag.class);
          _jspx_th_display_column_1.setPageContext(_jspx_page_context);
          _jspx_th_display_column_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
          _jspx_th_display_column_1.setTitle("類別");
          int _jspx_eval_display_column_1 = _jspx_th_display_column_1.doStartTag();
          if (_jspx_eval_display_column_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_display_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_display_column_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_display_column_1.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");

						java.math.BigDecimal capitalAmount = (java.math.BigDecimal)request.getAttribute("capitalAmountFuture");
						java.lang.String kind = new String();
						if(1 == capitalAmount.compareTo(new java.math.BigDecimal(0)))
						{
							kind = "還本付息" ;
						}
						else
						{
							kind = "付息" ;
						}
						request.setAttribute("kind",kind);
					
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              out.print(request.getAttribute("kind"));
              out.write("\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_display_column_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_display_column_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_display_column_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_1);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  display:column
          org.displaytag.tags.ColumnTag _jspx_th_display_column_2 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.ColumnTag.class);
          _jspx_th_display_column_2.setPageContext(_jspx_page_context);
          _jspx_th_display_column_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
          _jspx_th_display_column_2.setTitle("預計還本金額");
          int _jspx_eval_display_column_2 = _jspx_th_display_column_2.doStartTag();
          if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_display_column_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_display_column_2.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:link
              org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_name_action.get(org.apache.struts.taglib.html.LinkTag.class);
              _jspx_th_html_link_1.setPageContext(_jspx_page_context);
              _jspx_th_html_link_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_2);
              _jspx_th_html_link_1.setAction("/CIMA0125");
              _jspx_th_html_link_1.setName("paramMap");
              int _jspx_eval_html_link_1 = _jspx_th_html_link_1.doStartTag();
              if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_link_1.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t<p align=\"right\">");
                  out.print( new java.text.DecimalFormat("#,##0").format(request.getAttribute("capitalAmountFuture")));
                  out.write("</p>\r\n");
                  out.write("\t\t\t\t\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_name_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_1);
                  _jspx_th_html_hidden_0.setName("Cima0101Form");
                  _jspx_th_html_hidden_0.setProperty("sumCapitalAmountFuture");
                  _jspx_th_html_hidden_0.setValue(((java.math.BigDecimal)(request.getAttribute("capitalAmountFuture"))).toString());
                  int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
                  if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_html_hidden_value_property_name_nobody.reuse(_jspx_th_html_hidden_0);
                  out.write(" \r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_html_link_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_link_name_action.reuse(_jspx_th_html_link_1);
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_display_column_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_display_column_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_display_column_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_2);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  display:column
          org.displaytag.tags.ColumnTag _jspx_th_display_column_3 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.ColumnTag.class);
          _jspx_th_display_column_3.setPageContext(_jspx_page_context);
          _jspx_th_display_column_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
          _jspx_th_display_column_3.setTitle("實際日期");
          int _jspx_eval_display_column_3 = _jspx_th_display_column_3.doStartTag();
          if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_display_column_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_display_column_3.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  logic:notEmpty
              org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_10 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
              _jspx_th_logic_notEmpty_10.setPageContext(_jspx_page_context);
              _jspx_th_logic_notEmpty_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_3);
              _jspx_th_logic_notEmpty_10.setName("row");
              _jspx_th_logic_notEmpty_10.setProperty("id");
              int _jspx_eval_logic_notEmpty_10 = _jspx_th_logic_notEmpty_10.doStartTag();
              if (_jspx_eval_logic_notEmpty_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
                  out.print(request.getAttribute("showDate"));
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_notEmpty_10.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_notEmpty_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_10);
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_display_column_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_display_column_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_display_column_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_3);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  display:column
          org.displaytag.tags.ColumnTag _jspx_th_display_column_4 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.ColumnTag.class);
          _jspx_th_display_column_4.setPageContext(_jspx_page_context);
          _jspx_th_display_column_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
          _jspx_th_display_column_4.setTitle("實際還本金額");
          int _jspx_eval_display_column_4 = _jspx_th_display_column_4.doStartTag();
          if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_display_column_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_display_column_4.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:link
              org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_name_action.get(org.apache.struts.taglib.html.LinkTag.class);
              _jspx_th_html_link_2.setPageContext(_jspx_page_context);
              _jspx_th_html_link_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_4);
              _jspx_th_html_link_2.setAction("/CIMA0125");
              _jspx_th_html_link_2.setName("paramMap");
              int _jspx_eval_html_link_2 = _jspx_th_html_link_2.doStartTag();
              if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_link_2.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t<p align=\"right\">");
                  out.print( new java.text.DecimalFormat("#,##0").format(request.getAttribute("capitalAmountDPT")));
                  out.write("</p>\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_html_link_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_link_name_action.reuse(_jspx_th_html_link_2);
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_display_column_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_display_column_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_display_column_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_4);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  display:column
          org.displaytag.tags.ColumnTag _jspx_th_display_column_5 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.ColumnTag.class);
          _jspx_th_display_column_5.setPageContext(_jspx_page_context);
          _jspx_th_display_column_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
          _jspx_th_display_column_5.setTitle("實際付息金額");
          int _jspx_eval_display_column_5 = _jspx_th_display_column_5.doStartTag();
          if (_jspx_eval_display_column_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_display_column_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_display_column_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_display_column_5.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  html:link
              org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_name_action.get(org.apache.struts.taglib.html.LinkTag.class);
              _jspx_th_html_link_3.setPageContext(_jspx_page_context);
              _jspx_th_html_link_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_5);
              _jspx_th_html_link_3.setAction("/CIMA0125");
              _jspx_th_html_link_3.setName("paramMap");
              int _jspx_eval_html_link_3 = _jspx_th_html_link_3.doStartTag();
              if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_link_3.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t<p align=\"right\">");
                  out.print( new java.text.DecimalFormat("#,##0").format(request.getAttribute("interestAmountDPT")));
                  out.write("</p>\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_html_link_3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_link_name_action.reuse(_jspx_th_html_link_3);
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_display_column_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_display_column_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_display_column_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_5);
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  display:column
          org.displaytag.tags.ColumnTag _jspx_th_display_column_6 = (org.displaytag.tags.ColumnTag) _jspx_tagPool_display_column_title.get(org.displaytag.tags.ColumnTag.class);
          _jspx_th_display_column_6.setPageContext(_jspx_page_context);
          _jspx_th_display_column_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_table_0);
          _jspx_th_display_column_6.setTitle("實付本息合計");
          int _jspx_eval_display_column_6 = _jspx_th_display_column_6.doStartTag();
          if (_jspx_eval_display_column_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_display_column_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_display_column_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_display_column_6.doInitBody();
            }
            do {
              out.write("\t\r\n");
              out.write("\t\t\t\t\t");
              //  html:link
              org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_name_action.get(org.apache.struts.taglib.html.LinkTag.class);
              _jspx_th_html_link_4.setPageContext(_jspx_page_context);
              _jspx_th_html_link_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_column_6);
              _jspx_th_html_link_4.setAction("/CIMA0125");
              _jspx_th_html_link_4.setName("paramMap");
              int _jspx_eval_html_link_4 = _jspx_th_html_link_4.doStartTag();
              if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_link_4.doInitBody();
                }
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t<p align=\"right\">");
                  out.print( new java.text.DecimalFormat("#,##0").format(request.getAttribute("totalAmount")));
                  out.write("</p>\t\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_html_link_4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_link_name_action.reuse(_jspx_th_html_link_4);
              out.write("\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_display_column_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_display_column_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_display_column_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_display_column_title.reuse(_jspx_th_display_column_6);
          out.write("\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"capitalAmountDPT\" value=\"");
          out.print(request.getAttribute("capitalAmountDPT"));
          out.write("\" />\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"interestAmountDPT\" value=\"");
          out.print(request.getAttribute("interestAmountDPT"));
          out.write("\" />\r\n");
          out.write("\t\t\t\t<input type=\"hidden\" name=\"totalAmount\" value=\"");
          out.print(request.getAttribute("totalAmount"));
          out.write("\" />\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_display_table_0.doAfterBody();
          row = (java.lang.Object) _jspx_page_context.findAttribute("row");
          row_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("row_rowNum");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_table_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_display_table_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_display_table_name_id_class.reuse(_jspx_th_display_table_0);
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}