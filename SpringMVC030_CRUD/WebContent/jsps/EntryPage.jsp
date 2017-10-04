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
<h1>Login PAGE</h1>
<c:url var="myAction" value="submitEmpDetails.do" />
<sf:form method="post" modelAttribute="employee" action="${myAction}">
	<label for="empNm">Enter Name:</label>
  <sf:input path="empNm" for="empNm" type="text"/><br/>
  
  <label for="sal">Enter Salary:</label>
  <sf:input path="empSal" for="sal" type="text"/><br/>
  
  <label for="hireDate">Enter Date of Joining:</label>
  <sf:input path="hireDate" for="hireDate" type="text"/><br/>
  
  <input type="submit" value="Submit Details"/>
</sf:form>

</body>
</html>