<?php
session_start();
?>
<!DOCTYPE html>
<html>
<head>
	<title>Alertas | HidroSystem 🌱</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/alert.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	    
</head>
<body>
<?php

if (!isset($_SESSION["arduino"]) or !isset($_SESSION["2fa"]) or $_SESSION["2fa"]==false) {
	echo "<script>document.location='/404.html'</script>";
}else{

//setando variaveis fundamentais para a Usabilidade do sistema
$arduino=$_SESSION['arduino'];
$ip="localhost";
$user="id17157107_root";
$pass="|nxFufp9F/ru6OXo";
$bd="id17157107_system";
$con=mysqli_connect($ip,$user,$pass,$bd);
//buscando dados no banco de dados
$sql="SELECT * FROM alerta WHERE arduino=$arduino ORDER BY id DESC LIMIT 9";
$res=mysqli_query($con,$sql);


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
					<h2 style="cursor: pointer;">Alertas - HidroSystem 🌱</h2>					
				</div>
				<div>
					<img src="img/user.jpg"><br>
					<strong><h5 style="cursor: pointer;"> <?php echo $_SESSION["nome"]; ?> </h5></strong>
				</div>
			</div>
			<div class="conteudo">
				<div class="grafico g1">
					<div id="tabela">
						<table style="width:100%">
 							 <tr>
 							   <th>Data</th>
    							<th>Hora</th>
    							<th>Mensagem</th>
  							</tr>
							<?php
							
							while($output=mysqli_fetch_array($res)){
							$data=$output['data'];
							$hora=$output['hora'];
							$msg=$output['mensagem'];
							echo "<tr><td>$data</td>";
							echo "<td>$hora</td>";
							echo "<td>$msg</td></tr>";
							}

							?>
						</table>
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