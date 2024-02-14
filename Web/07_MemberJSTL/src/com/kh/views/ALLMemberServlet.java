package com.kh.views;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

/**
 * Servlet implementation class ALLMemberServlet
 */
@WebServlet("/ALLMemberServlet")
public class ALLMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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
		request.getRequestDispatcher("views/allShow.jsp").forward(request, response);
	}

}
