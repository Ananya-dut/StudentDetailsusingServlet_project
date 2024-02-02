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

@WebServlet(urlPatterns="/update")
public class UpdateServlet extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String phno=req.getParameter("phno");
	int studentid=Integer.parseInt(req.getParameter("studentid"));
	Student s=new Student();
	s.setStudentid(studentid);
	s.setName(name);
	s.setEmail(email);
	s.setPhno(phno);
	int response;
	try {
		response = s.updateStudent();
		RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
		
		
		if(response==1) {
			req.setAttribute("message", "registration succesfully");
		}
		else {
			req.setAttribute("message", "registration failed");
		}
		rd.forward(req, resp);
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	resp.setContentType("text/plain");
//	resp.setCharacterEncoding("UTF-8");
//	resp.getWriter().write("Hii "+name);
	
}

}


