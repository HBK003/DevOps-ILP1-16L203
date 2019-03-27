<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Add gadget</h3>
<form action="add">
	ID : <input type="text" name="id">
	<br>
	Name : <input type="text" name="name">
	<br>
	Price : <input type="number" name="price">
	<br>
	<input type="submit" value="Add">
</form>
<br>
<br>

<h3>Remove gadget</h3>
<form action="remove">
	ID : <input type="text" name="id">
	<br>
	<input type="submit" value="Remove">
</form>

<br>
<br>

<h3>Display gadgets</h3>
<form action="display">
	<input type="submit" value="Display all gadgets">
</form>
</body>
</html>