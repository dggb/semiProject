/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-07-03 11:53:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.what.semi.common.template.PageInfo;
import com.what.semi.recruitment.model.vo.RecruitmentVo;
import java.util.ArrayList;

public final class manageRecruitment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.what.semi.common.template.PageInfo");
    _jspx_imports_classes.add("com.what.semi.recruitment.model.vo.RecruitmentVo");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   ");

   ArrayList<RecruitmentVo> list = 
	(ArrayList<RecruitmentVo>)request.getAttribute("list"); 
   
   
   java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("MM / dd");

PageInfo pi = (PageInfo)request.getAttribute("pi");
int listCount = pi.getTotalCount();
int currentPage = pi.getCurrentPage();
int maxPage = pi.getMaxPage();
int startPage = pi.getStartPage();
int endPage = pi.getEndPage();  
   
      out.write(" \r\n");
      out.write("    \r\n");
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
      out.write("\r\n");
      out.write("<script src=\"https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction updateRecruit(){\r\n");
      out.write("\t\tlocation.href = \"/sp/views/recruitment/recruitmentForm.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction updateResume() {\r\n");
      out.write("\t\tlocation.href = \"/sp/views/resume/memberResume.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction recruitmentDetail(i){\r\n");
      out.write("\t\tlocation.href=\"/sp/recruitmentDetail.do?recId=\"+i+\"&currentPage=\"+");
      out.print(currentPage);
      out.write(";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write(".btn-link{\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".list-table{\r\n");
      out.write("border-top:2px #5D5D5D solid;\r\n");
      out.write("margin-top:20px;\r\n");
      out.write("padding-left:100px;\r\n");
      out.write("padding-right:20px;\r\n");
      out.write("width:700px;\r\n");
      out.write("}\r\n");
      out.write(".list-table tr{\r\n");
      out.write("border-top:1px #cccccc solid;\r\n");
      out.write("}\r\n");
      out.write(".table-td{\r\n");
      out.write("padding:5px;\r\n");
      out.write("min-width:80px;\r\n");
      out.write("}\r\n");
      out.write(".table-td-location{\r\n");
      out.write("padding:5px;\r\n");
      out.write("min-width:100px;\r\n");
      out.write("}\r\n");
      out.write(".td-title{\r\n");
      out.write("width:350px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\t<div class=\"container\" style=\"min-height: 800px\">\t<!-- 내용을 담아놓을 컨테이너 -->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("      ");
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
      out.write("\t      <div class=\"col-lg-9\" style='padding-top:50px; padding-left:30px;'>\r\n");
      out.write("     <h3>구인게시글 관리</h3>\r\n");
      out.write("\t    <!-- Page Content -->\r\n");
      out.write("\t\t     <!-- <div class=\"media mt-4 border rounded bg-light\">\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t\t  \t  <div class=\"media-left media-middle\">\r\n");
      out.write("\t\t\t    \t<a href=\"/sp/views/recruitment/recruitmentForm.jsp\">\r\n");
      out.write("\t\t\t     \t <img class=\"media-object btn-link\" onclick=\"updateRecruit();\" src=\"http://placehold.it/150x150\" alt=\"...\">\r\n");
      out.write("\t\t\t    \t</a>\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t  \t<div class=\"media-body\">\r\n");
      out.write("\t\t\t    \t<h4 class=\"media-heading btn-link\" onclick=\"updateRecruit();\">[구인게시글 제목]</h4>\r\n");
      out.write("\t\t\t    \t세부사항\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<table class=\"list-table\">\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<th><div class=\"table-td\">게시여부</div></th><th><div class=\"table-td\">날짜</div></th><th><div class=\"td-title\">기업명/글제목</div></th><th><div class=\"table-td-location\">지역</div></th><th><div class=\"table-td\">급여</div></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
for(int i =0; i<list.size();i++) {
				String[] locationArr = list.get(i).getAddress().split(" ");
				String location = locationArr[0]+" "+locationArr[1];
			
      out.write("\r\n");
      out.write("\t\t\t<tr onclick=\"recruitmentDetail(");
      out.print(list.get(i).getRecruitment_id());
      out.write(");\">\r\n");
      out.write("\t\t\t<td class=\"table-td\">");
if(list.get(i).getIs_post()==0){ 
      out.write("기간만료");
}else{ 
      out.write('게');
      out.write('시');
      out.write('중');
} 
      out.write("</td><td class=\"table-td\">");
      out.print(df.format(list.get(i).getWork_day()) );
      out.write("</td><td class=\"td-title\"><b>");
      out.print(list.get(i).getRecruitment_name() );
      out.write("</b><br>");
      out.print(list.get(i).getRecruitment_title() );
      out.write("</td><td class=\"table-td-location\">");
      out.print(location);
      out.write("</td><th class=\"table-td\">");
      out.print(list.get(i).getPay() );
      out.write("원</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!--====================================\t페이지선택버튼\t ==================================  -->\r\n");
      out.write("\t        <div class=\"btn-toolbar mb-1\" role=\"toolbar\">\r\n");
      out.write("\t\t\t  <div class=\"btn-group\" role=\"group\">\r\n");
      out.write("\t\t\t\t\t<button onclick=\"movePage(");
      out.print(currentPage==1?1:currentPage-1);
      out.write(");\" type=\"button\" class=\"btn btn-default bg-dark text-white\"><</button>\r\n");
      out.write("\t\t\t\t\t");
for(int i = startPage; i <= endPage; i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
if(currentPage != i){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button onclick=\"movePage();\" type=\"button\" class=\"btn btn-default bg-dark text-white\">1</button>\r\n");
      out.write("\t\t\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default bg-dark text-white\">1</button>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t<button onclick=\"movePage(");
      out.print(currentPage==maxPage?maxPage:maxPage+1);
      out.write(");\" type=\"button\" class=\"btn btn-default bg-dark text-white\">></button>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</div>  \r\n");
      out.write("\t\t\t\t<!--=========================================================================================-->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.row -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.container -->\r\n");
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
