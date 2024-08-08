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

/**
 *
 * @author Admin
 */
public class Registion extends HttpServlet {

    PreparedStatement ps = null;
    PreparedStatement ps2 = null;
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
            String ufnm = request.getParameter("firstname");
            String ulnm = request.getParameter("lastname");
            String upwd = request.getParameter("password");
            String umail = request.getParameter("email");
            int rs1;
            databas = new DataConection();
            if (databas != null) {
                ps = databas.PsStatment("select * from user_info where email=?");
                if (ps != null) {
                    ps.setString(1, umail);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        ps.close();
                        rs.close();
                        out.println("<script>");
                        out.println("alert('user Email already exixst')");
                        out.println("window.location='Login.jsp'");
                        out.println("</script>");
//                        response.sendRedirect("Login.jsp");
                    } else {
                        ps2 = databas.PsStatment("INSERT INTO user_info (`first_name`, `last_name`, `email`, `pass`) VALUES (?,?,?,?)");
                        ps2.setString(1, ufnm);
                        ps2.setString(2, ulnm);
                        ps2.setString(3, umail);
                        ps2.setString(4, upwd);
                        rs1 = ps2.executeUpdate();
                        if (rs1 > 0) {
                            ps2.close();
                            rs.close();
                            request.setAttribute("insertst", "correct");
                            request.getRequestDispatcher("Login.jsp").forward(request, response);
                        } else {
                            ps2.close();
                            rs.close();
                            out.println("<script>");
                            out.println("alert('Sorry Somthing Worng')");
                            out.println("</script>");
                            response.sendRedirect("Sign.jsp");
                        }
                    }
                }
            } else {
                out.println("<script>");
                out.println("alert('Sorry Somthing Worng')");
                out.println("</script>");
                response.sendRedirect("Sign.jsp");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registion.class.getName()).log(Level.SEVERE, null, ex);
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
