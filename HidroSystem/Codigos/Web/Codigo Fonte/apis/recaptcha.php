<?php
function recaptcha($response_captcha){
    $resposta = file_get_contents("https://www.google.com/recaptcha/api/siteverify?secret=6LewA5UcAAAAAMSxPCIORwKlAz7x4ISr-6FFxO3B&response=".$response_captcha."&remoteip=".$_SERVER['REMOTE_ADDR']);
    if ($resposta.success) {
    return true;
    } else {
    
    return false;
    }
    
    
}


?>