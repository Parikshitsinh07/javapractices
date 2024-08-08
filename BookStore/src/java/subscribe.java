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
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class subscribe extends HttpServlet {
     
     DataConection database = null;
     PreparedStatement ps = null;
     PreparedStatement ps2 = null;
     ResultSet rs = null;
     int user_id = 0;
     
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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            
            HttpSession session = request.getSession(false);
            
             if(session.getAttribute("User_id") == null){
              response.sendRedirect("Login.jsp");
            }else{
                String user = session.getAttribute("User_id").toString();
                if(user != null){
                user_id = Integer.parseInt(user);
                }
               database = new DataConection();
               
               ps = database.PsStatment("select * from subuser");
               
               rs = ps.executeQuery();
               while(rs.next()){
                   if(email.equals(rs.getString("email"))){
                       out.print("<script> alert('you have alrady subscribe');"
                               + "window.location='Home';</script>");
//                       response.sendRedirect("Home");
                       break;
                   }
               }
               ps2 = database.PsStatment("INSERT INTO `subuser`( `user_id`, `email`) VALUES (?,?)");
               ps2.setInt(1, user_id);
               ps2.setString(2, email);
               ps2.executeUpdate();
               String page = session.getAttribute("Page").toString();
               out.print("<script> alert('Subscribe Succsesfully');"
                       + "window.location="+page+";</script>");
               
               
            }
            
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
         try {
             processRequest(request, response);
         } catch (SQLException ex) {
             Logger.getLogger(subscribe.class.getName()).log(Level.SEVERE, null, ex);
         }
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
         try {
             processRequest(request, response);
         } catch (SQLException ex) {
             Logger.getLogger(subscribe.class.getName()).log(Level.SEVERE, null, ex);
         }
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
