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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class UserLogin extends HttpServlet {

    Statement st = null;
    ResultSet rs = null;
//     PreparedStatement ps = null;
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
                st = databas.StStatment();
            }
            if (st != null) {
                HttpSession sesstion = request.getSession();
                String umail = request.getParameter("User");
                String upwd = request.getParameter("Password");
                String page;
                rs = st.executeQuery("SELECT `user_id`,`first_name`,`email`,`pass` FROM `user_info` WHERE email = '" + umail + "'");
                if (rs.next()) {
                    rs = st.executeQuery("SELECT `user_id`,`first_name`,`email`,`pass` FROM `user_info` WHERE pass = '" + upwd + "'");
                    if (!(rs.next())) {
                        st.close();
                        rs.close();
                        out.println("<script>");
                        out.println("alert('Password is Worng !')");
                        out.println("window.location='Login.jsp'");
                        out.println("</script>");
                    } else {
                        sesstion.setAttribute("User_id", rs.getString("user_id"));
                        sesstion.setAttribute("UserName", rs.getString("first_name"));
                        sesstion.setAttribute("UserEmail", rs.getString("email"));
                        page = (String) request.getSession().getAttribute("Page");
                        System.out.println(page);
                        if (page != null) {
                            st.close();
                            rs.close();
                            out.println("<script>");
                            out.println("alert('Login successfully !')");
                            out.println("window.location='" + page + "'");
                            out.println("</script>");
                        } else {
                            st.close();
                            rs.close();
                            out.println("<script>");
                            out.println("alert('Login successfully  !')");
                            out.println("window.location='index.jsp'");
                            out.println("</script>");
                        }
                    }
                } else {

                    st.close();
                    rs.close();
                    out.println("<script>");
                    out.println("alert('Please Register Your Self !')");
                    out.println("window.location='Sign.jsp'");
                    out.println("</script>");
                }
            } else {
                out.println("sorry");
            }

        } catch (Exception e) {
            e.printStackTrace();
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
