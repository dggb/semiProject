<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.what.semi.common.template.PageInfo"%>
<%@page import="com.what.semi.contract.model.vo.ContractVo"%>
<%@page import="com.what.semi.resume.model.vo.MyResumeVo"%>
<%@page import="java.util.ArrayList"%>
<%
	ArrayList<ContractVo> myConList = (ArrayList<ContractVo>) request.getAttribute("myConList");
	ArrayList<MyResumeVo> conResumeList = (ArrayList<MyResumeVo>) request.getAttribute("conResumeList");
	int contId = (int) request.getAttribute("contId");

	java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("MM / dd");

	PageInfo pi = (PageInfo) request.getAttribute("pi");
	int listCount = pi.getTotalCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
%>

<%@include file="/views/common/header.jsp"%>
<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>

<script type="text/javascript">
	function contractResumeDetail(i,j) {
		location.href = "/sp/contractResumeDetail.do?resume_id=" + i+"&jsId="+j+"&state=1&contId="+<%=contId%>;
	}

	function accept(i) {
		location.href = "/sp/acceptResume.do?contId="+i+"&currentPage="+<%=currentPage%>;
	}

	function reject(i) {
		location.href = "/sp/rejectResume.do?contId=" + i+"&currentPage="+<%=currentPage%>;
	}
	
	$(function(){
		<%if (contId != -1) {%>
			$("#conDetails<%=contId%>").addClass('show');
		<%}%>
	});
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
	width: 350px;
}
</style>

<script>
	function addBlacklist(i){
		window.open("/sp/searchIdByRecId.do?recId="+i,"_blank", "width=600, height=700");
	}
</script>
<div class="container" style="min-height: 800px">
	<!-- ????????? ???????????? ???????????? -->

	<div class="row">

		<%@include file="/views/common/nav.jsp"%>
		<div class="col-lg-9" style='padding-top: 50px; padding-left: 30px;'>
			<h3>???????????? ??????</h3>
			<!-- Page Content -->
			<!-- <div class="media mt-4 border rounded bg-light">
		     
			  	  <div class="media-left media-middle">
			    	<a href="/sp/views/recruitment/recruitmentForm.jsp">
			     	 <img class="media-object btn-link" onclick="updateRecruit();" src="http://placehold.it/150x150" alt="...">
			    	</a>
			  	</div>
			  	<div class="media-body">
			    	<h4 class="media-heading btn-link" onclick="updateRecruit();">[??????????????? ??????]</h4>
			    	????????????
			  	</div>
			
			</div> -->

			<table class="list-table" id="myConTable">
				<tr>
					<th><div class='table-td'>?????????</div></th>
					<th><div class='td-title'>????????????</div></th>
					<th><div class='table-td'>????????????</div></th>
					<td style='width: 20px;'></td>
				</tr>
				<%
					for (int i = 0; i < myConList.size(); i++) {
				%>
				<tr>
					<td class="table-td">
						<%
							if (myConList.get(i).getContract_date() == null) {
						%>-<%
							} else {
						%><%=myConList.get(i).getContract_date()%> <%
 	}
 %>
					</td>
					<%
						for (int j = 0; j < conResumeList.size(); j++) {
								if (myConList.get(i).getResume_id() == conResumeList.get(j).getResume_id()) {
					%>
					<td class="td-title"><b><%=conResumeList.get(j).getName()%></b></td>
					<%
						}
							}
					%>
					<td class="table-td">
						<%
							if (myConList.get(i).getState() == 0) {
									if (member_type.equals(myConList.get(i).getDemander())) {
						%>??????<%
							} else {
						%>??????<%
							}
								} else if (myConList.get(i).getState() == 1) {
						%>?????????<%
							} else if (myConList.get(i).getState() == 2) {
						%>??????<%
							} else {
						%>?????? <%
							}
						%>
					</td>
					<td>
						<button type="button" class="btn btn-default btn-xs btn-info"
							data-toggle="collapse"
							data-target="#conDetails<%=myConList.get(i).getC_no()%>">????????????</button>

					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div id="conDetails<%=myConList.get(i).getC_no()%>"
							class="collapse">
							<div style="margin: 0 50px 0 50px;">
								<div style="height: 50px;">
									<div style="float: left;">
										<button class="btn btn-info" style="margin-top: 10px;"
											onclick="contractResumeDetail(<%=myConList.get(i).getResume_id()%>,'<%=myConList.get(i).getJs_id()%>');">??????
											????????? ??????</button>
									</div>
									<div style="float: right;">
										<div>
											?????? ?????? ?????? :
											<%
											if (myConList.get(i).getStart_work_time() != null) {
										%><%=myConList.get(i).getStart_work_time()%>
											<%
												}
											%>
										</div>
										<div>
											?????? ?????? ?????? :
											<%
											if (myConList.get(i).getEnd_work_time() != null) {
										%><%=myConList.get(i).getEnd_work_time()%>
											<%
												}
											%>
										</div>
									</div>
								</div>
								<div align="right">
									<%
										if (myConList.get(i).getState() == 0) {
												if (member_type.equals(myConList.get(i).getDemander())) {
									%>
									????????? ?????????. ????????? ??????????????????.<%
										} else {
									%>
									<button onclick="accept(<%=myConList.get(i).getC_no()%>);"
										class="btn btn-default bg-dark text-white">??????</button>
									<button onclick="reject(<%=myConList.get(i).getC_no()%>);"
										class="btn btn-default bg-dark text-white">??????</button>
									<%
										}
											} else if (myConList.get(i).getState() == 1) {
									%>
									?????? ??????????????????.
									<%
										} else if (myConList.get(i).getState() == 2) {
									%>
									<button
										onclick="addBlacklist('<%=myConList.get(i).getRecruitment_id()%>');"
										class="btn btn-default bg-dark text-white">????????????</button>
									<%
										} else {
												if (myConList.get(i).getDemander().equals(member_type)) {
									%>
									???????????? ???????????? ???????????????.
									<%
										} else {
									%>
									????????? ???????????????.
									<%
										}
											}
									%>
								</div>
							</div>
						</div>
					</td>
				</tr>
				<%
					}
				%>
			</table>



			<!--====================================	?????????????????????	 ==================================  -->
			<div class="btn-toolbar mb-1" role="toolbar">
				<div class="btn-group" role="group">
					<button
						onclick="movePage(<%=currentPage == 1 ? 1 : currentPage - 1%>);"
						type="button" class="btn btn-default bg-dark text-white"><</button>
					<%
						for (int i = startPage; i <= endPage; i++) {
					%>
					<%
						if (currentPage != i) {
					%>
					<button onclick="movePage(<%=i%>);" type="button"
						class="btn btn-default bg-dark text-white"><%=i%></button>
					<%
						} else {
					%>
					<button type="button" class="btn btn-default bg-dark text-white"><%=i%></button>

					<%
						}
					%>
					<%
						}
					%>
					<button
						onclick="movePage(<%=currentPage == maxPage ? maxPage : maxPage + 1%>);"
						type="button" class="btn btn-default bg-dark text-white">></button>
				</div>

			</div>
			<!--=========================================================================================-->

		</div>
	</div>
	<!-- /.row -->
</div>
<!-- /.container -->
<script type="text/javascript">
	function movePage(pageNum) {
		location.href = "/sp/myHiredList.do?currentPage="+pageNum;
	}
</script>
<%@include file="/views/common/footer.jsp"%>
