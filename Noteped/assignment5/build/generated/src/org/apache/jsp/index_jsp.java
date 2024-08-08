package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("           body{\n");
      out.write("                  font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("           label{\n");
      out.write("                  \n");
      out.write("                  width:100%;\n");
      out.write("                  margin-top:10px;\n");
      out.write("                  margin-bottom:5px;\n");
      out.write("                  font-style: bold;\n");
      out.write("                  color: #555;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                \n");
      out.write("                width:100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                border:1px solid #ddd;\n");
      out.write("                border-radius:5px;\n");
      out.write("             }\n");
      out.write("             .main{\n");
      out.write("                border:1px solid #ddd;\n");
      out.write("                border-radius:5px;\n");
      out.write("                width:500px;\n");
      out.write("                margin-bottom:50px;\n");
      out.write("                margin-right: 50px;\n");
      out.write("                margin-left: 350px;\n");
      out.write("                margin-top:120px;\n");
      out.write("                background-color:white;\n");
      out.write("                height: 420px;\n");
      out.write("             }\n");
      out.write("             button\n");
      out.write("            {\n");
      out.write("                 border-radius: 10px; \n");
      out.write("                 margin-top: 15px;\n");
      out.write("                 width:100%;\n");
      out.write("                 padding:10px;\n");
      out.write("                 background-color:#1d415e;\n");
      out.write("                 color:white;\n");
      out.write("             }\n");
      out.write("             \n");
      out.write("           table{\n");
      out.write("                margin-top:20%;\n");
      out.write("                margin-bottom:20%;\n");
      out.write("                width:300px;\n");
      out.write("              }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            var sid=/^[0-9]+$/;\n");
      out.write("            var snm=/^[a-zA-Z]+$/;\n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("                if(sid.test(document.getElementById(\"sid\").value)==false)\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter only numeric\");\n");
      out.write("                   \n");
      out.write("                    return false;\n");
      out.write("                } \n");
      out.write("                if(snm.test(document.getElementById(\"snm\").value)==false)\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter only alphabet in name \");\n");
      out.write("                    \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(snm.test(document.getElementById(\"sc\").value)==false)\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter only aalphabet in course \");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body style=\"background-color:#1d415e\">\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <form onsubmit=\"return validate()\" action=\"insert_data\" method=\"post\">\n");
      out.write("                <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><label>Student id</label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"sid\" id=\"sid\"  placeholder=\"Id\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><label>Student name</label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"snm\" id=\"snm\" placeholder=\"Name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td><label>course</label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"sc\" id=\"sc\"placeholder=\"Course\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\"><button type=\"submit\" name=\"insert\" value=\"insert\">insert</button></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
