<?php
session_start();
?>
<!DOCTYPE html>
<html>
<head>
	<title>DASHBOARD | HidroSystem 🌱</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
</head>
<body>
<?php

if (!isset($_SESSION["arduino"]) or !isset($_SESSION["2fa"]) or $_SESSION["2fa"]==false) {
	echo "<script>document.location='/404.html'</script>";
}else{
// setando variaiveis fundamentais para o funcionamento do sistema
	$arduino=$_SESSION['arduino'];
	$ip="localhost";
	$user="root";
	$pass="";
	$bd="system";
	$con=mysqli_connect($ip,$user,$pass,$bd);
	//buscando dados no banco de dados
	$sql="SELECT * FROM realtime WHERE arduino=$arduino";
	$res=mysqli_query($con,$sql);
    $output=mysqli_fetch_array($res);
	$t=$output['temperatura'];
	$p=$output['ph'];

	//buscando valores do alerta!
	$sql="SELECT * FROM alerta WHERE arduino=$arduino ORDER BY id DESC LIMIT 1";
    $res=mysqli_query($con,$sql);
	if (mysqli_num_rows($res)>0){
		$out=mysqli_fetch_array($res);
		$msg=$out['mensagem'];
		$hora=$out['hora'];
		$data=$out['data'];
		$s=true;

	}else{
		$msg="Você não Possui Nenhum Alerta No Momento!";
		$s=false;
	}


function grafico(){

	$arduino=$_SESSION['arduino'];
	$ip="localhost";
	$user="root";
	$pass="";
	$bd="system";
	$con=mysqli_connect($ip,$user,$pass,$bd);
	$s="SELECT * FROM diaria WHERE arduino=$arduino";
    $output=mysqli_query($con,$s);
	$lines=mysqli_num_rows($output);
	$l=$lines-7;
    $sql="SELECT * FROM diaria WHERE arduino=$arduino AND id>$l LIMIT 10";
	$out=mysqli_query($con,$sql);

	return $out;

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
				<button class="btn" onclick="document.location='https://www.google.com'"><i class="fa fa-comment"></i>  </button>
			</div><br><hr><br>  -->
			<div class="options">
				<button class="btn" onclick="document.location='sair.php'"><i class="fa fa-sign-out"></i> Sair </button>
			</div><br>
		</div>
		<div class="item2">
			<div class="top-bar">
				<div>
				</div>
				<div>
					<h2 style="cursor: pointer;">DASHBOARD - HidroSystem 🌱</h2>					
				</div>
				<div>
					<img src="img/user.jpg"><br>
					<strong><h5 style="cursor: pointer;" alt="Meu Perfil"> <?php echo $_SESSION["nome"]; ?> </h5></strong>
				</div>
			</div>
			<div class="conteudo">
				<div class="grafico g1">
					<h1>Alertas! </h1><br>
					<p align="center" style="color: red;">
	     <?php
		 if ($s=true){
		 		if (isset($msg)  and isset($hora) and isset($data) ){

			 		echo "$msg no dia $data ás $hora";
		 		}
		 		else{
		 			echo "Voce Não Possui Alertas No Momento";

		 		}

		 	}
		 
		 
		 ?>
	</p>
					
				</div>
				<div class="grafico g2">
					<h3>Temperatura Atual</h3><br>
					<h1 align="left"> <?php echo $t; ?> °C</h1>
					
				</div>
				<div class="grafico g3">
					<h2 style="margin-top: 5px;">P.H</h2><br>
					<h1 align="left"> <?php echo $p; ?> pH</h1>
				
				</div>
				<div class="grafico g4 chart">
				<h4 style="margin-top: 2px;">Temperatura</h4>
				
				</div>
				<div class="grafico g5 chart2" style="color: white;">
				<h4 style="margin-top: 2px;">pH</h4>
				</div>
			</div>
		</div>	
	</div>

	<script type="text/javascript">
var options = {
  chart: {
    height: 280,
    type: "area"
  },
  dataLabels: {
    enabled: true
  },
  series: [
    {
      name: "Temperatura",
      data: [

		<?php
		$d=grafico();
		while($output=mysqli_fetch_array($d)){
	    $temp=$output['temperatura'];
		echo $temp.",";
		}
		
		?>
	  
	  
	  ]
    }
  ],
  fill: {
    type: "gradient",
    gradient: {
      shadeIntensity: 1,
      opacityFrom: 0.9,
      opacityTo: 0.9,
      stops: [80, 90, 100],
    }
  },
markers: {
   colors: ['#0F143C', '#0F143C', '#0F143C']
},
grid: {
  row: {
    colors: ['#0F143C', '#0F143C', '#0F143C']
  },
  column: {
    colors: ['#0F143C', '#0F143C', '#0F143C']
  }
},

  xaxis: {
    categories: [
		<?php
		$d=grafico();
		while($output=mysqli_fetch_array($d)){
	    $hora=$output['hora'];
		echo "'$hora'".",";
		}
		
		?>
    ]
  }
};
var chart = new ApexCharts(document.querySelector("div.chart"), options);
chart.render();
</script>

<script type="text/javascript">
var options = {
  chart: {
    height: 280,
    type: "area"
  },
  dataLabels: {
    enabled: true
  },
  series: [
    {
      name: "Temperatura",
      data: [

		<?php
		$d=grafico();
		while($output=mysqli_fetch_array($d)){
	    $temp=$output['ph'];
		echo $temp.",";
		}
		
		?>
	  
	  
	  ]
    }
  ],
  fill: {
    type: "gradient",
    gradient: {
      shadeIntensity: 1,
      opacityFrom: 0.9,
      opacityTo: 0.9,
      stops: [80, 90, 100],
    }
  },
markers: {
   colors: ['#0F143C', '#0F143C', '#0F143C']
},
grid: {
  row: {
    colors: ['#0F143C', '#0F143C', '#0F143C']
  },
  column: {
    colors: ['#0F143C', '#0F143C', '#0F143C']
  }
},

  xaxis: {
    categories: [
		<?php
		$d=grafico();
		while($output=mysqli_fetch_array($d)){
	    $hora=$output['hora'];
		echo "'$hora'".",";
		}
		
		?>
    ]
  }
};
var chart = new ApexCharts(document.querySelector("div.chart2"), options);
chart.render();
</script>


<script src="//code-sa1.jivosite.com/widget/BhH39d8qzG" async></script>

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