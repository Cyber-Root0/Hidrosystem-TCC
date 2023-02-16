<!DOCTYPE html>
<html>

<head>
    <title>HidroSystem | Cadastro</title>
    <link rel="stylesheet" href="css/cadastro.css">
    <script src='https://www.google.com/recaptcha/api.js'></script>
    <meta charset="utf-8">
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.2.2/jquery.form.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>

<body>
    <script>
        function sucess() {
            Swal.fire(
                'CADASTRADO',
                'Usuario Cadastrado Com Sucesso',
                'success'
            )
        }

        function error() {
            Swal.fire(
                'CADASTRO',
                'Cadastro Não Efetuado, tente novamente',
                'error'
            )
        }

        function sql(a) {
            Swal.fire(
                'Digite Outro ' + a,
                'Cadastro Não Efetuado, Já Existe um Cadastro Com Esse ' + a,
                'error'
            )
        }

        function recaptcha() {
            Swal.fire(
                'reCAPTCHA',
                'Realize o reCAPTCHA GOOGLE',
                'error'
            )
        }

        function campo() {
            Swal.fire(
                'CADASTRO',
                'Preencha todos os Campos',
                'error'
            )
        }
    </script>
    <div class="corpo">
        <center>
            <string id="string">Cadastro</string><br>
        </center>
        <div class="cadastro">
            <center>
                <form action="" method="POST" onsubmit="if (grecaptcha.getResponse() == ''){
                    alert('Você não clicou no reCAPTCHA, por favor, faça!')
                    return false;
                    }">
                    <input type="text" name="nome" placeholder="NOME:" required="true" maxlength="10"><br>
                    <input type="text" name="sobrenome" placeholder="SOBRENOME:" required="true" maxlength="30"><br>
                    <input type="email" name="email" placeholder="EMAIL:" required="true" maxlength="40"><br>
                    <input type="number" name="number" placeholder="Celular:" required="true" maxlength="5" onKeyPress="if(this.value.length==13) return false;"><br>
                    <input type="password" name="senha" required="true" id="input-password" placeholder="Insira Sua Senha" maxlength="15"><br>
                    <input type="number" name="id" placeholder="ID DO PRODUTO" required="true" onKeyPress="if(this.value.length==4) return false;"><br>
                    <div class="g-recaptcha" data-sitekey="6LewA5UcAAAAAPYrmzG7mDrpIbU0b6VaimGaGAIu"></div>
                    <input type="submit" value="Cadastrar">
                </form>
                <br>
                <string><a href="login.php">Já tem Cadastro? Faça Login</a></string><br>
            </center>
        </div>
    </div>

    <?php
    require 'email.php';
    require("apis/conecao.php");
    require_once('sendsms.php');
    include("apis/recaptcha.php");

    //função que envia os SMS 
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
    //processo de recebindo das informaçoes via POST e validação dos campos
    if (!empty($_POST['nome']) and !empty($_POST['sobrenome']) and !empty($_POST['email']) and !empty($_POST['number']) and !empty($_POST['senha']) and !empty($_POST['id']) and !empty($_POST['g-recaptcha-response'])) {
        //realizando a validação do reCAPTCHA GOOGLE 

        $status = recaptcha($captcha_data);
        if ($status == true) {

            // setando variaveis enviadas via Post 
            $nome = addslashes($_POST['nome']);
            $sobrenome = addslashes($_POST['sobrenome']);
            $email = addslashes($_POST['email']);
            $numero = addslashes($_POST['number']);
            $senha = addslashes($_POST['senha']);
            $arduino = addslashes($_POST['id']);



            //validando se Ja Existe esses dados no Banco De Dados
            $con = mysqli_connect($ip, $user, $pass, $bd);
            $sql = "SELECT * FROM user WHERE email='$email' or arduino='$arduino'";
            $resultado = mysqli_query($con, $sql);
            $linhas = mysqli_num_rows($resultado);
            if ($linhas > 0) {
                //fazendo a validação se foi o EMAIL ou o CODIGO encontrado...
                $array = mysqli_fetch_array($resultado);
                if ($array["arduino"] == $arduino) {
                    echo "<script>sql('ID');</script>";
                } else {
                    echo "<script>sql('EMAIL');</script>";
                }
            } else {
                // dados validados e cadastrando o Novo Usuario
                if (1 == 1) {

                    $sql = "INSERT INTO user(nome,sobrenome,email,senha,celular,arduino,token,token_status) VALUES('$nome','$sobrenome','$email','$senha','$numero',$arduino,'','')";
                    if (mysqli_query($con, $sql)) {
                        echo "<script>sucess();</script>";
                        $msg = "Bem vindo a Hidrosystem $nome" . "!\nFicamos Felizes por você se Cadastrar em Nosso Sistema!\nDúvidas ou Sugestões? Nos Envie uma Mensagem WhatsApp:\nhttps://wa.me/5518997479949";
                        EnviarSms($numero, $msg);

                        //configurando a Tabela do Banco de Dados
                        $sql = "INSERT INTO realtime(arduino,temperatura,ph,hora) VALUES($arduino,'0','0','00:00')";
                        mysqli_query($con, $sql);


                        // envio do Email de Boas Vindas
                        // Envio do Email
                        $body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>
<html xmlns='http://www.w3.org/1999/xhtml'>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
<title>Bem Vindo - HidroSystem</title>
<meta name='viewport' content='width=device-width, initial-scale=1.0'/>
</head>
<body style='margin: 0px; padding: 0px;'>
<table border='0' cellpadding='0' cellspacing='0' width='100%'>
    <tr style='height: 500px;'>
        <td align='center'>
            <h1 style='font-family: sans-serif; cursor: pointer;'>Bem Vindo(a) $nome :) a HidroSystem</h1>
            <img src='https://i.imgur.com/CTHFAbb.png'><br>
            <h1 style='font-family: sans-serif; cursor: pointer; color: green'>Seus Dados de Cadastro:</h1>
            <p style='font-family: sans-serif; cursor: pointer; font-size: 20px;'>Email: $email </p>
            <p style='font-family: sans-serif; cursor: pointer; font-size: 20px;'>Senha: $senha </p>
            <p style='font-family: sans-serif; cursor: pointer; font-size: 20px;'>ID Do Produto: $arduino </p>
            <button style='height: 70px; width: 200px; border-radius: 10px; background-color: rgb(0, 234, 0); border:none; cursor: pointer; color: white; font-size: 20px;'> <a href='https://api.whatsapp.com/send?phone=5518997479949&text=Ol%C3%A1.%20Seja%20bem%20Vindo!%20Aqui%20%C3%A9%20o%20Suporte%20da%20HidroSystem%2C%20em%20que%20podemos%20ajudar%3F'>
                <img src='https://imagepng.org/wp-content/uploads/2017/08/whatsapp-icone-1.png' style='height: 40px; width: 40px;'>
            </a> </button><br>
            <p style='font-family: sans-serif; cursor: pointer; font-size: 20px; color: red'>Dúvidas? Nos Comunique pelo WhatsApp </p>
        </td>
    </tr>
</table>
</body>
</html>";
                        $assunto = "Olá $nome, Bem Vindo(a) a HidroSystem";
                        SendEmail($email, $assunto, $body);
                    } else {
                        echo "<script>error();</script>";
                    }
                } else {
                }
            }
        } else {
            //recaptcha nao deu certo... entao vai exibir um alerta
            echo "<script>recaptcha();</script>";




        }
    } else {
       
    }



    ?>

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