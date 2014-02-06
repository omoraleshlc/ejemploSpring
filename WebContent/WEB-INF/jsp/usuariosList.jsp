<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Being Java Guys | Spring DI Hello World</title>
<style>
body {
	font-size: 20px;
	color: teal;
	font-family: Calibri;
}

td {
	font-size: 15px;
	color: black;
	width: 100px;
	height: 22px;
	text-align: center;
}
.heading {
	font-size: 18px;
	color: white;
	font: bold;
	background-color: orange;
	border: thick;
}
</style>
</head>
<body>
	<center>
		<br /> <br /> <br /> <b>Usuarios
			List | Being Java¿? </b><br /> <br />
			
		

		<table border="1">
			<tr>
				<td class="heading">folio</td>
				<td class="heading">Usuario</td>
				<td class="heading">Nombre</td>
				
			</tr>
			<c:forEach var="usuarios" items="${usuariosList}">
				<tr>
					<td>${usuarios.folio}</td>
					<td>${usuarios.usuario}</td>
					<td>${usuarios.nombre}</td>
					
					<td><a href="editarUsuario?folio=${usuarios.folio}">Edit</a></td>
					<td><a href="delete?folio=${usuarios.folio}">Delete</a></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="register">Add New Usuario</a></td></tr>
		</table>

	</center>
</body>
</html>