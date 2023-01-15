<%@page import="com.what.semi.common.template.PageInfo"%>
<%@page import="com.what.semi.qna.model.vo.QnaVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
   String id = (String)session.getAttribute("id"); 
   ArrayList<QnaVo> qna = (ArrayList<QnaVo>)request.getAttribute("qna");

   PageInfo pi = (PageInfo)request.getAttribute("pi");
   int listCount = pi.getTotalCount();
   int currentPage = pi.getCurrentPage();
   int maxPage = pi.getMaxPage();
   int startPage = pi.getStartPage();
   int endPage = pi.getEndPage();
 
%>

<!DOCTYPE html >

<html>
<head>
<style>
.top {
    padding-top: 15px;
}

.top ul {
    height: 44px;
    border-bottom: 1px solid #363d54;
    list-style: none;
    padding: 0;
    margin: 0;	
    margin: 0;   
    display: block;
    -webkit-margin-before: 1.5em;
    -webkit-margin-after: 1em;
    -webkit-margin-start: 0px;
    -webkit-margin-end: 0px;
    -webkit-padding-start: 0px;
}

.top ul li.m2 a{
    height: 44.5px;
    border: 1px solid #363d54;
    border-bottom: 0;
    color: #222;
    background: #fff;
}


.top ul li {
    float: left;
    margin-right: -1px;
    list-style: none;
    display: list-item;
    text-align: -webkit-match-parent;
}

.top ul li a {
    display: block;
    padding: 0 25px;
    height: 43px;
    line-height: 43px;
    border: 1px solid #d5d5d5;
    border-bottom: 0;
    text-align: center;
    font-size: 14px;
    color: #777;
    background: #fcfcfc;
    text-decoration: none;
    letter-spacing: -1px;
}

.top2 {
    padding: 30px 0 20px 10px;
    font-size: 12px;
    -webkit-margin-before: -1em;
}

.top2 ul li {
    padding: 1px 0;
    color: #6e6e6e;
}

myqna .tbl {
    width: 97%;
    margin: 0 auto;
    border-collapse: collapse;
    font-size: 13px;
    
}

table {
    border-spacing: 0;
    empty-cells: show;
    display: table;
}

caption{
    font-weight: normal;
    font-style: normal;
    display: table-caption;
    text-align: -webkit-center;
}

.skip{
    overflow: hidden;
    position: absolute;
    top: -5000em;
    visibility: hidden;
    width: 1px;
    height: 1px;
    line-height: 0;
    font-size: 0;
}

thead {
    display: table-header-group;
    vertical-align: middle;
    border-color: inherit;
}

tr {
    display: table-row;
    vertical-align: inherit;
    border-color: inherit;
}

.myqna .tbl tr th {
    padding: 11px;
    border-top: 2px solid #ccc;
    border-bottom: 1px solid #ccc;
    color: #222;
    background: #fafafa;
    font: 14px 맑은고딕, "Malgun Gothic", Dotum, 돋움, sans-serif;
}

tbody {
    display: table-row-group;
    vertical-align: middle;
    border-color: inherit;
}

.myqna .tbl tr td.none {
    height: 180px;
    text-align: center;
    color: #acacac;
}

.myqna .tbl tr td {
    padding: 10px 10px 9px 10px;
    border-bottom: 1px solid #eee;
}

.tbl{
    border: none;
    width: 100%;
}

.tbl tr td.date {
    text-align: left;
    color: #494949;
    text-decoration: none;
    font-size: 13px;
}	

.myInquire .tbl {
    border-collapse: collapse;
    font-size: 13px;
}

.tbl tr td {
    padding: 10px 10px 9px 10px;
    border-bottom: 1px solid #eee;
}

.tbl tr td a {
    color: #494949;
    text-decoration: none;
    font-size: 13px;
}

.tbl tr.ask .arrow {
    display: inline-block;
    width: 3%;
    vertical-align: middle;
    font-size: 0;
    line-height: 0;
    color: #fff;
}

.tbl tr.ask .state.on em {
    color: #09a2f6;
}

em {
    font-weight: normal;
    font-style: normal;
}

.tbl tr.answer td {
    padding: 0;
    background: #f6f8fa;
}

dl {
	padding: 0;
    margin: 0;
    display: block;
    -webkit-margin-before: 1em;
    -webkit-margin-after: 1em;
    -webkit-margin-start: 0px;
    -webkit-margin-end: 0px;
}

.tbl tr td dl dt {
    position: relative;
    padding: 25px 40px 25px 65px;
    font-weight: bold;
}

.tbl tr td dl dd {
    position: relative;
    padding: 25px 40px 25px 65px;
    border-top: 1px dotted #eee;
    color: #686868;
}

.tbl tr td dl dt span {
    position: absolute;
    top: 24px;
    left: 40px;
    font-weight: bold;
    font-size: 15px;
    color: #ff6633;
}

.tbl tr td dl dd span {
    position: absolute;
    top: 24px;
    left: 40px;
    font-weight: bold;
    font-size: 15px;
    color: #09a2f6;
}
</style>

