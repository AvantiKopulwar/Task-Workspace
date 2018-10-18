package com.av;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String un = req.getParameter("uname");
		String pas = req.getParameter("password");
		HttpSession session = req.getSession();
		if(!session.isNew()) {
			System.out.println(session.getId());
			session.invalidate();
			session=req.getSession();
			System.out.println(session.getId());
		}
		System.out.println(session.getId());
		req.setAttribute("uname..", un);
		req.setAttribute("password..", pas);
		RequestDispatcher rd = req.getRequestDispatcher("inbox.jsp");
		rd.forward(req, res);

	}

}
