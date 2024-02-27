package com.kh.controller;

import java.io.IOException;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

@WebServlet("/front.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 요청이 어디에서 들어오는 요청인지 구분할 command 값 같이 받는다.
		String command = request.getParameter("command");
		String path = "index.jsp";
		try {

			if (command.equals("register")) {
				path = register(request, response);
			} else if (command.equals("login")) {
				path = login(request, response);
			} else if (command.equals("search")) {
				path = search(request, response);
			} else if (command.equals("allShow")) {
				path = allShow(request, response);
			} else if (command.equals("logout")) {
				path = logout(request, response);
			}

		} catch (SQLException e) {

		}

		// 네비게이션
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected String register(HttpServletRequest request, HttpServletResponse response) throws SQLException {

		// 1. 폼값 바든다.
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");

		// 2. DAO
		Member member = new Member(id, password, name);
		MemberDAO dao = new MemberDAO();

		int result = dao.registerMember(member);

		return "index.jsp";
	}

	protected String login(HttpServletRequest request, HttpServletResponse response) throws SQLException {

		// 1. 폼값 받는다.
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		// 2. DAO
		MemberDAO dao = new MemberDAO();

		Member member = dao.login(id, password);

		// 3. 바인딩 - session
		HttpSession session = request.getSession();
		session.setAttribute("member", member);

		// 4. 네비게이션
		return "views/login_result.jsp";

	}

	protected String search(HttpServletRequest request, HttpServletResponse response) throws SQLException {

		// 1. 폼값 받는다.
		String id = request.getParameter("id");
		// 2. DAO
		MemberDAO dao = new MemberDAO();

		Member member = dao.findMember(id);

		if (member != null) {
			// 3. 바인딩
			request.setAttribute("member", member);

			// 4. 네비게이션
			return "views/find_ok.jsp";
		} else {
			return "views/find_fail.jsp";
		}
	}
	/*
	 * 삼항연산자 if(member!= null)request.setAttribute("member", member); return member
	 * != null ? "/views/find_ok.jsp" : "/views/find_fail.jsp";
	 */

	protected String allShow(HttpServletRequest request, HttpServletResponse response) {
		// 2. DAO
		MemberDAO dao = new MemberDAO();
		ArrayList<Member> list = null;
		try {
			list = dao.showAllMember();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 3. 바인딩
		request.setAttribute("list", list);

		// 4. 네비게이션
		return "views/allShow.jsp";
	}

	protected String logout(HttpServletRequest request, HttpServletResponse response) {

		// 3. session - 세션 죽이기
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("member");

		if (member != null) {
			session.invalidate();
		}
		// 4. 네비게이션
		return "index.jsp";
	}

}
