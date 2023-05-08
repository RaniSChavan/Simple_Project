<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

	<form:form method="POST" modelAttribute="userForm">
		<spring:bind path="username">
			<form:input path="username" type="text" placeholder="UserName"
				autofocus="true" />
			<form:errors path="username" />
		</spring:bind>

		<spring:bind path="password">
			<form:input type="password" path="password" placeholder="Password" />
			<form:errors path="password" />
		</spring:bind>

		<spring:bind path="passwordConfirm">
			<form:input type="password" path="passwordConfirm"
				placeholder="Confirm your Password" />
			<form:errors path="passwordConfirm" />
		</spring:bind>

		<button type=submit>Submit</button>
	</form:form>

</body>
</html>