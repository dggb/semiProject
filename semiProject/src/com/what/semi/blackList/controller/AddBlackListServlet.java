package com.what.semi.blackList.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.what.semi.blackList.model.service.BlackListService;

/**
 * Servlet implementation class AddBlackListServlet
 */
@WebServlet("/addBlackList.do")
public class AddBlackListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBlackListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String id = request.getParameter("memId");
		String reason = request.getParameter("slt");
		String memberType = (String)session.getAttribute("member_type");
		
		int result = new BlackListService().addBlackList(id,reason);
		
		if(result<0) {
			System.out.println("insert,update 실패");
		}else {
			System.out.println("insert,update 성공");
			if(memberType.equals("JS")) {
				response.sendRedirect("/sp/views/member/declarationJS.jsp?declarationFlag=true");
			}else {
				response.sendRedirect("/sp/views/member/declarationBO.jsp?declarationFlag=true");
			}
			
		}
	}

}
