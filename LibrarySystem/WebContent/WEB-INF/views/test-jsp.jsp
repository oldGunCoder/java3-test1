<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test</title>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<th>genre</th>
				<th>name</th>
				<th>pageNumber</th>
			</tr>

			<c:forEach var="book" items="${bookList}">
				<tr>
					<td>"${book.genre}"</td>
					<td>"${book.name}"</td>
					<td>"${book.pageNumber}"</td>
				</tr>
			</c:forEach>

		</table>


	</div>

</body>
</html>