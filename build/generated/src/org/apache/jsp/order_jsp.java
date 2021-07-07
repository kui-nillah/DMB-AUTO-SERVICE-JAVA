package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        out.println("<table border 1>"
                + "<tr>"
                + "<th>S/No</th>"
                + "<th>Full name</th>"
                + "<th>Location</th>"
                + "<th>Email</th>"
                + "<th>Driver's age</th>"
                + "<th>Phone number</th>"
                + "<th>Vehicle</th>"
                + "<th>Message</th>"
                + "<th>Check box</th>"
                 + "<th col='2'>Action</th>"
                + "</tr>");
        
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection(url,user,password);
            String sel= "SELECT * FROM shipping";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sel);

            while(result.next()){
                int id = result.getInt("id");
                String fname = result.getString("fname");
                String loc = result.getString("loc");
                String mail = result.getString("mail");
                String d_age = result.getString("d_age");
                String tel = result.getString("tel");
                String vehc = result.getString("vehc");
                String message = result.getString("message");
                String check_box = result.getString("check_box");
                
                
              
                
                out.println("<tr>"
                            +"<td>"+id+"</td>"
                            + "<td>"+fname+"</td>"
                            + "<td>"+loc+"</td>"
                            + "<td>"+mail+"</td>"
                            + "<td>"+d_age+"</td>"
                            + "<td>"+tel+"</td>"
                            + "<td>"+vehc+"</td>"
                            + "<td>"+message+"</td>"
                            + "<td>"+check_box+"</td>");
                            out.println("</tr>");
                
                       
                         
              
            }
            out.println("</table>");
 }catch(SQLException e){
     out.println(e);
     
 }






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
