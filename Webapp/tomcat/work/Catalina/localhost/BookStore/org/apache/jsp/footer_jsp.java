/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-07-14 11:08:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

    String[] url = null;
    String refererHeader = request.getHeader("referer");
    if (refererHeader != null) {
        url = refererHeader.split("/");
        int len = url.length;
        String sub = url[len - 1];
        session.setAttribute("Sub", sub);
    }

      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function Sub() {\n");
      out.write("        e = document.getElementById(\"email\").value;\n");
      out.write("        if (e != null && e != \"\") {\n");
      out.write("            document.getElementById(\"Subcrib\").setAttribute(\"href\", \"subscribe?email=\" + e);\n");
      out.write("        } else {\n");
      out.write("            alert(\"Enter Your email !\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<section id=\"newsletter\" class=\"section-p1 section-m1\">\n");
      out.write("    <div class=\"newstext\">\n");
      out.write("        <h4>Sing Up For New Books</h4>\n");
      out.write("        <p>\n");
      out.write("            Get E-mail updates about our latest Books\n");
      out.write("            <span> & special offers.</span>\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form\">\n");
      out.write("        <input type=\"text \"  name=\"email\" id= \"email\" placeholder=\"Your email address\" required/>\n");
      out.write("        <a href=\"\" id= \"Subcrib\" onclick=\"Sub()\"><button class=\"normal\">subscribe</button></a>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<footer class=\"section-p1\">\n");
      out.write("    <div class=\"col\">\n");
      out.write("        <img class=\"logo\" src=\"\" alt=\"\" />\n");
      out.write("        <h4>Contact</h4>\n");
      out.write("        <p>\n");
      out.write("            <strong>Address:</strong> 562Wellington Road,Street 32.San Francisco\n");
      out.write("        </p>\n");
      out.write("        <p><strong>Phone:</strong> +01 2222 365/(+91) 01 2345 6789</p>\n");
      out.write("        <p><strong>Hours:</strong> 10:00 - 18:00,Mon - Sat</p>\n");
      out.write("        <div class=\"follow\">\n");
      out.write("            <h4>Follow us</h4>\n");
      out.write("            <div class=\"icon\">\n");
      out.write("                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                <i class=\"fab fa-twitter\"></i>\n");
      out.write("                <i class=\"fab fa-instagram\"></i>\n");
      out.write("                <i class=\"fab fa-pinterest-p\"></i>\n");
      out.write("                <i class=\"fab fa-youtube\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col\">\n");
      out.write("        <h4>About</h4>\n");
      out.write("        <a href=\"index.jsp\">Home</a>\n");
      out.write("        <a href=\"Discounts.jsp\">Discounts%</a>\n");
      out.write("        <a href=\"NewBooks.jsp\">NewBooks</a>\n");
      out.write("        <a href=\"AllBook.jsp\">AllBook</a>\n");
      out.write("        <a href=\"Contact.jsp\">Contact Us</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col\">\n");
      out.write("        <h4>My Account</h4>\n");
      out.write("        <a href=\"Sign.jsp\" id=\"sin\">Sing In</a>\n");
      out.write("        <a href=\"cart.jsp\">View Cart</a>\n");
      out.write("        <a href=\"Request.jsp\">Request a Book</a>\n");
      out.write("        <a href=\"#\">Help</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col install\">\n");
      out.write("        <h4>install App</h4>\n");
      out.write("        <p>Form App Store or Google Play</p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <img src=\"img/app.jpg\" alt=\"\" />\n");
      out.write("            <img src=\"img/play.jpg\" alt=\"\" />\n");
      out.write("        </div>\n");
      out.write("        <p>Secured Payment Getways</p>\n");
      out.write("        <img src=\"img/pay.png\" />\n");
      out.write("    </div>\n");
      out.write("    <div class=\"copyright\">\n");
      out.write("        <p>@ 2024, Mahir & Parikshit tech - HTML CSS Online Book Store</p>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
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
