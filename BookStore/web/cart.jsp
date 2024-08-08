<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>AddCart</title>
    <link
      rel="stylesheet"
      href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
    />
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css"
      rel="stylesheet"
    />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="cart.css" />
    <link rel="stylesheet" href="User.css" />
  </head>
  <body onload="myFunction()">
      <%
       String User_id = (String)session.getAttribute("User_id");
       if( User_id != null){%>
       <script>
           document.getElementById("user").addEventListener("load", myFunction);
           function myFunction() 
           {
              document.getElementById("user").className = "user-panel";
              document.getElementById("User-drop").className = "user-dropdown";
              document.getElementById("Contener").className = "dropdown-content";
//              document.getElementById("User-drop").addEventListener("mouseover", Dropdown);
              document.getElementById("User-drop").setAttribute("href","");
              Dropdown("UserInfo","Admin.jsp");
              Dropdown("Logout","logout.jsp");
              
             
           }
           function Dropdown(text,url){
                 const node = document.createElement("a");
                // Create a text node:
                node.setAttribute("href",url)
                const textnode = document.createTextNode(text);
                // Append the text node to the "li" node:
                node.appendChild(textnode);
                // Append the "li" node to the list:
                document.getElementById("Contener").appendChild(node);
           }
       </script>
            
        <%}%>
    <section id="header">
      <a href="#"><img src="img/BookLogo.png" class="logo log" style="margin-right: 10px;"/></a>

      <label
        for="default-search"
        class="mb-2 text-sm font-medium text-gray-900 sr-only dark:text-white"
        >Search</label
      >
      <div class="relative">
        <div
          class="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none"
        >
          <svg
           
            class="w-4 h-4 text-gray-500 dark:text-gray-400"
            aria-hidden="true"
            xmlns="http://www.w3.org/2000/svg"
            fill="none"
            viewBox="0 0 20 20"
          >
            <path
              stroke="currentColor"
              stroke-linecap="round"
              stroke-linejoin="round"
              stroke-width="2"
              d="m19 19-4-4m0-7A7 7 0 1 1 1 8a7 7 0 0 1 14 0Z"
            />
          </svg>
        </div>
        <input
          style="width: 350px; height: 15px; margin-left: 10px;"
          
          type="search"
          id="default-search"
          class="block w-full p-4 ps-10 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
          placeholder="Search Your Books..."
          required
        />
        <button
          type="submit"
          style="background-color: hsl(229, 100%, 76%); color: black;"
          class="text-white absolute end-2.5 bottom-2.5 bg-gray-700 hover:bg-gray-800 focus:ring-4 focus:outline-none focus:ring-gray-300 font-medium rounded-lg text-sm px-4 py-2 dark:bg-gray-600 dark:hover:bg-gray-700 dark:focus:ring-gray-800"
        >
          Search
        </button>
      </div>

      <div>
        <ul id="navbar">
          <li><a href="index.jsp">Home</a></li>
          <li><a href="Discounts.jsp">Discounts%</a></li>
          <li><a href="NewBooks.jsp">NewBooks</a></li>
          <li><a href="AllBook.jsp">AllBook</a></li>
          <li><a href="Contact.jsp">Contact</a></li>
          <li><a href="Request.jsp">BookRequest</a></li>

          <li id="lg-bag">
            <a class="active"  href="cart.jsp"><i class="far fa-shopping-bag"></i></a>
          </li>
          <a href="#" id="close1"><i class="far fa-times"></i></a>
        </ul>
      </div>
      <div id="mobile">
        <a href="cart.jsp"><i class="far fa-shopping-bag"></i></a>
        <i id="bar" class="fas fa-outdent"></i>
      </div>
      <div class="user" style="margin-left: 20px">
        <a href="Sign.jsp" class="active">
          <svg
            style="margin-bottom: 13px;"
            class="w-6 h-6 text-gray-800 dark:text-white"
            aria-hidden="true"
            xmlns="http://www.w3.org/2000/svg"
            width="24"
            height="24"
            fill="currentColor"
            viewBox="0 0 24 24"
          >
            <path
              fill-rule="evenodd"
              d="M12 20a7.966 7.966 0 0 1-5.002-1.756l.002.001v-.683c0-1.794 1.492-3.25 3.333-3.25h3.334c1.84 0 3.333 1.456 3.333 3.25v.683A7.966 7.966 0 0 1 12 20ZM2 12C2 6.477 6.477 2 12 2s10 4.477 10 10c0 5.5-4.44 9.963-9.932 10h-.138C6.438 21.962 2 17.5 2 12Zm10-5c-1.84 0-3.333 1.455-3.333 3.25S10.159 13.5 12 13.5c1.84 0 3.333-1.455 3.333-3.25S13.841 7 12 7Z"
              clip-rule="evenodd"
            />
          </svg>
        </a>
      </div>
    </section>
    <section class="bg-light my-1">
      <div class="container">
        <div class="row">
          <div class="col-lg-9">
            <div class="card border shadow-0">
              <div class="m-4">
                <h4 class="card-title mb-4">Your shopping Books</h4>
                <div class="row gy-3 mb-4">
                  <div class="col-lg-5">
                    <div class="me-lg-5">
                      <div class="d-flex">
                        <img
                          src="img/book_14.png"
                          class="border rounded me-3"
                          style="width: 96px; height: 96px"
                        />
                        <div class="">
                          <a href="#" class="nav-link"
                            >Book Name</a
                          >
                          <p class="text-muted">Catagary, Language</p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div
                    class="col-lg-2 col-sm-6 col-6 d-flex flex-row flex-lg-column flex-xl-row text-nowrap"
                  >
                    
                    <div class="">
                      <text class="h6">â¹101156.00</text> <br />
                      <small class="text-muted text-nowrap">
                        â¹10460.00
                      </small>
                    </div>
                  </div>
                  <div
                    class="col-lg col-sm-6 d-flex justify-content-sm-center justify-content-md-start justify-content-lg-center justify-content-xl-end mb-2"
                  >
                    <div class="float-md-end">
                      <a
                        href="#!"
                        class="btn btn-light border px-2 icon-hover-primary"
                        ><i class="fas fa-heart fa-lg px-1 text-secondary"></i
                      ></a>
                      <a
                        href="#"
                        class="btn btn-light border text-danger icon-hover-danger"
                      >
                        Remove</a
                      >
                    </div>
                  </div>
                </div>

               
              </div>
            </div>
          </div>
          <!-- cart -->
          <!-- summary -->
          <div class="col-lg-3">
            <div class="card mb-3 border shadow-0">
              <div class="card-body">
                <form>
                  <div class="form-group">
                    <label class="form-label">Have coupon?</label>
                    <div class="input-group">
                      <input
                        type="text"
                        class="form-control border"
                        name=""
                        placeholder="Coupon code"
                      />
                      <button class="btn btn-light border">Apply</button>
                    </div>
                  </div>
                </form>
              </div>
            </div>
            <div class="card shadow-0 border">
              <div class="card-body">
                <div class="d-flex justify-content-between">
                  <p class="mb-2">Total price:</p>
                  <p class="mb-2">â¹10329.00</p>
                </div>
                <div class="d-flex justify-content-between">
                  <p class="mb-2">Discount:</p>
                  <p class="mb-2 text-success">-â¹1060.00</p>
                </div>
                <div class="d-flex justify-content-between">
                  <p class="mb-2">TAX:</p>
                  <p class="mb-2">â¹1014.00</p>
                </div>
                <hr />
                <div class="d-flex justify-content-between">
                  <p class="mb-2">Total price:</p>
                  <p class="mb-2 fw-bold">â¹10283.00</p>
                </div>

                <div class="mt-3">
                  <a href="Pyment.jsp" class="btn btn-success w-100 shadow-0 mb-2">
                    Make Purchase
                  </a>
                  <a href="#" class="btn btn-light w-100 border mt-2">
                    Back to shop
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <section>
      <div class="container my-2">
        <header class="mb-4">
          <h3>Recommended items</h3>
        </header>
        <section id="products1" class="section-p1">
          <div style="display: flex;" class="pro-container">
            <div class="pro">
              <img src="img/arrival_1.jpg" alt="" />
              <div class="des">
                <span>Best Book</span>
                <h5>The Gever lois lowry</h5>
                <div class="star">
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                </div>
                <h4>â¹1078</h4>
              </div>
              <a href="Add.jsp"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
              <img src="img/arrival_2.jpg" alt="" />
              <div class="des">
                <span>Best Book</span>
                <h5>The Wright Brathers</h5>
                <div class="star">
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                </div>
                <h4>â¹1078</h4>
              </div>
              <a href="Add.jsp"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
              <img src="img/arrival_3.jpg" alt="" />
              <div class="des">
                <span>Best Book</span>
                <h5>Radiacal Gardening</h5>
                <div class="star">
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                </div>
                <h4>â¹1078</h4>
              </div>
              <a href="Add.jsp"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
            <div class="pro">
              <img src="img/arrival_4.jpg" alt="" />
              <div class="des">
                <span>Best Book</span>
                <h5>Red Queen</h5>
                <div class="star">
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                  <i class="fas fa-star"></i>
                </div>
                <h4>â¹1078</h4>
              </div>
              <a href="Add.jsp"><i class="fal fa-shopping-cart cart"></i></a>
            </div>
          </div>
        </section>
    </section>

    <section id="newsletter" class="section-p1 section-m1">
      <div class="newstext">
        <h4>Sing Up For New Books</h4>
        <p>
          Get E-mail updates about our latest Books
          <span> & special offers.</span>
        </p>
      </div>
      <div class="form">
        <input type="text " placeholder="Your email address" />
        <button class="normal">Sing Up</button>
      </div>
    </section>
    <footer class="section-p1">
      <div class="col">
        <img class="logo" src="" alt="" />
        <h4>Contact</h4>
        <p>
          <strong>Address:</strong> 562Wellington Road,Street 32.San Francisco
        </p>
        <p><strong>Phone:</strong> +01 2222 365/(+91) 01 2345 6789</p>
        <p><strong>Hours:</strong> 10:00 - 18:00,Mon - Sat</p>
        <div class="follow">
          <h4>Follow us</h4>
          <div class="icon">
            <i class="fab fa-facebook-f"></i>
            <i class="fab fa-twitter"></i>
            <i class="fab fa-instagram"></i>
            <i class="fab fa-pinterest-p"></i>
            <i class="fab fa-youtube"></i>
          </div>
        </div>
      </div>
      <div class="col">
        <h4>About</h4>
        <a href="index.jsp">Home</a>
        <a href="Discounts.jsp">Discounts%</a>
        <a href="NewBooks.jsp">NewBooks</a>
        <a href="AllBook.jsp">AllBook</a>
        <a href="Contact.jsp">Contact Us</a>
      </div>
      <div class="col">
        <h4>My Account</h4>
        <a href="Sign.jsp">Sing In</a>
        <a href="cart.jsp">View Cart</a>
        <a href="Request.jsp">Request a Book</a>
        <a href="#">Help</a>
      </div>
      <div class="col install">
        <h4>install App</h4>
        <p>Form App Store or Google Play</p>
        <div class="row">
          <img src="img/app.jpg" alt="" />
          <img src="img/play.jpg" alt="" />
        </div>
        <p>Secured Payment Getways</p>
        <img src="img/pay.png" />
      </div>
      <div class="copyright">
        <p>@ 2024, Mahir tech - HTML CSS Online Book Store</p>
      </div>
    </footer>
  </body>
</html>
