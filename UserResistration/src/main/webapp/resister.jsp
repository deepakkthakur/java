<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="registerForm" method="post">
		<input type="text" name="name" placeholder="Enter name"><br/><br/>
		<input type="email" name="email" placeholder="Enter email"><br/><br/>
		<input type="password" name="password" placeholder="Enter Password"><br/><br/>
		Select Gender : <input type="radio" value="male" name="gender">Male
		<input type="radio" name="gender" value="female">Female<br/><br/>
		Select City : <select name="city"><br/><br/>
			<option>Delhi</option>
			<option>Mumbai</option>
			<option>Ranchi</option>
			<option>kolkata</option>
		</select><br/><br/>
		<input type="submit" value="register"/>
	</form>
</body>
</html>