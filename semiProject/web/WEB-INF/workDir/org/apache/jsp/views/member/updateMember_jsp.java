/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-07-03 11:52:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.what.semi.member.model.vo.MemberVo;

public final class updateMember_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

	MemberVo member = (MemberVo)request.getAttribute("member");
	String lower = member.getMember_type().toLowerCase();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\tlabel{\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar searchAddr;\r\n");
      out.write("\t\r\n");
      out.write("\tfunction openAddressPopup() {\r\n");
      out.write("\t\tvar themeObj = {\r\n");
      out.write("     \t\t   bgColor: \"#162525\", //바탕 배경색\r\n");
      out.write("     \t\t   searchBgColor: \"#162525\", //검색창 배경색\r\n");
      out.write("     \t\t   contentBgColor: \"#162525\", //본문 배경색(검색결과,결과없음,첫화면,검색서제스트)\r\n");
      out.write("     \t\t   pageBgColor: \"#162525\", //페이지 배경색\r\n");
      out.write("     \t\t   textColor: \"#FFFFFF\", //기본 글자색\r\n");
      out.write("     \t\t   queryTextColor: \"#FFFFFF\", //검색창 글자색\r\n");
      out.write("     \t\t   //postcodeTextColor: \"\", //우편번호 글자색\r\n");
      out.write("     \t\t   //emphTextColor: \"\", //강조 글자색\r\n");
      out.write("     \t\t   outlineColor: \"#444444\" //테두리\r\n");
      out.write("     \t\t};\r\n");
      out.write("\t\tnew daum.Postcode({\r\n");
      out.write("     \t   theme: themeObj,\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                var fullAddr = ''; // 최종 주소 변수\r\n");
      out.write("                var extraAddr = ''; // 조합형 주소 변수\r\n");
      out.write("\r\n");
      out.write("                // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                    fullAddr = data.roadAddress;\r\n");
      out.write("\r\n");
      out.write("                } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                    fullAddr = data.jibunAddress;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 사용자가 선택한 주소가 도로명 타입일때 조합한다.\r\n");
      out.write("                if(data.userSelectedType === 'R'){\r\n");
      out.write("                    //법정동명이 있을 경우 추가한다.\r\n");
      out.write("                    if(data.bname !== ''){\r\n");
      out.write("                        extraAddr += data.bname;\r\n");
      out.write("                    }\r\n");
      out.write("                    // 건물명이 있을 경우 추가한다.\r\n");
      out.write("                    if(data.buildingName !== ''){\r\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                    }\r\n");
      out.write("                    // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.\r\n");
      out.write("                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                $(\"#zipcode\").val(data.zonecode);//5자리 새우편번호 사용\r\n");
      out.write("                $(\"#address\").val(fullAddr);\r\n");
      out.write("\r\n");
      out.write("                // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("                $(\"#addressDetail\").focus();\r\n");
      out.write("                searchAddr = fullAddr;\r\n");
      out.write("            },\r\n");
      out.write("\t\t    onclose: function(state) {\r\n");
      out.write("\t\t        //state는 우편번호 찾기 화면이 어떻게 닫혔는지에 대한 상태 변수 이며, 상세 설명은 아래 목록에서 확인하실 수 있습니다.\r\n");
      out.write("\t\t        if(state === 'FORCE_CLOSE'){\r\n");
      out.write("\t\t            //사용자가 브라우저 닫기 버튼을 통해 팝업창을 닫았을 경우, 실행될 코드를 작성하는 부분입니다.\r\n");
      out.write("\t\r\n");
      out.write("\t\t        } else if(state === 'COMPLETE_CLOSE'){\r\n");
      out.write("\t\t            //사용자가 검색결과를 선택하여 팝업창이 닫혔을 경우, 실행될 코드를 작성하는 부분입니다.\r\n");
      out.write("\t\t            //oncomplete 콜백 함수가 실행 완료된 후에 실행됩니다.\r\n");
      out.write("\t\t            console.log('검색 종료', searchAddr); \r\n");
      out.write("\t\t         // 주소-좌표 변환 객체를 생성합니다\r\n");
      out.write("\t\t        \tvar geocoder = new daum.maps.services.Geocoder();\r\n");
      out.write("\r\n");
      out.write("\t\t        \t// 주소로 좌표를 검색합니다\r\n");
      out.write("\t\t        \tgeocoder.addressSearch(searchAddr, function(result, status) {\r\n");
      out.write("\r\n");
      out.write("\t\t        \t    // 정상적으로 검색이 완료됐으면 \r\n");
      out.write("\t\t        \t     if (status === daum.maps.services.Status.OK) {\r\n");
      out.write("\t\t        \t    \t $(\"#latitude\").val(result[0].y);\r\n");
      out.write("\t\t        \t    \t $(\"#longitude\").val(result[0].x);\r\n");
      out.write("\t\t        \t    \t \r\n");
      out.write("\t\t        \t        var coords = new daum.maps.LatLng(result[0].y, result[0].x);\r\n");
      out.write("\t\t        \t\t\tconsole.log(coords);\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t        \t        // 결과값으로 받은 위치를 마커로 표시합니다\r\n");
      out.write("\t\t        \t        \r\n");
      out.write("\t\t        \t    } \r\n");
      out.write("\t\t        \t});    \r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    }\r\n");
      out.write("            \r\n");
      out.write("        }).open();\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction update(){\r\n");
      out.write("\t\t$(\"#updateFrm\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction updatePw(){\r\n");
      out.write("\t\tlocation.href = \"/sp/views/member/updatePw.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page Content -->\r\n");
      out.write("    <div class=\"container\" style=\"min-height: 800px;\">\r\n");
      out.write("    \r\n");
      out.write("      <div class=\"row\">\r\n");
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
      out.write("        <!-- /.col-lg-3 -->\r\n");
      out.write("        <div class=\"col-lg-9 mt-lg-auto\">\r\n");
      out.write("        \t<div class=\"row mt-4\">\r\n");
      out.write("        \t  <div class=\"col-lg-3\"></div>\r\n");
      out.write("\t\t\t  <div class=\"col-lg-6 bg-dark\">\r\n");
      out.write("\t\t\t  <br><br>\r\n");
      out.write("        \t\t<h3 align=\"center\" class=\"text-white-50\">회원정보수정</h3>\r\n");
      out.write("        \t\t<br>\r\n");
      out.write("\t\t\t  <form id=\"updateFrm\" method=\"post\" action=\"/sp/updateMember.do\">\r\n");
      out.write("\t\t\t  <div class=\"btn-group mt-3\">\r\n");
      out.write("\t\t\t    \t<button type=\"button\" id=\"tBtn\" class=\"btn btn-dark dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t    \t<span class=\"caret\">회원타입</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t    \t<input type=\"hidden\" name=\"rTypeValue\" id=\"rTypeValue\">\r\n");
      out.write("\t\t\t\t\t  <ul class=\"dropdown-menu bg-dark\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t    <li><button type=\"button\" onclick=\"typeSelect(this);\" id=\"JS\" name=\"js\" class=\"btn btn-dark btn-sm btn-block\" value=\"JS\">구직자</button></li>\r\n");
      out.write("\t\t\t\t\t    <li><button type=\"button\" onclick=\"typeSelect(this);\" id=\"BO\" name=\"bo\" class=\"btn btn-dark btn-sm btn-block\" value=\"BO\">업주</button></li>\r\n");
      out.write("\t\t\t\t\t    <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    \t<!-- 사용자 이름 -->\r\n");
      out.write("\t\t\t      <input type=\"text\" class=\"form-control mb-1\" name=\"name\" placeholder=\"이름\" value=\"");
      out.print(member.getName());
      out.write("\"/>\r\n");
      out.write("\t\t\t      \r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t    \t<!-- 사용자 이메일 -->\r\n");
      out.write("\t\t\t      <input type=\"email\" class=\"form-control mb-1\" name=\"email\" placeholder=\"email\" value=\"");
      out.print(member.getEmail());
      out.write("\"/>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t    \t<!-- 사용자 전화번호 -->\r\n");
      out.write("\t\t\t    \t<input type=\"text\" class=\"form-control mb-1\" name=\"phone\" placeholder=\"휴대폰번호(-를 빼고 입력하세요)\" value=\"");
      out.print(member.getPhone());
      out.write("\"/>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t    \t<!-- 주소검색을 통해 입력받은 우편번호 저장 input -->\r\n");
      out.write("\t\t\t      <input type=\"hidden\" name=\"zipcode\" id=\"zipcode\" value=\"");
      out.print(member.getZipcode());
      out.write("\"/>\r\n");
      out.write("\t\t\t      <input type=\"hidden\" name=\"latitude\" id=\"latitude\" value=\"");
      out.print(member.getLatitude());
      out.write("\"/>\r\n");
      out.write("\t\t\t      <input type=\"hidden\" name=\"longitude\" id=\"longitude\" value=\"");
      out.print(member.getLongitude());
      out.write("\"/>\r\n");
      out.write("\t\t\t      \t<!-- 주소 -->\r\n");
      out.write("\t\t\t      <input type=\"text\" class=\"form-control mb-1\" name=\"address\" id=\"address\" placeholder=\"주소\" value=\"");
      out.print(member.getAddress());
      out.write("\"/>\r\n");
      out.write("\t\t\t      <span class=\"input-group-btn\">\r\n");
      out.write("\t\t\t        <button class=\"btn btn-light text-dark ml-1\" type=\"button\" onclick=\"openAddressPopup(); \">주소 검색</button>\r\n");
      out.write("\t\t\t      </span>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t    \t<!-- 상세주소 입력 -->\r\n");
      out.write("\t\t\t      <input type=\"text\" class=\"form-control mb-1\" name=\"addressDetail\" id=\"addressDetail\" placeholder=\"상세주소\" value=\"");
      out.print(member.getAddress_detail());
      out.write("\"/>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <input type=\"button\" class=\"btn btn-dark btn-sm btn-block\" value=\"회원정보수정\" onclick=\"update();\"/>\r\n");
      out.write("\t\t\t    <input type=\"button\" class=\"btn btn-dark btn-sm btn-block\" value=\"비밀번호변경\" onclick=\"updatePw();\"/>\r\n");
      out.write("\t\t\t    <br>\r\n");
      out.write("\t\t\t  </form>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t  </div><!-- /.col-lg-6 -->\r\n");
      out.write("\t\t\t  <div class=\"col-lg-3\"></div>\r\n");
      out.write("        \t</div>\r\n");
      out.write("\t\t</div><!-- /.row -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.row -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.container -->\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\tfunction typeSelect(obj) {\r\n");
      out.write("\t\tvar text = $(obj).text();\r\n");
      out.write("\t\tvar value = $(obj).val();\r\n");
      out.write("\t\t$(\"#tBtn\").text(text);\r\n");
      out.write("\t\t$(\"#rTypeValue\").val(value);\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\ttypeSelect($(\"#");
      out.print(member.getMember_type());
      out.write("\"));\r\n");
      out.write("\t});\r\n");
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
