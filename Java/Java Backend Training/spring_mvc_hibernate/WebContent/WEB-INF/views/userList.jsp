<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="" method="post">
		<p> User Id : <input type="text" name="id">	<input type="submit" value="del"><br>
		<p> User Name :<input type="text" name="userName"><br>
		<p> User Email:<input type="text" name="userEmail"><br>
		
		 <input
			type="submit" value="add">
	</form>
	<table border="1">
		<tr>
			<th>  Id</th>
			<th>Name</th>
			<th>EmailId</th>
		</tr>
		<c:forEach items="${uList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.userName}</td>
				<td>${user.userEmail}</td>
				<td><a href="/spring_mvc_hibernate/update/"${user.id} >Update</a></td>
				<td><a href="/spring_mvc_hibernate/delete/"${user.id} >Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>