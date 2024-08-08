/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class DataConection {
     Connection con = null;
     Statement st = null;
     ResultSet rs = null;
     PreparedStatement ps = null;
     DataConection(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-bookstore","root","");   
        }  catch (SQLException ex) {
             Logger.getLogger(DataConection.class.getName()).log(Level.SEVERE, null, ex);
         }catch (ClassNotFoundException ex) {
             Logger.getLogger(DataConection.class.getName()).log(Level.SEVERE, null, ex);
         } catch(NullPointerException ne){
            Logger.getLogger(DataConection.class.getName()).log(Level.SEVERE, null, ne);
        }
        catch(Exception e){
            Logger.getLogger(DataConection.class.getName()).log(Level.SEVERE, null, e);
        }
     }
    public PreparedStatement PsStatment(String url){
        try{
            ps = con.prepareStatement(url);
        } catch (SQLException ex) {
             Logger.getLogger(DataConection.class.getName()).log(Level.SEVERE, null, ex);
         }
         return ps;
    }
    public Statement StStatment(){
        try{
             if(con != null){
                st= con.createStatement(); 
             }
             
        } catch (SQLException ex) {
             Logger.getLogger(DataConection.class.getName()).log(Level.SEVERE, null, ex);
         }
         return st;
    }
    
  
}
