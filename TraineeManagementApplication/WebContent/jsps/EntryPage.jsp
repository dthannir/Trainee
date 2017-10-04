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
<h1>Enter Trainee Details</h1>
<sf:form method="post" modelAttribute="trainee" action="addTrainee.do">
	<label for="trId">TraineeId:</label>
  <sf:input path="traineeId" id="trId" type="text"/><br/>
  
  <label for="trNm">Trainee Name:</label>
  <sf:input path="traineeName" id="trNm" type="text"/><br/>
  
  <label for="trLoc">Trainee Location:</label>
  <sf:radiobutton path="traineeLocation" id="trLoc"  name="location" value="Chennai"/>Chennai
  <sf:radiobutton path="traineeLocation" id="trLoc"  name="location" value="Banglore"/>Banglore
  <sf:radiobutton path="traineeLocation" id="trLoc"  name="location" value="Mumbai"/>Mumbai
  <sf:radiobutton path="traineeLocation" id="trLoc"  name="location" value="Pune"/>Pune
  
  <label for="trDom">Trainee Domain:</label>
  <sf:select path="traineeDomain" name="traineeDomain">
  	<sf:option name="traineeDomain" value="">--Please Select--</sf:option>
  	<sf:option name="traineeDomain" value="JEE">JEE</sf:option>
  	<sf:option name="traineeDomain" value="SAP">SAP</sf:option>
  	<sf:option name="traineeDomain" value="Phython">Phython</sf:option>
  	<sf:option name="traineeDomain" value=".net">.net</sf:option>
  </sf:select>
  <input type="submit" value="Add Trainee"/>
</sf:form>

</body>
</html>