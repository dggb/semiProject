<%@page import="com.what.semi.resume.model.vo.MyResumeVo"%>
<%@page import="com.what.semi.common.template.PageInfo"%>
<%@page import="com.what.semi.recruitment.model.vo.RecruitmentVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MyResumeVo member = (MyResumeVo) request.getAttribute("member");
	ArrayList<RecruitmentVo> recList = (ArrayList<RecruitmentVo>) request.getAttribute("recList");
	String Mtype = (String) session.getAttribute("member_type");
	if(Mtype==null){
		Mtype="";
	}
	
	int contRe = (int) request.getAttribute("contRe");
%>
<%@include file="/views/common/header.jsp"%>
<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>

<style>
.img {
	border: 1px solid black;
}

.page-header {
	text-align: center;
}

.wrap {
	padding-right: 15px;
	padding-left: 15px;
	margin-right: auto;
	margin-left: auto;
}

.innerWrap {
	border: 1px solid black;
	height: 150px;
	width: 700px;
	/* padding-right: 15px;
	padding-left: 15px;
	margin-right: auto;
	margin-left: auto;
	padding-top: 15px;
	padding-bottom: 15px; */
}

.contentsWrap {
	
}

.auth {
	color: lightGray;
}

div {
	list-style: none;
}

#profileImg {
	height: 120px;
}
</style>
<script>
	function applyBtn() {
		if (<%=Mtype.equals("BO")%>) {
			if (<%=recList.size()%>>0) {
				$('div.modal').modal();
			} else {
				alert("등록된 구인글이 없습니다!!");
			}
		} else {
			alert("업주가 아니면 고용할 수 없습니다.");
		}
	}

	function apply() {
		$("#postNum").submit();
	}

	function goList() {
		history.back();
	}
	$(function() {
		if(<%=contRe%> != 0){
			alert("고용제안이 완료되었습니다.");
		}

	});
</script>
<div class="container">
	<div class="row">
		<%@include file="/views/common/nav.jsp"%>
		<div class="col-lg-9 mt-lg-auto">
			<div class="row" style="margin: 30px 0 0 40px;">
				<div class="row page-header" style="width: 700px;">
					<h1>
						나의 이력서<hr> <small><%=member.getIntroduce_title()%></small><hr>
					</h1>
				</div>
				<div class="row" style="width: 700px;">
					<div class="col-md-4">
						<a class="thumbnail"><img id="profileImg"
							src="/sp/profile_photo/<%if (member.getProfile_image_src() == null) {%>default_photo.jpeg<%} else {%><%=member.getProfile_image_src()%><%}%>">
						</a>
					</div>
					<div class="col-md-8">
						<h4>
							<strong><%=member.getName()%></strong>
						</h4>
						<address>
							<%=member.getGender() == 'M' ? "남" : "여"%>,
							<%=member.getAge()%>(<%=member.getAge() - 1%>) /
							<%=member.getBirth()%><br>
							<%=member.getAddress()%><br> <abbr title="Phone">P:</abbr>
							<%=member.getPhone()%>
							<strong>Full Name</strong><br>
							<%=member.getEmail()%>
						</address>
					</div>
				</div>
			</div>
			<hr>
			<h3>희망 근무 조건</h3><br>
			<div class="row wrap">
					<div class="col-md-4">
						<p class="tit">
							<img src="/sp/images/resume/shop.png" />&nbsp;&nbsp;&nbsp;근무지
						</p>
						<strong><%=member.getAddress()%></strong>
					</div>

					<div class="col-md-4">
						<p class="tit">
							<img src="/sp/images/resume/id-card.png" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;업종
						</p>
						<strong><%=member.getBusiness_type()%></strong> <strong>경력
							:&nbsp;<%=member.getCareer() == 1 ? "있음" : "없음"%></strong>
					</div>
					
					<div class="col-md-4">
							<p class="tit">
								<img src="/sp/images/resume/medal.png" />&nbsp;&nbsp;&nbsp;학력
							</p>
							<strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=member.getAchievement()%></strong>
					</div>
			</div>
			<br><hr>
		<h3>학력, 우대사항</h3><br>
			<div class="row wrap">
					<div class="col-md-4 col-md-offset-3">
						<p class="tit">
							<img src="/sp/images/resume/work_time.png" />&nbsp;&nbsp;&nbsp;희망시간
						</p>
						<strong><%=member.getWorkable_days()%></strong>
						 <strong><%=member.getWorkTime()%></strong>
					</div>
					<div class="col-md-4">
							<p class="tit">
								<img src="/sp/images/resume/dis.png" />&nbsp;장애여부
							</p>
							<strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=member.getDisability() == 1 ? "장애" : "정상"%></strong>
					</div>
				</div>
					<br><hr>
				<h3>자기 소개서</h3><br>
			<div class="row wrap">
					<textarea class="form-control" rows="5" readonly><%=member.getIntroduce()%></textarea>
			</div>
			<div class="row wrap">
			<div class="col-md-12 auth">
				<h2 align="center">위 입력사항은 사실과 다름이 없습니다</h2>
				<p align="center">작성자: <%=member.getName() %></p>
			</div>
			</div>
			<div class="line">
				<%
					if (!(member.getId().equals(id))) {
				%>
				<div align="center">
					<button onclick="applyBtn();"
						class="btn btn-default bg-dark text-white">제안하기</button>
				</div>
				<%
					}
				%>
				<div align="right">
					<button onclick="goList();"
						class="btn btn-default bg-dark text-white">목록으로</button>
				</div>
			</div>
	</div>
</div>
<!-- 팝업 모달영역 -->
<div class="modal fade" id="layerpop">
	<div class="modal-dialog">
		<div class="modal-content">
			<!-- header -->
			<div class="modal-header">
				<!-- 닫기(x) 버튼 -->
				<!-- header title -->
				<h4 class="modal-title">구인글 선택</h4>
				<button type="button" class="close" data-dismiss="modal">×</button>
			</div>
			<!-- body -->
			<div class="modal-body">
				<form id="postNum" method="get" action="/sp/suggest.do">
					<input type="hidden" name="js_id" value="<%=member.getId()%>" /> <input
						type="hidden" name="bo_id" value="<%=id%>" /> <input
						type="hidden" name="resumeId" value="<%=member.getResume_id()%>" />
					<div class="radio">
						<%
							for (int i = 0; i < recList.size(); i++) {
						%>
						<label for="post<%=i%>"><%=recList.get(i).getRecruitment_title()%>
							<input id="post<%=i%>" type="radio"
							value="<%=recList.get(i).getRecruitment_id()%>" name="recId"
							checked /> </label><br>
						<%
							}
						%>
					</div>
				</form>
				<hr>
				<button type="button" class="btn btn-success" onclick="apply();">제안</button>
				<button type="button" class="btn btn-danger" data-dismiss="modal">닫기</button>
			</div>
		</div>
	</div>
</div>
<%@include file="/views/common/footer.jsp"%>
