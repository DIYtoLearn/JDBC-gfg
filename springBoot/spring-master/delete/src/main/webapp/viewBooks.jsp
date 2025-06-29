<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
<style type="text/css">
	table, th, td {
 	 border: 1px solid black;
}
</style>
</head>
<body>
	<header align="center"><h1>Available Books in MOB Store</h1></header>
	<table align="center">
		<tr>
			<th>BookId</th>
			<th>Book Name</th>
			<th>Book Author</th>
			<th>Book Description</th>
		</tr>
		<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.getBid()}</td>
				<td>${book.getBookName()}</td>
				<td>${book.getBookAuthor()}</td>
				<td>${book.getBookDescription()}</td>
			</tr>
		</c:forEach>
	</table><br/>
	<a href="dashboard"><button>Dashboard</button></a>
</body>
</html>