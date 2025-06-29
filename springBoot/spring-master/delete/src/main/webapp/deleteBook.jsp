<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Book</title>
</head>
<body>
	<h1 align="center">Delete Book</h1>
	<form action="deleteBook">
		<table align="center">
			<tr>
				<th>Enter Book Id to delete</th>
				<th><input type="text" name="bid" required/></th>
			</tr>
			<tr><td></td><td><input type="submit" /></td></tr>
		</table>
	</form>
	${Message}

	<a href="dashboard"><button>DashBoard</button></a>
</body>
</html>