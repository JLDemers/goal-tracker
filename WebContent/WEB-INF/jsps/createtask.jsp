<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="${pageContext.request.contextPath}/static/css/main.css" type="text/css" rel="stylesheet"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Under Construction - Adding an new Task</h3>

	<sf:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="task">
		<table class="formtable">
			<tr>
				<td class="label">Title: </td><td><sf:input name="title" path="title" type="text"/><br/><sf:errors path="title" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Details: </td><td><sf:textarea name="details" path="details" rows="10" cols="20"></sf:textarea><br/><sf:errors path="details" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td></td><td><input value="Add Task" type="submit"></td>
			</tr>
		</table>
	</sf:form>


</body>
</html>