<% response.sendRedirect("Home");%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% int i;%>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Parikshit & Mahir E-book's Wab</title>
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
    <body onload="myFunction()">
        <%@include  file="Header.jsp" %>
        <section id="hero">
            <h1 class="texti" style="color: rgb(227, 252, 252)">
                WELCOME TO<br /><span> ONLINE BOOK STORE</span>
            </h1>
            <p class="texti" style="color: rgb(212, 212, 255)">
                Save more Book with coupons & up to 70% off!
            </p>
            <button class="texti">
                <a href="AllBook.jsp" class="main_btn">Learn More</a>
            </button>
        </section>

        <section id="feature" class="section-p1">
            <div class="fe-box">
                <img src="img/f1.png" alt="" />
                <h6>free</h6>
            </div>
            <div class="fe-box">
                <img src="img/f2.png" alt="" />
                <h6>Save Time</h6>
            </div>
            <div class="fe-box">
                <img src="img/f3.png" alt="" />
                <h6>Save Money</h6>
            </div>
            <div class="fe-box">
                <img src="img/f4.png" alt="" />
                <h6>Promotions</h6>
            </div>
            <div class="fe-box">
                <img src="img/f5.png" alt="" />
                <h6>Heppy Sell</h6>
            </div>
            <div class="fe-box">
                <img src="img/f6.png" alt="" />
                <h6>F24/7 Support</h6>
            </div>
        </section>

        <section id="products1" class="section-p1">
            <h2>Featured Books</h2>
            <p>Best sell book in site</p>
            <div class="pro-container">
                <% for (i = 0; i < 8; i++) {%>
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
                <%}%>
            </div>
        </section>

        <section id="banner" class="section-m1">
            <a href="AllBookF/AllBook.jsp"
               ><button class="normal">Explore More</button></a
            >
        </section>

        <section id="products1" class="section-p1">
            <h2>New Arrivals</h2>
            <p>New Books Added in this site</p>
            <div class="pro-container">
                <% for (i = 0; i < 8; i++) {%>
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
                    <a  href="Book_Diteils?BookId=<%= i + 1 %>"><i class="fal fa-shopping-cart cart"></i></a>
                </div>
                <%}%>
            </div>
        </section>

        <section id="banner3">
            <div class="banner-box">
                <h2>New Book SALE</h2>
                <h3>Book Collection -%50 OFF</h3>
            </div>
            <div class="banner-box banner-box2">
                <h2>NEW Book COLLECTION</h2>
                <h3>This Year/2024</h3>
            </div>
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
        <%@include  file="footer.jsp" %>
        <script src="script.js"></script>
    </body>
</html>
