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
@WebServlet(urlPatterns="/deletestudent")
public class DeleteServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
int sid=Integer.parseInt(req.getParameter("studentid"));
Student s=new Student();
s.setStudentid(sid);
try {
	int response=s.deleteStudent();
	RequestDispatcher rd=req.getRequestDispatcher("/showall");
	
	
	if(response==1) {
		req.setAttribute("message", "record deleted succesfully");
	}
	else {
		req.setAttribute("message", "record not deleted");
	}
	rd.forward(req, resp);
} 
catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
}
}
