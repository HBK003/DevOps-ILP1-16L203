<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" width=80% height=100>
<tr>
<th colspan=3 align="center" >Online Electronic Gadget Store</th> 
</tr>
<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Price</th>
</tr>
<c:forEach  items="${gadgets}"   var="item">
<tr>
         <td>${item.id}</td><td>${item.name}</td><td>${item.price}</td>
</tr>    
</c:forEach>
</table>

</body>
</html>