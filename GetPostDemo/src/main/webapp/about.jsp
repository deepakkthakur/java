<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String user = (String) session.getAttribute("user"); %>
<h1>About page !!</h1>
<%-- <% String user1 = (String) request.getAttribute("user"); %> --%>
	<h1>Welcome  <%= user %>!</h1>
	<a href="dashboard.jsp">Home</a>
	<a href="profile.jsp">profile</a>
	<a href="logout">logout</a>
</body>
</html>