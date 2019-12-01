<!-- Projeto da disciplina Programacao WEB 
     UFABC - 3o quadrimestre 2019
     Desenvolvido por Erika Yahata
     Professor Francisco Isidro
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:useBean id="Usuario" type="model.Usuario" scope="session"/>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Sistema de Saúde</title>

    <link href="css/style.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">

<style>
.container {
  position: relative;
  text-align: center;
  color: black;
  margin-left:2px;
  margin-right:10px;
  padding-right:15px;
  padding-left:15px
}

.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
 }
 
.lateral {
    margin-left:15px;
    margin-right:20px;
 }
</style>
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
                           &nbsp;&nbsp; Área do Usuário 

                    </h3>
		<!--	<p>
				Aqui você pode gerenciar seus agendamento, ver seu histórico e resultado de exames.
			</p>  -->
		</div>
	</div>
        
 	<div class="container">
                <img src="images/userarea3.png" alt="Foto" style="width:120%;">
                <div class="centered" style="font-family:verdana;"><b>Bem vindo!<br>Aqui você pode marcar consultas, gerenciar seus agendamentos, ver seu histórico e resultados de exames.</b></div>
	</div>
              
    </div>
        
        

  <!--      <div class="row">
            <div class="col-md-12">
              <div class="alert alert-success alert-dismissable">
                  <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                      Fechar
                  </button>
                  <h4>
                      Atenção"
                  </h4> <strong>Consulta!</strong> Você tem uma consulta para o dia xxxx. <a href="#" class="alert-link">Cancele se não for comparecer.</a>
              </div> 
          </div>
        </div> -->
                    
</br>
    <div class="container-fluid">
        <div class="lateral">
        <div class="row">
            <div class="col-md-3">
                <h2>
                   Agendamento de consultas
                </h2>
                <p>
                    Agora você pode marcar suas consultas sem sair de casa!<br> É só escolher a especialidade e a unidade desejada e verificar os horários disponíveis.

                </p>
                <p>
                        <!-- chamar o servlet buscaespecialidade para trazer a lista e preencher os botoes dropdown -->
                        <a href="./marcarconsulta">Quero agendar uma consulta »</a>
                </p>
            </div>
        
            <div class="col-md-3">
                <h2>
                    Cancelamento de consultas
                </h2>
                <p>
                    Se você agendou alguma consulta e não poderá comparecer, cancele seu agendamento o mais rápido possível!
                    Assim, você dá chances para outra pessoa se consultar! 

                </p>
                <p>
                        <!-- chamar o servlet buscaespecialidade para trazer a lista e preencher os botoes dropdown -->
                        <a href="./gerenciaragenda?iduser=${Usuario.id}">Quero cancelar uma consulta »</a>
                </p>
            </div>
                
            <div class="col-md-3">
                <h2>
                    Histórico <br>de consultas
                </h2>
                <p>
                    Não lembra quando foi a última vez que foi ao médico? 
                    Agora você pode consultar todo seu histórico e verificar as datas, especialidades, nomes dos médicos e unidades que passou.
                </p>
                <p>
                        <!-- chamar o servlet buscaespecialidade para trazer a lista e preencher os botoes dropdown -->
                        <a href="./historicoconsulta?iduser=${Usuario.id}">Quero ver o meu histórico »</a>
                </p>
            </div>
        </div>
        </div>
    </div>


    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>