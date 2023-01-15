<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.what.semi.common.template.PageInfo"%>
<%@page import="com.what.semi.resume.model.vo.MyResumeVo"%>
<%@page import="java.util.ArrayList"%>
<%
	ArrayList<MyResumeVo> list = (ArrayList<MyResumeVo>) request.getAttribute("list");

	 java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("MM / dd"); 
%>

<%@include file="/views/common/header.jsp"%>
<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>

<script type="text/javascript">
	function resumeDetail(i,j){
		location.href="/sp/seeMyResume.do?userId="+i+"&resume_id="+j;
	}
</script>
<style>
.btn-link {
	cursor: pointer;
}

.list-table {
	border-top: 2px #5D5D5D solid;
	margin-top: 20px;
	padding-left: 100px;
	padding-right: 20px;
	width: 700px;
}

.list-table tr {
	border-top: 1px #cccccc solid;
}

.table-td {
	padding: 5px;
	min-width: 80px;
}

.table-td-location {
	padding: 5px;
	min-width: 100px;
}

.td-title {
	width: 330px;
	padding-left:10px;
}
</style>
<div class="container" style="min-height: 800px">
	<!-- 내용을 담아놓을 컨테이너 -->

	<div class="row">

		<%@include file="/views/common/nav.jsp"%>
		<div class="col-lg-9" style='padding-top: 50px; padding-left: 30px;'>
			<h3>해당 구직자 목록</h3>
			<!-- Page Content -->
			<!-- <div class="media mt-4 border rounded bg-light">
		     
			  	  <div class="media-left media-middle">
			    	<a href="/sp/views/resume/resumeForm.jsp">
			     	 <img class="media-object btn-link" onclick="updateRecruit();" src="http://placehold.it/150x150" alt="...">
			    	</a>
			  	</div>
			  	<div class="media-body">
			    	<h4 class="media-heading btn-link" onclick="updateRecruit();">[구인게시글 제목]</h4>
			    	세부사항
			  	</div>
			
			</div> -->

			<table class="list-table">
				<tbody>
					<tr>
						<th><div class="table-td">업종</div></th>
						<th><div class="td-title">구직자명/이력서제목</div></th>
						<th><div class="table-td-location">희망근무지</div></th>
						<th><div class="table-td">근무희망일</div></th>
					</tr>
					<%
						for (int i = 0; i < list.size(); i++) {
							String[] locationArr = list.get(i).getAddress().split(" ");
							String location = locationArr[0] + " " + locationArr[1];
					%>
					<tr>
						<td class="table-td" onclick="resumeDetail('<%=list.get(i).getId() %>',<%=list.get(i).getResume_id()%>);"><%=list.get(i).getBusiness_type()%></td>
						<td class="td-title" onclick="resumeDetail('<%=list.get(i).getId() %>',<%=list.get(i).getResume_id()%>);"><b><%=list.get(i).getName()%></b><br><%=list.get(i).getIntroduce_title()%></td>
						<td class="table-td-location" onclick="resumeDetail('<%=list.get(i).getId() %>',<%=list.get(i).getResume_id()%>);"><%=location%></td>
						<td class="table-td" onclick="resumeDetail('<%=list.get(i).getId() %>',<%=list.get(i).getResume_id()%>);"><%=df.format(list.get(i).getWorkable_days()) %></td>
						</td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>


		</div>
	</div>
	<!-- /.row -->
</div>
<!-- /.container -->

<%@include file="/views/common/footer.jsp"%>