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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class CartServlet extends HttpServlet {

    PreparedStatement ps = null;
    ResultSet rs = null;
    DataConection databas = null;
    String BookId = null;
    int Book_Id = 0;
    String titel = "";
    String img = "";
    String Author = "";
    String Language = "";
    String Category = "";
    double price = 0;
    double TotalPrice = 0;
    double Discount = 0;
    double Total = 0;
    int index = 0;

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
            BookId = request.getParameter("BookId");
            databas = new DataConection();
            if (BookId != null) {
                Book_Id = Integer.parseInt(BookId);
            }
            HttpSession session = request.getSession();
            ArrayList<Integer> cart = (ArrayList<Integer>) session.getAttribute("cart");
//            Book_Select bk = new Book_Select();
            if (cart == null) {
                System.out.println("Cart is Empty");
                cart = new ArrayList<>();
            }
            if (cart.contains(Book_Id)) {
                System.out.println("have iteam");
            } else {
                if (Book_Id != 0) {
                    cart.add(Book_Id);
                    Book_Id = 0;
                    session.setAttribute("cart", cart);
                }
            }
            if (databas != null) {
                ps = databas.PsStatment("SELECT * FROM `book` WHERE Book_id = ?");
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CartServlet</title>");
            out.println("<link\n"
                    + "      rel=\"stylesheet\"\n"
                    + "      href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\"\n"
                    + "    />\n"
                    + "    <link\n"
                    + "      href=\"https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css\"\n"
                    + "      rel=\"stylesheet\"\n"
                    + "    />\n"
                    + "    <link\n"
                    + "      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n"
                    + "      rel=\"stylesheet\"\n"
                    + "      integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\n"
                    + "      crossorigin=\"anonymous\"\n"
                    + "    />\n"
                    + "    <link rel=\"stylesheet\" href=\"cart.css\" />\n"
                    + "    <link rel=\"stylesheet\" href=\"User.css\" />");
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
                    + "            }"
                    + ".active { margin: -13px 28px 0px 0p;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body onload=\"myFunction()\">");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Header.jsp");
            dispatcher.include(request, response);

            out.println("<section class=\"bg-light my-1\">\n"
                    + "      <div class=\"container\">\n"
                    + "        <div class=\"row\">\n"
                    + "          <div class=\"col-lg-9\">\n"
                    + "            <div class=\"card border shadow-0\">\n"
                    + "              <div class=\"m-4\">\n"
                    + "                <h4 class=\"card-title mb-4\">Your shopping Books</h4>\n");
            if (cart.size() > 0) {
                for (Integer Book : cart) {
                    if (ps != null) {
                        ps.setInt(1, Book);
                        rs = ps.executeQuery();
                        if (rs.next()) {
                            img = rs.getString("Book_ImgUrl");
                            titel = rs.getString("Book_Title");
                            Author = rs.getString("Book_Author");
                            Language = rs.getString("Book_Language");
                            Category = rs.getString("Book_Category");
                            price = rs.getDouble("Book_Price");
                            TotalPrice = TotalPrice + price;
                            Discount = TotalPrice % 5;
                            Total = TotalPrice - Discount;
                            index = cart.indexOf(Book);

                            out.println("                <div class=\"row gy-3 mb-4\">\n"
                                    + "                  <div class=\"col-lg-5\">\n"
                                    + "                    <div class=\"me-lg-5\">\n"
                                    + "                      <div class=\"d-flex\">\n"
                                    + "                        <img\n"
                                    + "                          src=\"" + img + "\"\n"
                                    + "                          class=\"border rounded me-3\"\n"
                                    + "                          style=\"width: 96px; height: 96px\"\n"
                                    + "                        />\n"
                                    + "                        <div class=\"\">\n"
                                    + "                          <a href=\"#\" class=\"nav-link\"\n"
                                    + "                            >" + titel + "</a\n"
                                    + "                          >\n"
                                    + "                          <p class=\"text-muted\">" + Category + "," + Language + "</p>\n"
                                    + "                        </div>\n"
                                    + "                      </div>\n"
                                    + "                    </div>\n"
                                    + "                  </div>\n"
                                    + "                  <div\n"
                                    + "                    class=\"col-lg-2 col-sm-6 col-6 d-flex flex-row flex-lg-column flex-xl-row text-nowrap\"\n"
                                    + "                  >\n"
                                    + "                    \n"
                                    + "                    <div class=\"\">\n"
                                    + "                      <text class=\"h6\">₹" + price + "</text> <br />\n"
                                    + "                      <small class=\"text-muted text-nowrap\">\n"
                                    + "                        ₹" + price + "\n"
                                    + "                      </small>\n"
                                    + "                    </div>\n"
                                    + "                  </div>\n"
                                    + "                  <div\n"
                                    + "                    class=\"col-lg col-sm-6 d-flex justify-content-sm-center justify-content-md-start justify-content-lg-center justify-content-xl-end mb-2\"\n"
                                    + "                  >\n"
                                    + "                    <div class=\"float-md-end\">\n"
                                    + "                      <a\n"
                                    + "                        href=\"#!\"\n"
                                    + "                        class=\"btn btn-light border px-2 icon-hover-primary\"\n"
                                    + "                        ><i class=\"fas fa-heart fa-lg px-1 text-secondary\"></i\n"
                                    + "                      ></a>\n"
                                    + "                      <a\n"
                                    + "                        href=\"removecart?index=" + index + "\" "
                                    + "                        class=\"btn btn-light border text-danger icon-hover-danger\"\n"
                                    + "                      >\n"
                                    + "                        Remove</a\n"
                                    + "                      >\n"
                                    + "                    </div>\n"
                                    + "                  </div>\n"
                                    + "                </div>\n");
                        }
                    }
                    price = 0;
                }
            } else {
                out.println("<h1>Cart is Empty<h1>");
            }
            out.println("              </div>\n"
                    + "            </div>\n"
                    + "          </div>\n"
                    + "          <!-- cart -->\n"
                    + "          <!-- summary -->\n"
                    + "          <div class=\"col-lg-3\">\n"
                    + "            <div class=\"card mb-3 border shadow-0\">\n"
                    + "              <div class=\"card-body\">\n"
                    + "                <form>\n"
                    + "                  <div class=\"form-group\">\n"
                    + "                    <label class=\"form-label\">Have coupon?</label>\n"
                    + "                    <div class=\"input-group\">\n"
                    + "                      <input\n"
                    + "                        type=\"text\"\n"
                    + "                        class=\"form-control border\"\n"
                    + "                        name=\"\"\n"
                    + "                        placeholder=\"Coupon code\"\n"
                    + "                      />\n"
                    + "                      <button class=\"btn btn-light border\">Apply</button>\n"
                    + "                    </div>\n"
                    + "                  </div>\n"
                    + "                </form>\n"
                    + "              </div>\n"
                    + "            </div>\n"
                    + "            <div class=\"card shadow-0 border\">\n"
                    + "              <div class=\"card-body\">\n"
                    + "                <div class=\"d-flex justify-content-between\">\n"
                    + "                  <p class=\"mb-2\">Total price:</p>\n"
                    + "                  <p class=\"mb-2\">" + TotalPrice + "</p>\n"
                    + "                </div>\n"
                    + "                <div class=\"d-flex justify-content-between\">\n"
                    + "                  <p class=\"mb-2\">Discount:</p>\n"
                    + "                  <p class=\"mb-2 text-success\">" + Discount + "</p>\n"
                    + "                </div>\n"
                    + "                <div class=\"d-flex justify-content-between\">\n"
                    + "                  <p class=\"mb-2\">TAX:</p>\n"
                    + "                  <p class=\"mb-2\">.00</p>\n"
                    + "                </div>\n"
                    + "                <hr />\n"
                    + "                <div class=\"d-flex justify-content-between\">\n"
                    + "                  <p class=\"mb-2\">Total price:</p>\n"
                    + "                  <p class=\"mb-2 fw-bold\">" + Total + "</p>\n"
                    + "                </div>\n"
                    + "\n"
                    + "                <div class=\"mt-3\">\n"
                    + "                  <a href=\"Pyment?TotalPy=" + Total + "\" class=\"btn btn-success w-100 shadow-0 mb-2\">\n"
                    + "                    Make Purchase\n"
                    + "                  </a>\n"
                    + "                  <a href=\"#\" class=\"btn btn-light w-100 border mt-2\">\n"
                    + "                    Back to shop\n"
                    + "                  </a>\n"
                    + "                </div>\n"
                    + "              </div>\n"
                    + "            </div>\n"
                    + "          </div>\n"
                    + "        </div>\n"
                    + "      </div>\n"
                    + "    </section>\n"
                    + "    <section>\n"
                    + "      <div class=\"container my-2\">\n"
                    + "        <header class=\"mb-4\">\n"
                    + "          <h3>Recommended items</h3>\n"
                    + "        </header>\n"
                    + "        <section id=\"products1\" class=\"section-p1\">\n"
                    + "          <div style=\"display: flex;\" class=\"pro-container\">\n");
            TotalPrice = 0;
            Discount = 0;
            Total = 0;
            for (int i = 1; i < 5; i++) {
                if (ps != null) {
                    ps.setInt(1, i);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        img = rs.getString("Book_ImgUrl");
                        titel = rs.getString("Book_Title");
                        price = rs.getDouble("Book_Price");
                        out.println("<div class=\"pro\">\n"
                                + "              <img src=\"" + img + "\" alt=\"\" />\n"
                                + "              <div class=\"des\">\n"
                                + "                <span>Best Book</span>\n"
                                + "                <h5>" + titel + "</h5>\n"
                                + "                <div class=\"star\">\n"
                                + "                  <i class=\"fas fa-star\"></i>\n"
                                + "                  <i class=\"fas fa-star\"></i>\n"
                                + "                  <i class=\"fas fa-star\"></i>\n"
                                + "                  <i class=\"fas fa-star\"></i>\n"
                                + "                  <i class=\"fas fa-star\"></i>\n"
                                + "                </div>\n"
                                + "                <h4>₹" + price + "</h4>\n"
                                + "              </div>\n"
                                + "              <a href=\"Book_Diteils?BookId=" + i + "\"><i class=\"fal fa-shopping-cart cart\"></i></a>\n"
                                + "            </div>\n");
                    }
                }
            }
            ps.close();
            rs.close();
            out.println("          </div>\n"
                    + "        </section>\n"
                    + "    </section>");
            RequestDispatcher footerDispatcher = request.getRequestDispatcher("/footer.jsp");
            footerDispatcher.include(request, response);
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(CartServlet.class.getName()).log(Level.SEVERE, null, ex);
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
