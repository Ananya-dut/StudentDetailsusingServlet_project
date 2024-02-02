package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test.Student;
@WebServlet(urlPatterns="/showall")
public class ShowAllServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Student s=new Student();
	PrintWriter out=resp.getWriter();
	try {
		ArrayList<Student> mylist = s.getAllStudent();
		out.println("<table border='2'>");
	    out.println("<tr>");
	        out.println("<th>Student Id</th>");
	        out.println("<th>Name</th>");
	        out.println("<th>Email</th>");
	        out.println("<th>Phone no</th>");
	        out.println("<th colspan='2'>Action</th>");
	        out.println("</tr>"); 
		for(Student ss:mylist) {
			 out.println("<tr>");
	            out.println("<td>"+ss.getStudentid()+"</td>");
	            out.println("<td>"+ss.getName()+"</td>");
	            out.println("<td>"+ss.getEmail()+"</td>");
	            out.println("<td>"+ss.getPhno()+"</td>");
	            out.println("<td><a href='editstudent.jsp?studentid="+ss.getStudentid()+"'>Edit</td>");
	            out.println("<td><a href='deletestudent?studentid="+ss.getStudentid()+"'>Delete</td>");
	            out.println("</tr>");
		}
		out.println("</table>");
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(req.getAttribute("message")!=null) {
		out.print(req.getAttribute("message"));
	}
}
}
