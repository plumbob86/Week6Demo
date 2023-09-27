<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trees</title>
</head>
<body>
	List of all forests and trees:
	<table>
		<c:forEach items="${requestScope.allForests}" var="currentforest">
			<tr>
				<td>${currentforest.name}|</td>
				<td>${currentforest.location}</td>
				
			</tr>
			<c:forEach items="${currentforest.trees}" var="currenttree">
					<tr>
						<td>${currenttree.commonName}|</td>
						<td>${currenttree.latinName}|</td>
						<td>${currenttree.avgHeight}</td>
					</tr>
				</c:forEach>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>