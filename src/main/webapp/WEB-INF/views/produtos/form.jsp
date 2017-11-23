<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@	taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de produtos</title>
</head>
<body>




	<form:form method="post" action="/springmvc/produtos"
		commandName="prodcut" enctype="multipart/form-data">
		<div>
			<label for="tittle">Titulo</label>
			<form:input path="tittle" id="tittle" />
			<form:errors path="tittle" />
		</div>

		<div>
			<label for="description">Descricao</label>
			<form:textarea path="description" id="description" cols="20"
				rows="10" />
			<form:errors path="description" />
		</div>
		<div>
			<label for="pages">Numero de paginas</label> <input type="text"
				name="pages" id="pages" />
		</div>
		
		<div>
			<label for="releaseDate">Data de lancamento</label>
			<form:input path="releaseDate" type="date" />
			<form:errors path="releaseDate" />
		</div>
		
		<div>
			<label for="summary">Sumario do livro</label>
			<a href="${product.summaryPath }">Sumario</a>
			<input type="file" name="summary"/>
			<form:errors path="summaryPath"/>
		</div>

		<c:forEach items="${types}" var="bookType" varStatus="status">
			<div>
				<label for="price_${bookType}">${bookType}</label> <input
					type="text" name="prices[${status.index}].value"
					id="price_${bookType}" /> <input type="hidden"
					name="prices[${status.index}].bookType" value="${bookType}" />
			</div>
		</c:forEach>

		

		<div>
			<input type="submit" value="Enviar">
		</div>
	</form:form>







</body>
</html>