<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful Updation</title>
</head>
<body>
<h1>Capgemini India Pvt. Ltd, Mumbai</h1>
		<h3>${PageHead}</h3>
		<table border="1">
			<tr>
				<th>Employee Number</th>
				<th>Employee Name</th>
				<th>Salary</th>
				<th>Hire Date</th>
			</tr>
				<tr>
					<td>${emp.empNo }</td>
					<td>${emp.empNm }</td>
					<td>${emp.empSal }</td>
					<td>${emp.hireDate }</td>
				</tr>
		</table>
		<a href="getUpdateNamePage.do">Go Back to Update Page</a>
		<a href="jsps/HomePage.jsp">Home</a>
</body>
</html>