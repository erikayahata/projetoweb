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
    <link rel="stylesheet" href="css/bootstrap.css" type="text/css"/>
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

            <div class="row">
                <div class="col-md-12">
                    <div class="carousel slide" id="carousel-793235">
			<ol class="carousel-indicators">
                            <li data-slide-to="0" data-target="#carousel-793235"></li>
                            <li data-slide-to="1" data-target="#carousel-793235"></li>
                            <li data-slide-to="2" data-target="#carousel-793235" class="active"></li>
			</ol>
			<div class="carousel-inner" >
                            <div class="carousel-item">
				<img alt="Carousel Bootstrap First" src="images/agendamento.png" width="100%">
                                    <div class="carousel-caption">
					<h3>
                                            <font color="black"> Agendamento Consciente </font>
					</h3>
                                        <p>
                                            <font color="black"> Não agende consultas que não possa comparecer. Há outras pessoas na fila necessitando da mesma consulta.</font>
					</p>
                                    </div>
                            </div>
                            <div class="carousel-item" >
                                <img class="d-block w-100" alt="Carousel Bootstrap Second" src="images/fila.png">
                                    <div class="carousel-caption">
                                        <h4>
                                            Agendamento online 
                                        </h4>
                                        <p>
                                            Evite filas. Faça seu agendamento online pelo portal da Saúde! 
                                        </p>
                                    </div>
                            </div>
                            <div class="carousel-item active">
                                <img class="d-block w-100" alt="Carousel Bootstrap Second" src="images/medicamento.png">
                                    <div class="carousel-caption">
                                        <h4>
                                            Medicamentos 
					</h4>
					<p>
                                            Siga as instrucões do médico. Não faça uso de medicamento por conta própria.
					</p>
                                    </div>
                            </div>
			</div> <a class="carousel-control-prev" href="#carousel-793235" data-slide="prev"><span class="carousel-control-prev-icon"></span> <span class="sr-only">Previous</span></a> <a class="carousel-control-next" href="#carousel-793235" data-slide="next"><span class="carousel-control-next-icon"></span> <span class="sr-only">Next</span></a>
                    </div>
                </div>
            </div>
	</div>
	<div class="row">
            <div class="col-md-4">
		<h2>
                    Pesquise uma unidade
		</h2>
		<p>
                    Pesquise uma unidade pela localização ou pela especialidade desejada.
		</p>
		<p>
                    <!-- chamar o servlet buscaespecialidade para trazer a lista e preencher os botoes dropdown -->
                    <a href="./servletbuscaespecialidade">Detalhes »</a>
		</p>
            </div>
            <div class="col-md-4">
                <h2>
                    Agendamento online
                </h2>
                <p>
                    Realize seu agendamento ou cancelamento de consultas.
                </p>
                <p>
                    <a href="./servletlogin">Detalhes »</a>
                </p>
            </div>
		<div class="col-md-4">
                    <h2>
			Consulte seu histórico
                    </h2>
                    <p>
			Consulte seu histórico de consultas.
                    </p>
                    <p>
			<a href="./servletlogin">Detalhes »</a>
                    </p>
		</div>
	</div>
        <div class="row">
            <div class="col-md-12">
                <p id="creditos" align="right"><font size="1"> Developed by Ey </font></p>
            </div>
        </div>
    </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>