<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Agregar Alumnos</title>

</head>
<body>
    
    <div class="container">
	<center>
		<br /> <br /> <br /> <h1 class="jumbotron">Agregar Alumnos</h1> <br />
		<br />
		<div>
			<form:form method="post" action="/agregarAlumnos" modelAttribute="alumnos">
				<table class="table table-condensed table-hover">
					<tr>
						<td>Nombre :</td>
						<td><form:input path="nombre" /></td>
					</tr>
					<tr>
						<td>Escuela :</td>
						<td><form:input path="escuela" /></td>
					</tr>
					<tr>
						<td>Matricula :</td>
						<td><form:input path="matricula" /></td>
					</tr>
					<tr>
						<td>TipoAlumno :</td>
						<td><form:input path="tipoAlumno" /></td>
					</tr>
                                        
                                        
                                        
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" /></td>
					</tr>
					<tr>
						
						<td colspan="2"><a href="getList">Click Here to See User List</a></td>
					</tr>
				</table>
			</form:form>
		</div>
	</center>
    </div>
</body>
</html>