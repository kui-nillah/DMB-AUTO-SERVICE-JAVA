package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

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
         
                    String fname,lname,tel,tsap,mail,country,comment;
    fname = request.getParameter("fname");
    lname = request.getParameter("lname");
    tel = request.getParameter("tel");
    tsap = request.getParameter("tsap");
    mail = request.getParameter("mail");
    country = request.getParameter("country");
    comment = request.getParameter("comment");

    
        if(fname != null || lname != null || tel != null || tsap != null || mail != null || country != null || comment != null){
        
        if(fname.equals("") || lname.equals("") || tel.equals("") || tsap.equals("") || mail.equals("") || country.equals("") || comment.equals("")){
            out.println("Please fill all fields");
        }
        else{
            String sql = "INSERT INTO enquiry(fname,lname,tel,tsap,mail,country,comment) VALUES('"+fname+"','"+lname+"','"+tel+"','"+tsap+"','"+mail+"','"+country+"','"+comment+"')";
            
//            out.println(sql);
            statement.execute(sql);
            response.sendRedirect("index.jsp");
        }
//        
        
    }
     }
     
 }catch(SQLException e){
     out.println(e);
     
 }






      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"doc/css/index.css\">\n");
      out.write("<head>\n");
      out.write("\t<title>Home</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- Navigation bar area -->\n");
      out.write("\n");
      out.write("\t<div class=\"menu\">\n");
      out.write("       <div class=\"nav\">\n");
      out.write("       \t\t\t<div class=\"head\">\n");
      out.write("               <a href=\"index.jsp\" id=\"logo\">DMB AUTO<br>SERVICES</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"nav2\">\n");
      out.write("            <a href=\"#pop\">Popular</a>\n");
      out.write("            <a href=\"aquarium.php\">Aquiarim</a>\n");
      out.write("            <a href=\"dealers.php\">Dealers</a>\n");
      out.write("            <a href=\"shipping.jsp\">Shipping</a>\n");
      out.write("            <a href=\"contact.php\">Contact Us</a>\n");
      out.write("     </div>\n");
      out.write("          <div class=\"social\">\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a><br>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a><br>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a><br>\n");
      out.write("     </div>\n");
      out.write("     </div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("  <!-- Header area -->\n");
      out.write("\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"header1\" style=\" background-image: url(doc/img/home/1.JPG);\">\n");
      out.write("            <div class=\"header2\">\n");
      out.write("\t\t\t<h5 id=\"h1\">Welcome!!</h5>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<h6 id=\"h2\">DMB SERVICES, the best car deallers in Tanzania.</h6>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("  <!-- Ask a question and enquire area -->\n");
      out.write("\n");
      out.write("\t<div class=\"askhead\">\n");
      out.write("\t\t<h3 class=\"askh\">ASK A QUESTION | ENQUIRE NOW</h3>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"ask\">\n");
      out.write("\t\t<p id=\"txt\">\n");
      out.write("\t\t\tDMB AUTO is a trading platform where used vehicles in Japan, UK, USA, and UAE are sold in Tanzana market.<br>\n");
      out.write("\t\t\tYou will find on the site not only vehicles offered by many well-known used car exporters, but also those by local car dealers in Japan, uk, usa <br>\n");
      out.write("\t\t\tand UAE. As such, you have a huge and diverse range to choose from, making your browsing experience more enjoyable.<br>\n");
      out.write("\t\t\tThe most remarkable feature of the site is that you can compare the total (CIF) price of all the vehicles that are listed.\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\tCross-comparing for this reason becomes extremely convenient, and finding that right car at your budget becomes very much hassle-free \n");
      out.write("\t\t\t<p id=\"txt2\"><b><big>TANZANIA</big></b></p>\n");
      out.write("\t\t\t<div class=\"link\">\n");
      out.write("\t\t\t\t<p id=\"ln\"><a href=\"#enq\">LET US HELP GET A CAR OF YOUR DREAM</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("  <!-- Gallery area -->\n");
      out.write("\n");
      out.write("\t<div class=\"gallery\">\n");
      out.write("\t\t<table width=\"100%\" align=\"center\" cellspacing=\"1px\" cellpadding=\"90\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td style=\"background-image: url(doc/img/home/2.JPG); background-size: cover; width: auto; height: 120px;\"></td>\n");
      out.write("\t\t\t\t<td style=\"background-image: url(doc/img/home/3.JPG); background-size: cover; width: auto; height: 120px;\"></td>\n");
      out.write("\t\t\t\t<td style=\"background-image: url(doc/img/home/4.JPG); background-size: cover; width: auto; height: 120px;\"></td>\n");
      out.write("\t\t\t\t<td style=\"background-image: url(doc/img/home/5.JPG); background-size: cover; width: auto; height: 120px;\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("        </table>\n");
      out.write("        <table width=\"90%\" cellspacing=\"0\" align=\"center\" class=\"tc\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("                    <p>German Cars</p>\n");
      out.write("                    <br>\n");
      out.write("\t\t\t        <a href=\"#\">Mercedes Benz</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Volks Wagen</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">BMW</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">AUDI</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Porsche</a>\n");
      out.write("                    <br>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("                    <p>British Cars</p>\n");
      out.write("                    <br>\n");
      out.write("\t\t\t        <a href=\"#\">Land Rover</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Jaguar</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Nissan UK</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Bentley</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Rolls Royce</a>\n");
      out.write("                    <br>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("                    <p>Japan Cars</p>\n");
      out.write("                    <br>\n");
      out.write("\t\t\t        <a href=\"#\">Toyota</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Mitsubishi</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Lexus</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Suzuki</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Isuzu</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Subaru</a>\n");
      out.write("                    <br>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("                    <p>USA Cars</p>\n");
      out.write("                    <br>\n");
      out.write("\t\t            <a href=\"#\">Cadillac</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Ford</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Chevrolet</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Jeep</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Hyundai</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">KIA</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Infinit</a>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"#\">Tesla</a>\n");
      out.write("                    <br>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("  <!-- Popular area -->\n");
      out.write("\n");
      out.write("    <div class=\"popularhead\" id=\"pop\">\n");
      out.write("    \t<h1 id=\"pophead\">Popular</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"popular\">\n");
      out.write("    \t<table width=\"100%\" align=\"center\" cellspacing=\"1px\" cellpadding=\"90\">\n");
      out.write("    \t\t<tr>\n");
      out.write("    \t\t\t<td style=\"background-image: url(doc/img/home/6.JPG); background-size: cover;\"><p id=\"label\">LAND ROVER</p></td>\n");
      out.write("    \t\t\t<td style=\"background-image: url(doc/img/home/7.JPG); background-size: cover;\"><p id=\"label\">BMW</p></td>\n");
      out.write("    \t\t\t<td style=\"background-image: url(doc/img/home/8.JPEG); background-size: cover;\"><p id=\"label\">VOVLO</p></td>\n");
      out.write("    \t\t</tr>\n");
      out.write("    \t\t<tr>\n");
      out.write("    \t\t\t<td style=\"background-image: url(doc/img/home/9.JPG); background-size: cover;\"><p id=\"label\">HYUNDAI</p></td>\n");
      out.write("    \t\t\t<td style=\"background-image: url(doc/img/home/10.JPG); background-size: cover;\"><p id=\"label\">JEEP</p></td>\n");
      out.write("    \t\t\t<td style=\"background-image: url(doc/img/home/11.JPG); background-size: cover;\"><p id=\"label\">NISSAN</p></td>\n");
      out.write("    \t\t</tr>    \t\t\n");
      out.write("    \t\t<tr>\n");
      out.write("    \t\t\t<td></td>\n");
      out.write("    \t\t\t<td style=\"background-image: url(doc/img/home/12.JPG); background-size: cover;\"><p id=\"label\">REZVANI</p></td>\n");
      out.write("    \t\t\t<td></td>\n");
      out.write("    \t\t</tr>\n");
      out.write("    \t</table>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"card1\">\n");
      out.write("\t\t\t<div class=\"ch1\">\n");
      out.write("\t\t\t\t<h3 id=\"ch1\">OTHER</h3><br>\n");
      out.write("\t\t\t\t<h3 id=\"ch2\">HELPFUL</h3><br>\n");
      out.write("\t\t\t\t<h3 id=\"ch3\">ARTICLES</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"chnav\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("             <li><a href=\"#\">Import fleets in Tanzania</a></li>\n");
      out.write("                <p></p>\n");
      out.write("             <li><a href=\"#\">Export fleets in Tanzania</a></li>\n");
      out.write("                <p></p>\n");
      out.write("             <li><a href=\"#\">Tanzania highway roads</a></li>\n");
      out.write("                <p></p>\n");
      out.write("             <li><a href=\"#\">Getting car license in Tanzania</a></li>\n");
      out.write("                <p></p>\n");
      out.write("             <li><a href=\"#\">Tanzania rally</a></li>\n");
      out.write("                <p></p>\n");
      out.write("             <li><a href=\"#\">Best safari cars in Tanzania</a></li>\n");
      out.write("                <p></p>\n");
      out.write("         </ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("    <!-- Enquire now form area -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"card2\">\n");
      out.write("\t\t\t<h3 align=\"center\" id=\"c2h\">Ready to purchase a car</h3>\n");
      out.write("            <button onclick=\"document.getElementById('id01').style.display='block'\" style=\"width:auto;\" id=\"enq\">ENQUIRE NOW</button>\n");
      out.write("\n");
      out.write("<div id=\"id01\" class=\"modal\">\n");
      out.write("  <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("  <form class=\"modal-content\" method=\"POST\" autocomplete=\"off\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <table cellspacing=\"2\" align=\"center\" width=\"100%\">\n");
      out.write("            <tr>\n");
      out.write("             <td><input type=\"text\" name=\"fname\" placeholder=\"First Name\" required></td>\n");
      out.write("             <td><input type=\"text\" name=\"lname\" placeholder=\"Last Name\" required></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("             <td><input type=\"text\" name=\"tel\" placeholder=\"Phone Number\" required></td>\n");
      out.write("             <td><input type=\"text\" name=\"tsap\" placeholder=\"Whatsapp Number\" required></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("             <td colspan=\"2\"><input type=\"email\" name=\"mail\" placeholder=\"Email Address\" required></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("             <td>\n");
      out.write("                 <div class=\"custom-select\" style=\"width:70%;\">\n");
      out.write("            <select name=\"country\">\n");
      out.write("              <option value=\"0\">Select Your Country:</option>\n");
      out.write("              <option value=\"Kenya\">Kenya</option>\n");
      out.write("              <option value=\"Uganda\">Uganda</option>\n");
      out.write("              <option value=\"USA\">USA</option>\n");
      out.write("              <option value=\"England\">England</option>\n");
      out.write("              <option value=\"Germany\">Germany</option>\n");
      out.write("              <option value=\"China\">China</option>\n");
      out.write("              <option value=\"Netherland\">Netherland</option>\n");
      out.write("              <option value=\"Zimbabwe\">Zimbabwe</option>\n");
      out.write("              <option value=\"Malawi\">Malawi</option>\n");
      out.write("              <option value=\"South africa\">South africa</option>\n");
      out.write("              <option value=\"Dubai\">Dubai</option>\n");
      out.write("              <option value=\"Japan\">Japan</option>\n");
      out.write("            </select>\n");
      out.write("                </div>\n");
      out.write("             </td>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("             <td colspan=\"2\">  \n");
      out.write("             </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td><input autocomplete=\"false\" class=\"form-control\" name=\"hidden\" type=\"text\" style=\"display: none;\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <div>\n");
      out.write("        <label>Comment</label>\n");
      out.write("        <br>\n");
      out.write("        <textarea cols=\"70\" rows=\"3\" name=\"comment\" placeholder=\"[ Any special requirement and any other information that may help us arranging your cargo ]\" maxlength=\"300\"></textarea> \n");
      out.write("        </div>\n");
      out.write("      <div class=\"clearfix\">\n");
      out.write("        <button type=\"button\" onclick=\"document.getElementById('id01').style.display='none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("        <button type=\"submit\" class=\"signupbtn\" name=\"send\">Submit</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Ask a question form area -->\n");
      out.write("\n");
      out.write("\t\t\t<button class=\"open-button\" onclick=\"openForm()\" id=\"qn\">ASK A QUESTION</button>\n");
      out.write("            <div class=\"form-popup\" id=\"myForm\">\n");
      out.write("  <form action=\"sendemail.php\" method=\"POST\" class=\"form-container\" autocomplete=\"off\">\n");
      out.write("      <p><h3 id=\"as1\" align=\"center\">ASK US ANY QUESTION</h3></p>\n");
      out.write("      <br>\n");
      out.write("    <p><h6 id=\"as2\" align=\"center\"><u>We will reply you within 24 hours</u></h6></p>\n");
      out.write("    <input type=\"text\" placeholder=\"Your Name\" name=\"name\" required>\n");
      out.write("    <input type=\"text\" placeholder=\"Your Email Address\" name=\"email\" required>\n");
      out.write("      \n");
      out.write("    <textarea name=\"message\" placeholder=\"Your Questions\" required cols=\"10\" rows=\"5\"></textarea>\n");
      out.write("    <input autocomplete=\"false\" class=\"form-control\" name=\"hidden\" type=\"text\" style=\"display: none;\">\n");
      out.write("\n");
      out.write("    <button type=\"submit\" class=\"btn\" name=\"send\">Send</button>\n");
      out.write("    <button type=\"button\" class=\"btn cancel\" onclick=\"closeForm()\">Close</button>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("  <!-- Footer area -->\n");
      out.write("\t<div class=\"footer1\">\n");
      out.write("  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved |\n");
      out.write("            This website is made by <a href=\"https://t.me/black_titan\" target=\"_blank\">Black Titan</a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"doc/js/index.js\"></script>\n");
      out.write("</body>\n");
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
