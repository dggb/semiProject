package com.what.semi.contract.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.what.semi.common.GmailSend;
import com.what.semi.contract.model.service.ContractService;
import com.what.semi.contract.model.vo.ContractVo;
import com.what.semi.member.model.service.MemberService;
import com.what.semi.member.model.vo.MemberVo;
import com.what.semi.recruitment.model.service.RecruitmentService;
import com.what.semi.recruitment.model.vo.RecruitmentVo;
import com.what.semi.resume.model.service.MyResumeService;
import com.what.semi.resume.model.vo.MyResumeVo;

/**
 * Servlet implementation class ApplyServlet
 */
@WebServlet("/apply.do")
public class ApplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ApplyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int resumeId = Integer.parseInt(request.getParameter("resume_id"));
		String recId = request.getParameter("recId");
		String boId = request.getParameter("bo_id");
		String jsId = request.getParameter("userId");
		HttpSession session =request.getSession();
		String demander = (String) session.getAttribute("member_type");

		int currentPage = Integer.parseInt(request.getParameter("currentPage"));

		int result = new ContractService().insertContract(recId, boId, jsId, resumeId,demander);
		ContractVo cont = new ContractService().selectThisCon(recId, boId, jsId, resumeId);
		RecruitmentVo rec = new RecruitmentService().selectRecruitment(recId);
		MemberVo writer = new MemberService().getMemberInfo(rec.getM_id());
		MyResumeVo resume = new MyResumeService().selectMyResume(jsId, resumeId);

		ArrayList<MyResumeVo> myResumes = new MyResumeService().selectMyInfo(jsId);
		
		for(int i=0;i<myResumes.size();i++){
			if(myResumes.get(i).getResume_id()==resumeId){
				myResumes.remove(myResumes.get(i));
			}
		}
		
		String title="<"+rec.getRecruitment_title()+">의 지원 이력서가 등록되었습니다.";
		String resumeUrl="contractResumeDetail.do?resume_id="+resumeId+"&jsId="+jsId+"&state=0&contId="+cont.getC_no();
		new GmailSend().sendResume(rec.getRecruitment_email(),title,resumeUrl,1);
		
		
		
		RequestDispatcher view = null;
		String url = "";
		if (result != 0) {
			url = "/views/recruitment/recruitmentDetail.jsp";
			request.setAttribute("rec", rec);
			request.setAttribute("currentPage", currentPage);
			request.setAttribute("writer", writer);
			request.setAttribute("myResumes", myResumes);
			request.setAttribute("contRe", 1);

		} else {
			System.out.println("계약구인상세페이지오류");
		}
		view = request.getRequestDispatcher(url);
		view.forward(request, response);
	}

}
