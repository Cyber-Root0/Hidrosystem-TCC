<?php

session_start();
?>
<!DOCTYPE html>
<html>
<head>
	<title>Relatórios | HidroSystem 🌱</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/alert.css">
    <link rel="stylesheet" type="text/css" href="css/relatorio.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	    
</head>
<body>
<?php

if (!isset($_SESSION["arduino"]) or !isset($_SESSION["2fa"]) or $_SESSION["2fa"]==false) {
	echo "<script>document.location='/404.html'</script>";
}else{

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
					<h2 style="cursor: pointer;">Relatórios - HidroSystem 🌱</h2>					
				</div>
				<div>
					<img src="img/user.jpg"><br>
					<strong><h5 style="cursor: pointer;"> <?php echo $_SESSION["nome"]; ?> </h5></strong>
				</div>
			</div>
			<div class="conteudo">
				<div class="grafico g1">
					<center>
                        <h1 style="cursor: pointer;">Gerar Relatórios</h1>
                        <form action="src/relatorio.php" method="POST" class="relatorio" target="_blanck">
                          <string>Inicio</string><input type="date" name="inicio">
                            <input type="date" name="fim"> <string>Fim</string> <br>
                            <input type="submit" value="Gerar Relatório">

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