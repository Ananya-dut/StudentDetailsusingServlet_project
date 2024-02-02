<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Form</title>
</head>
<body>
<form action="Login" method="post">
<table>
<tr>
<td>Enter Email Address</td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td>Enter Password</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td><input type="submit" value="Login"></td>
</tr>
<tr>
<td>${requestScope["message"]}</td>
</tr>
</table>
</form>
</body>
</html>