<?php

session_start();
?><DOCTYPE html>
<html>
<head>
	<title>Minhas Informações | HidroSystem 🌱</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/profile.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
</head>
<body>
<?php

if (!isset($_SESSION["arduino"]) or !isset($_SESSION["2fa"]) or $_SESSION["2fa"]==false) {
	echo "<script>document.location='/404.html'</script>";

}else{
	if (!empty($_POST['nome']) and !empty($_POST['sobrenome']) and !empty($_POST['senha']) and !empty($_POST['celular'])  ){
		// variaveis do Layout e Dashboard 
		$email=$_SESSION['login'];
		$nome=$_POST['nome'];
		$sobrenome=$_POST['sobrenome'];
		$senha=$_POST['senha'];
		$celular=$_POST['celular'];
		// configuração do Banco de dados
		$ip="localhost";
$user="id17157107_root";
$pass="|nxFufp9F/ru6OXo";
$bd="id17157107_system";
		$con=mysqli_connect($ip,$user,$pass,$bd);
		$sql="UPDATE user SET nome='$nome',sobrenome='$sobrenome',senha='$senha',celular='$celular' WHERE email='$email'";

		if (mysqli_query($con,$sql)){
			echo "<script>alert('Alterações Realizadas Com Sucesso');</script>";
			
		$_SESSION["nome"]=$nome;
		$_SESSION["sobrenome"]=$sobrenome;
		$_SESSION["celular"]=$celular;
		$_SESSION["senha"]=$senha;




		}else{
			echo "<script>alert('Não Foi Possivel realizar as alterações');</script>";
		}




	}

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
					<h2 style="cursor: pointer;">Minhas Informações - HidroSystem 🌱</h2>					
				</div>
				<div>
					<img src="img/user.jpg"><br>
					<strong><h5 style="cursor: pointer;"> <?php echo $_SESSION["nome"]; ?> </h5></strong>
				</div>
			</div>
			<div class="conteudo">
				<div class="grafico g1">
					<center>
						<h1 style="color: rgb(3, 120, 215);">Meus Dados - <string style="color: yellow;"> Alterar</string></h1><br><hr>
						<form action="" method="POST" class="myinfo">
							<string>Nome</string><br>
							<input type="text" name="nome" value="<?php echo $_SESSION['nome']; ?>"><br>
							<string>Sobrenome</string><br>
							<input type="text" name="sobrenome" value="<?php echo $_SESSION['sobrenome']; ?>"><br>
							<string>Email</string><br>
							<input type="email" name="email" class="block-input" disabled="false" value="<?php echo $_SESSION['login']; ?>"><br>
							<string>Senha</string><br>
							<input type="text" name="senha" value="<?php echo $_SESSION['senha']; ?>"><br>
							<string>Celular</string><br>
							<input type="number" name="celular" value="<?php echo $_SESSION['celular']; ?>"><br>
							<string>Cod. Produto</string><br>
							<input type="number" name="arduino" class="block-input" disabled value="<?php echo $_SESSION['arduino']; ?>"><br>
							<input type="submit" value="Atualizar" class="btn-i">	
						</form>
					</center>
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