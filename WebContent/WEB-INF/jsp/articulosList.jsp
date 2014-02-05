<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Lista de Articulos</title>
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
		<br /> <br /> <br /> <b>Articuloses
			Lista | </b><br /> <br />
			
		

		<table border="1">
			<tr>
				<td class="heading">#Mov</td>
				<td class="heading">Descripcion</td>
				<td class="heading">Sustancia</td>
				
			</tr>
			<c:forEach var="articulos" items="${articulosList}">
				<tr>
					<td>${articulos.keyPA}</td>
					<td>${articulos.descripcion}</td>
					<td>${articulos.descripcion1}</td>
					
					<td><a href="edit?id=${articulos.keyPA}">Editar</a></td>
					<td><a href="delete?id=${articulos.keyPA}">Eliminar</a></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="register">Agregar New Articulos</a></td></tr>
		</table>

	</center>
</body>
</html>