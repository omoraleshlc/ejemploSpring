<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Lista de Articulos</title>

</head>
<body>
     <%@include file="menu.jsp" %>
    
     <div class="container">
	<center>
		<br /> <br /> <br /> <b>Articuloses
			Lista | </b><br /> <br />
			
		
                <% int numeracion=0;%>
		<table class="table table-striped table-hover">
			<thead >
                                <td >#</td>
				<td >Mov</td>
				<td >Descripcion</td>
				<td >Sustancia</td>
                                <td ></td>
                                <td ></td>
				
			</thead>
                        
			<c:forEach var="articulos" items="${articulosList}">
				<tr>
                                        <td><small><% 
                                        numeracion+=1;
                                        out.println(numeracion);                                        
                                        %></small></td>
					<td><small>${articulos.keyPA}</small></td>
					<td><small>${articulos.descripcion}</small></td>
					<td><small>${articulos.descripcion1}</small></td>
					
					<td><small><a href="editarArticulos?keyPA=${articulos.keyPA}">Editar</a></small></td>
					<td><small><a href="eliminarArticulos?keyPA=${articulos.keyPA}">Eliminar</a></small></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><small><a href="register">Agregar Articulos</a></small></td></tr>
		</table>

	</center>
     </div>
</body>
</html>