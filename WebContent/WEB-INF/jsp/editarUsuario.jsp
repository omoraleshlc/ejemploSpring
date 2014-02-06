<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
		<br /> <br /> <br /> <b>Edit User Details </b><br /> <br />
		<div>
			<form:form method="post" action="/actualizarUsuario" modelAttribute="usuarios">
				<table>					
					<tr>
						<td>Usuario :</td>
						<td><form:input path="usuario" value="${map.usuarios.usuario}" />
						</td>
					</tr>
					
                                        	<tr>
						<td>Nombre :</td>
						<td><form:input path="nombre" value="${map.usuarios.nombre}" />
						</td>
					</tr>
                                        
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="folio" value="${map.usuarios.folio}" />

			</form:form>
		</div>
	</center>
</body>
</html>