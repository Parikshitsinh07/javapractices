/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-03-22 04:30:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style >\n");
      out.write("            body{\n");
      out.write("                font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("\n");
      out.write("                width:100%;\n");
      out.write("                margin-top:10px;\n");
      out.write("                margin-bottom:5px;\n");
      out.write("                font-style: bold;\n");
      out.write("                color: #555;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("\n");
      out.write("                width:100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                border:1px solid #ddd;\n");
      out.write("                border-radius:5px;\n");
      out.write("            }\n");
      out.write("            #btn1{\n");
      out.write("                width:100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                border:1px solid #ddd;\n");
      out.write("                border-radius:5px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .main{\n");
      out.write("                border:1px solid #ddd;\n");
      out.write("                border-radius:5px;\n");
      out.write("                width:500px;\n");
      out.write("                margin-bottom:50px;\n");
      out.write("                margin-right: 50px;\n");
      out.write("                margin-left: 350px;\n");
      out.write("                margin-top:120px;\n");
      out.write("                background-color:white;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            button\n");
      out.write("            {\n");
      out.write("                border-radius: 10px;\n");
      out.write("                margin-top: 15px;\n");
      out.write("                width:100%;\n");
      out.write("                padding:10px;\n");
      out.write("                background-color:#1d415e;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table,td {\n");
      out.write("                /*border-collapse: collapse;*/\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            .red{\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#1d415e\">\n");
      out.write("        <div class=\"main\" >\n");
      out.write("            <h1 align=\"center\"> Update Information </h1>\n");
      out.write("            <form action=\"UpdateData\"  onsubmit=\"return vaild()\">\n");
      out.write("                <table align=\"center\">\n");
      out.write("                     <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"std_id\">Student ID:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"number\" id=\"std_id\" name=\"std_id\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"first_name\">First Name:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" id=\"first_name\" name=\"first_name\" onblur=\"Fname()\"><br>\n");
      out.write("                            <span id =\"error1\" class=\"red\"></span>\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"last_name\">Last Name:</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" id=\"last_name\" name=\"last_name\" onblur=\"Lname()\"><br>\n");
      out.write("                            <span id =\"error2\" class=\"red\"></span>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"email\">Email:</label>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"email\" id=\"email\" name=\"email\" onblur=\"EmailValid()\"><br>\n");
      out.write("                            <span id =\"error3\" class=\"red\"></span>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label for=\"date_of_birth\">Date of Birth <br> (YYYY-MM-DD):</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" id=\"date_of_birth\" name=\"date_of_birth\" onblur=\"Bodvaild()\"><br>\n");
      out.write("                            <span id =\"error4\" class=\"red\"></span>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>course</label></td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"course\" id=\"res\" required>\n");
      out.write("\n");
      out.write("                                <option value=\"\">Selcect Option</option>\n");
      out.write("                                <option value=\"P.G.D.C.A\">P.G.D.C.A</option>\n");
      out.write("                                <option value=\"M.C.A\">M.C.A</option>\n");
      out.write("                                <option value=\"B.C.A\">B.C.A</option>\n");
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <span id=\"error5\" class=\"red\"></span>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td> <td colspan=\"2\"><input type=\"submit\" value=\"Update\" name=\"submit\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>  \n");
      out.write("        <script>\n");
      out.write("//            var sid=/^[0-9]+$/;\n");
      out.write("            var snm = /^[a-zA-Z]+$/;\n");
      out.write("            var emailRegex = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;\n");
      out.write("            function Fname() {\n");
      out.write("                var first_name = document.getElementById(\"first_name\").value;\n");
      out.write("//                 alert(first_name);\n");
      out.write("                if (!snm.test(document.getElementById(\"first_name\").value)) {\n");
      out.write("                    document.getElementById(\"error1\").innerHTML = \"Enter a valid Name\";\n");
      out.write("                    document.getElementById(\"first_name\").value = \"\"\n");
      out.write("                    return false;\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"error1\").value = \"\"\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function Lname() {\n");
      out.write("                var last_name = document.getElementById(\"last_name\").value;\n");
      out.write("//                 alert(last_name);\n");
      out.write("                if (!snm.test(document.getElementById(\"last_name\").value)) {\n");
      out.write("                    document.getElementById(\"error2\").innerHTML = \"Enter a valid Name\";\n");
      out.write("                    document.getElementById(\"last_name\").value = \"\"\n");
      out.write("                    return false;\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"error2\").value = \"\"\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("//             \n");
      out.write("            function EmailValid() {\n");
      out.write("                var email = document.getElementById(\"email\").value;\n");
      out.write("                if (!(emailRegex.test(email))) {\n");
      out.write("                    document.getElementById(\"error3\").innerHTML = \"Please Enter Valid Email\";\n");
      out.write("                    document.getElementById(\"email\").value = \"\";\n");
      out.write("                    return false;\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"error3\").innerHTML = \"\";\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function Bodvaild() {\n");
      out.write("//                 alert(\"Hello\");\n");
      out.write("                var dobRegex = /^\\d{4}-\\d{2}-\\d{2}$/;\n");
      out.write("                if (!dobRegex.test(document.getElementById(\"date_of_birth\").value)) {\n");
      out.write("                    document.getElementById(\"error4\").innerHTML = \"Please Enter Valid date of birth \";\n");
      out.write("                    document.getElementById(\"date_of_birth\").value = \"\";\n");
      out.write("                    return false;\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"error4\").innerHTML = \"\";\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function vaild()\n");
      out.write("            {\n");
      out.write("//               alert(\"Hello\");\n");
      out.write("                if (Fname() && Lname() && EmailValid() && Bodvaild()) {\n");
      out.write("                    return true;\n");
      out.write("                } else {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
