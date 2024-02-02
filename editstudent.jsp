<%@page import="Test.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>
</head>
<body>
<%
//java codes
int sid=Integer.parseInt(request.getParameter("studentid"));
Student s=new Student();
s.setStudentid(sid);
Student details=s.getStudentById();
%>
<h1>User Update Form</h1>
       <form action="update" method="post">
       <table>
           <tr>
           <td>Enter Student ID</td>
           <td><input type="text" name="studentid" value="<%=details.getStudentid() %>" readonly></td>
           </tr>
           <tr>
           <td>Enter Your Name</td>
           <td><input type="text" name="name" value="<%=details.getName() %>"></td>
           </tr>
           <tr>
           <td>Enter Your Email</td>
           <td><input type="text" name="email" value="<%=details.getEmail() %>"></td>
           </tr>
           <tr>
           <td>Enter Your Phone</td>
           <td><input type="text" name="phno" value="<%=details.getPhno() %>"></td>
           </tr>
           <tr>
         <td><input type="submit" value="Update"></td>
           </tr>
           
       </table>
       </form>
     
</body>
</html>
