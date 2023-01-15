package com.what.semi.recruitment.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.what.semi.recruitment.model.service.RecruitmentService;
import com.what.semi.recruitment.model.vo.RecruitmentVo;

/**
 * Servlet implementation class SearchSameBusinessServlet
 */
@WebServlet("/searchSameBusiness.do")
public class SearchSameBusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchSameBusinessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String recId = request.getParameter("recId");
		
		RecruitmentVo rec = new RecruitmentService().selectRecruitment(recId);
		
		ArrayList<RecruitmentVo> list = new RecruitmentService().loadSameBusiness(rec.getM_id());
		
		String url = "";
		if(null != list) {
				url = "/views/recruitment/SameRecruitmentList.jsp";
				request.setAttribute("list", list);
		}else {
			System.out.println("오류");
			url = "index.jsp";
			request.setAttribute("msg", "오류");
		}
		RequestDispatcher view = request.getRequestDispatcher(url);
		view.forward(request, response);
	}

}
