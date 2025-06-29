<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Book</title>
</head>
<body>
	<form action="updateBook" method="post">
		<table align="center">
			<tr><th>Edit Book</th></tr>
			<tr><td>Book Id</td><td><input type="text" name="bid" required/></td></tr>
			<tr><td>Book Name</td><td><input type="text" name="bname" required/></td></tr>
			<tr><td>Author Name</td><td><input type="text" name="bauthor" required/></td></tr>
			<tr><td>Description</td><td><input type="text" name="des" /></td></tr>
			<tr><td></td><td><input type="submit" /></td></tr>	
		</table>
	</form>
	<span style="align:center">
		<a href="dashboard"><button>DashBoard</button></a>
	</span>
	<p>${Message}</p>
	
	
</body>
</html>