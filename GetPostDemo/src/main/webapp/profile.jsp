<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Profile page !!</h1>
<% String user = (String) session.getAttribute("user"); %>
<%-- <% String user1 = (String) request.getAttribute("user"); %> --%>
	<h1>Welcome  <%= user %>!</h1>
	<a href="about.jsp">About</a>
	<a href="dashboard.jsp">Home</a>
	<a href="logout">logout</a>
</body>
</html>