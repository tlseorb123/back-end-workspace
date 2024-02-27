package com.kh.controller.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.controller.Controller;
import com.kh.controller.ModelAndView;
import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

public class LoginController implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
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
		return new ModelAndView("views/login_result.jsp", true);

		
	}


}
