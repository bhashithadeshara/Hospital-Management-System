package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doctor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/style2.css\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("        \n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<div class=\"container\" id=\"container\">\n");
      out.write("\t\n");
      out.write("\t<div class=\"form-container sign-in-container\">\n");
      out.write("\t\t<form action=\"DoctorLogin\" method=\"POST\">\n");
      out.write("\t\t\t<h1>Sign in</h1>\n");
      out.write("\t\t\t<div class=\"social-container\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"social\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"social\"><i class=\"fab fa-google-plus-g\"></i></a>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"social\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<span>or use your account</span>\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"Username\" name = \"username\"/>\n");
      out.write("\t\t\t<input type=\"password\" placeholder=\"Password\" name = \"password\"/>\n");
      out.write("\t\t\t<a href=\"#\">Forgot your password?</a>\n");
      out.write("\t\t\t<button>Sign In</button><br/>\n");
      out.write("                        <button class=\"button\"><a class =\"none\" href=\"index.html\">Home</a></button>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"overlay-container\">\n");
      out.write("\t\t<div class=\"overlay\">\n");
      out.write("\t\t\t<div class=\"overlay-panel overlay-left\">\n");
      out.write("\t\t\t\t<h1>Welcome Back!</h1>\n");
      out.write("\t\t\t\t<p>To keep connected with us please login with your personal info</p>\n");
      out.write("\t\t\t\t<button class=\"ghost\" id=\"signIn\">Sign In</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"overlay-panel overlay-right\">\n");
      out.write("\t\t\t\t<h1>Welcome Doctor</h1>\n");
      out.write("\t\t\t\t<p>Enter your Username and Password</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("\t\n");
      out.write("</footer>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
