<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@include file="./base.jsp" %>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to product App</h1>
			
			<table class="table">
  				<thead class="thead-dark">
    			<tr>
      				<th scope="col">Product Id</th>
      				<th scope="col">Product Name</th>
      				<th scope="col">Description</th>
      				<th scope="col">Price</th>
      				<th scope="col">Action</th>
    			</tr>
  				</thead>
  				<tbody>
  				<c:forEach items="${products}" var="p">
    				<tr>
      					<th scope="row">${p.id}</th>
      					<td>${p.name}</td>
      					<td>${p.description}</td>
      					<td class="font-weight-bold">&#x20B9; ${p.price}</td>
      					<td>
      					<a href="delete/${p.id }"><i class="fa-solid fa-trash text-danger"></i></a>
      					<a class="mx-2" href="update/${p.id }"><i class="fa-solid fa-pen-to-square text-success"></i></a>
      					</td>
      					
    				</tr>
    				
    			</c:forEach>	
    			
  				</tbody>
			</table>
			<div class="container text-center">
				<a href="add-product" class="btn btn-outline-success">Add Product</a>
			
			
			</div>
			
			</div>
		
		</div>
	
	
	</div>

</body>
</html>