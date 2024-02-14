package com.kh.views;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 1. 폼값 바든다.
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");

		// 2. DAO
		Member member = new Member(id, password, name);
		MemberDAO dao = new MemberDAO();

		try {
			int result = dao.registerMember(member);

			if (result == 1) {
				// 4. 네비게이션
				response.sendRedirect("index.jsp");

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
