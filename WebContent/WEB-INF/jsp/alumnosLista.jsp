<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Lista de Alumnos</title>

</head>
<body>
    
    
     <%@include file="menu.jsp" %>
     
     <div class="container">
	<center>
		<br /> <br /> <br /> <b>Alumnos
			Lista | </b><br /> <br />
			
		

		<table class="table table-striped table-hover">
                    <thead class="success">
			<tr>
				<td >#Mov</td>
				<td >Nombre</td>
				<td >Escuela</td>
                                <td >Carrera</td>
                                <td >TipoAlumno</td>
                                
				
			</tr>
                    </thead>
			<c:forEach var="alumnos" items="${alumnosLista}">
				<tr>
				<td><small>${alumnos.keyAEMain}</small></td>	
                                    <td><small>${alumnos.nombre}</small></td>
                                    <td><small>${alumnos.escuela}</small></td>
                                    <td><small>${alumnos.matricula}</small></td>
                                    <td><small>${alumnos.tipoAlumno}</small></td>
					
                                    <td><small><a href="actualizarAlumnos?keyAEMain=${alumnos.keyAEMain}">Editar</a></small></td>
                                    <td><small><a href="eliminarAlumnos?keyAEMain=${alumnos.keyAEMain}">Eliminar</a></small></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="registrarAlumnos">Agregar New Alumnos</a></td></tr>
		</table>

	</center>
</div>
</body>
</html>