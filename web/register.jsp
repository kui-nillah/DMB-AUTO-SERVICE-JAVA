<%@page import="java.sql.*" %>

<%
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





%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Admin Register - DMB AUTO SERVICES</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="doc/css/register.css">
    </head>
    <body>
        <div class="menu">
    <div class="nav">
	<div class="head">
      <a href="dashboard.php" id="logo">DMB AUTO<br>SERVICES</a>
	</div>
	<div class="nav2">
             <a href="enquiry.jsp">Submitted Enquiries</a>
             <a href="order.jsp">Submitted Orders</a>
             <a href="register.jsp">Register Admin</a>
     </div>
          <div class="social">
     	    <a href="#"><i class="fa fa-twitter"></i></a><br>
            <a href="#"><i class="fa fa-facebook"></i></a><br>
            <a href="#"><i class="fa fa-instagram"></i></a><br>
     </div>
    </div>
    </div>
    <div class="main">
        <span class="medium">
    <center><h1 id="two"><big>Admin Registration</big></h1></center>
    </span>
    <div class="log">
   <center><form method="POST" autocomplete="off">
   <br>
   <br>
    <label>First name</label><br>
    <input type="text" name="fname" placeholder="First name" required>
    <br>
    <br>
    <label>Last name</label><br>
    <input type="text" name="lname" placeholder="Last name" required>
    <br>
    <br>
    <label>Address</label><br>
    <input type="text" name="addr" placeholder="Street, Region, Country" required>
    <br>
    <br>
    <label>Phone number</label><br>
    <input type="text" name="tel" placeholder="+255...." required>
    <br>
    <br>
    <label>Email address</label><br>
    <input type="email" name="mail" placeholder="Email address" required>
    <br>
    <br>
    <label>Password</label><br>
    <input type="password" name="pass" required>
    <br>
    <br>
    <input type="submit" name="send" value="REGISTER">
    <input type="reset" name="reset" value="RESET">
    </form></center>
    </div>
    </div>
    </div>
        <div class="footer">
      <center>
              <p>
  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved |
                  This website is made by <a href="https://t.me/black_titan" target="_blank">Black Titan</a></p>
      </center>
    </div>

        <script src="" async defer></script>
    </body>
    </html>