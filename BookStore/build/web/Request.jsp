<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>RequestBook</title>
    <link
      rel="stylesheet"
      href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
    />
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="Request.css" />
     <link rel="stylesheet" href="User.css" />
     <style>
            #default-search{
                   width: 300px;
                }
        </style>
  </head>
  <body  onload="myFunction()">
       <%@include  file="Header.jsp" %>
    <section class="getbok">
      <div class="main">
        <div class="img">
          <img src="img/Request.png" alt="" class="RQimg" />
        </div>
        <div class="Req">
          <div class="mt-4 flex flex-col bg-gray-100 rounded-lg p-4 shadow-sm">
            <h2 class="text-black font-bold text-lg">Request a Book:-</h2>
           <form action="#" onsubmit="return validateRequestForm()">
            <div class="mt-4">
              <label class="text-black" for="Title">Title</label>
              <input
                placeholder="Your Book Title"
                class="w-full bg-white rounded-md border-gray-300 text-black px-2 py-1"
                type="text"
                id="Title"
                required
              />
            </div>
            <div class="mt-5">
              <label class="text-black" for="Author">Author</label>
              <input
                placeholder="Your Book Author Name"
                class="w-full bg-white rounded-md border-gray-300 text-black px-2 py-1"
                type="text"
                id="Author"
                required
              />
            </div>

            <div class="mt-4">
              <label class="text-black" for="Email">Email</label>
              <input
                placeholder="Your Email"
                class="w-full bg-white rounded-md border-gray-300 text-black px-2 py-1"
                id="email"
                type="email"
                required
              />
            </div>

            <div class="mt-4 flex flex-row space-x-2">
              <div class="flex-1">
                <label class="text-black" for="city">Mobile no</label>
                <input
                  placeholder="Your Mobile number"
                  class="w-full bg-white rounded-md border-gray-300 text-black px-2 py-1"
                  id="number"
                  type="number"
                  required
                />
              </div>

              <div class="flex-1">
                <label class="text-black" for="Quantity">Category</label>
                <input
                  placeholder="Your Book Quantity"
                  class="w-full bg-white rounded-md border-gray-300 text-black px-2 py-1"
                  id="Quantity"
                  type="number"
                  required
                />
              </div>
            </div>

            <div class="mt-4 flex flex-row space-x-2">
              <div class="flex-1">
                <label class="text-black" for="Phone">Phone No</label>
                <input
                  placeholder="Your Phone Number"
                  class="w-full bg-white rounded-md border-gray-300 text-black px-2 py-1"
                  id="Phone"
                  type="number"
                  required
                />
              </div>

              <div class="flex-1">
                <label class="text-black" for="Language">Language</label>
                <select
                  class="w-full bg-white rounded-md border-gray-300 text-black px-2 py-1"
                  id="Language"
                  required
                >
                  <option value="">Select a language</option>
                  <option value="">Hindi</option>
                  <option value="">Gujarati</option>
                  <option value="">English</option>
                  <option value="">Any</option>
                </select>
              </div>
            </div>

            <div class="mt-4 flex justify-center">
              <button
                class="text-white rounded-md px-8 py-1 hover:bg-gray-200 hover:text-gray-900"
                style="background-color: hsl(229, 100%, 76%)"
                type="submit"
              >
                Submit
              </button>
            </form>
            </div>
          </div>
        </div>
      </div>
    </section>

       <%@include  file="footer.jsp" %>
  </body>
  <script>
    function validateRequestForm() {
      let title = document.querySelector('#Title').value;
      let author = document.querySelector('#Author').value;
      let email = document.querySelector('#email').value;
      let mobileNumber = document.querySelector('#number').value;
      let quantity = document.querySelector('#Quantity').value;
      let phoneNumber = document.querySelector('#Phone').value;
      let language = document.querySelector('#Language').value;
  

      let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

      let phoneRegex = /^\d{10}$/;
  

      if (!emailRegex.test(email)) {
        alert('Please enter a valid email address.');
        return false;
      }
  

      if (!phoneRegex.test(mobileNumber)) {
        alert('Please enter a valid mobile number.');
        return false;
      }
  

      if (!phoneRegex.test(phoneNumber)) {
        alert('Please enter a valid phone number.');
        return false;
      }
  

      return true;
    }
  </script>
  
</html>
