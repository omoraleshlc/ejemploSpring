<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Being Java Guys | Spring DI Hello World</title>

</head>
<body>
    
    <div class="container">
	<center>
		<br /> <br /> <br /> <h1 class="jumbotron">Being Java Guys | Registration Form </h1> <br />
		<br />
		<div>
			<form:form method="post" action="/insert" modelAttribute="usuarios">
				<table class="table table-condensed table-hover">
					<tr>
						<td>Folio :</td>
						<td><form:input path="folio" /></td>
					</tr>
					<tr>
						<td>Usuario :</td>
						<td><form:input path="usuario" /></td>
					</tr>
					<tr>
						<td>Nombre:</td>
						<td><form:input path="nombre" /></td>
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