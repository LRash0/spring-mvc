<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de produtos</title>
</head>
<body>

	<form method="post" action="/springmvc/produtos">
		<div>
			<label for="tittle">Titulo</label> <input type="text" name="tittle"
				id="tittle" />
		</div>

		<div>
			<label for="description">Descricao</label>
			<textarea name="description" id="description" cols="20" rows="10"></textarea>
		</div>
		<div>
			<label for="pages">Numero de paginas</label> <input type="text"
				name="pages" id="pages" />
		</div>

		<div>
			<input type="submit" value="Enviar">
		</div>


	</form>

</body>
</html>