<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Contact</title>
    <link
      rel="stylesheet"
      href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
    />
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="Contact.css" />
     <link rel="stylesheet" href="User.css" />
     <style>
            #default-search{
                   width: 300px;
                }
        </style>
  </head>
  <script>
    function allInput() {
      let firstname = document.getElementById("firstname").value;
      let lastname = document.getElementById("lastname").value;
      let number = document.getElementById("number").value;

      let val = /^[a-zA-Z]+$/;

      if (!val.test(firstname)) {
        alert("Numbers are not allowed in the first name field.");
        return false;
      }

      if (!val.test(lastname)) {
        alert("Numbers are not allowed in the last name field.");
        return false;
      }
      if (number.length !== 10) {
        alert("Your Number is  Invalid");
        return false;
      }

      return true;
    }
  </script>
  <body onload="myFunction()">
       <%@include  file="Header.jsp" %>
    <section class="Contact">
      <div class="img">
        <img src="img/contact.png" alt="" class="Cimg" />
      </div>
      <div class="cont">
        <form class="form" action="Contact_Us" onsubmit="return allInput()">
          <p style="font-size: 30px; color: hsl(0, 0%, 0%)">Contact Us :-</p>
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
              <span>first name</span>
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
              <span>last name</span>
            </label>
          </div>
          <label>
              <input required="" placeholder="" type="email" class="input" name="email" />
            <span>email</span>
          </label>
          <label>
            <input
              required=""
              type="number"
              placeholder=""
              class="input"
              id="number"
              name ="num"
            />
            <span>contact number</span>
          </label>
          <label>
            <textarea
              required=""
              rows="3"
              placeholder=""
              class="input01"
              name="message"
            ></textarea>
            <span>message</span>
          </label>
          <button class="fancy" href="#" type="submit">
            <span class="top-key"></span>
            <span class="text">Contact Us</span>
            <span class="bottom-key-1"></span>
            <span class="bottom-key-2"></span>
          </button>
        </form>
      </div>
    </section>
       <%@include  file="footer.jsp" %>
  </body>
</html>
