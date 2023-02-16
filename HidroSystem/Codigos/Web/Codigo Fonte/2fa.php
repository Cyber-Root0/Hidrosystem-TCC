<?php
session_start();
echo $_SESSION["token"];
if (isset($_SESSION["login"]) and $_SESSION["2fa"]==true) {
	echo "<script>document.location='dashboard/index.php'</script>";
}else if(!isset($_SESSION["login"])){
    
echo "<script>document.location='login.php'</script>";
    
}

if(!empty($_POST["code"])){
    $code=$_POST["code"];
    if($code==$_SESSION["token"]){
        $_SESSION["2fa"]=true;
        echo "<script>document.location='dashboard/index.php'</script>";
    }
    
}

?>
<!doctype html>
<html>
	<head>
		<title>WhatsApp</title>
		<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
                <link rel="shortcut icon" href="https://static.whatsapp.net/rsrc.php/v3/yP/r/rYZqPCBaG70.png">
		<style>
		* {
			box-sizing:border-box;
			outline:none;
			margin-top:50px;
		}
		body,html{		  margin:0;}
		body {
		  background:#1ebea5;

		  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen, Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
		  
		}
		h1{
		  font-size: 24px;
		  color:#Fff;
		  font-size: 24px;
		  font-weight: 400;
		  letter-spacing: .04px;
		  line-height: 31px;
		  margin-bottom: 15px;
		  text-align: center;
		}
		img {
			height: 90px;
			display:block;
			margin:50px auto 0 auto;
		}
		#code {
			display: block;
border: 20px solid #77d7c8;
padding: 5px;
text-align:center;
font-size: 25px;
border-radius: 5px;
margin: 50px auto 0 auto;
width: 95%;
color: rgba(52, 68, 76);
border-width-top: 100px;

		}
		input[type=submit] {
			background-color: #01e675;
			color: #fff !important;
			padding: 18px 36px;
			font-size: 14px;
			letter-spacing: .01em;
			border-radius: 40px;
			border: none;
			display:block;
width:90%;
margin:50px auto 0 auto;
		}
p{color:#fff;text-align:center;padding:20px;}

		</style>
	</head>



<body>
   <img src="https://icon-library.com/images/android-message-icon/android-message-icon-9.jpg">
  <h1>Enviamos um código de verificação</h1>
  <form action="" method="POST">
  <input id="code" type="number" maxlength="6" name="code" placeholder="_ _ _ _ _ _">
  <input type="submit" id="button" value="ACESSAR MINHA CONTA"/>

<p>Nunca compartilhe seu código de confirmação da HidroSystem com outras pessoas. </p>

<script>
var code = document.getElementById("code");
code.addEventListener("keyup",function(){
	if(code.value.length >= 6){
		document.getElementById("code").value = document.getElementById("code").value.slice(0,6);	
	}
});
</script>
</body>