<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@include file="./base.jsp" %>

<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Change Product Details</h1>
				<form class="border border-secondray" action="${pageContext.request.contextPath}/handle-product" method="post">
				<input type="hidden" value="${product.id }" name="id">
					<div class="form-group">
						<label for="name">Product Name</label>
						<input type="text" class="form-control" id="name" aria-describedby="emailhelp"
							name="name"
							placeholder="Enter Product Name here !" value="${product.name }">
					</div>
					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" id="description"
							name="description" rows="5"
							placeholder="Enter the Product Desciption here !">${product.description}</textarea>
					</div>
					<div class="form-group">
						<label for="price">Product Price</label>
						<input type="text" class="form-control" id="price" 
							name="price" value="${product.price }"
							placeholder="Enter Product price !">
					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
						class="btn btn-outline-danger">Back</a>
						
						<button type="submit" class="btn btn-warning">Update Product</button>
					
					</div>
			
			
			</form>
			
			</div>
		
		
		
		</div>
	
	
	
	
	</div>



</body>
</html><