<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
</head>
<body>

	<div align="center">
		Library Book List
		<table border="1">
			<tr>
				<th>genre</th>
				<th>name</th>
				<th>pageNumber</th>
			</tr>

			<c:forEach var="book" items="${bookList}">
				<tr>
					<td><c:out value="${book.genre}"></c:out></td>
					<td><c:out value="${book.name}"></c:out></td>
					<td><c:out value="${book.pageNumber}"></c:out></td>
				</tr>
			</c:forEach>

		</table>


	</div>
</body>
</html>