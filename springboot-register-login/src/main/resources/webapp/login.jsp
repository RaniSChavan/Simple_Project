<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<form method="POST" action="contextPath/login">
		<span>${message}</span> <input name="username" type="text"
			placeholder="Username" autofocus="true" /> <input name="password"
			type="password" placeholder="Password" /> <span>${error}</span> <input
			type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

		<button type="submit">Log In</button>
		<a href="registration.jsp">
			<button type="submit">Create an account</button>
		</a>
		
	</form>
</body>
</html>