<meta charset="UTF-8" >
<title>나의 문의내역</title>
   <link href="/sp/css/shop-homepage.css" rel="stylesheet">
   <link href="/sp/vendor/bootstrap/css/bootstrap.min.css"rel="stylesheet">
    <link href="/sp/vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
    <!-- 화면 상단 아이콘 이미지 -->
	<link rel="shortcut icon" href="/sp/images/icon.png">	
    <!-- <link href="/sp/css/myQna.css" rel="stylesheet"> -->
    <script src="/sp/vendor/jquery/jquery.min.js"></script>
    <script type="text/javascript">
    
    $(function () {
        $('.ask').on("click", function () {
            $(this).next().siblings('.answer').hide(); 
            $(this).next().toggle();
            $(this).toggleClass('on');
            $(this).siblings().removeClass('on');
            if ($('.ask').hasClass('on') == "") {
                $(this).find('.arrow').removeClass('on');
                $(this).find('.arrow').text('열기')
            } else {
               
                $('.ask').find('.arrow').removeClass('on');
                $('.ask').find('.arrow').text('열기');
                $(this).find('.arrow').addClass('on');
                $(this).find('.arrow').text('닫기')
            }
            return false;
        });
    });
    
    function movePage(pageNum){
    	location.href = "/sp/qna.do?currentPage=" + pageNum;
    }
	</script>
</head>
<body>
   


<form class="fixed-top" method="get" action="" style="padding: 20px 28px 20px 28px; overflow-y:scroll; height:700px;">
   <div class="allwp">
      <div>나의 문의내역
         <div class="progress" style="height: 1.5px; ">
              <div class="progress-bar"></div>
         </div>
      </div>
   
      <div class="top" style="-webkit-margin-before: -1em;">
            <ul>
                <li><a href="/sp/views/qna/qnaNew.jsp">문의 하기</a></li>
                <li class="m2"><a>나의 문의내역</a></li>
            </ul>
       </div>
       
       <div class="top2" style="-webkit-margin-before: -1.5em;">
             <ul>
                 <li>답변 보내기 귀찮다</li>
                 <li>회원 탈퇴해</li>
             </ul>
       </div>
    
      <div class="myqna">
      <table class="tbl">
         <caption>
            <span class="skip">나의 문의내역</span>
         </caption>
         
         <colgroup>
            <col width="19%">
            <col width="420px">
            <col width="20%">
         </colgroup>
         
         <thead>
            <tr>
            <th scope="col">문의일</th>
            <th scope="col">문의내역</th>
            <th scope="col">처리상태</th>
            </tr>
         </thead>
         
         <%if(qna.size() == 0){ %>
         <tbody>
            <tr>
            <td colspan="3" class="none">최근 작성한 문의 내역이 없습니다.</td>
            </tr>
         </tbody>
         <%}else{ %>
         <tbody>
         	<%for(QnaVo qv : qna){ %>
         	
         	<%if(qv.getIs_checked() == 1){ %>
         	<tr class="ask" data-idx="251696" >
                <td class="date"><%=qv.getReporting_date() %></td>
                <td class="his"><a><%=qv.getContent() %></a></td>
                <td class="state on"><a href="#"><em>답변완료</em>
                	<span class="arrow" >열기</span></a>
                </td>
            </tr>
            
            <tr class="answer" style="display: none;">
	            <td colspan="3">
	            	<dl>
	            	<dt><span>Q.</span><%=qv.getContent() %></dt>
	            	<dd><span>A.</span><%=qv.getAnswer() %></dd></dl>
	            </td>
            </tr>
         	<%}else if(qv.getIs_checked() == 0) { %>
         	<tr class="ask" data-idx="251696" >
                <td class="date"><%=qv.getReporting_date() %></td>
                <td class="his"><a><%=qv.getContent() %></a></td>
                <td class="state "><a href="#"><em>접수 확인중</em>
                	<span class="arrow" >열기</span></a>
                </td>
            </tr>
            
            <tr class="answer" style="display: none;">
	            <td colspan="3">
		            <dl>
		            <dt style="-webkit-margin-before: 1em;"><span>Q.</span><%=qv.getContent() %></dt>
		            </dl>
	            </td>
            </tr>
         	<%} %> 
         <%} %> 
         </tbody>
         <%} %>
      </table>
      </div>
      
      <div class="btn-toolbar mb-1" role="toolbar">
           <div class="btn-group" role="group">
               <button onclick="movePage(<%=currentPage==1?1:currentPage-1%>);" type="button" class="btn btn-default bg-dark text-white">◀</button>
               <%for(int i = startPage; i <= endPage; i++){ %>
                  <%if(currentPage != i){ %>
                  <button onclick="movePage(<%=i %>);" type="button" class="btn btn-default bg-dark text-white"><%=i %></button>
                  <%}else{ %>
                  <button type="button" class="btn btn-default bg-dark text-white disabled"><%=i %></button>
                  <%} %>
               <%} %>
               <button onclick="movePage(<%=currentPage==maxPage?maxPage:currentPage+1%>);" type="button" class="btn btn-default bg-dark text-white">▶</button>
           </div>
       </div>
   </div>
</form>
</body>
</html>