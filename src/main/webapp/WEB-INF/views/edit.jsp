<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>

<c:url  var="reqUrl" value="/edit/saveEdit" />

<html>
<head>
<title>Edytuj</title>
</head>
<body>
	<h1>Edytuj</h1>
	<form:form action="${reqUrl}" method="POST" commandName="form">
	
	<form:hidden path="id" />
	
		<table>
			<tr>
				<%-- <td><form:label path="name"></form:label></td>  --%>
				<td>Imie</td>
				<td><form:input path="name" size="30" /></td>
				<td><form:errors path="name" /></td>
			</tr>
			<tr>
				<td>Nazwisko</td>
				<td><form:input path="lastName" size="30" /></td>
				<td><form:errors path="lastName" /></td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td><form:input path="email" size="30" /></td>
				<td><form:errors path="email" /></td>
			</tr>
			<tr>
				<td>Telefon</td>
				<td><form:input path="phone" size="30" /></td>
				<td><form:errors path="phone" /></td>
			</tr>
			<tr>
				<td>Ulica/Osiedle</td>
				<td><form:input path="street" size="30" /></td>
				<td><form:errors path="street" /></td>
			</tr>
			<tr>
				<td>Nr domu</td>
				<td><form:input path="nrHouse" size="30" /></td>
				<td><form:errors path="nrHouse" /></td>
			</tr>
			<tr>
				<td>Nr mieszkania</td>
				<td><form:input path="nrApartment" size="30" /></td>
				<td><form:errors path="nrApartment" /></td>
			</tr>
			<tr>
				<td>Kod pocztowy</td>
				<td><form:input path="zipCode" size="30" /></td>
				<td><form:errors path="zipCode" /></td>
			</tr>
			<tr>
				<td>Miasto</td>
				<td><form:input path="city" size="30" /></td>
				<td><form:errors path="city" /></td>
			</tr>
		</table>

		<table>
			<tr>
				<td><input type="submit" name="saveEdit" value="Zapisz" /></td>
			</tr>
		</table>
	</form:form>

	<form:form action="deleteEdit" method="POST">
		<input type="submit" name="deleteEdit" value="Usun" />
	</form:form>


</body>
</html>
