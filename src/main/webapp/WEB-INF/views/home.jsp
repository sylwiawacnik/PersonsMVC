<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>Lista</title>
</head>
<body>
	<h1>Lista</h1>
	<form:form action="" method="POST" commandName="form">
		<table>
			<tr>
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
				<td><input type="submit" name="save" value="Zapisz" /></td>

			</tr>
		</table>
	</form:form>

	<form:form action="clean" method="POST">
		<input type="submit" name="cancel" value="Anuluj" />
	</form:form>

	<c:forEach var="entry" items="${history}">
		<span>${entry.name} ${entry.lastName} ${entry.email}
			${entry.city}</span>
		<a href="edit/${entry.id}">Edytuj</a>
		<a href="delete/${entry.id}">Usun</a>
		<br />
	</c:forEach>

</body>
</html>
