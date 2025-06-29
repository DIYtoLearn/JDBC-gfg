<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title><c:out value="${page}"></c:out></title>
</head>
<body>
	<div class="container mt-3">
		<h1 class="text-center">Welcome to Todo App</h1>
	</div>
	<div class="row mt-5">
		<div class="col-md-2">
			<h3 class="text-center">Options</h3>
			<div class="list-group">
				<button type="button"
					class="list-group-item list-group-item-action active">Menu
				</button>
				<a href="<c:url value ="/add"></c:url>" type="button"
					class="list-group-item list-group-item-action">Add Todo </a> <a
					type="button" href="<c:url value ="/home"></c:url>"
					class="list-group-item list-group-item-action">View All Todos</a>
					<a href="<c:url value ="/update"></c:url>" type="button"
					class="list-group-item list-group-item-action">Update Todo </a> <a
					type="button" href="<c:url value ="/delete"></c:url>"
					class="list-group-item list-group-item-action">Delete Todo </a>

			</div>
		</div>
		<div class="col-md-10">
			<h3 class="text-center">Content</h3>
			<c:if test="${page=='home'}">
				<h3 class="text-center">
					All Todos
					</h3>
					<c:forEach items="${todos}" var="t">
						<div class="card">
							<div class="card-body">
								<h3>
									<c:out value="${t.title}"></c:out>
								</h3>
								<p>
									<c:out value="${t.description}"></c:out>
								</p>
							</div>
						</div>

					</c:forEach>
			</c:if>

			<c:if test="${page=='add'}">
				<h3 class="text Center">
					Add Todos
					</h3>

					<form:form action="saveTodo" method="post" modelAttribute="todo">
						<div class="form-group">

							<form:input path="id" cssClass="form-control"
								placeholder="enter task number" />
						</div>
						<div class="form-group">

							<form:input path="title" cssClass="form-control"
								placeholder="enter title" />
						</div>
						<div class="form-group">
							<form:textarea path="description" cssClass="form-control"
								placeholder="enter description" cssStyle="height:300px;" />
						</div>
						<div class="container text-center">
							<button class="btn btn-outline-success">Add Todo</button>
						</div>
					</form:form>
			</c:if>
			<c:if test="${page=='update'}">
				<h3 class="text Center">
					update Todos
					</h3>

					<form:form action="update" method="put" modelAttribute="todo">
						<div class="form-group">

							<form:input path="id" cssClass="form-control"
								placeholder="enter task number" />
						</div>
						<div class="form-group">

							<form:input path="title" cssClass="form-control"
								placeholder="enter title" />
						</div>
						<div class="form-group">
							<form:textarea path="description" cssClass="form-control"
								placeholder="enter description" cssStyle="height:300px;" />
						</div>
						<div class="container text-center">
							<button class="btn btn-outline-success">Update Todo</button>
						</div>
					</form:form>
			</c:if>
			<c:if test="${page=='delete'}">
				<h3 class="text Center">
					delete Todo</h3>
					
					<form action="delete" method="delete" ">
						<div class="form-group">
							<input type ="text" name="id">
						</div>
						<input type="submit">
					</form >
			</c:if>
		</div>

	</div>
	
	
</body>
</html>