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
			<form:form method="post" action="/insert" modelAttribute="user">
				<table class="table table-condensed table-hover">
					<tr>
						<td>First Name :</td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td>Last Name :</td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><form:radiobuttons path="gender"
								items="${map.genderList}" /></td>
					</tr>
					<tr>
						<td>City :</td>
						<td><form:select path="city" items="${map.cityList}" /></td>
					</tr>
                                        
                                        <tr>
						<td>Estado :</td>
						<td><form:select path="estado" items="${map.estadoList}" /></td>
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