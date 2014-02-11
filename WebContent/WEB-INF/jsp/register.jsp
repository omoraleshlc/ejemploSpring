<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Catalogo de Articulos</title>

</head>

<%@include file="menu.jsp" %>
<body>
    
    <div class="container">
	<center>
		<br /> <br /> <br /> <h1 >Alta de Articulos</h1> <br />
		<br />
		<div>
			<form:form method="post" action="/insert" modelAttribute="articulos">
                            
                            <form:select path="usuarios" />
				<table class="table table-condensed table-hover">
					<tr>
						<td>Descripcion :</td>
						<td><form:input path="descripcion" /></td>
					</tr>
					<tr>
						<td>Sustancia :</td>
						<td><form:input path="descripcion1" /></td>
					</tr>
					
                                        
					<tr>
						<td>&nbsp;</td>
						<td><button class="btn btn-primary btn-sm" type="submit" value="Guardar" name="send"/> Guardar</button></td>
					</tr>
					<tr>
						
						<td colspan="2"><a href="getList">Agregar</a></td>
					</tr>
				</table>
                                        <form:hidden path="keyPA" />
			</form:form>
		</div>
	</center>
    </div>
</body>
</html>