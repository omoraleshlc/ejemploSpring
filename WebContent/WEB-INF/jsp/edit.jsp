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
			<form:form method="post" action="/update" modelAttribute="usuarios">
				<table>
					<tr>
						<td>First Name :</td>
						<td><form:input path="usuario"
								value="${map.usuarios.usuario}" />
						</td>
					</tr>
					<tr>
						<td>Last Name :</td>
						<td><form:input path="usuario" value="${map.usuarios.nombre}" />
						</td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><spring:bind path="gender">
								<c:forEach items='${map.genderList}' var='genderName'>
									<c:choose>
										<c:when test="${genderName eq map.user.gender}">
											<input type="radio" name="gender" value="${genderName}"
												checked="checked">${genderName}
										</c:when>
										<c:otherwise>
											<input type="radio" name="gender" value="${genderName}">${genderName}
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</spring:bind>
						</td>
					</tr>
					<tr>

						<td>City :</td>
						<td><spring:bind path="city">
								<select name="city">
									<c:forEach items='${map.cityList}' var='cityName'>
										<c:choose>
											<c:when test="${cityName eq map.user.city}">
												<option value="${cityName}" selected="selected">${cityName}</option>
											</c:when>
											<c:otherwise>
												<option value="${cityName}">${cityName}</option>
											</c:otherwise>
										</c:choose>
									</c:forEach>
								</select>
							</spring:bind></td>
					</tr>
                                        
                                        
                                        <tr>

						<td>Estado :</td>
						<td><spring:bind path="estado">
								<select name="estado">
									<c:forEach items='${map.estadoList}' var='estadoName'>
										<c:choose>
											<c:when test="${estadoName eq map.user.estado}">
												<option value="${estadoName}" selected="selected">${estadoName}</option>
											</c:when>
											<c:otherwise>
												<option value="${estadoName}">${estadoName}</option>
											</c:otherwise>
										</c:choose>
									</c:forEach>
								</select>
							</spring:bind></td>
					</tr>
                                        
                                        
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="userId" value="${map.user.userId}" />

			</form:form>
		</div>
	</center>
</body>
</html>