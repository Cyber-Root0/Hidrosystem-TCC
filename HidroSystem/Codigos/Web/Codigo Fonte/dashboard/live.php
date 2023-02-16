<?php

session_start();
?>
<!DOCTYPE html>
<html>
<head>
	<title>Real Time | HidroSystem 🌱</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/live.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	    <meta http-equiv="refresh" content="4">

</head>
<body>
<?php

if (!isset($_SESSION["arduino"]) or !isset($_SESSION["2fa"]) or $_SESSION["2fa"]==false) {
	echo "<script>document.location='/404.html'</script>";
}else{

$arduino=$_SESSION["arduino"];

//comunicação com o Banco de Dados...
$ip="localhost";
$user="id17157107_root";
$pass="|nxFufp9F/ru6OXo";
$bd="id17157107_system";
$con=mysqli_connect($ip,$user,$pass,$bd);
$sql="SELECT * FROM realtime WHERE arduino=$arduino";
$resposta=mysqli_query($con,$sql);
$output=mysqli_fetch_array($resposta);

$t=$output['temperatura'];
$p=$output['ph'];
$hora=$output['hora'];

// pegando a Minima e a Maxima da Temperatura e Do PH

//minima da Temperatura
$sql2="SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY temperatura";
$res_temp=mysqli_query($con,$sql2);
$output2=mysqli_fetch_array($res_temp);
$t_minima=$output2['temperatura'];

//maxima da Temperatura
$sql2="SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY temperatura DESC";
$res_temp=mysqli_query($con,$sql2);
$output2=mysqli_fetch_array($res_temp);
$t_maxima=$output2['temperatura'];

//minima do PH
$sql2="SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY ph";
$res_temp=mysqli_query($con,$sql2);
$output2=mysqli_fetch_array($res_temp);
$ph_minima=$output2['ph'];

//maxima do PH
$sql2="SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY ph DESC";
$res_temp=mysqli_query($con,$sql2);
$output2=mysqli_fetch_array($res_temp);
$ph_maxima=$output2['ph'];


}

?>
	<div class="container">
		<div class="item">
			<div class="title">
				<div class="title-a">
					<h1>Painel</h1>
				</div>
				<div class="title-a">
					<img src="img/iconea.png" alt="Logo do Sistema Da HIDROPONIA">
				</div>
			</div>
			<div class="options">
				<button class="btn" onclick="document.location='index.php'"><i class="fa fa-star-o"></i> Inicio </button>

			</div><br><hr><br>
			<div class="options">
				<button class="btn" onclick="document.location='live.php'"><i class="fa fa-wifi"></i> Monitoramento </button>

			</div><br><hr><br>
			<div class="options">
				<button class="btn" onclick="document.location='relatorio.php'"><i class="fa fa-file-text-o"></i> Relatórios </button>

			</div><br><hr><br>
			<div class="options">
				<button class="btn" onclick="document.location='profile.php'"><i class="fa fa-user-circle"></i> Minhas Informações </button>

			</div><br><hr><br>
			<div class="options">
				<button class="btn" onclick="document.location='alert.php'"><i class="fa fa-bullhorn"></i> Alertas </button>

			</div><br><hr><br>
		<!--	<div class="options">
				<button class="btn" onclick="document.location='https://www.google.com'"><i class="fa fa-comment"></i> Reclame Aqui </button>
			</div><br><hr><br> -->
			<div class="options">
				<button class="btn" onclick="document.location='sair.php'"><i class="fa fa-sign-out"></i> Sair </button>

			</div><br>
		</div>
		<div class="item2">
			<div class="top-bar">
				<div>	
				</div>
				<div>
					<h2 style="cursor: pointer;">Monitoramento - HidroSystem 🌱</h2>					
				</div>
				<div>
					<img src="img/user.jpg"><br>
					<strong><h5 style="cursor: pointer;"> <?php echo $_SESSION["nome"]; ?> </h5></strong>
				</div>
			</div>
			<div class="conteudo">
				<div class="grafico img1">
                 <h1 align="center">Camera 1</h1>   

					
				</div>
                <div class="grafico live img2">
				<h1 align="center">Camera 2</h1>   
				

                </div>
				<div class="grafico white">
					<div class="top1">
					<h2 align="center" style="color: rgb(64, 64, 64);margin-top:15px; ">Temperatura Agora</h2>
					</div>
					<div class="top2">
						<img src="img/termo.png" align="right" height="80px" width="50px;" style="margin-top: 5px;">

					</div>
					<div class="top3">
						
						<h1 align="left" style="font-size:50px; margin-left:15px; color:rgb(64, 64, 64); margin-top:15px"> <?php echo $t; ?>°C		</h1>
						<p style="color: red; margin-right:15px" align="right"><?php echo $hora; ?> </p>

					</div>
					<div class="top4"> 
					<div id="tabela">
						<table style="width:100%">
 							 <tr>
 							   <th>Minima</th>
    							<th>Maxima</th>
  							</tr>
  							<tr>
    							<td> <?php echo $t_minima; ?> °C</td>
    							<td> <?php echo $t_maxima ?> °C</td>
  							</tr>
						</table>
					</div>
					</div>
					<div class="top5">
						<button>Mais Informações

						</button>

					</div>
				
				</div>
				<div class="grafico ph white">
				<div class="top1">
					<h2 align="center" style="color: rgb(64, 64, 64);margin-top:15px; ">PH Agora</h2>
					</div>
					<div class="top2">
						<img src="img/ph.png" align="right" height="70px" width="60px;" style="margin-top: 15px;">

					</div>
					<div class="top3">
						
						<h1 align="left" style="font-size:50px; margin-left:15px; color:rgb(64, 64, 64); margin-top:15px"> <?php echo $p; ?> pH	</h1>
						<p style="color: red; margin-right:15px" align="right"><?php echo $hora; ?> </p>
					</div>
					<div class="top4">
					<div id="tabela">
						<table style="width:100%">
 							 <tr>
 							   <th>Minima</th>
    							<th>Maxima</th>
    							
  							</tr>
  							<tr>
    							<td><?php echo $ph_minima; ?> pH</td>
    							<td><?php echo $ph_maxima; ?> pH</td>
  							</tr>
						</table>
					</div>


					</div>
					<div class="top5">
						<button>Mais Informações
							
						</button>

					</div>
				
				 
				</div>
			</div>
		</div>	
	</div>
</script>

<div vw class="enabled">
    <div vw-access-button class="active"></div>
    <div vw-plugin-wrapper>
      <div class="vw-plugin-top-wrapper"></div>
    </div>
  </div>
  <script src="https://vlibras.gov.br/app/vlibras-plugin.js"></script>
  <script>
    new window.VLibras.Widget('https://vlibras.gov.br/app');
  </script>


</body>
</html>