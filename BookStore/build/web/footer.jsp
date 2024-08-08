<%-- 
    Document   : footer
    Created on : 29 Mar, 2024, 9:07:18 PM
    Author     : Admin
--%>

<%
    String[] url = null;
    String refererHeader = request.getHeader("referer");
    if (refererHeader != null) {
        url = refererHeader.split("/");
        int len = url.length;
        String sub = url[len - 1];
        session.setAttribute("Sub", sub);
    }
%>

<script>
    function Sub() {
        e = document.getElementById("email").value;
        if (e != null && e != "") {
            document.getElementById("Subcrib").setAttribute("href", "subscribe?email=" + e);
        } else {
            alert("Enter Your email !");
        }
    }
</script>
<section id="newsletter" class="section-p1 section-m1">
    <div class="newstext">
        <h4>Sing Up For New Books</h4>
        <p>
            Get E-mail updates about our latest Books
            <span> & special offers.</span>
        </p>
    </div>
    <div class="form">
        <input type="text "  name="email" id= "email" placeholder="Your email address" required/>
        <a href="" id= "Subcrib" onclick="Sub()"><button class="normal">subscribe</button></a>
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
        <a href="Sign.jsp" id="sin">Sing In</a>
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
        <p>@ 2024, Mahir & Parikshit tech - HTML CSS Online Book Store</p>
    </div>
</footer>
