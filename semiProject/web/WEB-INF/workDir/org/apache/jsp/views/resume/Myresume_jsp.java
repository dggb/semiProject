/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-07-05 08:44:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.resume;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.what.semi.resume.model.vo.MyResumeVo;
import com.what.semi.member.model.vo.MemberVo;

public final class Myresume_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.what.semi.resume.model.vo.MyResumeVo");
    _jspx_imports_classes.add("com.what.semi.member.model.vo.MemberVo");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>[오늘뭐해?]홈페이지</title>\r\n");
      out.write("<link href=\"/sp/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/sp/vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=154d504288d7ddddd16f6867efe451af&libraries=services,clusterer,drawing\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"/sp/css/shop-homepage.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"/sp/css/daum.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"/sp/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
MyResumeVo member = (MyResumeVo) request.getAttribute("member");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction writeResume() {\r\n");
      out.write("\t\t$(\"#writeResume\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Page Content -->\r\n");
      out.write("<div class=\"container\" style=\"min-height: 1000px\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<!-- /.col-lg-3 -->\r\n");
      out.write("\t\t<div class=\"col-lg-9 mt-lg-auto\">\r\n");
      out.write("\t\t\t<div class=\"row mt-4\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-2\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-8 bg-dark\">\r\n");
      out.write("\t\t\t\t\t<h3 align=\"center\" class=\"text-white-50\">이력서</h3>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-3 mb-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(null!=member.getProfile_image_src()){ 
      out.write("\r\n");
      out.write("\t\t\t\t  \t\t<img alt=\"\" height=\"140px\" width=\"120px\" src=\"/sp/profile_photo/");
      out.print(member.getProfile_image_src() );
      out.write("\" id=\"userPhoto\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" id=\"userPhotoInput\" name=\"userPhoto\"  onchange=\"printImage(this);\"/> \r\n");
      out.write("\t\t\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"\" height=\"140px\" width=\"120px\" src=\"http://placehold.it/300x400\" id=\"userPhoto\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" id=\"userPhotoInput\" name=\"userPhoto\"  onchange=\"printImage(this);\"/> \r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 사용자 이름 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\" style=\"min-height: 33%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control mb-1\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(member.getName());
      out.write("\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 사용자 전화번호 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\" style=\"min-height: 33%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control mb-1\" name=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(member.getPhone());
      out.write("\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 사용자 이메일 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\" style=\"min-height: 33%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control mb-1\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(member.getEmail());
      out.write("\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 주소 -->\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control mb-1 mr-1\" name=\"address\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"address\" placeholder=\"");
      out.print(member.getAddress());
      out.write("\" readonly />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group mt-1 ml-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" style=\"min-width: 130px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-lg btn-dark dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span readonly class=\"caret\" id=\"acBtn\">");
      out.print(member.getAchievement() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group mt-1 ml-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" style=\"min-width: 130px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-lg btn-dark dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"caret\" id=\"dBtn\">");
      out.print(member.getDisability()==1?"장애":"비장애" );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group mt-1 ml-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" style=\"min-width: 130px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-lg btn-dark dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"mBtn\" class=\"caret\">");
      out.print(member.getMiltary_service()==1?"군필":"미필" );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"text-white-50\">근무 희망 사항</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 근무희탕타입 -->\r\n");
      out.write("\t\t\t\t\t\t\t<p>");
      out.print(member.getBusiness_type() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>");
      out.print(member.getCareer()==1?"있음":"없음" );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mt-1 ml-3\" style=\"max-height: 33%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"text-white\">근무가능일</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mt-1 btn btn-md btn-dark\" style=\"max-height: 33%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(member.getWorkable_days() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<br> <input type=\"hidden\" name=\"workTime\" id=\"workTime\" />\r\n");
      out.write("\t\t\t\t\t\t<!-- 희망근무시간대 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-group-toggle ml-3\" id=\"workTimeCkb\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-white\">희망 근무시간대</div>\r\n");
      out.write("\t\t\t\t\t\t\t<p>");
      out.print(member.getWorkTime() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox-inline btn-dark btn-md mr-3\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"workTime[]\" class=\"inlineCheckbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"오전\" onclick=\"checkBoxSelector(this, 0);\"> 오전\r\n");
      out.write("\t\t\t\t\t\t\t</label> <label class=\"checkbox-inline btn-dark btn-md mr-3\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"workTime[]\" class=\"inlineCheckbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"오후\" onclick=\"checkBoxSelector(this, 1);\"> 오후\r\n");
      out.write("\t\t\t\t\t\t\t</label> <label class=\"checkbox-inline btn-dark btn-md mr-3\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"workTime[]\" class=\"inlineCheckbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"저녁\" onclick=\"checkBoxSelector(this, 2);\"> 저녁\r\n");
      out.write("\t\t\t\t\t\t\t</label> <label class=\"checkbox-inline btn-dark btn-md mr-3\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"workTime[]\" class=\"inlineCheckbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"야간\" onclick=\"checkBoxSelector(this, 3);\"> 야간\r\n");
      out.write("\t\t\t\t\t\t\t</label> <label class=\"checkbox-inline btn-dark btn-md mr-3\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"workTime[]\" class=\"inlineCheckbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"상관없음\" onclick=\"checkBoxSelector(this, 4);\"> 상관없음\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control mb-1 mr-1\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"introduce_title\" id=\"introduce_title\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(member.getIntroduce_title());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<textarea name=\"introduce\" id=\"introduce\" class=\"col-12\" rows=\"5\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(member.getIntroduce());
      out.write("\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.col-lg-6 -->\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-2\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.row -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.container -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction acSelect(obj) {\r\n");
      out.write("\t\tvar text = $(obj).text();\r\n");
      out.write("\t\tvar value = $(obj).val();\r\n");
      out.write("\t\t$(\"#acBtn\").text(text);\r\n");
      out.write("\t\t$(\"#achievementValue\").val(value);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction dSelect(obj) {\r\n");
      out.write("\t\tvar text = $(obj).text();\r\n");
      out.write("\t\tvar value = $(obj).val();\r\n");
      out.write("\t\t$(\"#dBtn\").text(text);\r\n");
      out.write("\t\t$(\"#dValue\").val(value);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction mSelect(obj) {\r\n");
      out.write("\t\tvar text = $(obj).text();\r\n");
      out.write("\t\tvar value = $(obj).val();\r\n");
      out.write("\t\t$(\"#mBtn\").text(text);\r\n");
      out.write("\t\t$(\"#mValue\").val(value);\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#userPhotoInput\").hide();\r\n");
      out.write("\t\t$(\"#userPhoto\").click(function(){\r\n");
      out.write("\t\t\t$(\"#userPhotoInput\").click();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction printImage(obj){\r\n");
      out.write("\t\tif(obj.files && obj.files[0]){\r\n");
      out.write("\t\t\tvar reader = new FileReader();\r\n");
      out.write("\t\t\treader.onload=function(e){\r\n");
      out.write("\t\t\t\t\t$(\"#userPhoto\").attr(\"src\", e.target.result);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treader.readAsDataURL(obj.files[0]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction checkBoxSelector(obj, index){\r\n");
      out.write("\t\tvar $chkBoxArr = $(\".inlineCheckbox\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar send_array = Array();\r\n");
      out.write("\t\tvar send_cnt = 0;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(index==4 && $(obj).prop(\"checked\")){\r\n");
      out.write("\t\t\t$chkBoxArr.each(function(index, value){\r\n");
      out.write("\t\t\t\tif(index != 4){\r\n");
      out.write("\t\t\t\t\t$(this).prop(\"checked\", false);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}else if(index!=4 && $(obj).prop(\"checked\")){\r\n");
      out.write("\t\t\t$chkBoxArr.eq(4).prop(\"checked\", false);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(i=0;i<$chkBoxArr.length;i++) {\r\n");
      out.write("\t\t    if ($chkBoxArr[i].checked == true){\r\n");
      out.write("\t\t        send_array[send_cnt] = $chkBoxArr[i].value;\r\n");
      out.write("\t\t        send_cnt++;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar resultStr = send_array.join(\",\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#workTime\").val(resultStr);\r\n");
      out.write("\t\tconsole.log(resultStr);\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Bootstrap core JavaScript -->\r\n");
      out.write("<!--  <script src=\"/sp/vendor/jquery/jquery.min.js\"></script> -->\r\n");
      out.write("<script src=\"/sp/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
