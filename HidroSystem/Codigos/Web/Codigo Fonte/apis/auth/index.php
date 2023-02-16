<?php
    header('Content-Type: application/json');
//validação se existe informações sendo enviadas para a API , metodo POST('user' and 'pass')
if (isset($_POST['user']) && isset($_POST['pass']) && !empty($_POST['user']) && !empty($_POST['pass'])  ) {
    $user = addslashes($_POST['user']);
    $pass = addslashes($_POST['pass']);
    // verificando se Existe algum Usuario com as informações no Banco De Dados
    $ip = "localhost";
$u = "id17157107_root";
$p = "|nxFufp9F/ru6OXo";
$bd = "id17157107_system";
    if ($con = mysqli_connect($ip,$u,$p,$bd)) {
        $sql="SELECT * FROM user WHERE email='$user' and senha='$pass'";
        $output=mysqli_query($con,$sql);
        if(mysqli_num_rows($output)>0){
            $token = md5(uniqid(rand(), true));

            // se o Login Estiver correto e a Query for executada...
            $dados=mysqli_fetch_array($output);
            $j["cod"]=200;
            $j["msg"]="Logado Com Sucesso";
            $j["login"]="true";
            $info=array();
            $info["id"]=$dados["id"];
            $info["user"]=$dados["email"];
            $info["token"]=$token;
            $info["name"]=$dados["nome"];
            $j["info"]=$info;
            echo json_encode($j,JSON_PRETTY_PRINT);
            newtoken($token,$dados["email"],$dados["arduino"]);

        }else{
            // se os dados de login não conferem acontecera a seguinte ação
        $j=array();
        $j["cod"]=503;
        $j["msg"]="Autenticação Mal Sucedida";
	echo json_encode($j,JSON_PRETTY_PRINT);

        }

    } else {
        // se aconteceu problema com a comunicaçã com o banco de dados exibi um erro em json
        $j=array();
        $j["cod"]=503;
        $j["msg"]="O servidor está em manutenção ou não consegue dar conta dos processamentos de recursos devido à sobrecarga do sistema. Isto deve ser uma condição temporária.";
        $a=json_encode($j);
        echo $a;
    }
} else {
    
    // se os dados METODO POST n forem enviados
    $j = array();
    $j["cod"]=401;
    $j["msg"] = "Nao Autorizado";
    $a = json_encode($j,JSON_PRETTY_PRINT);
    echo $a;
}

function newtoken($token,$email,$arduino){
    date_default_timezone_set('america/sao_paulo');
   $data=date('Y-m-d', strtotime('+15 days'));

    //cadatramento do token gerado no banco De dados juntamente com a DATA de validade do MESMO
     $ip = "localhost";
    $u = "id17157107_root";
    $p = "|nxFufp9F/ru6OXo";
    $bd = "id17157107_system"; 
    //coneção com o banco e execução da query...
    $con=mysqli_connect($ip,$u,$p,$bd);
    $sql="INSERT INTO tokens(token,validade,email,arduino) VALUES('$token','$data','$email',$arduino)";
    mysqli_query($con,$sql);
}
?>
