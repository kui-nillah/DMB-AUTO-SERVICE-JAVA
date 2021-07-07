package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

String url,user,password;

url = "jdbc:mysql://localhost/dmb_auto_services";

user ="root";

password = "";
 try {
        
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection(url,user,password);
      Statement statement = conn.createStatement();
     if(conn != null){
         out.println("sucessfully connected");
     }
                         String fname,lname,addr,tel,mail,pass;
    fname = request.getParameter("fname");
    lname = request.getParameter("lname");
    addr = request.getParameter("addr");    
    tel = request.getParameter("tel");
    mail = request.getParameter("mail");
    pass = request.getParameter("pass");


    
        if(fname != null || lname != null || addr != null || tel != null || mail != null || pass != null){
        
        if(fname.equals("") || lname.equals("") || addr.equals("") || tel.equals("") || mail.equals("") || pass.equals("")){
            out.println("Please fill all fields");
        }
        else{
            String sql = "INSERT INTO register(fname,lname,addr,tel,mail,pass) VALUES('"+fname+"','"+lname+"','"+addr+"','"+tel+"','"+mail+"','"+pass+"')";
            
//            out.println(sql);
            statement.execute(sql);
            response.sendRedirect("admin1.jsp");
        }
//        
        
    }
     
     
     
 }catch(SQLException e){
     out.println(e);
     
 }






      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Admin Register - DMB AUTO SERVICES</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"doc/css/register.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("    <div class=\"nav\">\n");
      out.write("\t<div class=\"head\">\n");
      out.write("      <a href=\"dashboard.php\" id=\"logo\">DMB AUTO<br>SERVICES</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"nav2\">\n");
      out.write("             <a href=\"enquiry.jsp\">Submitted Enquiries</a>\n");
      out.write("             <a href=\"order.jsp\">Submitted Orders</a>\n");
      out.write("             <a href=\"register.jsp\">Register Admin</a>\n");
      out.write("     </div>\n");
      out.write("          <div class=\"social\">\n");
      out.write("     \t    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a><br>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a><br>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a><br>\n");
      out.write("     </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <span class=\"medium\">\n");
      out.write("    <center><h1 id=\"two\"><big>Admin Registration</big></h1></center>\n");
      out.write("    </span>\n");
      out.write("    <div class=\"log\">\n");
      out.write("   <center><form method=\"POST\" autocomplete=\"off\">\n");
      out.write("   <br>\n");
      out.write("   <br>\n");
      out.write("    <label>First name</label><br>\n");
      out.write("    <input type=\"text\" name=\"fname\" placeholder=\"First name\" required>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <label>Last name</label><br>\n");
      out.write("    <input type=\"text\" name=\"lname\" placeholder=\"Last name\" required>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <label>Address</label><br>\n");
      out.write("    <input type=\"text\" name=\"addr\" placeholder=\"Street, Region, Country\" required>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <label>Phone number</label><br>\n");
      out.write("    <input type=\"text\" name=\"tel\" placeholder=\"+255....\" required>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <label>Email address</label><br>\n");
      out.write("    <input type=\"email\" name=\"mail\" placeholder=\"Email address\" required>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <label>Password</label><br>\n");
      out.write("    <input type=\"password\" name=\"pass\" required>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <input type=\"submit\" name=\"send\" value=\"REGISTER\">\n");
      out.write("    <input type=\"reset\" name=\"reset\" value=\"RESET\">\n");
      out.write("    </form></center>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("      <center>\n");
      out.write("              <p>\n");
      out.write("  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved |\n");
      out.write("                  This website is made by <a href=\"https://t.me/black_titan\" target=\"_blank\">Black Titan</a></p>\n");
      out.write("      </center>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <script src=\"\" async defer></script>\n");
      out.write("    </body>\n");
      out.write("    </html>");
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
