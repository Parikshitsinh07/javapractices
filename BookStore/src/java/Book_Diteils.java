/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Admin
 */
public class Book_Diteils extends HttpServlet {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DataConection databas = null;
    String titel = "";
    String img = "";
    String Author = "";
    String Language = "";
    String Category = "";
    double price = 0;
    int BookId = 0;
    String Book = null;
    String ditelis= "";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            Book = request.getParameter("BookId");
            if (Book != null) {
                BookId = Integer.parseInt(Book);
                databas = new DataConection();
                if (databas != null) {
                    ps = databas.PsStatment("SELECT * FROM `book` WHERE Book_id = ?");
                    ps.setInt(1, BookId);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        if (rs != null) {
                            img = rs.getString("Book_ImgUrl");
                            titel = rs.getString("Book_Title");
                            Author = rs.getString("Book_Author");
                            Language = rs.getString("Book_Language");
                            Category = rs.getString("Book_Category");
                            price = rs.getDouble("Book_Price");
                            ditelis=rs.getString("Book_info");
                        }
                    }
                }
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Book_Diteils</title>");
            out.println("<link rel='stylesheet' href='style.css'/>"
                    + "<link\n"
                    + "            rel=\"stylesheet\"\n"
                    + "            href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\"\n"
                    + "            />\n"
                    + "        <link\n"
                    + "            href=\"https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css\"\n"
                    + "            rel=\"stylesheet\"\n"
                    + "            />"
                    + " <link rel=\"stylesheet\" href=\"Add.css\" />\n"
                    + " <link rel=\"stylesheet\" href=\"User.css\" />"
                    + "<link\n"
                    + "            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n"
                    + "            rel=\"stylesheet\"/>");
            out.println("<style>");
            out.println(".logo{\n"
                    + "                width: 40px;\n"
                    + "            }\n"
                    + "            #default-search{\n"
                    + "                width: 300px;\n"
                    + "                height: 55px;\n"
                    + "            }\n"
                    + "            .section-p1 > div{\n"
                    + "                display: flex;\n"
                    + "                justify-content: center;\n"
                    + "            }\n"
                    + "            .relative svg{\n"
                    + "                margin: -11px;\n"
                    + "            }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body onload=\"myFunction()\">");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Header.jsp");
            dispatcher.include(request, response);
//             while (rs.next()) {
//                out.println("<h1>Book Titile" + rs.getString("Book_Title") + "</h1>");
//            }
            out.println("<section name=\"add\">\n"
                    + "            <div class=\"products1\" id=\"products1\">\n"
                    + "                <div class=\"pro-container\">\n"
                    + "                    <div class=\"pro\">\n"
                    + "                        <img src=" + img + " alt=\"\" />\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "                <div class=\"Req\">\n"
                    + "                    <main>\n"
                    + "                        <div class=\"ps-lg-3\" style=\"margin: 50px 200px 50px 30px;\">\n"
                    + "                            <h3 class=\"title text-dark\">\n"
                    + titel
                    + "                            </h3>\n"
                    + "                            <div class=\"d-flex flex-row my-3 \" style=\"justify-content: center;\">\n"
                    + "                                <div class=\"text-warning mb-1 me-2\">\n"
                    + "                                    <i class=\"fa fa-star\"></i>\n"
                    + "                                    <i class=\"fa fa-star\"></i>\n"
                    + "                                    <i class=\"fa fa-star\"></i>\n"
                    + "                                    <i class=\"fa fa-star\"></i>\n"
                    + "                                    <i class=\"fas fa-star-half-alt\"></i>\n"
                    + "                                    <span class=\"ms-1\">\n"
                    + "                                        4.5\n"
                    + "                                    </span>\n"
                    + "                                </div>\n"
                    + "                                <span class=\"text-muted\"><i class=\"fas fa-shopping-basket fa-sm mx-1\"></i>154 orders</span>\n"
                    + "\n"
                    + "                            </div>\n"
                    + "\n"
                    + "                            <div class=\"mb-3\">\n"
                    + "                                <span class=\"h5\">₹" + price + "</span>\n"
                    + "                                <span class=\"text-muted\">/per book</span>\n"
                    + "                            </div>\n"
                    + "                            <p style=\"font-size: 20px; color: black;\">Book details</p>\n"
                    + "                            <p>\n"
                    +                                 ditelis
                    + "                            </p>\n"
                    + "\n"
                    + "                            <div class=\"row\">\n"
                    + "                                <dt class=\"col-3\">Author</dt>\n"
                    + "                                <dd class=\"col-9\">" + Author + "</dd>\n"
                    + "\n"
                    + "                                <dt class=\"col-3\">Language</dt>\n"
                    + "                                <dd class=\"col-9\">" + Language + "</dd>\n"
                    + "\n"
                    + "                                <dt class=\"col-3\">Category</dt>\n"
                    + "                                <dd class=\"col-9\">" + Category + "</dd>\n"
                    + "\n"
                    + "                                <dt class=\"col-3\">Brand</dt>\n"
                    + "                                <dd class=\"col-9\">book</dd>\n"
                    + "                            </div>\n"
                    + "\n"
                    + "                            <hr />\n"
                    + "                            <!-- col.// -->\n"
                    + "                            <a href=\"Pyment?TotalPy=" + price + "\" class=\"btn btn-warning shadow-0\"> Buy now </a>\n"
                    + "                            <a href=\"CartServlet?BookId=" + BookId + "\" class='btn btn-primary shadow-0'> <i class='me-1 fa fa-shopping-basket'></i> Add to cart </a>\n"
                    + "                            <a href=\"#\" class=\"btn btn-light border border-secondary py-2 icon-hover px-3\"> <i class=\"me-1 fa fa-heart fa-lg\"></i> Save </a>\n"
                    + "                        </div>\n"
                    + "                    </main>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </section>\n"
                    + "        <section>\n"
                    + "            <div class=\"container my-2\">\n"
                    + "                <header class=\"mb-4\">\n"
                    + "                    <h3>Recommended items</h3>\n"
                    + "                </header>\n"
                    + "                <section id=\"products1\" class=\"section-p1\">\n"
                    + "                    <div>\n");
            for (int i = 0; i < 4; i++) {
                if (ps != null) {
                    ps.setInt(1, (i + 1));
                    rs = ps.executeQuery();
                    rs.next();
                    if (rs != null) {
                        out.println("                <div class=\"pro\">\n"
                                + "                   <img src=\"" + rs.getString("Book_ImgUrl") + "\" alt=\"\" />\n"
                                + "                    <div class=\"des\">\n"
                                + "                        <span>Best Book</span>\n"
                                + "                        <h5>" + rs.getString("Book_Title") + "</h5>\n"
                                + "                        <div class=\"star\">\n"
                                + "                            <i class=\"fas fa-star\"></i>\n"
                                + "                            <i class=\"fas fa-star\"></i>\n"
                                + "                            <i class=\"fas fa-star\"></i>\n"
                                + "                            <i class=\"fas fa-star\"></i>\n"
                                + "                            <i class=\"fas fa-star\"></i>\n"
                                + "                        </div>\n"
                                + "                        <h4>₹" + rs.getDouble("Book_Price") + "</h4>\n"
                                + "                    </div>\n"
                                + "                    <a href=\"Book_Diteils?BookId=" + (i + 1) + "\"><i class=\"fal fa-shopping-cart cart\"></i></a>\n"
                                + "                </div>\n");
                    }
                }
            }
            out.println("                    </div>\n"
                    + "                </section>\n"
                    + "            </div>\n"
                    + "        </section>\n");
            RequestDispatcher footerDispatcher = request.getRequestDispatcher("/footer.jsp");
            footerDispatcher.include(request, response);
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(Book_Diteils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
