<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
<script>
<!-- "http://localhost:8081/MaterialTracker/rest/warehouse/all"  $('p').text(data);-->
	$(function(){
		$('button').on('click',function(){
			$.ajax({
				type : "GET",
				dataType : "json",
				url : "http://localhost:8081/MaterialTracker/do/get/warehouses/all",
				success : function(data){
					var warehouseOutput="";
					$.each(data.warehouses, function(i,v){
						warehouseOutput+=v.warehouseName+ " ";
						$('p').text(warehouseOutput);
					})
				}
			});
		});
	});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<p id="report">Report goes here</p>
		<button class="btn btn-default">Generate
			Report</button>
	</div>
</body>
</html>