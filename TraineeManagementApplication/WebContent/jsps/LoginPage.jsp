<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Home Page</title>
	</head>
	<body>
		<h1>Login Page</h1>
		<form action="traineePage.do">
		<table border="1">
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td>PassWord:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
			<td colspan="2"><input type="submit" value="Login"></td> 
			</tr>
		</table>
		</form>
	</body>
</html>