<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
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
	<div class="container">
		<form action="${pageContext.request.contextPath}/do/shipments/submit" method="POST">
			<spring:bind path="shipment.itemType">
				<input type="text" name="${status.expression}" placeholder="type" value="${status.value}"><br/>
			</spring:bind><!--end type-->
			<spring:bind path="shipment.itemDescription">
				<input type="text" name="${status.expression}" placeholder="descrption" value="${status.value}"><br/>
			</spring:bind><!--end description-->
			<spring:bind path="shipment.itemCount">
				<input type="text" name="${status.expression}" placeholder="count" value="${status.value}"><br/>
			</spring:bind><!--end count-->
			<spring:bind path="shipment.destination">
				<input type="text" name="${status.expression}" placeholder="destination" value="${status.value}"><br/>
			</spring:bind><!--end destination-->
			

			<spring:bind path="chosenWarehouse.warehouseId">
				<div class="dropdown">
					<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
				    	Warehouses
						<span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
						<c:forEach var="whElem" items="${warehouses}">
							<li> ${whElem.warehouseName}<input type="radio"  name="${status.expression}" value="${whElem.warehouseId}"></li>
						</c:forEach>
					</ul>
				</div>
			</spring:bind><!--end warehouse -->	
					
			<input class="btn btn-default" type="submit" value="New Shipment!" />
		</form>	
	</div>
</body>
</html>