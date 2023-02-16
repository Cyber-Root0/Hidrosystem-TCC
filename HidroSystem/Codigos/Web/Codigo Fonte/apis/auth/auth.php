<?php
 header('Content-Type: application/json');
if(!empty($_POST["token"])){
   
    $token=$_POST["token"];
    $output=valida_token($token);
    
    
    
    
}else{
    $a=array();
    $a["cod"]=400;
    $a["msg"]="Não Autorizado";
    echo json_encode($a,JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
    
}


function valida_token($token){
//processo de coneção com o banco de dados e fazer um WHERE:
$ip = "localhost";
$u = "id17157107_root";
$p = "|nxFufp9F/ru6OXo";
$bd = "id17157107_system";
$con=mysqli_connect($ip,$u,$p,$bd);
$sql="SELECT * FROM tokens WHERE token='$token'";
$out=mysqli_query($con,$sql);
if(mysqli_num_rows($out)>0){
    $json=mysqli_fetch_array($out,MYSQLI_ASSOC);
    $hoje=date("Y-m-d");
    $validade=$json["validade"];
    if(strtotime($validade) >= strtotime($hoje)){
        $api=array();
        $api["cod"]=200;
        $api["login"]="true";
        $api["msg"]="Logado Com Sucesso!";
        echo json_encode($api,JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
    
        
    }else{
        $api=array();
        $api["cod"]=400;
        $api["login"]="false";
        $api["msg"]="Token Expirado!";
        echo json_encode($api,JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
       
    }
    
}else{
    $api=array();
        $api["cod"]=400;
        $api["login"]="false";
        $api["msg"]="Token Inválido";
        echo json_encode($api,JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
}


}

?>




