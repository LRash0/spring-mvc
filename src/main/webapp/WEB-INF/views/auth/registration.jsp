<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>

	<form:form method="post" action="/springmvc/auth/"
		commandName="user" enctype="multipart/form-data">
		<div>
			<label for=login>username</label>
			<form:input path="login" id="login" />
			<form:errors path="login" />
		</div>


	</form:form>
</body>
</html>