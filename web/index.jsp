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





%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="doc/css/index.css">
<head>
	<title>Home</title>
</head>
<body>
<!-- Navigation bar area -->

	<div class="menu">
       <div class="nav">
       			<div class="head">
               <a href="index.jsp" id="logo">DMB AUTO<br>SERVICES</a>
	</div>
	<div class="nav2">
            <a href="#pop">Popular</a>
            <a href="aquarium.php">Aquiarim</a>
            <a href="dealers.php">Dealers</a>
            <a href="shipping.jsp">Shipping</a>
            <a href="contact.php">Contact Us</a>
     </div>
          <div class="social">
            <a href="#"><i class="fa fa-twitter"></i></a><br>
            <a href="#"><i class="fa fa-facebook"></i></a><br>
            <a href="#"><i class="fa fa-instagram"></i></a><br>
     </div>
     </div>
	</div>

  <!-- Header area -->

	<div class="main">
		<div class="header1" style=" background-image: url(doc/img/home/1.JPG);">
            <div class="header2">
			<h5 id="h1">Welcome!!</h5>
			<br>
			<h6 id="h2">DMB SERVICES, the best car deallers in Tanzania.</h6>
            </div>
	</div>

  <!-- Ask a question and enquire area -->

	<div class="askhead">
		<h3 class="askh">ASK A QUESTION | ENQUIRE NOW</h3>
	</div>
	<div class="ask">
		<p id="txt">
			DMB AUTO is a trading platform where used vehicles in Japan, UK, USA, and UAE are sold in Tanzana market.<br>
			You will find on the site not only vehicles offered by many well-known used car exporters, but also those by local car dealers in Japan, uk, usa <br>
			and UAE. As such, you have a huge and diverse range to choose from, making your browsing experience more enjoyable.<br>
			The most remarkable feature of the site is that you can compare the total (CIF) price of all the vehicles that are listed.
			<br>
			Cross-comparing for this reason becomes extremely convenient, and finding that right car at your budget becomes very much hassle-free 
			<p id="txt2"><b><big>TANZANIA</big></b></p>
			<div class="link">
				<p id="ln"><a href="#enq">LET US HELP GET A CAR OF YOUR DREAM</a></p>
			</div>
	</div>

  <!-- Gallery area -->

	<div class="gallery">
		<table width="100%" align="center" cellspacing="1px" cellpadding="90">
			<tr>
				<td style="background-image: url(doc/img/home/2.JPG); background-size: cover; width: auto; height: 120px;"></td>
				<td style="background-image: url(doc/img/home/3.JPG); background-size: cover; width: auto; height: 120px;"></td>
				<td style="background-image: url(doc/img/home/4.JPG); background-size: cover; width: auto; height: 120px;"></td>
				<td style="background-image: url(doc/img/home/5.JPG); background-size: cover; width: auto; height: 120px;"></td>
			</tr>
        </table>
        <table width="90%" cellspacing="0" align="center" class="tc">
			<tr>
				<td>
                    <p>German Cars</p>
                    <br>
			        <a href="#">Mercedes Benz</a>
                    <br>
                    <a href="#">Volks Wagen</a>
                    <br>
                    <a href="#">BMW</a>
                    <br>
                    <a href="#">AUDI</a>
                    <br>
                    <a href="#">Porsche</a>
                    <br>
				</td>
				<td>
                    <p>British Cars</p>
                    <br>
			        <a href="#">Land Rover</a>
                    <br>
                    <a href="#">Jaguar</a>
                    <br>
                    <a href="#">Nissan UK</a>
                    <br>
                    <a href="#">Bentley</a>
                    <br>
                    <a href="#">Rolls Royce</a>
                    <br>
				</td>
				<td>
                    <p>Japan Cars</p>
                    <br>
			        <a href="#">Toyota</a>
                    <br>
                    <a href="#">Mitsubishi</a>
                    <br>
                    <a href="#">Lexus</a>
                    <br>
                    <a href="#">Suzuki</a>
                    <br>
                    <a href="#">Isuzu</a>
                    <br>
                    <a href="#">Subaru</a>
                    <br>
				</td>
				<td>
                    <p>USA Cars</p>
                    <br>
		            <a href="#">Cadillac</a>
                    <br>
                    <a href="#">Ford</a>
                    <br>
                    <a href="#">Chevrolet</a>
                    <br>
                    <a href="#">Jeep</a>
                    <br>
                    <a href="#">Hyundai</a>
                    <br>
                    <a href="#">KIA</a>
                    <br>
                    <a href="#">Infinit</a>
                    <br>
                    <a href="#">Tesla</a>
                    <br>
				</td>
			</tr>
		</table>
	</div>

  <!-- Popular area -->

    <div class="popularhead" id="pop">
    	<h1 id="pophead">Popular</h1>
    </div>
    <div class="popular">
    	<table width="100%" align="center" cellspacing="1px" cellpadding="90">
    		<tr>
    			<td style="background-image: url(doc/img/home/6.JPG); background-size: cover;"><p id="label">LAND ROVER</p></td>
    			<td style="background-image: url(doc/img/home/7.JPG); background-size: cover;"><p id="label">BMW</p></td>
    			<td style="background-image: url(doc/img/home/8.JPEG); background-size: cover;"><p id="label">VOVLO</p></td>
    		</tr>
    		<tr>
    			<td style="background-image: url(doc/img/home/9.JPG); background-size: cover;"><p id="label">HYUNDAI</p></td>
    			<td style="background-image: url(doc/img/home/10.JPG); background-size: cover;"><p id="label">JEEP</p></td>
    			<td style="background-image: url(doc/img/home/11.JPG); background-size: cover;"><p id="label">NISSAN</p></td>
    		</tr>    		
    		<tr>
    			<td></td>
    			<td style="background-image: url(doc/img/home/12.JPG); background-size: cover;"><p id="label">REZVANI</p></td>
    			<td></td>
    		</tr>
    	</table>
    </div>
	<div class="footer">
		<div class="card1">
			<div class="ch1">
				<h3 id="ch1">OTHER</h3><br>
				<h3 id="ch2">HELPFUL</h3><br>
				<h3 id="ch3">ARTICLES</h3>
			</div>
			<div class="chnav">
			<ul>
             <li><a href="#">Import fleets in Tanzania</a></li>
                <p></p>
             <li><a href="#">Export fleets in Tanzania</a></li>
                <p></p>
             <li><a href="#">Tanzania highway roads</a></li>
                <p></p>
             <li><a href="#">Getting car license in Tanzania</a></li>
                <p></p>
             <li><a href="#">Tanzania rally</a></li>
                <p></p>
             <li><a href="#">Best safari cars in Tanzania</a></li>
                <p></p>
         </ul>
			</div>
		</div>

    <!-- Enquire now form area -->

		<div class="card2">
			<h3 align="center" id="c2h">Ready to purchase a car</h3>
            <button onclick="document.getElementById('id01').style.display='block'" style="width:auto;" id="enq">ENQUIRE NOW</button>

