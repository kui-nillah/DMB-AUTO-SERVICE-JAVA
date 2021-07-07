<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
	<style type="text/css">
		body{
			margin: 0px;
			padding: 0px;
			background-color: black;
		}
		.small{
			color: white;
			text-align: center;
			font-family: Haettenschweiler;
			font-size: 30px;
			text-decoration: underline;
			text-decoration-color: #f16c32;
		}
		.medium{
			color: white;
			margin-top: 0px;
			text-align: center;
			font-size: 40px;
			margin-top: 150px;
		}
		#two{
			-webkit-animation-name: fade;
			-webkit-animation-duration: 4s;
			-webkit-animation-iteration-count: infinite;
			animation-name: fade;
			animation-duration: 4s;
			animation-iteration-count: infinite;

		}

		@-webkit-keyframes fade
		{
			from{opacity:0;}
			to{opacity: .9;}
		}

		@keyframes fade
		{
			from{opacity:0;}
			to{opacity: .9;}
		}
		.btn {
  background-color: #ddd;
  border: none;
  color: black;
  padding: 16px 32px;
  text-align: center;
  font-size: 20px;
  margin: 4px 2px;
  transition: 1s;
  margin-top: 20px;
  border-radius: 10px; 
  border-style: solid;
  border-color: #555; 
}

.btn:hover {
  background-color: #555;
  color: white;
}
a{
	text-decoration-line: none;
	font-family: Haettenschweiler;
	font-size: 25px;
}
a:link {
  color: #555;
}

a:hover {
  color: white;
}
	</style>
	<title>DMB AUTO SERVICES - Received</title>
	<meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="manifest" href="site.webmanifest">
 <!--   <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico"> -->
</head>
<body>
	<div class="main">
		<div class="medium">
			<span id="two">ORDER RECEIVED</span>
		</div>
        <div class="small">
        	<span id="one">We will get in touch with you within 24 hours. Thank you!!</span>
        </div>
        <div class="large">
        	<center><button class="btn"><a href="index.jsp">Continue</a></button></center>
        </div>
	</div>

</body>
</html>