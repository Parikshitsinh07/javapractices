/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-04-15 04:50:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;

public final class addBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.sql.DriverManager");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Book</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Calibri, sans-serif; \n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: stretch;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu-bar {\n");
      out.write("                background-color: #607d8b;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin-right: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu-bar a {\n");
      out.write("                display: block;\n");
      out.write("                color: #fff;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu-bar a:hover {\n");
      out.write("                background-color: #455a64;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .content {\n");
      out.write("                background-color: #fff;\n");
      out.write("                box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("                margin: auto;\n");
      out.write("                padding: 30px;\n");
      out.write("                max-width: 700px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                color: #607d8b;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            label {\n");
      out.write("                font-size: 18px;\n");
      out.write("                color: #607d8b;\n");
      out.write("                display: block;\n");
      out.write("                margin-top:5px;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input, textarea, select {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #607d8b;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:hover {\n");
      out.write("                background-color: #78909c;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function validateForm() {\n");
      out.write("                var catalogueId = document.getElementById(\"catalogueId\").value;\n");
      out.write("                var authorName = document.getElementById(\"authorName\").value.trim();\n");
      out.write("                var isbn = document.getElementById(\"isbn\").value.trim();\n");
      out.write("                var publisher = document.getElementById(\"publisher\").value.trim();\n");
      out.write("                var title = document.getElementById(\"bookTitle\").value.trim();\n");
      out.write("                var price = document.getElementById(\"price\").value.trim();\n");
      out.write("                var quantity = document.getElementById(\"quantity\").value.trim();\n");
      out.write("                var editionYear = document.getElementById(\"editionYear\").value.trim();\n");
      out.write("\n");
      out.write("                var alphabetRegex = /^[A-Za-z\\s]+$/;\n");
      out.write("                var alphanumericRegex = /^[0-9a-zA-Z]+$/;\n");
      out.write("                var priceRegex = /^\\d+(\\.\\d{1,2})?$/;\n");
      out.write("                var quantityRegex = /^[1-9]\\d*$/;\n");
      out.write("                var yearRegex = /^\\d{4}$/;\n");
      out.write("                var isbnRegex = /^\\d{13}$/; \n");
      out.write("\n");
      out.write("                if (catalogueId === \"\") {\n");
      out.write("                    alert(\"Please select a catalogue\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (title === \"\") {\n");
      out.write("                    alert(\"Title cannot be empty\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (!authorName.match(alphabetRegex)) {\n");
      out.write("                    alert(\"Author name must contain only alphabets\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (!price.match(priceRegex)) {\n");
      out.write("                    alert(\"Price must be a valid number\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (!quantity.match(quantityRegex)) {\n");
      out.write("                    alert(\"Quantity must be a positive integer\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (!isbn.match(isbnRegex)) {\n");
      out.write("                    alert(\"ISBN must be in valid format\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (!publisher.match(alphabetRegex)) {\n");
      out.write("                    alert(\"Publisher must contain only alphabets\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (!editionYear.match(yearRegex)) {\n");
      out.write("                    alert(\"Edition year must be a valid 4-digit year\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var currentYear = new Date().getFullYear();\n");
      out.write("                if (parseInt(editionYear) > currentYear) {\n");
      out.write("                    alert(\"Edition year cannot be in the future\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h1>Add Book</h1>\n");
      out.write("                <form action=\"insertBook.jsp\" method=\"post\" onsubmit=\"return validateForm()\" style=\"margin-top: 40px;\">\n");
      out.write("                    <label for=\"catalogueId\">Catalogue</label>\n");
      out.write("                    <select name=\"catalogueId\" id=\"catalogueId\">\n");
      out.write("                        <option value=\"\">Select Catalogue</option>\n");
      out.write("                        ");

                            try {
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parikshit_20", "root", "");
                                Statement stmt = conn.createStatement();
                                ResultSet rs = stmt.executeQuery("SELECT * FROM catalogue");

                                while (rs.next()) {
                                    String catalogueId = rs.getString("catalogueId");
                                    String title = rs.getString("title");
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <option value=\"");
      out.print( catalogueId);
      out.write('"');
      out.write('>');
      out.print( title);
      out.write("</option>\n");
      out.write("                        ");

                                }
                                rs.close();
                                stmt.close();
                                conn.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <label for=\"bookTitle\">Title</label>\n");
      out.write("                    <input type=\"text\" id=\"bookTitle\" name=\"bookTitle\"><br>\n");
      out.write("\n");
      out.write("                    <label for=\"authorName\">Author</label>\n");
      out.write("                    <input type=\"text\" id=\"authorName\" name=\"authorName\"><br>\n");
      out.write("\n");
      out.write("                    <label for=\"price\">Price</label>\n");
      out.write("                    <input type=\"text\" id=\"price\" name=\"price\"><br>\n");
      out.write("\n");
      out.write("                    <label for=\"quantity\">Quantity</label>\n");
      out.write("                    <input type=\"text\" id=\"quantity\" name=\"quantity\"><br>\n");
      out.write("\n");
      out.write("                    <label for=\"isbn\">ISBN</label>\n");
      out.write("                    <input type=\"text\" id=\"isbn\" name=\"isbn\"><br>\n");
      out.write("\n");
      out.write("                    <label for=\"publisher\">Publisher</label>\n");
      out.write("                    <input type=\"text\" id=\"publisher\" name=\"publisher\"><br>\n");
      out.write("\n");
      out.write("                    <label for=\"editionYear\">Edition Year</label>\n");
      out.write("                    <input type=\"text\" id=\"editionYear\" name=\"editionYear\" ><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <button type=\"submit\">Add Book</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
