package com.av;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InboxServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String edu = req.getParameter("education");
		HttpSession session = req.getSession();
		if(session==null) {
			//System.out.println(session.getId());
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
		}else {
			System.out.println(session.getId());
			req.setAttribute("education..", edu);
			RequestDispatcher rd = req.getRequestDispatcher("draft.jsp");
			rd.forward(req, res);
		}
	}
}
