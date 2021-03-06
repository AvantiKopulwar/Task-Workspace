package com.av;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String gender = req.getParameter("gender");
		String email = req.getParameter("email");
		String mobNo = req.getParameter("mobNo");
		String password = req.getParameter("password");
		String conpassword = req.getParameter("conpassword");
		
		if(password.equals(conpassword)){
			StudentVariables studentvariables = new StudentVariables(firstName, lastName, gender, email, mobNo, password); 
			JDBCquery.addquery(studentvariables);
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, res);			
		} else {
			req.setAttribute("msg", "PASSWORD MISMATCH");
			RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			rd.forward(req, res);	
		}
	}
}