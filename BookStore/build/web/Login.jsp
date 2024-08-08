<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login</title>
     <link
    rel="stylesheet"
    href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
  />
  <link
    href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css"
    rel="stylesheet"
  />
  <link rel="stylesheet" href="Login.css" />
  <link rel="stylesheet" href="User.css" />
  <style>
            #default-search{
                   width: 300px;
                }
        </style>
  </head>
 
  
  <body>
      
       <%
             
    String User = (String) session.getAttribute("User_id");
        if (User != null) {
                response.sendRedirect("Home");
          }
             String[] parts = request.getHeader("referer").split("/");
             int len = parts.length;
             String pageurl = parts[len-1];
              session.setAttribute("ragistion","Sign.jsp");
              session.setAttribute("Page", pageurl);
            if("correct".equals(request.getAttribute("insertst"))) {%>
            <script>
                alert("Registion successfully!");
            </script>
        <%}%>
        <%  if("resetSuccess".equals(request.getAttribute("status"))) { %>
             <script>
                alert("PassWord Update successfully!");
            </script>
        <% }else if("resetFailed".equals(request.getAttribute("status"))) { %>
             <script>
                alert("PassWord resetFailed !");
            </script>
        <% } %>
         <%@include  file="Header.jsp" %>
    <section class="rag">
      <div class="main">
        <div class="img">
          <img src="img/Login.png" alt="" class="Limg" />
        </div>
        <div class="login">
            <form class="form" action="UserLogin">
            <p class="title">Login</p>
            <label>
                <input required="" placeholder="" type="email" class="input" name="User" />
              <span>Email</span>
            </label>

            <label>
                <input required="" placeholder="" type="password" class="input" name="Password"/>
              <span>Password</span>
            </label>
            <button class="submit">Submit</button>
            <p class="signin">
               <a href="forgotPassword.jsp">Forgot Password?</a> 
            </p>
            <p class="signin">
              Create New acount ? <a href="Sign.jsp">Register</a>
            </p>
          </form>
        </div>
      </div>
    </section>
  </body>
</html>
