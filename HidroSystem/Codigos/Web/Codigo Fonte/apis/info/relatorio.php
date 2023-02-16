<?php
date_default_timezone_set('america/sao_paulo');
function valida_token($token)
{
    //processo de cone��o com o banco de dados e fazer um WHERE:
    $ip = "localhost";
    $u = "id17157107_root";
    $p = "|nxFufp9F/ru6OXo";
    $bd = "id17157107_system";
    $con = mysqli_connect($ip, $u, $p, $bd);
    $sql = "SELECT * FROM tokens WHERE token='$token'";
    $out = mysqli_query($con, $sql);
    if (mysqli_num_rows($out) > 0) {
        $json = mysqli_fetch_array($out, MYSQLI_ASSOC);
        $hoje = date("Y-m-d");
        $validade = $json["validade"];
        if (strtotime($validade) >= strtotime($hoje)) {
            $a = array();
            return $json["arduino"];
        } else {
            $a = array();
            $a["cod"] = 0;
            return 0;
        }
    } else {
        return 0;
    }
}

if (!empty($_GET["inicio"]) and !empty($_GET["fim"]) and !empty($_GET["token"]) ){
//setando variaveis de configuração
$inicio=$_GET['inicio'];
$fim=$_GET['fim'];
$token=$_GET["token"];
 $output = valida_token($token);
 if ($output == 0) {
    
     echo "<script>window.close();</script>";
        
    } else {
        
        //processo de configuração do banco de dados...
$ip="localhost";
$user="id17157107_root";
$pass="|nxFufp9F/ru6OXo";
$bd="id17157107_system";
$con=mysqli_connect($ip,$user,$pass,$bd);
$sql="SELECT * FROM full WHERE arduino=$output AND data BETWEEN '$inicio' AND '$fim'";
$res=mysqli_query($con,$sql);
    }



}else{

echo "Permissão NEGADA!";


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