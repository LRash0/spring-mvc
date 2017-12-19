<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<form:form method="post" action="/springmvc/register/register"
		commandName="user">
		<div>
			<label for="login">Login</label>
			<form:input path="login" id="login" />
			<form:errors path="login" />
		</div>
		<div>
			<label for="name">Nome</label>
			<form:input path="name" id="name" />
			<form:errors path="name" />
		</div>
				<div>
			<label for="password">password</label>
			<form:input path="password" id="password" />
			<form:errors path="password" />
		</div>
		
		<div>
			<input type="submit" value="Cadastrar">
		</div>
	</form:form>
</body>
</html>