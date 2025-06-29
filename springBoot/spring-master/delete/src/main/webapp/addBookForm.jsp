<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>
<body>
	${msg}
	<form action="addBook" method="post">
		<table align="center">
			<tr><th>Add Book Details</th></tr>
			<tr><td>Book Id</td><td><input type="text" name="bid" required/></td></tr>
			<tr><td>Book Name</td><td><input type="text" name="bname" required/></td></tr>
			<tr><td>Author Name</td><td><input type="text" name="bAuthor" required/></td></tr>
			<tr><td>Description</td><td><input type="text" name="des" /></td></tr>
			<tr><td></td><td><input type="submit" /></td></tr>	
		</table>
	</form>
	<a href="dashboard.jsp">dashboard</a>
</body>
</html>