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





%>
<!DOCTYPE html>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="doc/css/shipping.css">
<head>
<title>Shipping</title>
</head>
<body>
	<div class="menu">
       <div class="nav">
       			<div class="head">
               <a href="index.jsp" id="logo">DMB AUTO<br>SERVICES</a>
	</div>
	<div class="nav2">
             <a href="index.jsp.#pop">Popular</a>
             <a href="aquarium.php">Aquiarim</a>
             <a href="dealers.php">Dealers</a>
             <a href="Shipping.jsp">Shipping</a>
             <a href="contact.php">Contact Us</a>
     </div>
          <div class="social">
     	    <a href="#"><i class="fa fa-twitter"></i></a><br>
            <a href="#"><i class="fa fa-facebook"></i></a><br>
            <a href="#"><i class="fa fa-instagram"></i></a><br>
     </div>
     </div>
	</div>
	<div class="main">
		<div class="header1" style=" background-image: url(doc/img/shipping/1.JPG);">
        <div id="heading"><center><h1><big>Shipping</big></h1></center></div>
	</div>
    <div class="disc">
    <div class="disc1">
    <p id="two"><b>The Complete Solution for Your Fleet Relocation
</b></p>
<p id="one">
Our network of certified transport experts have the experience and resources required to provide a full-service solution for
your fleet shipping needs. We understand the importance of keeping your fleet on the road, and to ensure that we provide
you with the highest level of service.
</p>
    </div>
    </div>
    <div class="form">
    <form  method="POST" autocomplete="off">
    <table cellpadding="10" cellspacing="10" align="center" width="70%%" border="0">
    <tr>
    <td colspan="3"><center><p id="three"><big>Shipping form</big></p></center></td>
    </tr>
        <tr>
    <td>
    <input type="text" name="fname" placeholder="Full Name" required>
    </td>
    <td>
    <div class="custom-select" style="width:200px;">
  <select name="loc">
    <option value="0">Pick up location</option>
              <option value="Kenya">Kenya</option>
              <option value="Uganda">Uganda</option>
              <option value="Tanzania">Tanzania</option>
              <option value="South africa">South africa</option>
              <option value="Zimbabwe">Zimbabwe</option>
              <option value="Malawi">Malawi</option>
              <option value="England">England</option>
              <option value="Germany">Germany</option>
              <option value="China">China</option>
              <option value="Netherland">Netherland</option>
              <option value="Dubai">Dubai</option>
              <option value="Japan">Japan</option>
  </select>
</div>
</td>
    <td>
    <input type="checkbox" name="check_box" value="Drop off at a different location">Drop off at a different location
    </td>
    </tr>
        <tr>
    <td>
    <input type="email" name="mail" placeholder="Email address" required>
    </td>
    <td>
    <input type="text" name="d_age" placeholder="Drivers age" required>
    </td>
    <td></td>
    </tr>
        <tr>
    <td>
    <input type="text" name="tel" placeholder="Phone" required>
</td>
    <td>
     <input type="text" name="vehc" placeholder="Vehical" required>
    </td>
    <td>
    </td>
    </tr>
        <tr>
    <td colspan="3">
    <textarea name="message" placeholder="Any message about the car your fleet" required cols="90" rows="5" maxlength="300"></textarea>
    </td>
    </tr>
        <tr>
    <td colspan="3">
    <center><button type="submit" class="signupbtn" name="send">SEND</button></center>
    </td>
    </tr>
    </table>
    </form>
    </div>
    <div class="fleet">
    <div id="fleet">
    <center><h3><big><b>FLEET MANAGEMENT</b></big></h3></center>
    </div>
    <div class="manage">
    <center><h4><big><b><a href="#">Trucks</a> |<a href="#"> Mini vans </a>|<a href="#"> Buses </a>|<a href="#"> SUVs</a>
</b></big></h4></center>
    </div>
    </div>

    </div>
    <script src="doc/js/shipping.js"></script>
</body>
</html>