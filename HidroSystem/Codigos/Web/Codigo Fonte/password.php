<?php
if (!empty($_GET['token'])) {
	session_start();
	$_SESSION['token']=$_GET['token'];

}else{
echo "<script>document.location='404.html'</script>";

}

?>
<!DOCTYPE html>
<html>
<head>
	<title>HidroSystem - Alter Password</title>
	<meta charset="utf-8">
	<style>
    body{
    	padding: 0px;
    	margin: 0px;
    	background: url(https://image.freepik.com/vetores-gratis/estilo-abstrato-de-fundo-de-movimento-leve_23-2148344182.jpg) no-repeat;
    	background-size: cover;
    	position: relative;

    }

	input[type="text"]{
		margin-top: 5px;
		margin-bottom: 10px;
		height: 30px;
		width: 400px;
		font-size: 20px;

	}
	input[type="submit"]{
		height: 60px;
		width: 200px;
		border-radius: 10px;
		border: none;
		background-color: rgb(0, 234, 0);
		cursor: pointer;
		color: white;
		font-size: 20px;
		font-family: sans-serif;

	}
	h2{
		font-family: sans-serif;
		text-decoration: underline;
		color: white;
	}
	.conteudo{
		margin-top: 200px;
	}
	</style>
</head>
<body>
<center>
	<div class="conteudo">
		<form action="" method="POST">
		<h2> Coloque sua Nova Senha:</h2> <input type="text" name="newpass"><br>
		<input type="submit" value="Mudar Senha">
	</form>
	</div>
</center>
<?php

require 'apis/conecao.php';
if (!empty($_SESSION['token']) && !empty($_POST['newpass']) ) {
$token=$_SESSION['token'];
$newpass=$_POST['newpass'];

//validacao do token no banco de dados, juntamente com seu status....
$sql="SELECT token,token_status FROM user WHERE token='$token'";
$output=mysqli_query($con,$sql);
	if (mysqli_num_rows($output)>0){
		$dados=mysqli_fetch_array($output);
		$status=$dados['token_status'];
		if ($status=="true"){
			$update="UPDATE user SET token_status='false',senha='$newpass' WHERE token='$token'";
			mysqli_query($con,$update);
			echo "<script>alert('Senha Modificada com Sucesso')</script>";
			session_destroy();
			echo "<script>document.location='index.php'</script>";
		}else{
			echo "Esse Token é invalido, Ja Houve uma Troca de Senha com o Mesmo";
		}


	}else{
		echo "Esse Token é invalido";
	}	


}else{
	
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
