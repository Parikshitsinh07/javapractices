<%
        String User_id = (String) session.getAttribute("User_id");
        if (User_id != null) {%>
<script>
    document.getElementById("user").addEventListener("load", myFunction);
    function myFunction()
    {
        document.getElementById("user").className = "user-panel";
        document.getElementById("User-drop").className = "user-dropdown";
        document.getElementById("Contener").className = "dropdown-content";
//              document.getElementById("User-drop").addEventListener("mouseover", Dropdown);
        document.getElementById("User-drop").setAttribute("href", "");
        document.getElementById("sin").setAttribute("href", "");
        Dropdown("UserInfo", "Admin.jsp");
        Dropdown("Logout", "Logout.jsp");

    }
    function Dropdown(text, url) {
        const node = document.createElement("a");
        // Create a text node:
        node.setAttribute("href", url)
        const textnode = document.createTextNode(text);
        // Append the text node to the "li" node:
        node.appendChild(textnode);
        // Append the "li" node to the list:
        document.getElementById("Contener").appendChild(node);
    }
</script>

<%}%>
<!--<style>
     .active {
        color: blue; /* Change color for demonstration */
    }
</style>-->
<section id="header">
    <a href="#"><img src="img/BookLogo.png" class="logo log" /></a>

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
        <form action="Search">
        <input
            type="search"
            id="default-search"
            name="search"
            class="block w-full p-4 ps-10 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
            placeholder="Search Your Books..."
            required
            />
        <button
            type="submit"
            style="background-color: hsl(229, 100%, 76%); color: black"
            class="text-white absolute end-2.5 bottom-2.5 bg-gray-700 hover:bg-gray-800 focus:ring-4 focus:outline-none focus:ring-gray-300 font-medium rounded-lg text-sm px-4 py-2 dark:bg-gray-600 dark:hover:bg-gray-700 dark:focus:ring-gray-800"
            >
            Search
        </button>
        </form>
    </div>

    <div>
        <ul id="navbar">
            <li><a class="active" href="Home">Home</a></li>
            <li><a href="Discounts">Discounts</a></li>
            <li><a href="NewBooks.jsp">NewBooks</a></li>
            <li><a href="AllBook.jsp">AllBook</a></li>
            <li><a href="Contact.jsp">Contact</a></li>
            <li>
                <a href="Request.jsp">BookRequest</a>
            </li>

            <li id="lg-bag">
                <a href="CartServlet"><i class="far fa-shopping-bag"></i></a>
            </li>
            <a href="#" id="close1"><i class="far fa-times"></i></a>
        </ul>
    </div>
    <div id="mobile">
        <a href="cart.jsp"><i class="far fa-shopping-bag"></i></a>
        <i id="bar" class="fas fa-outdent"></i>
    </div>
    <div class="user" id="user" >
        <a href="Sign.jsp" class="active" id="User-drop">
            <svg
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
            <div id="Contener"></div>
        </a>

    </div>
</section>

<!--<script>
    // Get all anchor tags inside the navbar
    const navLinks = document.querySelectorAll('#navbar a');

    // Add click event listener to each anchor tag
    navLinks.forEach(link => {
        link.addEventListener('click', function (event) {
            event.preventDefault(); // Prevent default behavior of the link

            // Remove 'active' class from all links
            navLinks.forEach(link => {
                link.classList.remove('active');
            });

            // Add 'active' class to the clicked link
            this.classList.add('active');
        });
    });
</script>-->