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
        <br/><br/><br/><br/>
	<div class="row">
                 <div class="col-md-4"></div>
                <div class="col-md-1">
                    <a href="./sair">
                        <img class="resize" alt="Sistema de Saude logo" src="images/logo.png" align="center">
                    </a>
                </div>
                <div class="col-md-3">
                        <br/>
                        <h3 class="text-primary" align="left">
				Sistema de Saúde
			</h3>
		</div> 
                 <div class="col-md-4"></div>
	</div>
        </br></br>
	<div class="row">
            <div class="col-md-4"></div>
            
            <div class="col-md-4">
		<h3>
                    Acesse sua conta do Portal da Saúde
		</h3>
            </div>
            
            <div class="col-md-4"></div>
	</div>
        </br>
	<div class="row">
            <div class="col-md-4"></div>
		<div class="col-md-4">
			<form role="form" action="servletautentica" method="POST"><!chamando o servlet de servletlogin>
				<div class="form-group">
					 
					<label for="exampleInputEmail1">
						Digite seu usuário
					</label>
					<input type="text" class="form-control" id="exampleInputEmail1" name="txtEmail"> <!estes names serao usados no servlet>
				</div>
				<div class="form-group">
					 
					<label for="exampleInputPassword1">
						Digite sua senha
					</label>
					<input type="password" class="form-control" id="exampleInputPassword1" name="txtSenha">
                                <br/>
				<button type="submit" class="btn btn-primary">
					Enviar
				</button>
                                        <p>
                                            N&atildeo tem cadastro? Clique <a href="novousuario">AQUI</a>
                                        </p>
			</form>
		</div>
	</div>
        <div class="col-md-4"></div>
    </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>
