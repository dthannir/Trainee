<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Name</title>
</head>
<body>
<h1>Delete Operation</h1>
<form action="deleteTrainee.do">
	<label for="trainId">Please Enter Your Id:</label>
	<input type="text" name="traineeId" id="trainId">
	<input type="submit" value="Delete">
</form>

<h3>${PageHead}</h3>
		<table border="1">
			<tr>
				<th>Trainee Id</th>
				<th>Trainee Name</th>
				<th>Trainee Domain</th>
				<th>Trainee Location</th>
			</tr>
				<tr>
					<td>${Dtrainee.traineeId}</td>
					<td>${Dtrainee.traineeName}</td>
					<td>${Dtrainee.traineeDomain}</td>
					<td>${Dtrainee.traineeLocation}</td>
				</tr>
		</table>
		<a href="traineePage.do">Home</a>
</body>
</html>