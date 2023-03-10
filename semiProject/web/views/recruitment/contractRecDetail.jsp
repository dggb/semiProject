<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.what.semi.recruitment.model.vo.RecruitmentVo"%>
<%@page import="com.what.semi.member.model.vo.MemberVo"%>
<%@page import="com.what.semi.resume.model.vo.MyResumeVo"%>
<%@page import="java.util.ArrayList"%>
<%
	RecruitmentVo rec = (RecruitmentVo) request.getAttribute("rec");
	int state = (int) request.getAttribute("state");
	int contId = (int) request.getAttribute("contId");

	/* rec.setRecruitment_image_src(null); */
%>
<%@include file="/views/common/header.jsp"%>

<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>

<script type="text/javascript">

	$(function() {
		var count = $("#ta").text().length;
		if (count > 510) {
			var minus = count - 510;
			var mod = (minus / 85) + 1;
			var he = (mod * 25) + 150;
			$("#ta").css("height", he + "px");
		}
		
	});
	
	function applyBtn() {
		location.href="/sp/searchSameBusiness.do?recId="+<%=rec.getRecruitment_id()%>;
	}
	
	function acceptBtn() {
		location.href="/sp/myWorkedList.do?contId="+<%=contId%>;
	}
</script>
<style>
.line {
	width: 800px;
	margin-bottom: 20px;
	margin-left: 60px;
	float: center;
}

.title_line {
	width: 800px;
	margin-bottom: 20px;
	float: center;
}

.title_space {
	width: 800px;
	height: 30px;
	border-top: 2px #5D5D5D solid;
}

.space {
	width: 800px;
	height: 30px;
	border-top: 1px #cccccc solid;
}

.title_image {
	width: 220px;
	float: left;
}

.sub_image {
	width: 170px;
	float: left;
	margin-top: 20px;
}

table {
	margin-top: 10px;
}

td {
	padding-right: 10px;
}

tr {
	height: 30px;
}

#ta {
	width: 680px;
	height: 150px;
}
</style>
<!-- Page Content -->
<div class="container" style="min-height: 1000px">
	<div class="row">

		<%@include file="/views/common/nav.jsp"%>

		<!-- /.col-lg-3 -->
		<div class="col-lg-9 mt-lg-auto">
			<div class="row mt-4" style="margin-left: 50px;">
				<div class="title_line">
					<div>
						<h5><%=rec.getRecruitment_name()%></h5>
					</div>
					<div>
						<h1><%=rec.getRecruitment_title()%></h1>
					</div>
				</div>
				<div class="title_space"></div>
				<div class="line">
					<div class="title_image">
						<div>
							<img
								src="<%if (rec.getRecruitment_image_src() == null) {%>/sp/images/building.jpeg<%} else {%>/sp/images/recruitmentImg/<%=rec.getRecruitment_image_src()%><%}%>"
								width="128px" height="128px">
						</div>
					</div>
					<div class="sub_image">
						<div>
							<img src="/sp/images/calendar2.jpeg">
						</div>
						<div><%=rec.getWork_day()%></div>
					</div>
					<div class="sub_image">
						<div>
							<img src="/sp/images/pay2.jpeg">
						</div>
						<div><%=rec.getPay()%>???
						</div>
					</div>
					<div class="sub_image">
						<div>
							<img src="/sp/images/time2.jpeg">
						</div>
						<div><%=rec.getStart_work_time()%>~<%=rec.getEnd_work_time()%></div>
					</div>
				</div>
				<div class="space"></div>
				<div class="line">
					<div style="float: left;">
						<b>????????????</b>
						<table>
							<tr>
								<td>????????????</td>
								<td><%=rec.getBusiness_type()%></td>
							</tr>
							<tr>
								<td>????????????</td>
								<td>
									<%
										if (rec.getGender() == 'M') {
									%>????????????<%
										} else if (rec.getGender() == 'F') {
									%>????????????<%
										} else {
									%>??????<%
										}
									%>
								</td>
							</tr>
							<tr>
								<td>????????????</td>
								<td>
									<%
										if (rec.getCareer() == 0) {
									%>??????<%
										} else {
									%>??????<%
										}
									%>
								</td>
							</tr>
							<tr>
								<td>????????????</td>
								<td><%=rec.getAchievement()%></td>
							</tr>
							<tr>
								<td>????????????</td>
								<td>
									<%
										if (rec.getMilitary_service() == 0) {
									%>??????<%
										} else {
									%>????????????<%
										}
									%>
								</td>
							</tr>
						</table>
					</div>
					<div style="float: right; margin-right: 50px;">
						<b>???????????????</b>
						<table>
							<tr>
								<td>?????????</td>
								<%
									if (rec.getName().length() >= 3) {
								%>
								<td><%=rec.getName().charAt(0)%><%
										for (int i = 0; i < rec.getName().length() - 2; i++) {
									%>*<%
										}
									%><%=rec.getName().charAt(rec.getName().length() - 1)%></td>
								<%
									} else {
								%>
								<td><%=rec.getName().charAt(0)%>*</td>
								<%
									}
								%>
							</tr>
							<tr>
								<td>?????????</td>
								<td><%=rec.getRecruitment_phone()%></td>
							</tr>
						</table>
					</div>
				</div>
				<div class="space"></div>
				<div class="line">
					<div id="ta"><%=rec.getIntroduce()%></div>
				</div>
				<div class="space"></div>
				<div class="line">
					<div id="map" style="width: 670px; height: 400px;"></div>
				</div>
				<div class="space"></div>
				<div class="line">
					<div align="center">
						<%
							if (state == 0) {
						%>
						<button onclick="acceptBtn();"
							class="btn btn-default bg-dark text-white">?????? ?????? ??????????????????</button>
						<%
							} else {
						%>
						<button onclick="applyBtn();"
							class="btn btn-default bg-dark text-white">?????? ????????? ????????????</button>
						<%
							}
						%>
					</div>

				</div>
			</div>
		</div>
		<!-- /.row -->


	</div>
	<!-- /.row -->
</div>
<!-- /.container -->
<script type="text/javascript">
var mapContainer = document.getElementById('map'), // ????????? ????????? div 
mapOption = { 
   
   center: new daum.maps.LatLng(<%=rec.getR_latitude()%>, <%=rec.getR_longitude()%>), // ????????? ????????????
   level: 3 // ????????? ?????? ??????

};

// ????????? ???????????????
   var map = new daum.maps.Map(mapContainer, mapOption); 

   var content = '<div><%=rec.getRecruitment_name()%></div>';
	var latlng = new daum.maps.LatLng(<%=rec.getR_latitude()%>,<%=rec.getR_longitude()%>);

	var imageSrc = "http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png";

	// ?????? ???????????? ????????? ?????? ?????????
	var imageSize = new daum.maps.Size(24, 35);

	// ?????? ???????????? ???????????????    
	var markerImage = new daum.maps.MarkerImage(imageSrc, imageSize);

	// ????????? ???????????????
	var marker = new daum.maps.Marker({
		map : map, // ????????? ????????? ??????
		position : latlng, // ????????? ????????? ??????
		image : markerImage
	// ?????? ????????? 
	});

	// ????????? ????????? ?????????????????? ??????????????? 
	var infowindow = new daum.maps.InfoWindow({
		content : content
	// ?????????????????? ????????? ??????
	});

	daum.maps.event.addListener(marker, 'mouseover', makeOverListener(map,
			marker, infowindow));
	daum.maps.event
			.addListener(marker, 'mouseout', makeOutListener(infowindow));
</script>
<%@include file="/views/common/footer.jsp"%>
