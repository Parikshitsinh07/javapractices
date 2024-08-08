<%-- 
    Document   : Search
    Created on : 3 Apr, 2024, 11:18:52 PM
    Author     : Admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% int i = 0;
    ResultSet rs = null;
    rs = (ResultSet) session.getAttribute("Result");
    System.out.println(rs);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
        <link
            rel="stylesheet"
            href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
            />
        <link
            href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css"
            rel="stylesheet"
            />
        <link rel="stylesheet" href="style.css" />
        <link rel="stylesheet" href="User.css" />
        <style>
            #default-search{
                width: 300px;
            }
        </style>
    </head>
    <body>
        <%@include  file="Header.jsp" %>

        <section id="products1" class="section-p1">
            <h2>Search Boook</h2>
            <p>Search Books Added in this site</p>
            <div class="pro-container">
                <%if (rs != null && rs.next()) {
                        do {%>
                <div class="pro">
                    <img src=<%=rs.getString("Book_ImgUrl")%> alt="" />
                    <div class="des">
                        <span>Best Book</span>
                        <h5><%=rs.getString("Book_Title")%></h5>
                        <div class="star">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                        </div>
                        <h4><%=rs.getDouble("Book_Price")%></h4>
                    </div>
                    <a  href="Book_Diteils?BookId=<%=rs.getInt("Book_id")%>"><i class="fal fa-shopping-cart cart"></i></a>
                </div>
                <% } while (rs.next());
                 } else {%>
                 <h1>No Results Found</h1>
                 <%}%>
            </div>
        </section>

        <%@include file="footer.jsp" %>
    </body>
</html>
