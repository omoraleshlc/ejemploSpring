<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Lista de Alumnos</title>
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
		<br /> <br /> <br /> <b>Alumnos
			Lista | </b><br /> <br />
			
		

		<table border="1">
			<tr>
				<td class="heading">#Mov</td>
				<td class="heading">Nombre</td>
				<td class="heading">Escuela</td>
                                <td class="heading">Carrera</td>
                                <td class="heading">TipoAlumno</td>
				
			</tr>
			<c:forEach var="alumnos" items="${alumnosList}">
				<tr>
					<td>${alumnos.keyAEMain}</td>
					<td>${alumnos.nombre}</td>
					<td>${alumnos.escuela}</td>
                                        <td>${alumnos.carrera}</td>
                                        <td>${alumnos.tipoAlumno}</td>
					
					<td><a href="edit?id=${alumnos.keyAEMain}">Editar</a></td>
					<td><a href="delete?id=${alumnos.keyAEMain}">Eliminar</a></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="agregarAlumnos">Agregar New Alumnos</a></td></tr>
		</table>

	</center>
</body>
</html>