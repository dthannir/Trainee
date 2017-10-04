<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	<h1>Modify Operation</h1>
<form action="modifyPage.do">
	<label for="trainId">Please Enter Your Id:</label>
	<input type="text" name="traineeId" id="trainId">
	<input type="submit" value="Modify">
</form>
<c:if test="${trainee ne null }">
<sf:form method="post" modelAttribute="trainee" action="modifyTrainee.do">
	<label for="trId">TraineeId:</label>
  <sf:input path="traineeId" id="trId" type="text" value="${trainee.traineeId}" readonly="true"/><br/>
  
  <label for="trNm">Trainee Name:</label>
  <sf:input path="traineeName" id="trNm" type="text"  value="${trainee.traineeName}"/><br/>
  
  <label for="trDm">Trainee Domain:</label>
  <sf:input path="traineeDomain" id="trDm" type="text"  value="${trainee.traineeDomain}"/><br/>
  
  <label for="trLoc">Trainee Location:</label>
  <sf:input path="traineeLocation" id="trLoc" type="text" value="${trainee.traineeLocation}"/><br/>
  <input type="submit" value="Modify Trainee"/>
</sf:form>
</c:if>
<a href="traineePage.do">Home</a>
</body>
</html>