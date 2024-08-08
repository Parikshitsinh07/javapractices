<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Sign</title>
  </head>
  <link
    rel="stylesheet"
    href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
  />
  <link
    href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css"
    rel="stylesheet"
  />
  <link rel="stylesheet" href="Sign.css" />
  
  <link rel="stylesheet" href="User.css" />
  <style>
            #default-search{
                   width: 300px;
                }
        </style>
  <body>

       <%@include  file="Header.jsp" %>
                <%
    String User = (String) session.getAttribute("User_id");
        if (User != null) {
                response.sendRedirect("Home");
          }
%>
    <section class="rag">
      <div class="main">
        <div class="img">
          <img src="img/Regestore.png" alt="" class="Rimg" />
        </div>
        <div class="sign">
            <form class="form"  action="Registion" onsubmit="return validateForm()">
            <p class="title">Register</p>
            <p class="message">Signup now and get full access to our app.</p>
            <div class="flex">
              <label>
                <input
                  required=""
                  placeholder=""
                  type="text"
                  class="input"
                  id="firstname"
                  name="firstname"
                />
                <span>Firstname</span>
              </label>

              <label>
                <input
                  required=""
                  placeholder=""
                  type="text"
                  class="input"
                  id="lastname"
                  name="lastname"
                />
                <span>Lastname</span>
              </label>
            </div>

            <label>
                <input required="" placeholder="" type="email" class="input" name="email" />
              <span>Email</span>
            </label>

            <label>
              <input
                required=""
                placeholder=""
                type="password"
                class="input"
                id="password"
                name="password"
              />
              <span>Password</span>
            </label>
            <label>
              <input
                required=""
                placeholder=""
                type="password"
                class="input"
                id="confirmpassword"
              />
              <span>Confirm password</span>
            </label>
            <button class="submit" type="submit">Submit</button>
            <p class="signin">
              Already have an acount ? <a href="Login.jsp">Login</a>
            </p>
          </form>
        </div>
      </div>
    </section>
    <script>
      function validateForm() {
        let firstname = document.getElementById("firstname").value;
        let lastname = document.getElementById("lastname").value;
        let email = document.querySelector('input[type="email"]').value;
        let password = document.getElementById("password").value;
        let confirmPassword = document.getElementById("confirmpassword").value;

        let val = /^[a-zA-Z]+$/;
        let emailVal = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (!val.test(firstname)) {
          alert("Numbers are not allowed in the first name field.");
          return false;
        }

        if (!val.test(lastname)) {
          alert("Numbers are not allowed in the last name field.");
          return false;
        }

        if (!emailVal.test(email)) {
          alert("Please enter a valid email address.");
          return false;
        }

        if (password !== confirmPassword) {
          alert("Passwords do not match.");
          return false;
        }

        return true;
      }
    </script>
  </body>
</html>
