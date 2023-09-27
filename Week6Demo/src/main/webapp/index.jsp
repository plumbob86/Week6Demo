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
	<form action="forest/showForest" method="get">
		<input type="submit" value="Show Forests" />
	</form>
	<a href="forest/update.jsp">Update Forest</a>
	<a href="forest/delete.jsp">Delete Forest</a>
	<a href="forest/add.jsp">Add Forest</a>

</body>
</html>