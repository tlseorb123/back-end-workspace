package com.kh.views;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		MemberDAO dao = new MemberDAO();
		
		try {
			dao.login(id, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		HttpSession session = request.getSession();
		
		session.setAttribute("info", member);
		
		response.sendRedirect("FindMemberServlet");
	}

}
