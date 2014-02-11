<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Editar Articulos</title>

</head>
<body>
	<center>
		<br /> <br /> <br /> <b>Editar Articulos</b><br /> <br />
		<div>
			<form:form method="post" action="/actualizarArticulos" modelAttribute="articulos">
				<table> <tr>
						<td>Nombre :</td>
						<td><form:input path="descripcion" value="${map.articulos.descripcion}" />
						</td>
					</tr>
                                        	<tr>

						<td>City :</td>
						<td><spring:bind path="city">
								<select name="city">
									<c:forEach items='${map.usuariosList}' var='cityName'>
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
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				

			</form:form>
		</div>
	</center>
</body>
</html>