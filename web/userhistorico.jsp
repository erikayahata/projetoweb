<!-- Projeto da disciplina Programacao WEB 
     UFABC - 3o quadrimestre 2019
     Desenvolvido por Erika Yahata
     Professor Francisco Isidro
-->
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:useBean id="Lista" type="java.util.List" scope="request"/>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Sistema de saúde</title>

    <link href="css/style.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">

  </head>
  <body>
    <div class="container-fluid">
        <br/>
        <div class="row">
            <div class="col-md-1">
                <a href="./userarea">
                    <img class="resize" alt="Sistema de Saude logo" src="images/logo.png" align="center">
                </a>
            </div>
            <div class="col-md-9">
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
            <div class="col-md-1">

                <img class="resize" alt="Sistema de Saude logo" src="images/raiox2.png" align="right"> 
                <p align="right">
                    Olá, ${Usuario.nome}
                </p>
            </div>
	</div>
    </div>
    
    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<h3>
				Área do Usuário - Histórico de consultas
			</h3>
			<p>
				Acompanhe seu histórico de consultas
			</p>
		</div>
	</div>
	<!--<div class="row">
		<div class="col-md-4">
			<div class="dropdown">
				 
				<button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown">
					Ano
				</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					 <a class="dropdown-item disabled" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="dropdown">
				 
				<button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown">
					Mês
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
	</div> -->
        <br/>
        <div class="row">
            <div class="col-md-11">
                    <table class="table table-bordered table-hover table-sm" style="width:100%">
                        <thead>
                            <tr class="table-active">
                                <th>Data</th>
                                <th>Horário</th>
                                <th>Especialidade</th>
                                <th>Médico(a)</th>
                                <th>Local</th>
                                <th>Status</th>
                            </tr>
                        </thead>
                        
                        <c:if test="${Lista.size() != 0}">
                        <tbody>
                                <c:forEach var="consulta" items="${Lista}">
                                <tr>
                                    <td>${consulta.data}</td>
                                    <td>${consulta.horario}</td>
                                    <td>${consulta.especialidade}</td>
                                    <td>${consulta.medico}</td>
                                    <td>${consulta.unidade}</td>
                                    <td>${consulta.status}</td>
                                </tr>
                                </c:forEach>

                        </tbody>
                        </c:if>
                    </table>
                <c:if test="${Lista.size() == 0}">
                    Sem histórico
                 </c:if>    
            </div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>