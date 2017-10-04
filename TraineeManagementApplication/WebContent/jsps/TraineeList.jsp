<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Capgemini India Pvt. Ltd, Mumbai</h1>
		<h3>${PageHead}</h3>
		<table border="1">
			<tr>
				<th>Trainee Id</th>
				<th>Trainee Name</th>
				<th>Trainee Domain</th>
				<th>Trainee Location</th>
			</tr>
			<c:forEach items="${traineeList}" var="train">
				<tr>
					<td>${train.traineeId}</td>
					<td>${train.traineeName}</td>
					<td>${train.traineeDomain}</td>
					<td>${train.traineeLocation}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="traineePage.do">Home</a>
	</body>
</html>