<div id="id01" class="modal">
  <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
  <form class="modal-content" method="POST" autocomplete="off">
    <div class="container">
        <table cellspacing="2" align="center" width="100%">
            <tr>
             <td><input type="text" name="fname" placeholder="First Name" required></td>
             <td><input type="text" name="lname" placeholder="Last Name" required></td>
            </tr>
            <tr>
             <td><input type="text" name="tel" placeholder="Phone Number" required></td>
             <td><input type="text" name="tsap" placeholder="Whatsapp Number" required></td>
            </tr>
            <tr>
             <td colspan="2"><input type="email" name="mail" placeholder="Email Address" required></td>
            </tr>
            <tr>
             <td>
                 <div class="custom-select" style="width:70%;">
            <select name="country">
              <option value="0">Select Your Country:</option>
              <option value="Kenya">Kenya</option>
              <option value="Uganda">Uganda</option>
              <option value="USA">USA</option>
              <option value="England">England</option>
              <option value="Germany">Germany</option>
              <option value="China">China</option>
              <option value="Netherland">Netherland</option>
              <option value="Zimbabwe">Zimbabwe</option>
              <option value="Malawi">Malawi</option>
              <option value="South africa">South africa</option>
              <option value="Dubai">Dubai</option>
              <option value="Japan">Japan</option>
            </select>
                </div>
             </td>
                <td></td>
            </tr>
            <tr>
             <td colspan="2">  
             </td>
            </tr>
            <tr>
              <td><input autocomplete="false" class="form-control" name="hidden" type="text" style="display: none;"></td>
            </tr>
        </table>
        <br>
        <div>
        <label>Comment</label>
        <br>
        <textarea cols="70" rows="3" name="comment" placeholder="[ Any special requirement and any other information that may help us arranging your cargo ]" maxlength="300"></textarea> 
        </div>
      <div class="clearfix">
        <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
        <button type="submit" class="signupbtn" name="send">Submit</button>
      </div>
    </div>
  </form>
</div>

<!-- Ask a question form area -->

			<button class="open-button" onclick="openForm()" id="qn">ASK A QUESTION</button>
            <div class="form-popup" id="myForm">
  <form action="sendemail.php" method="POST" class="form-container" autocomplete="off">
      <p><h3 id="as1" align="center">ASK US ANY QUESTION</h3></p>
      <br>
    <p><h6 id="as2" align="center"><u>We will reply you within 24 hours</u></h6></p>
    <input type="text" placeholder="Your Name" name="name" required>
    <input type="text" placeholder="Your Email Address" name="email" required>
      
    <textarea name="message" placeholder="Your Questions" required cols="10" rows="5"></textarea>
    <input autocomplete="false" class="form-control" name="hidden" type="text" style="display: none;">

    <button type="submit" class="btn" name="send">Send</button>
    <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
  </form>
</div>
		</div>
	</div>

  <!-- Footer area -->
	<div class="footer1">
  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved |
            This website is made by <a href="https://t.me/black_titan" target="_blank">Black Titan</a>
	</div>
</div>
<script src="doc/js/index.js"></script>
</body>
</html>
