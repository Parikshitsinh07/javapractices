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
public class Home extends HttpServlet {
//    Statement st = null;

    PreparedStatement ps = null;
    ResultSet rs = null;
    DataConection databas = null;

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
            /* TODO output your page here. You may use following sample code. */
            databas = new DataConection();
            if (databas != null) {
                ps = databas.PsStatment("SELECT * FROM `book` WHERE Book_id = ?");
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Parikshit & Mahir E-book's Wab</title>\n"
                    + "        <link\n"
                    + "            rel=\"stylesheet\"\n"
                    + "            href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\"\n"
                    + "            />\n"
                    + "        <link\n"
                    + "            href=\"https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css\"\n"
                    + "            rel=\"stylesheet\"\n"
                    + "            />\n"
                    + "        <link rel=\"stylesheet\" href=\"style.css\" />\n"
                    + "        <link rel=\"stylesheet\" href=\"User.css\" />\n"
                    + "        <style>\n"
                    + "            #default-search{\n"
                    + "                   width: 300px;\n"
                    + "                }\n"
                    + "        </style>");
            out.println("</head>");
            out.println("<body onload=\"myFunction()\">");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Header.jsp");
            dispatcher.include(request, response);
            out.println(" <section id=\"hero\">\n"
                    + "            <h1 class=\"texti\" style=\"color: rgb(227, 252, 252)\">\n"
                    + "                WELCOME TO<br /><span> ONLINE BOOK STORE</span>\n"
                    + "            </h1>\n"
                    + "            <p class=\"texti\" style=\"color: rgb(212, 212, 255)\">\n"
                    + "                Save more Book with coupons & up to 70% off!\n"
                    + "            </p>\n"
                    + "            <button class=\"texti\">\n"
                    + "                <a href=\"AllBook.jsp\" class=\"main_btn\">Learn More</a>\n"
                    + "            </button>\n"
                    + "        </section>\n"
                    + "\n"
                    + "        <section id=\"feature\" class=\"section-p1\">\n"
                    + "            <div class=\"fe-box\">\n"
                    + "                <img src=\"img/f1.png\" alt=\"\" />\n"
                    + "                <h6>free</h6>\n"
                    + "            </div>\n"
                    + "            <div class=\"fe-box\">\n"
                    + "                <img src=\"img/f2.png\" alt=\"\" />\n"
                    + "                <h6>Save Time</h6>\n"
                    + "            </div>\n"
                    + "            <div class=\"fe-box\">\n"
                    + "                <img src=\"img/f3.png\" alt=\"\" />\n"
                    + "                <h6>Save Money</h6>\n"
                    + "            </div>\n"
                    + "            <div class=\"fe-box\">\n"
                    + "                <img src=\"img/f4.png\" alt=\"\" />\n"
                    + "                <h6>Promotions</h6>\n"
                    + "            </div>\n"
                    + "            <div class=\"fe-box\">\n"
                    + "                <img src=\"img/f5.png\" alt=\"\" />\n"
                    + "                <h6>Heppy Sell</h6>\n"
                    + "            </div>\n"
                    + "            <div class=\"fe-box\">\n"
                    + "                <img src=\"img/f6.png\" alt=\"\" />\n"
                    + "                <h6>F24/7 Support</h6>\n"
                    + "            </div>\n"
                    + "        </section>\n"
                    + "\n"
                    + "        <section id=\"products1\" class=\"section-p1\">\n"
                    + "            <h2>Featured Books</h2>\n"
                    + "            <p>Best sell book in site</p>\n"
                    + "            <div class=\"pro-container\">\n");
            for (int i = 0; i < 8; i++) {
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
                   rs= null; 
                }
            }
            out.println("            </div>\n"
                    + "        </section>\n"
                    + "\n"
                    + "        <section id=\"banner\" class=\"section-m1\">\n"
                    + "            <a href=\"AllBook.jsp\"\n"
                    + "               ><button class=\"normal\">Explore More</button></a\n"
                    + "            >\n"
                    + "        </section>\n"
                    + "\n"
                    + "        <section id=\"products1\" class=\"section-p1\">\n"
                    + "            <h2>New Arrivals</h2>\n"
                    + "            <p>New Books Added in this site</p>\n"
                    + "            <div class=\"pro-container\">\n");
            for (int i = 0; i < 8; i++) {
                if (ps != null) {
                    ps.setInt(1, (i + 1));
                    rs = ps.executeQuery();
                    rs.next();
                    if (rs != null) {
                        out.println("                <div class=\"pro\">\n"
                                + "                    <img src=\"" + rs.getString("Book_ImgUrl") + "\" alt=\"\" />\n"
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
                                + "                         <h4>₹" + rs.getDouble("Book_Price") + "</h4>\n"
                                + "                    </div>\n"
                                + "                    <a href=\"Book_Diteils?BookId=" + (i + 1) + "\"><i class=\"fal fa-shopping-cart cart\"></i></a>\n"
                                + "                </div>\n");
                    }
                }
            }
            out.println("            </div>\n"
                    + "        </section>\n"
                    + "\n"
                    + "        <section id=\"banner3\">\n"
                    + "            <div class=\"banner-box\">\n"
                    + "                <h2>New Book SALE</h2>\n"
                    + "                <h3>Book Collection -%50 OFF</h3>\n"
                    + "            </div>\n"
                    + "            <div class=\"banner-box banner-box2\">\n"
                    + "                <h2>NEW Book COLLECTION</h2>\n"
                    + "                <h3>This Year/2024</h3>\n"
                    + "            </div>\n"
                    + "        </section>");
            RequestDispatcher footerDispatcher = request.getRequestDispatcher("/footer.jsp");
            footerDispatcher.include(request, response);
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
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
