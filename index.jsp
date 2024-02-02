<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Registration Form</h1>
       <form action="register" method="post">
       <table>
           <tr>
           <td>Enter Student ID</td>
           <td><input type="text" name="studentid"></td>
           </tr>
           <tr>
           <td>Enter Your Name</td>
           <td><input type="text" name="name"></td>
           </tr>
           <tr>
           <td>Enter Your Email</td>
           <td><input type="text" name="email"></td>
           </tr>
           <tr>
           <td>Enter Your Phone</td>
           <td><input type="text" name="phno"></td>
           </tr>
           <tr>
         <td><input type="submit" value="Click Me"></td>
           </tr>
           <td>${requestScope["message"]}</td>
           <tr>
       </table>
       </form>
       <a href="showall">Get All Records</a>
</body>
</html>