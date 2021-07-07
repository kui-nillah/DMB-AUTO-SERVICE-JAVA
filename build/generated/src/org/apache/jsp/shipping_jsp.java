package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class shipping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
     
          if(conn != null){
         out.println("sucessfully connected");
         
                    String fname,loc,check_box,mail,d_age,tel,vehc,message;
    fname = request.getParameter("fname");
    loc = request.getParameter("loc");
    check_box = request.getParameter("check_box");
    mail = request.getParameter("mail");
    d_age = request.getParameter("d_age");
    tel = request.getParameter("tel");
    vehc = request.getParameter("vehc");
    message = request.getParameter("message");

    
        if(fname != null || loc != null || check_box != null || mail != null || d_age != null || tel != null || vehc != null || message != null){
        
        if(fname.equals("") || loc.equals("") || check_box.equals("") || mail.equals("") || d_age.equals("") || tel.equals("") || vehc.equals("") || message.equals("")){
            out.println("Please fill all fields");
        }
        else{
            String sql = "INSERT INTO shipping(fname,loc,check_box,mail,d_age,tel,vehc,message) VALUES('"+fname+"','"+loc+"','"+check_box+"','"+mail+"','"+d_age+"','"+tel+"','"+vehc+"','"+message+"')";
            
//            out.println(sql);
            statement.execute(sql);
            response.sendRedirect("shipping.jsp");
        }
//        
        
    }
     }
 }catch(SQLException e){
     out.println(e);
     
 }






      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"doc/css/shipping.css\">\n");
      out.write("<head>\n");
      out.write("<title>Shipping</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"menu\">\n");
      out.write("       <div class=\"nav\">\n");
      out.write("       \t\t\t<div class=\"head\">\n");
      out.write("               <a href=\"index.php\" id=\"logo\">DMB AUTO<br>SERVICES</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"nav2\">\n");
      out.write("             <a href=\"index.jsp.#pop\">Popular</a>\n");
      out.write("             <a href=\"aquarium.php\">Aquiarim</a>\n");
      out.write("             <a href=\"dealers.php\">Dealers</a>\n");
      out.write("             <a href=\"Shipping.jsp\">Shipping</a>\n");
      out.write("             <a href=\"contact.php\">Contact Us</a>\n");
      out.write("     </div>\n");
      out.write("          <div class=\"social\">\n");
      out.write("     \t    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a><br>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a><br>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a><br>\n");
      out.write("     </div>\n");
      out.write("     </div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"header1\" style=\" background-image: url(doc/img/shipping/1.JPG);\">\n");
      out.write("        <div id=\"heading\"><center><h1><big>Shipping</big></h1></center></div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"disc\">\n");
      out.write("    <div class=\"disc1\">\n");
      out.write("    <p id=\"two\"><b>The Complete Solution for Your Fleet Relocation\n");
      out.write("</b></p>\n");
      out.write("<p id=\"one\">\n");
      out.write("Our network of certified transport experts have the experience and resources required to provide a full-service solution for\n");
      out.write("your fleet shipping needs. We understand the importance of keeping your fleet on the road, and to ensure that we provide\n");
      out.write("you with the highest level of service.\n");
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form\">\n");
      out.write("    <form  method=\"POST\" autocomplete=\"off\">\n");
      out.write("    <table cellpadding=\"10\" cellspacing=\"10\" align=\"center\" width=\"70%%\" border=\"0\">\n");
      out.write("    <tr>\n");
      out.write("    <td colspan=\"3\"><center><p id=\"three\"><big>Shipping form</big></p></center></td>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"text\" name=\"fname\" placeholder=\"Full Name\" required>\n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("    <div class=\"custom-select\" style=\"width:200px;\">\n");
      out.write("  <select name=\"loc\">\n");
      out.write("    <option value=\"0\">Pick up location</option>\n");
      out.write("              <option value=\"Kenya\">Kenya</option>\n");
      out.write("              <option value=\"Uganda\">Uganda</option>\n");
      out.write("              <option value=\"Tanzania\">Tanzania</option>\n");
      out.write("              <option value=\"South africa\">South africa</option>\n");
      out.write("              <option value=\"Zimbabwe\">Zimbabwe</option>\n");
      out.write("              <option value=\"Malawi\">Malawi</option>\n");
      out.write("              <option value=\"England\">England</option>\n");
      out.write("              <option value=\"Germany\">Germany</option>\n");
      out.write("              <option value=\"China\">China</option>\n");
      out.write("              <option value=\"Netherland\">Netherland</option>\n");
      out.write("              <option value=\"Dubai\">Dubai</option>\n");
      out.write("              <option value=\"Japan\">Japan</option>\n");
      out.write("  </select>\n");
      out.write("</div>\n");
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"checkbox\" name=\"check_box\" value=\"Drop off at a different location\">Drop off at a different location\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"email\" name=\"mail\" placeholder=\"Email address\" required>\n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"text\" name=\"d_age\" placeholder=\"Drivers age\" required>\n");
      out.write("    </td>\n");
      out.write("    <td></td>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("    <td>\n");
      out.write("    <input type=\"text\" name=\"tel\" placeholder=\"Phone\" required>\n");
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("     <input type=\"text\" name=\"vehc\" placeholder=\"Vehical\" required>\n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("    <td colspan=\"3\">\n");
      out.write("    <textarea name=\"message\" placeholder=\"Any message about the car your fleet\" required cols=\"90\" rows=\"5\" maxlength=\"300\"></textarea>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("    <td colspan=\"3\">\n");
      out.write("    <center><button type=\"submit\" class=\"signupbtn\" name=\"send\">SEND</button></center>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"fleet\">\n");
      out.write("    <div id=\"fleet\">\n");
      out.write("    <center><h3><big><b>FLEET MANAGEMENT</b></big></h3></center>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"manage\">\n");
      out.write("    <center><h4><big><b><a href=\"#\">Trucks</a> |<a href=\"#\"> Mini vans </a>|<a href=\"#\"> Buses </a>|<a href=\"#\"> SUVs</a>\n");
      out.write("</b></big></h4></center>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <script src=\"doc/js/shipping.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
