<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DashBoard</title>
</head>
<body>
	<div class="main">
	<header align="center"><h1>Welcome to MagicOfBooks Library</h1></header>
	<h2 align ="center">${user}</h2>
	<main align="center">
		1) <a href="addBookPage"><button>Add Book</button></a>
		2) <a href="updateBookPage"><button>Update Book</button></a>
		3) <a href="deleteBookPage"><button>Delete Book</button></a>
		4) <a href="viewBooks"><button>View Books</button></a>
		5) <a href="logout"><button>Logout</button></a>
	</main>
	</div>
</body>
</html>