<!DOCTYPE html>
<!-- Projeto da disciplina Programacao WEB 
     UFABC - 3o quadrimestre 2019
     Desenvolvido por Erika Yahata
     Professor Francisco Isidro
-->
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
        <br/>
	<div class="row">
                <a href="./userarea">
                    <img class="resize" alt="Sistema de Saude logo" src="images/logo.png" align="center">
                </a>
                <div class="col-md-11">
                        <br/>
                        <h3 class="text-primary" align="left">
				Sistema de Saúde
			</h3>
                        
                        <div class="row">
                    <div class="col-md-12">
                        <div class="btn-group" role="group">
                            <button class="btn btn-secondary" type="button">
                                <a href="./userarea">Principal</a>
                            </button> 
                            <button class="btn btn-secondary" type="button">
                                <a href="./marcarconsulta">Marcar Consulta</a>
                            </button> 
                            <button class="btn btn-secondary" type="button">
                                <a href="./gerenciaragenda?iduser=${Usuario.id}">Gerenciar Agenda</a>
                            </button> 
                            <button class="btn btn-secondary" type="button">
                                <a href="./resultadoexame?iduser=${Usuario.id}">Resultado de Exames</a>
                            </button> 
                            <button class="btn btn-secondary" type="button">
                                <a href="./historicoconsulta?iduser=${Usuario.id}">Histórico</a>
                            </button> 
                            <button class="btn btn-secondary" type="button">
                                <a href="./sair">Sair</a>
                            </button> 
                        </div>
                    </div>
                </div>
		</div> 
	</div>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<h3>
				Área do Usuário - Marcação de Consulta
			</h3>
			<p>
				Marque suas consultas
			</p>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<div class="dropdown">
				 
				<button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown">
					Especialidade
				</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					 <a class="dropdown-item disabled" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="dropdown">
				 
				<button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown">
					Localidade
				</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					 <a class="dropdown-item disabled" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			 
			<button type="button" class="btn btn-success">
				Pesquisar
			</button>
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>