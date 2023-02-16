


?>

<?php
//variaveis e Funcoes de Configurações e Inicialização do Sistema
// http://localhost/css/p2/apis/get/api.php?temperatura=31&arduino=9090&ph=13

date_default_timezone_set('America/Sao_Paulo');
$ip = "localhost";
$user = "id17157107_root";
$pass = "|nxFufp9F/ru6OXo";
$bd = "id17157107_system";
$con = mysqli_connect($ip, $user, $pass, $bd);
require 'email.php';

if (!empty($_GET['arduino']) and !empty($_GET['temperatura']) and !empty($_GET['ph']) and !empty($_GET['token'])) {
    //fazendo a validação do token...
    if ($_GET['token'] == "2345") {

        //setando variaveis fundamentais para usabilidade no sistema
        $arduino = $_GET['arduino'];
        $temperatura = $_GET['temperatura'];
        $ph = $_GET['ph'];

        //função que faz o processo de OUTPUT DO JSON
        json($arduino, $temperatura, $ph);

        //chamando as funçoes para Atribuir valores ao Banco de Dados
        RealTime($arduino, $temperatura, $ph);
        Diario($arduino, $temperatura, $ph);
        alls($arduino, $temperatura, $ph);
        //verificando valores da temperatura e ph pra ver se n estao elevados
        if ($temperatura < 18 or $temperatura > 24) {
            SendEmail("boteistem@gmail.com", "Temperatura Fora do Normal", "A Temperatura Atual é: $temperatura °C");
            if ($temperatura < 18) {
                $msg = "A Temperatura Abaixo da Media, " . $temperatura . "°C";
            }
            if ($temperatura > 24) {
                $msg = "Temperatura Acima da Media, " . $temperatura . "°C";
            }
            Alerta($msg, $arduino);
        }

        if ($ph < 3 or $ph > 6) {
            SendEmail("boteistem@gmail.com", "pH Fora do Normal", "O pH Atual é: $ph pH");
            if ($ph < 3) {
                $msg = "pH  Abaixo da Media, " . $ph . " pH";
            }
            if ($ph > 6) {
                $msg = "pH Acima da Media, " . $ph . "pH";
            }
            Alerta($msg, $arduino);
        }
    } else {



        header('Content-Type: application/json');
        $array = array();
        $array["Cod"] = 401;
        $array["Msg"] = "401 Unauthorized";
        echo json_encode($array, JSON_PRETTY_PRINT);
    }
} else {
    header('Content-Type: application/json');
    $array = array();
    $array["Cod"] = 401;
    $array["Msg"] = "401 Unauthorized";
    echo json_encode($array, JSON_PRETTY_PRINT);
}

function Alerta($mensagem, $arduino)
{
    //função para Jogar dados de Alerta no Banco de Dados
    $ip = "localhost";
    $user = "id17157107_root";
    $pass = "|nxFufp9F/ru6OXo";
    $bd = "id17157107_system";
    $con = mysqli_connect($ip, $user, $pass, $bd);
    $arduino = $arduino;
    $msg = $mensagem;
    $hora = date('H:i');
    $data = date("d/m");
    //Jogar no banco de dados os dados
    $sql = "INSERT INTO alerta(arduino,mensagem,hora,data) VALUES($arduino,'$msg','$hora','$data')";
    mysqli_query($con, $sql);
}

function json($id, $temp, $ph)
{
    header('Content-Type: application/json');
    //verificando se exite o ID no banco de dados
    $ip = "localhost";
    $user = "id17157107_root";
    $pass = "|nxFufp9F/ru6OXo";
    $bd = "id17157107_system";
    $con = mysqli_connect($ip, $user, $pass, $bd);
    $sql = "SELECT * FROM user WHERE arduino=$id";
    $output = mysqli_query($con, $sql);
    if (mysqli_num_rows($output) > 0) {
        $res = mysqli_fetch_array($output);
        $array = array();
        $dados = array();
        $account = array();
        $account["Nome"] = $res["nome"];
        $account["Email"] = $res["email"];
        $dados["Temperatura"] = $temp;
        $dados["Ph"] = $ph;
        $dados["Arduino"] = $id;
        $array["Cod"] = 200;
        $array["Status"] = "Data Found For This Account";
        $array["Msg"] = "Data Submitted Successfully";
        $array["Dados"] = $dados;
        $array["Account"] = $account;
        echo json_encode($array, JSON_PRETTY_PRINT);
    } else {
        $array = array();
        $array["cod"] = 404;
        $array["status"] = "No Data Found For This Account";
        $array["msg"] = "Data Submitted Successfully";
        $array["dados"] = $dados = array();
        $dados["temperatura"] = $temp;
        $dados["ph"] = $ph;
        $dados["arduino"] = $id;
        echo json_encode($array);
    }
}

