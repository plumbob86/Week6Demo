<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tree Library</title>
</head>
<body>

	<h1>Tree Library</h1>
	<form action="showTrees" method="get">
		<input type="submit" value="Show Trees" />
	</form>
	<a href="update.jsp">Update Trees</a>
	<a href="delete.jsp">Delete Trees</a>
	<a href="add.jsp">Add Trees</a>
	<form action="showForest" method="get">
		<input type="submit" value="Show Forests" />
	</form>
	<a href="updateForest.jsp">Update Forest</a>
	<a href="deleteForest.jsp">Delete Forest</a>
	<a href="addForest.jsp">Add Forest</a>

</body>
</html>