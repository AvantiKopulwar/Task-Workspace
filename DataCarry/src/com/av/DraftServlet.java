package com.av;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DraftServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String exp = req.getParameter("experience");
		HttpSession session = req.getSession();
		if(session==null) {
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
			//System.out.println(session.getId());
		}else {
			System.out.println(session.getId());
			req.setAttribute("experience..", exp);
			RequestDispatcher rd = req.getRequestDispatcher("preview.jsp");
			rd.forward(req, res);
		}
	}
}
