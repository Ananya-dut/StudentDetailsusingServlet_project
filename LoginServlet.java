package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test.Student;
@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	Student s=new Student();
	s.setEmail(email);
	s.setPassword(password);
	try {
		Student details=s.studentLogin();
		if(details==null || details.getEmail()==null) {
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
		req.setAttribute("message", "sorry invalid email or password");
		rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
