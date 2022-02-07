<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Customer Details</h2>
	<h2>${Orders.orders}</h2>
	 <div align="center">
	<table border="1" cellpadding = "5">
		<caption><h2>List of Customers</h2></caption>
		<tr>
			<th>customerId </th>
			<th>customerDate </th>
			<th>customerValue </th>
		</tr> 
		<c:forEach items = "${Customers.customers}" var="cus" >
		
		 <tr>
			<td><c:out value= "${cus.customerId}" /></td>
			<td><c:out value= "${cus.customerDate}" /></td>
			<td><c:out value= "${cus.customerValue}" /> </td>
		</tr> 
		</c:forEach>
	</table> 
		
</div>

</body>
</html>