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
import javax.servlet.http.HttpSession;
//import com.razorpay.*; 
/**
 *
 * @author Admin
 */
public class Pyment extends HttpServlet {

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
             String BookId = request.getParameter("TotalPy");
             HttpSession session = request.getSession(false);
            if (session.getAttribute("User_id") == null) {
                response.sendRedirect("Login.jsp");
            }
            session.removeAttribute("cart");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Pyment</title>");
            out.println("<style>\n"
                    + "     .payment-form {\n"
                    + "	max-width: 400px;\n"
                    + "	margin: 0 auto;\n"
                    + "	padding: 20px;\n"
                    + "	background-color: #f5f5f5;\n"
                    + "	border: 1px solid #ddd;\n"
                    + "	border-radius: 5px;\n"
                    + "}\n"
                    + "\n"
                    + "h2 {\n"
                    + "	text-align: center;\n"
                    + "}\n"
                    + "\n"
                    + "form {\n"
                    + "	display: flex;\n"
                    + "	flex-direction: column;\n"
                    + "}\n"
                    + "\n"
                    + "label {\n"
                    + "	margin-top: 10px;\n"
                    + "	font-weight: bold;\n"
                    + "}\n"
                    + "\n"
                    + "input[type=\"text\"] {\n"
                    + "	padding: 10px;\n"
                    + "	border-radius: 5px;\n"
                    + "	border: 1px solid #ccc;\n"
                    + "	margin-bottom: 20px;\n"
                    + "}\n"
                    + "\n"
                    + "button[type=\"submit\"] {\n"
                    + "	background-color: #4CAF50;\n"
                    + "	color: white;\n"
                    + "	padding: 10px;\n"
                    + "	border-radius: 5px;\n"
                    + "	border: none;\n"
                    + "	cursor: pointer;\n"
                    + "	margin-top: 20px;\n"
                    + "}\n"
                    + "\n"
                    + "button[type=\"submit\"]:hover {\n"
                    + "	background-color: #3e8e41;\n"
                    + "}\n"
                    + "</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"payment-form\">\n"
                    + "		<h2>Payment Method</h2>\n"
                    + "		<form action=\"Payment\" method=\"post\">\n"
                    + "			<label for=\"name\">Name</label>\n"
                    + "			<input type=\"text\" id=\"name\" name=\"name\" placeholder=\"John Smith\" required>\n"
                    + "\n"
                    + "			<label for=\"card-number\"> Number</label>\n"
                    + "			<input type=\"text\" id=\"card-number\" name=\"card-number\" placeholder=\"1234 5678 9012 3456\" required>\n"
                    + "\n"
                    + "			<label for=\"amount\">Amount</label>\n"
                    + "			<input type=\"text\" id=\"amount\" name=\"amount\" placeholder=\"$10.00\" required>\n"
                    + "\n"
                    + "			<button type=\"submit\">Pay Now</button>\n"
                    + "		</form>\n"
                    + "	</div>");
            out.println("</body>");
            out.println("</html>");
 
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
