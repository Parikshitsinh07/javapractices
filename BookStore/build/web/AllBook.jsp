<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>AllBook</title>
    <link
      rel="stylesheet"
      href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
    />
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="AllBook.css" />
     <link rel="stylesheet" href="User.css" />
     <style>
            #default-search{
                   width: 300px;
                }
        </style>
  </head>
  <body  onload="myFunction()">
       <%@include  file="Header.jsp" %>
    <div style="display: flex; margin: 10px">
      <iframe src="Sidebar.jsp" height="600" width="290"> </iframe>
      <iframe src="Contant.jsp" height="600" width="1100"> </iframe>
    </div>
       <%@include  file="footer.jsp" %>
  </body>
</html>
