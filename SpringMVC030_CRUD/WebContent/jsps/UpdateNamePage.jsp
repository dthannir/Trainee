<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Name</title>
<script src="./jsps/jquery-1.12.3.js"></script>
<script type="text/javascript">
$(document).ready(
		function(){
//  var button = $('#empNo').click(
// 	 		function(){
// 	 			$(this).html("Clicked");
// 	 		}
// 	 		);
	alert("hiii");
	$('#empNo').bind('click','#newName');
		});
</script>
</head>
<body>
<h1>Capgemini India Pvt. Ltd, Mumbai</h1>
		<h3>${PageHead}</h3>
<form action="submitNewEmpName.do">
	<label for="empNo"></label>
	Employee Number:<select name="empNo" id="empNo">
		<option name="empNo">Select Id</option>
		<c:forEach items="${idList}" var="id">
			<option name="empNo" value="${id}">${id}</option>
		</c:forEach>
	</select>
	<label for="newName"></label>
	<input type="text" name="newName" id="newName">
	<input type="submit" value="Update Details">
</form>
</body>
</html>