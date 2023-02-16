<?php
header('Content-Type: application/json');
if(!empty($_POST["token"])){
    $token=$_POST["token"];
    //processo de validação do token....
    $output=valida_token($token);
    if($output==0){
        $api=array();
        $api["cod"]=400;
        $api["msg"]="Token Invalido ou Inexistente";
        echo json_encode($api,JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
        
    }else{
        alerta($output);
       
        
    }
    
    
}else{
   $api=array();
   $api["cod"]=400;
   $api["msg"]="Não Autorizado";
    echo json_encode($api,JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
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
        $a=array();
        return $json["arduino"];
       
    
        
    }else{
         $a=array();
        $a["cod"]=0;
        return 0;
       
    }
    
}else{
     return 0;
}
    
}

function alerta($cod){
//processo de coneção com o banco de dados e fazer um WHERE:
$ip = "localhost";
$u = "id17157107_root";
$p = "|nxFufp9F/ru6OXo";
$bd = "id17157107_system";
$con=mysqli_connect($ip,$u,$p,$bd);
$sql="SELECT * FROM alerta WHERE arduino=$cod";
$out=mysqli_query($con,$sql);  
    if(mysqli_num_rows($out)>0){
        
        while($linha=mysqli_fetch_array($out,MYSQLI_ASSOC)){
          $api[]=$linha;
        
        }
        $json=array();
        $json["cod"]=200;
        $json["info"]=$api;
        echo json_encode($json,JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
        
    }else{
        $json=array();
        $json["cod"]=404;
        echo json_encode($json,JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
    }
    
    
}


?>