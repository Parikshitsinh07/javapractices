<%-- 
    Document   : Logout
    Created on : 29 Mar, 2024, 5:39:10 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%session.invalidate();%>
        <%response.sendRedirect("Login.jsp");%>
    </body>
</html>
