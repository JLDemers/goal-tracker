<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Under Construction - Adding an new Task</h3>

	<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="task">
		<table>
			<tr>
				<td>Title: </td><td><sf:input name="title" path="title" type="text"/></td>
			</tr>
			<tr>
				<td>Details: </td><td><sf:textarea name="details" path="details" rows="10" cols="20"></sf:textarea></td>
			</tr>
			<tr>
				<td></td><td><input value="Add Task" type="submit"></td>
			</tr>
		</table>
	</sf:form>


</body>
</html>