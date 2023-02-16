<?php

require_once 'src/PHPMailer.php';
require_once 'src/SMTP.php';
require_once 'src/Exception.php';

use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\SMTP;
use PHPMailer\PHPMailer\Exception;

function SendEmail($destino,$assunto,$mensagem){
$mail = new PHPMailer(true);

$destino=$destino;
$assunto=$assunto;
$mensagem=$mensagem;

    try {
    
        $mail->SMTPDebug = 0;                     
        $mail->isSMTP();
        $mail->SMTPAuth=true;
        $mail->SMTPSecure='tls';
        $mail->Host='tls://smtp.gmail.com';
        $mail->Username='hidrosystem.contato@gmail.com';
        $mail->Password='36251400Ab.';
        $mail->Port=587;
        $mail->setFrom('contatocomercialcyber@gmail.com','HidroSystem');
        $mail->addReplyTo('contatocomercialcyber@gmail.com','HidroSystem');
        $mail->addAddress($destino);
        $mail->IsHTML(true);
        $mail->CharSet='UTF-8';
        $mail->Subject=$assunto;
        $mail->Body=$mensagem;
        $envia=$mail->Send(); 
    

    } catch (Exception $e) {
        echo $e;
    
    }
}


?>