function RealTime($id, $temp, $ph)
{
    //setando variaveis
    $ip = "localhost";
    $user = "id17157107_root";
    $pass = "|nxFufp9F/ru6OXo";
    $bd = "id17157107_system";
    $con = mysqli_connect($ip, $user, $pass, $bd);
    $id = $id;
    $temp = $temp;
    $ph = $ph;
    $hora = date('H:i');

    //atualizando valores ao Banco de Dados
    $sql = "UPDATE realtime SET temperatura='$temp',ph='$ph',hora='$hora' WHERE arduino='$id'";
    mysqli_query($con, $sql);
}

function Diario($id, $temp, $ph)
{
    //setando variaveis
    $ip = "localhost";
    $user = "id17157107_root";
    $pass = "|nxFufp9F/ru6OXo";
    $bd = "id17157107_system";
    $con = mysqli_connect($ip, $user, $pass, $bd);
    $id = $id;
    $temp = $temp;
    $ph = $ph;
    $hora = date('H:i');
    $dia = date('j');

    //validação para a Reinicialização da tabela 

    $validacao = "SELECT dia FROM diaria WHERE arduino='$id'";
    $res = mysqli_query($con, $validacao);
    $output = mysqli_fetch_array($res);
    $d = $output['dia'];

    if ($d == $dia) {

        $sql = "INSERT INTO diaria(arduino,hora,temperatura,ph,dia) VALUES ('$id','$hora',$temp,$ph,$dia)";
        mysqli_query($con, $sql);
    } else {
        $sql = "DELETE FROM diaria WHERE arduino='$id'";
        mysqli_query($con, $sql);
        $sql = "INSERT INTO diaria(arduino,hora,temperatura,ph,dia) VALUES ('$id','$hora',$temp,$ph,$dia)";
        mysqli_query($con, $sql);
    }
}

function alls($id, $temp, $ph)
{

    //setando variaveis essenciais para o Funcionamento do Sistema
    $ip = "localhost";
    $user = "id17157107_root";
    $pass = "|nxFufp9F/ru6OXo";
    $bd = "id17157107_system";
    $con = mysqli_connect($ip, $user, $pass, $bd);
    $data_atual = date("Y-m-d");
    $arduino = $id;
    $temp = $temp;
    $ph = $ph;

    // validacao pra ver se existe algum registro com essa Data
    $sql = "SELECT * FROM full WHERE arduino=$arduino and data='$data_atual'";
    $res = mysqli_query($con, $sql);
    $lines = mysqli_num_rows($res);

    if ($lines > 0) {


        $sql2 = "SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY temperatura";
        $res_temp = mysqli_query($con, $sql2);
        $output2 = mysqli_fetch_array($res_temp);
        $t_minima = $output2['temperatura'];

        //maxima da Temperatura
        $sql2 = "SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY temperatura DESC";
        $res_temp = mysqli_query($con, $sql2);
        $output2 = mysqli_fetch_array($res_temp);
        $t_maxima = $output2['temperatura'];

        //minima do PH
        $sql2 = "SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY ph";
        $res_temp = mysqli_query($con, $sql2);
        $output2 = mysqli_fetch_array($res_temp);
        $ph_minima = $output2['ph'];

        //maxima do PH
        $sql2 = "SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY ph DESC";
        $res_temp = mysqli_query($con, $sql2);
        $output2 = mysqli_fetch_array($res_temp);
        $ph_maxima = $output2['ph'];

        //atualização dos Dados na tabela
        $sql = "UPDATE full SET ph_minimo=$ph_minima,ph_maximo=$ph_maxima,temp_minima=$t_minima,temp_maxima=$t_maxima WHERE arduino=$arduino AND data='$data_atual'";
        mysqli_query($con, $sql);
    } else {

        $sql2 = "SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY temperatura";
        $res_temp = mysqli_query($con, $sql2);
        $output2 = mysqli_fetch_array($res_temp);
        $t_minima = $output2['temperatura'];

        //maxima da Temperatura
        $sql2 = "SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY temperatura DESC";
        $res_temp = mysqli_query($con, $sql2);
        $output2 = mysqli_fetch_array($res_temp);
        $t_maxima = $output2['temperatura'];

        //minima do PH
        $sql2 = "SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY ph";
        $res_temp = mysqli_query($con, $sql2);
        $output2 = mysqli_fetch_array($res_temp);
        $ph_minima = $output2['ph'];

        //maxima do PH
        $sql2 = "SELECT * FROM `diaria` WHERE arduino=$arduino ORDER BY ph DESC";
        $res_temp = mysqli_query($con, $sql2);
        $output2 = mysqli_fetch_array($res_temp);
        $ph_maxima = $output2['ph'];

        //Inserindo um novo registro na Tabela de Dados
        $sql = "INSERT INTO full(data,arduino,ph_minimo,ph_maximo,temp_minima,temp_maxima) VALUES ('$data_atual',$arduino,$ph_minima,$ph_maxima,$t_minima,$t_maxima)";
        mysqli_query($con, $sql);
    }
}


?>