/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-07-03 09:23:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dropMember_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/common/nav.jsp", Long.valueOf(1530014139831L));
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1530089635221L));
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1530007682069L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write('\r');
      out.write('\n');
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
      out.write("\t\t//추후 회원의 구인게시물/이력서를 불러올 function - 회원정보를 parameter로 설정해야함\r\n");
      out.write("\t\tfunction loadMyList() {\r\n");
      out.write("\t\t\tlocation.href = \"/sp/views/member/join.jsp\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//추후 회원정보변경 페이지를 불러올 function - 회원정보를 parameter로 설정해야함\r\n");
      out.write("\t\tfunction updateMyInfo() {\r\n");
      out.write("\t\t\tlocation.href = \"/sp/views/recruitment/recruitmentForm.jsp\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\n");
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
      out.write("              <a class=\"nav-link\" href=\"/sp/views/member/join.jsp\">개인정보수정\r\n");
      out.write("                <span class=\"sr-only\">(current)</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"/sp/getResume.do\">이력서/업체정보관리</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"/sp/views/qna/qnaList.jsp\">Q&A</a>\r\n");
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
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction dropMember(){\r\n");
      out.write("\t\tlocation.href = \"/sp/dropMember.do\";\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction cancle(){\r\n");
      out.write("\t\tlocation.href = \"/sp/index.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write(" <div class=\"container\" style=\"min-height: 800px;\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".btn {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\n");
      out.write("\r\n");
      out.write("#loginFrm {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<!-- <script src=\"//developers.kakao.com/sdk/js/kakao.min.js\"></script> -->\r\n");
      out.write("<!-- branch test -->\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction login() {\r\n");
      out.write("\t\t$(\"#loginFrm\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction join() {\r\n");
      out.write("\t\tlocation.href = \"/sp/views/member/join.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction loadLocalList() {\r\n");
      out.write("\t\tlocation.href = \"/sp/localList.do\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction logout(){\r\n");
      out.write("\t\tlocation.href=\"/sp/views/member/logout.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-lg-3\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<div class=\"list-group\">\r\n");
      out.write("\t");
if(id == null){ 
      out.write("\r\n");
      out.write("\t\t<form id=\"loginFrm\" action=\"/sp/login.do\" method=\"POST\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control mb-1\" name=\"id\" placeholder=\"아이디\" /> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"form-control mb-1\" name=\"pw\" placeholder=\"비밀번호\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" size=\"15\" value=\"로그인\" class=\"btn btn-dark btn-sm btn-block\" onclick=\"login();\" /> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" size=\"15\" value=\"회원가입\" class=\"btn btn-dark btn-sm btn-block\" onclick=\"join();\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
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
      out.write("\t<div class=\"list-group\">\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-default btn-lg btn-block bg-dark\">맞춤알바</button>\r\n");
      out.write("\t\t<!-- 지역 알바로 이동 -->\r\n");
      out.write("\t\t<button type=\"button\" onclick=\"loadLocalList();\"\r\n");
      out.write("\t\t\tclass=\"btn btn-lg btn-block bg-dark\">지역알바</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-lg btn-block btn-dark\">일별알바</button>\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-lg btn-block btn-dark\">구직자정보</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("        <!-- /.col-lg-3 -->\r\n");
      out.write("        <div class=\"col-lg-9 mt-lg-auto\">\r\n");
      out.write("        \t<div class=\"row mt-4\">\r\n");
      out.write("        \t  <div class=\"col-lg-3\"></div>\r\n");
      out.write("\t\t\t  <div class=\"col-lg-6 bg-dark\">\r\n");
      out.write("\t\t\t  <br><br>\r\n");
      out.write("        \t\t<h3 align=\"center\" class=\"text-white-50\">정말 탈퇴하시겠습니까?</h3>\r\n");
      out.write("        \t\t<br>\r\n");
      out.write("\t\t\t  \t<div class=\"input-group float-right\">\r\n");
      out.write("\t\t\t    <span class=\"input-group-btn\">\r\n");
      out.write("\t\t\t        <button class=\"btn btn-dark btn-sm btn-block\" type=\"button\" onclick=\"dropMember();\">탈퇴</button>\r\n");
      out.write("\t\t\t    </span>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<span class=\"input-group-btn\">\r\n");
      out.write("\t\t\t        <button class=\"btn btn-dark btn-sm btn-block\" type=\"button\" onclick=\"cancle();\">취소</button>\r\n");
      out.write("\t\t\t    </span>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t  </div><!-- /.col-lg-6 -->\r\n");
      out.write("\t\t\t  <div class=\"col-lg-3\"></div>\r\n");
      out.write("        \t</div>\r\n");
      out.write("\t\t</div><!-- /.row -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.row -->\r\n");
      out.write("    </div>\r\n");
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
      out.write("    \r\n");
      out.write("    <script src=\"/sp/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
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
