<!DOCTYPE html>
<!-- Projeto da disciplina Programacao WEB 
     UFABC - 3o quadrimestre 2019
     Desenvolvido por Erika Yahata
     Professor Francisco Isidro
--> 
<jsp:useBean id="erroSTR" type="java.lang.String" scope="request"/>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Sistema de Saúde</title>

    <link href="css/style.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">

  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
                <div class="col-md-1">
                    <a href="./sair">
                        <img class="resize" alt="Sistema de Saude logo" src="images/logo.png" align="center">
                    </a>
                </div>
                <div class="col-md-11">
                        <br/>
                        <h3 class="text-primary" align="left">
				Sistema de Saúde
			</h3>
		</div> 
	</div>
        
        <div class="row">
            <div class="col-md-12">
                <h4 class="text-primary" id="h4error">
                    ERRO: ${erroSTR}
		</h4>
            </div>
	</div>
        
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>        
    </body>
</html>
