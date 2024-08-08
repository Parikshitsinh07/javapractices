<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Add</title>
        <link
            rel="stylesheet"
            href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
            />
        <link
            href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css"
            rel="stylesheet"
            />
        <link rel="stylesheet" href="Add.css" />
        <link rel="stylesheet" href="User.css" />
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
            rel="stylesheet"/>
        <style>
            .logo{
                width: 40px;
            }
            #default-search{
                width: 300px;
                height: 55px;
            }
            .section-p1 > div{
                display: flex;
                justify-content: center;
            }
            .relative svg{
                margin: -11px;
            }
        </style>
        
    </head>
    <body target="page"  onload="myFunction()">
        <%@include  file="Header.jsp" %>
        <section name="add">
            <div class="products1" id="products1">
                <div class="pro-container">
                    <div class="pro">
                        <img src="img/arrival_2.jpg" alt="" />
                    </div>
                </div>
                <div class="Req">
                    <main>
                        <div class="ps-lg-3" style="margin: 50px 200px 50px 30px;">
                            <h3 class="title text-dark">
                                The Wright Brathers
                            </h3>
                            <div class="d-flex flex-row my-3 " style="justify-content: center;">
                                <div class="text-warning mb-1 me-2">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fas fa-star-half-alt"></i>
                                    <span class="ms-1">
                                        4.5
                                    </span>
                                </div>
                                <span class="text-muted"><i class="fas fa-shopping-basket fa-sm mx-1"></i>154 orders</span>

                            </div>

                            <div class="mb-3">
                                <span class="h5">$75.00</span>
                                <span class="text-muted">/per book</span>
                            </div>
                            <p style="font-size: 20px; color: black;">Book details</p>
                            <p>
                                Modern look and quality demo item is a streetwear-inspired collection that continues to break away from the conventions of mainstream fashion. Made in Italy, these black and brown clothing low-top shirts for
                                men.
                            </p>

                            <div class="row">
                                <dt class="col-3">Author</dt>
                                <dd class="col-9">Author Name</dd>

                                <dt class="col-3">Language</dt>
                                <dd class="col-9">Hindi</dd>

                                <dt class="col-3">Category</dt>
                                <dd class="col-9">Horror</dd>

                                <dt class="col-3">Brand</dt>
                                <dd class="col-9">book</dd>
                            </div>

                            <hr />
                            <!-- col.// -->
                            <a href="#" class="btn btn-warning shadow-0"> Buy now </a>
                            <a href="cart.jsp" class="btn btn-primary shadow-0"> <i class="me-1 fa fa-shopping-basket"></i> Add to cart </a>
                            <a href="#" class="btn btn-light border border-secondary py-2 icon-hover px-3"> <i class="me-1 fa fa-heart fa-lg"></i> Save </a>
                        </div>
                    </main>
                </div>
            </div>
        </section>
        <section>
            <div class="container my-2">
                <header class="mb-4">
                    <h3>Recommended items</h3>
                </header>
                <section id="products1" class="section-p1">
                    <div>
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
                                <h4>₹1078</h4>
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
                                <h4>₹1078</h4>
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
                                <h4>₹1078</h4>
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
                                <h4>₹1078</h4>
                            </div>
                            <a href="Add.jsp"><i class="fal fa-shopping-cart cart"></i></a>
                        </div>
                    </div>
                </section>
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
    </body>
</html>
