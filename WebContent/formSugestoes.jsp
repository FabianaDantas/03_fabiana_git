<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
		<fieldset>
			<form action="sugestoes" method="post">
				<label for="nome">Nome:</label><br/>
				<input type="text" name="nome"/><br/>
				<label for="email">Email:</label><br/>
				<input type="text" name="email" placeholder="exemplo@dominio.com"/><br/>
				<label for="sugestao">Sugestão:</label><br/>
				<textarea name="sugestao" rows="3"></textarea><br/>
				<input type="submit" value="Enviar"/>
			</form>
		</fieldset>
</body>
</html>