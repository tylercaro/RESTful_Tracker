<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${addedShipments.itemType}<br/>
${addedShipments.itemDescription}<br/>
${addedShipments.itemCount}<br/>
${addedShipments.destination}<br/>
<c:forEach var="whElem" items="${warehouses}">
	<h3>${whElem.warehouseName}</h3>
	<c:forEach var="shipmentElem" items="${whElem.shipments}">
		<li>${shipmentElem.shipmentId}: ${shipmentElem.itemType} ${shipmentElem.itemDescription} headed to ${shipmentElem.destination}</li>
	</c:forEach>
</c:forEach>

</body>
</html>