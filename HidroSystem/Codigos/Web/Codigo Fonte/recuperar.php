<?php

include("apis/recaptcha.php");
function EnviarSms($numero, $message)
{
    $token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhZG1pbiIsImlhdCI6MTYzMjI2Nzk2MywiZXhwIjo0MTAyNDQ0ODAwLCJ1aWQiOjkwNTg5LCJyb2xlcyI6WyJST0xFX1VTRVIiXX0.K71hcHGCZiDgKB-aAjRgbCMC2cWjWgJFoZFwraDIW-I";
    $phone_number = $numero;
    $message = $message;
    $deviceID = 125761;
    $options = [];
    $smsGateway = new SmsGateway($token);
    $result = $smsGateway->sendMessageToNumber($phone_number, $message, $deviceID, $options);
    return $result;
}


?>

<html>

<head>
    <title>Hidrosystem | Redefinir Senha</title>
    <script src='https://www.google.com/recaptcha/api.js'></script>
    <meta charset="UTF-8">
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.2.2/jquery.form.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <style>
        .form-gap {
            padding-top: 70px;
        }

        body {
            background: url(https://hidrosystem1.000webhostapp.com/images/greenbg.png) no-repeat;
            background-size: cover;
        }

        input[type="submit"].btn:hover {
            background: none;
        }

        #botao:hover {
            background: none;
        }
    </style>


</head>

<body>
    <script>
        function sucess() {
            Swal.fire(
                'Recuperação',
                'Enviamos uma Mensagem para o Seu Email para Redefinição da Senha',
                'success'
            )
        }

        function error() {
            Swal.fire(
                'Recuperação',
                'Não Foi Encontrado Nenhum Dados Com Esse Endereço de Email',
                'error'
            )
        }

        function recaptcha() {
            Swal.fire(
                'reCAPTCHA',
                'reCAPTCHA Inválido! Tente Novamente.',
                'error'
            )
        }
    </script>

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <div class="form-gap"></div>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="text-center">
                            <h3><i class="fa fa-lock fa-4x"></i></h3>
                            <h2 class="text-center">Esqueceu sua Senha?</h2>
                            <p>Você Pode Redefinir a sua Senha Aqui.</p>
                            <div class="panel-body">
                                <form action="" role="form" class="form" method="post" onsubmit="if (grecaptcha.getResponse() == ''){
                                alert('Você não clicou no reCAPTCHA, por favor, faça!')
                                return false;
                                 }">
                                    <div class="form-group">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope color-blue"></i></span>
                                            <input id="email" name="email" placeholder="E-MAIL" class="form-control" type="email">
                                        </div>
                                    </div>
                                    <div class="g-recaptcha" data-sitekey="6LewA5UcAAAAAPYrmzG7mDrpIbU0b6VaimGaGAIu"></div><br>
                                    <div class="form-group">
                                        <input name="recover-submi" class="btn btn-lg btn-primary btn-block" value="Redefinir Senha" type="submit" style="background:rgb(0, 234, 0);" id="botao">
                                    </div>


                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <?php
    require 'email.php';
    require 'apis/conecao.php';
    require_once('sendsms.php');
    require_once("apis/recaptcha.php");
    if (!empty($_POST['email']) and !empty($_POST['g-recaptcha-response'])) {
       
        
        //fazendo a validação do recaptcha....
        $captcha_data=$_POST["g-recaptcha-response"];
        $status = recaptcha($captcha_data);
        if ($status == true) {

            //recebimento dos dados para envio de  Email
            $email = $_POST['email'];
            $sql = "SELECT nome,sobrenome,email,senha,celular FROM user WHERE email='$email'";
            $output = mysqli_query($con, $sql);
            if (mysqli_num_rows($output) > 0) {
                $dados = mysqli_fetch_array($output, MYSQLI_ASSOC);
                //setando variaveis para Configuração do Email
                $nome = $dados["nome"];
                $sobrenome = $dados["sobrenome"];
                $email = $dados["email"];
                $senha = $dados["senha"];
                $celular = $dados["celular"];

                // Configurando Token para ser recebido no email
                $token = md5(uniqid());
                $status = "true";
                $update = "UPDATE user SET token='$token',token_status='$status' WHERE email='$email'";
                mysqli_query($con, $update);

                // Envio de dados para o Email

                $body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>
<html xmlns='http://www.w3.org/1999/xhtml'>
 <head>
  <meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
  <title>Mudar Senha - HidroSystem</title>
  <meta name='viewport' content='width=device-width, initial-scale=1.0'/>
</head>
<body style='margin: 0px; padding: 0px;'>
	<table border='0' cellpadding='0' cellspacing='0' width='100%'>
		<tr style='height: 500px;'>
			<td align='center'>
				<img src='https://i.imgur.com/CTHFAbb.png'>
				<h1 style='font-family: sans-serif; cursor: pointer;'>Troca de Senha - HidroSystem</h1>
				<button style='height: 70px; width: 200px; border-radius: 10px; background-color: rgb(0, 234, 0); border:none; cursor: pointer; color: white; font-size: 20px;'  > <a href='https://hidrosystem1.000webhostapp.com/password.php?token=$token' style='text-decoration: none; color: white;'>Mudar Senha</a> </button><br>
				<h1 style='font-family: sans-serif; cursor: pointer;'>Contato: - (18)99747-9949</h1>
			</td>
		</tr>
	</table>
</body>
</html>";
                $assunto = "Olá $nome :) - Redefinição de Senha da sua Conta HidroSystem";
                SendEmail($email, $assunto, $body);

                //preparo para o envio de SMS para a recuperação da senha....
                $a = "https://hidrosystem1.000webhostapp.com/password.php?token=$token";
                $link = bitly($a);
                $msg = "Olá, Acesse O link Abaixo para a Redefinição da sua conta Hidrosystem:\n" . "$link";
                EnviarSms($celular, $msg);

                //mensagem de Sucesso de Envio para o usuario
                echo "<script>sucess();</script";
            } else {
                echo "<script>error();</script";
            }
        } else {
            echo "<script>recaptcha();</script";

        }
    }

    function bitly($link)
    {

        $long_url = $link;
        $apiv4 = 'https://api-ssl.bitly.com/v4/bitlinks';
        $genericAccessToken = '7d4bd69816089b7d7941a59291b38c149e37bfd2';

        $data = array(
            'long_url' => $long_url
        );
        $payload = json_encode($data);

        $header = array(
            'Authorization: Bearer ' . $genericAccessToken,
            'Content-Type: application/json',
            'Content-Length: ' . strlen($payload)
        );

        $ch = curl_init($apiv4);
        curl_setopt($ch, CURLOPT_CUSTOMREQUEST, "POST");
        curl_setopt($ch, CURLOPT_POSTFIELDS, $payload);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
        curl_setopt($ch, CURLOPT_HTTPHEADER, $header);
        $result = curl_exec($ch);
        $resultToJson = json_decode($result);

        if (isset($resultToJson->link)) {
            return $resultToJson->link;
        } else {
            echo 'Not found';
        }
    }


    ?>




</body>




</html>