<!-- Projeto da disciplina Programacao WEB 
     UFABC - 3o quadrimestre 2019
     Desenvolvido por Erika Yahata
     Professor Francisco Isidro
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:useBean id="Usuario" type="model.Usuario" scope="session"/>
<jsp:useBean id="ListaUnidade" type="java.util.List" scope="request"/>
<jsp:useBean id="Especialidade" type="java.lang.String" scope="request"/>

<html lang="en">
  <head>
    <meta charset="ISO-8859-1">
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
            <div class="col-md-1">
                <a href="./userarea">
                    <img class="resize" alt="Sistema de Saude logo" src="images/logo.png" align="center">
                </a>
            </div>
            <div class="col-md-9">
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
                    <p name="txtEspecialidade" value="${Especialidade}"> Especialidade: <strong> ${Especialidade}</strong></p>
                    <p>Escolha a Unidade</p>
                    <form role="form"  action="marcarconsultas3?txtEspecialidade=${Especialidade}" method="POST" >

                          <div class="form-group">
                                <select name="txtUnidade" id="unidtype">
                                  <option value="nulo">Unidade</option>
                                  <c:forEach var="unidade" items="${ListaUnidade}">
                                      <option value="${unidade.unidade}">${unidade.unidade}</option>
                                  </c:forEach>
                                </select>
                            </div>
                        
                                            <br/>
                        <button type="submit" onclick="return valida(this);" class="btn btn-primary">
                            Pesquisar
                        </button>
                        <p id="retorno"></p>
                                            
                    </form>
                </div>
        </div>
    </div>

<script language="javascript" >
    function valida(frm) {
        var comboNome = document.getElementById("unidtype");
        if (comboNome.options[comboNome.selectedIndex].value === "nulo" ){
             //   alert("Selecione uma especialidade");
                document.getElementById("retorno").innerHTML = "Escolha uma unidade!";
                return false;
        }
    }    
</script>                    

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>