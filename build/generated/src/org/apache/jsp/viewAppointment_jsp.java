package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewAppointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("   ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("      <!-- aos css file cdn link  -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.css\">\n");
      out.write("\n");
      out.write("    <!-- magnific popup css cdn link  -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css\">\n");
      out.write("\n");
      out.write("    <!-- bootstrap cdn link  -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.3/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <!-- font awesome cdn link  -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    \n");
      out.write("    <link rel =\"stylesheet\" href =\"css/tablecss.css\">\n");
      out.write("        \n");
      out.write("  \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("        \n");
      out.write("<header>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    <a href=\"#\" class=\"logo\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h3 style = \"color : #354046\">\n");
      out.write("            \n");
      out.write("            ");

            
            session.setMaxInactiveInterval(20);
            String username = (String) session.getAttribute("info");
                
            out.println("Welcome " + username);
            
            
      out.write("\n");
      out.write("            \n");
      out.write("        </h3>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("            <nav class=\"nav\" >\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"index.html#home\">home</a></li>\n");
      out.write("            <li><a href=\"index.html#about\">about</a></li>\n");
      out.write("            <li><a href=\"index.html#facility\">facility</a></li>\n");
      out.write("            <li><a href=\"index.html#review\">review</a></li>\n");
      out.write("            <li><a href=\"index.html#contact\">contact</a></li>\n");
      out.write("            <li><a href=\"index.html#doctor.jsp\">Management</a></li>\n");
      out.write("            <li><a href=\"index.html\">Sign Out</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"fas fa-bars\"></div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section style = \"padding-top : 100px;\">\n");
      out.write("  <!--for demo wrap-->\n");
      out.write("  \n");
      out.write("  <div class=\"tbl-header\">\n");
      out.write("      \n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("        <p>Appointments</p>\n");
      out.write("      <thead>\n");
      out.write("         \n");
      out.write("        <tr>\n");
      out.write("          <th>Full Name</th>\n");
      out.write("          <th>Phone Number</th>\n");
      out.write("          <th>Email</th>\n");
      out.write("          <th>Time</th>\n");
      out.write("          <th>Message</th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"tbl-content\">\n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("      <tbody>\n");
      out.write("        \n");
      out.write("         ");

             
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
        
        try{
        
             PreparedStatement ps = con.prepareStatement("SELECT * FROM appointment");
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){ 
           
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("            <td>");
      out.print( rs.getString("name") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("number") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("email") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("time") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("message") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

               
           }
        }catch(Exception ex){
            out.println("Error Occured..!! " + ex);
        }         
         
      out.write(" \n");
      out.write("        \n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
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
