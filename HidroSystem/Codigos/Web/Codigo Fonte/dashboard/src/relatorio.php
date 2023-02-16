<?php
session_start();
if (!empty($_POST['inicio']) and !empty($_POST['fim'])){
//setando variaveis de configuração
$arduino=$_SESSION['arduino'];
$inicio=$_POST['inicio'];
$fim=$_POST['fim'];
$ip="localhost";
$user="id17157107_root";
$pass="|nxFufp9F/ru6OXo";
$bd="id17157107_system";
$con=mysqli_connect($ip,$user,$pass,$bd);
$sql="SELECT * FROM full WHERE data BETWEEN '$inicio' AND '$fim'";
$res=mysqli_query($con,$sql);


}else{

echo "<script>document.location='/css/p2/dashboard/relatorio.php'</script>";


}



?>

<html>
<head>
    <title>Relatório | HidroSystem</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <img src="https://i.imgur.com/CTHFAbb.png" id="logo">
    <center>
    <h1>Relatório HidroSystem</h1>
    <div id="tabela">
			<table style="width:100%">
 				<tr>
 					<th>ID</th>
    				<th>DATA</th>
                    <th>Temp. Minima</th>
                    <th>Temp. Máxima</th>
                    <th>pH Minimo</th>
                    <th>pH Máximo</th>
  				</tr>
                      <?php
                
                      while($output=mysqli_fetch_array($res)){
                          $id=$output['id'];
                          $data=$output['data'];
                          $t_min=$output['temp_minima'];
                          $t_maxima=$output['temp_maxima'];
                          $p_min=$output['ph_minimo'];
                          $p_max=$output['ph_maximo'];
                          echo "<tr><td>$id</td>";
                          echo "<td>$data</td>";
                          echo "<td>$t_min</td>";
                          echo "<td>$t_maxima</td>";
                          echo "<td>$p_min</td>";
                          echo "<td>$p_max</td></tr>";
                      }
                      
                      
                      
                      ?>
			</table>
	</div>
    <button onclick="action();" id="botao">Imprimir</button>
    </center>
    <script>
    var hidden = false;
    function action() {
        hidden = !hidden;
        if(hidden) {
            document.getElementById('botao').style.visibility = 'hidden';
            document.getElementById('logo').style.visibility = 'hidden';
            document.getElementById('logo').remove();
            

            window.print();
        } else {
            document.getElementById('botao').style.visibility = 'visible';
            document.getElementById('logo').style.visibility = 'visible';
        }
    }
</script>

</body>
</html>