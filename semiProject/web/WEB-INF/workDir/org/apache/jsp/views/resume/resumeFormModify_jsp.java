/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-07-03 11:54:46 UTC
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

public final class resumeFormModify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/common/nav.jsp", Long.valueOf(1530618078476L));
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1530618620105L));
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1530618078475L));
  }

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
      out.write('\r');
      out.write('\n');

	String id = (String)session.getAttribute("id");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>[오늘뭐해?]홈페이지</title>\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"/sp/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/sp/vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("   <script src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=154d504288d7ddddd16f6867efe451af&libraries=services,clusterer,drawing\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"/sp/css/shop-homepage.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("    <link href=\"/sp/css/daum.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"/sp/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction loadLocalList() {\r\n");
      out.write("\t\t\tlocation.href = \"/sp/localList.do\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//추후 회원의 구인게시물/이력서를 불러올 function - 회원정보를 parameter로 설정해야함\r\n");
      out.write("\t\tfunction loadMyList() {\r\n");
      out.write("\t\t\tlocation.href = \"/sp/views/member/join.jsp\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//추후 회원정보변경 페이지를 불러올 function - 회원정보를 parameter로 설정해야함\r\n");
      out.write("\t\tfunction updateMyInfo() {\r\n");
      out.write("\t\t\tlocation.href = \"/sp/views/recruitment/recruitmentForm.jsp\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//Q&A 게시판\r\n");
      out.write("\t      function qnaNew(){\r\n");
      out.write("\t          window.open(\"/sp/views/qna/qnaNew.jsp\",\"_blank\",\"width=600, height=700, left=auto,top=auto\");\r\n");
      out.write("\t       };\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("    <!-- Navigation -->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"/sp/indexList.do\">오늘뭐해?</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("          ");
if(id != null){ 
      out.write("\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"/sp/views/member/pwCheck.jsp\">개인정보수정\r\n");
      out.write("                <span class=\"sr-only\">(current)</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"/sp/getResume.do\">이력서/업체정보관리</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"/sp/myRecruitmentList.do\">이력서/업체정보관리</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link btn\" style=\"text-align: left;\" onclick=\"qnaNew();\">Q&A</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">근로내역/고용내역</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"/sp/views/member/dropMember.jsp\">회원탈퇴</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("           ");
} 
      out.write("\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write('\r');
      out.write('\n');
 MyResumeVo member = (MyResumeVo)request.getAttribute("member"); 
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t#userPhoto:hover{\r\n");
      out.write("\t\tcursor:pointer;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction modifyResume() {\r\n");
      out.write("\t\t$(\"#modifyResume\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("    <!-- Page Content -->\r\n");
      out.write("    <div class=\"container\"  style=\"min-height: 1000px\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".btn {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#loginFrm {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<!-- <script src=\"//developers.kakao.com/sdk/js/kakao.min.js\"></script> -->\r\n");
      out.write("<!-- branch test -->\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction login() {\r\n");
      out.write("\t\tvar id = $(\"#id\").val();\r\n");
      out.write("\t\tvar pw = $(\"#pw\").val();\r\n");
      out.write("\t\tif(pw==\"\"){\r\n");
      out.write("\t\t\tif(id=\"\"){\r\n");
      out.write("\t\t\t\talert(\"아이디를 입력하세요\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\talert(\"경호야 귀찮다고 비밀번호 안치고 그러면 안돼\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t$(\"#loginFrm\").submit();\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction join() {\r\n");
      out.write("\t\tlocation.href = \"/sp/views/member/join.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction loadLocalList() {\r\n");
      out.write("\t\tlocation.href = \"/sp/localList.do\";\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction searchByDateList() {\r\n");
      out.write("\t\tlocation.href = \"/sp/byDateList.do\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction logout(){\r\n");
      out.write("\t\tlocation.href=\"/sp/views/member/logout.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"col-lg-3\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<div class=\"list-group\">\r\n");
      out.write("\t");
if(id == null){ 
      out.write("\r\n");
      out.write("\t\t<form id=\"loginFrm\" action=\"/sp/login.do\" method=\"POST\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control mb-1\" id=\"id\" name=\"id\" placeholder=\"아이디\" /> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"form-control mb-1\" id=\"pw\" name=\"pw\" placeholder=\"비밀번호\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" size=\"15\" value=\"로그인\" class=\"btn btn-dark btn-sm btn-block\" onclick=\"login();\" /> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" size=\"15\" value=\"회원가입\" class=\"btn btn-dark btn-sm btn-block\" onclick=\"join();\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/sp/searchId.do\">아이디 찾기</a>\r\n");
      out.write("\t\t\t\t\t\t/\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">비밀번호 찾기</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<h5 class=\"text-center\">");
      out.print(id );
      out.write("님 환영합니다</h5>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-dark btn-sm btn-block\" onclick=\"logout();\">로그아웃</button>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<div class=\"list-group\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-default btn-lg btn-block bg-dark\">맞춤알바</button>\r\n");
      out.write("\t\t<!-- 지역 알바로 이동 -->\r\n");
      out.write("\t\t<button type=\"button\" onclick=\"loadLocalList();\"\r\n");
      out.write("\t\t\tclass=\"btn btn-lg btn-block bg-dark\">지역알바</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<button type=\"button\" onclick=\"searchByDateList();\"\r\n");
      out.write("\t\t\tclass=\"btn btn-lg btn-block btn-dark\">일별알바</button>\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-lg btn-block btn-dark\">구직자정보</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- /.col-lg-3 -->\r\n");
      out.write("        <div class=\"col-lg-9 mt-lg-auto\">\r\n");
      out.write("        \t<div class=\"row mt-4\">\r\n");
      out.write("        \t  <div class=\"col-lg-2\"></div>\r\n");
      out.write("\t\t\t  <div class=\"col-lg-8 bg-dark\">\r\n");
      out.write("\t\t\t  <br><br>\r\n");
      out.write("        \t\t<h3 align=\"center\" class=\"text-white-50\">이력서</h3>\r\n");
      out.write("        \t\t<br>\r\n");
      out.write("\t\t\t  <form id=\"modifyResume\" method=\"post\" action=\"/sp/modifyResume.do\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t  \t<div class=\"row\">\r\n");
      out.write("\t\t\t  \t\t<div class=\"col-3 mb-1\">\r\n");
      out.write("\t\t\t  \t\t");
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
      out.write("\t\t\t  \t\t</div>\r\n");
      out.write("\t\t\t\t  \t<div class=\"col-9\">\r\n");
      out.write("\t\t\t\t    \t<!-- 사용자 이름 -->\r\n");
      out.write("\t\t\t\t\t    <div class=\"input-group\" style=\"min-height: 33%\">\r\n");
      out.write("\t\t\t\t\t      \t<input type=\"text\" class=\"form-control mb-1\" name=\"name\" placeholder=\"");
      out.print(member.getName());
      out.write("\" readonly/>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t    \t<!-- 사용자 전화번호 -->\r\n");
      out.write("\t\t\t\t\t    <div class=\"input-group\" style=\"min-height: 33%\">\r\n");
      out.write("\t\t\t\t\t      \t<input type=\"text\" class=\"form-control mb-1\" name=\"phone\" placeholder=\"");
      out.print(member.getPhone());
      out.write("\"readonly/>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t    <!-- 사용자 이메일 -->\r\n");
      out.write("\t\t\t\t\t    <div class=\"input-group\" style=\"min-height: 33%\">\r\n");
      out.write("\t\t\t\t\t\t    <input type=\"email\" class=\"form-control mb-1\" name=\"email\" placeholder=\"");
      out.print(member.getEmail());
      out.write("\" readonly/>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t      \t<!-- 주소 -->\r\n");
      out.write("\t\t\t      <input type=\"text\" class=\"form-control mb-1 mr-1\" name=\"address\" id=\"address\" placeholder=\"");
      out.print(member.getAddress() );
      out.write("\" readonly/>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <div class=\"row\">\r\n");
      out.write("\t\t\t\t    <div class=\"btn-group mt-1 ml-3\">\r\n");
      out.write("\t\t\t\t    \t<button type=\"button\" style=\"min-width: 130px\" class=\"btn btn-lg btn-dark dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t    \t<span class=\"caret\" id=\"acBtn\">학력</span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"achievement\" id=\"achievementValue\"/>\r\n");
      out.write("\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu bg-dark\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t  <li><button type=\"button\" onclick=\"acSelect(this);\" class=\"btn btn-dark btn-sm btn-block\" value=\"초졸\">초졸</button></li>\r\n");
      out.write("\t\t\t\t\t\t  <li><button type=\"button\" onclick=\"acSelect(this);\" class=\"btn btn-dark btn-sm btn-block\" value=\"중졸\">중졸</button></li>\r\n");
      out.write("\t\t\t\t\t\t  <li><button type=\"button\" onclick=\"acSelect(this);\" class=\"btn btn-dark btn-sm btn-block\" value=\"고졸\">고졸</button></li>\r\n");
      out.write("\t\t\t\t\t\t  <li><button type=\"button\" onclick=\"acSelect(this);\" class=\"btn btn-dark btn-sm btn-block\" value=\"대졸\">대졸</button></li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t    <div class=\"btn-group mt-1 ml-1\">\r\n");
      out.write("\t\t\t\t    \t<button type=\"button\" style=\"min-width: 130px\" class=\"btn btn-lg btn-dark dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t    \t<span class=\"caret\" id=\"dBtn\">장애여부</span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t    \t<input type=\"hidden\" name=\"dValue\" id=\"dValue\"/><!-- 장애여부에 대한 값을 저장할 hidden input -->\r\n");
      out.write("\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu bg-dark\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t  <li><button type=\"button\" onclick=\"dSelect(this);\" name=\"disability\" class=\"btn btn-dark btn-sm btn-block\" value=\"1\">장애있음</button></li>\r\n");
      out.write("\t\t\t\t\t\t  <li><button type=\"button\" onclick=\"dSelect(this);\" name=\"disability\" class=\"btn btn-dark btn-sm btn-block\" value=\"0\">장애없음</button></li>\r\n");
      out.write("\t\t\t\t\t\t  <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t    <div class=\"btn-group mt-1 ml-1\">\r\n");
      out.write("\t\t\t\t    \t<button type=\"button\" style=\"min-width: 130px\" class=\"btn btn-lg btn-dark dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t    \t<span id=\"mBtn\"  class=\"caret\">병역사항</span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t    \t<input type=\"hidden\" name=\"mValue\" id=\"mValue\"><!-- 병역여부에 대한 값을 저장할 hidden input -->\r\n");
      out.write("\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t\t  <ul class=\"dropdown-menu bg-dark\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t    <li><button type=\"button\" onclick=\"mSelect(this);\" name=\"miltary\" class=\"btn btn-dark btn-sm btn-block\" value=\"1\">군필</button></li>\r\n");
      out.write("\t\t\t\t\t\t    <li><button type=\"button\" onclick=\"mSelect(this);\" name=\"miltary\" class=\"btn btn-dark btn-sm btn-block\" value=\"0\">면제</button></li>\r\n");
      out.write("\t\t\t\t\t\t    <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <br>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <h4 class=\"text-white-50\">근무 희망 사항</h4>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <div class=\"row\">\r\n");
      out.write("\t\t\t    \t<div class=\"col-3\">\r\n");
      out.write("\t\t\t\t    \t<select name = \"business_type\" multiple class=\"custom-select-lg mt-1 ml-3 btn-dark\" style=\"min-height: 150px\">\r\n");
      out.write("\t\t\t\t\t\t  <option disabled=\"disabled\" class=\"text-white-50\">[업종]</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value = \"사무직\">사무직</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value = \"서비스\">서비스</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value = \"유통\">유통/판매</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value = \"음료\">외식/음료</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value = \"고객상담\">고객상담</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value = \"생산/건설\">생산/건설</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    \t<div class=\"col-2\">\r\n");
      out.write("\t\t\t\t    \t<select name=\"career\" multiple class=\"custom-select-lg mt-1 ml-3 btn-dark\" style=\"min-height: 150px\">\r\n");
      out.write("\t\t\t\t\t\t  <option disabled=\"disabled\" class=\"text-white-50\">[경력]</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value = \"1\">있음</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value = \"0\">없음</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t    \t</div>\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t\t    <div class=\"col-7\">\r\n");
      out.write("\t\t\t\t    \t<div class=\"mt-1 ml-3\" style=\"max-height: 33%\">\r\n");
      out.write("\t\t\t\t\t    \t<h5 class=\"text-white\">근무가능일</h5>\r\n");
      out.write("\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t    \t<div class=\"mt-1 btn btn-md btn-dark\" style=\"max-height: 33%\">\r\n");
      out.write("\t\t\t\t    \t\t<label>근무 가능 일</label>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"date\" class=\"btn-dark\" name=\"dateD\"/>\r\n");
      out.write("\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <br>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <input type=\"hidden\" name=\"workTime\" id=\"workTime\"/> <!-- 희망근무시간대 -->\r\n");
      out.write("\t\t\t    <div class=\"btn-group-toggle ml-3\" id=\"workTimeCkb\">\r\n");
      out.write("\t\t\t    \t<div class=\"text-white\">희망 근무시간대</div>\r\n");
      out.write("\t\t\t    \t<label class=\"checkbox-inline btn-dark btn-md mr-3\">\r\n");
      out.write("\t\t\t\t\t  <input type=\"checkbox\" name=\"workTime[]\" class=\"inlineCheckbox\" value=\"오전\" onclick=\"checkBoxSelector(this, 0);\"> 오전\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t<label class=\"checkbox-inline btn-dark btn-md mr-3\">\r\n");
      out.write("\t\t\t\t\t  <input type=\"checkbox\" name=\"workTime[]\" class=\"inlineCheckbox\" value=\"오후\" onclick=\"checkBoxSelector(this, 1);\"> 오후\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t<label class=\"checkbox-inline btn-dark btn-md mr-3\">\r\n");
      out.write("\t\t\t\t\t  <input type=\"checkbox\" name=\"workTime[]\" class=\"inlineCheckbox\" value=\"저녁\" onclick=\"checkBoxSelector(this, 2);\"> 저녁\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t<label class=\"checkbox-inline btn-dark btn-md mr-3\">\r\n");
      out.write("\t\t\t\t\t  <input type=\"checkbox\" name=\"workTime[]\" class=\"inlineCheckbox\" value=\"야간\" onclick=\"checkBoxSelector(this, 3);\"> 야간\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t<label class=\"checkbox-inline btn-dark btn-md mr-3\">\r\n");
      out.write("\t\t\t\t\t  <input type=\"checkbox\" name=\"workTime[]\" class=\"inlineCheckbox\" value=\"상관없음\" onclick=\"checkBoxSelector(this, 4);\"> 상관없음\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t      <input type=\"text\" class=\"form-control mb-1 mr-1\" name=\"introduce_title\" id=\"introduce_title\" placeholder=\"이력서 한마디[15자 이내로 입력해주세요]\"/>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <div>\r\n");
      out.write("\t\t\t    \t<textarea name=\"introduce\"  id=\"introduce\" class=\"col-12\" rows=\"5\" placeholder=\"자기소개 [150자 이내로 입력해주세요]\"></textarea>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <div>\r\n");
      out.write("\t\t\t    \t<input type=\"hidden\" name=\"resume_id\" value=");
      out.print(member.getResume_id());
      out.write(">\r\n");
      out.write("\t\t\t    \t<input type=\"submit\" class=\"btn btn-light text-dark mt-4 mb-2\" onclick=\"modifyResume();\"/>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t  </form>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t  </div><!-- /.col-lg-6 -->\r\n");
      out.write("\t\t\t  <div class=\"col-lg-2\"></div>\r\n");
      out.write("        \t</div>\r\n");
      out.write("\t\t</div><!-- /.row -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.row -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.container -->\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
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
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer class=\"py-5 bg-dark\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2017</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.container -->\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript -->\r\n");
      out.write("   <!--  <script src=\"/sp/vendor/jquery/jquery.min.js\"></script> -->\r\n");
      out.write("    <script src=\"/sp/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- 브렌치생성코드 -->");
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