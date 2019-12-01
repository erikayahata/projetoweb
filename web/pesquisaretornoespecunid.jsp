<!-- Projeto da disciplina Programacao WEB 
     UFABC - 3o quadrimestre 2019
     Desenvolvido por Erika Yahata
     Professor Francisco Isidro
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:useBean id="ListaEspecUnid" type="java.util.List" scope="request"/>
<jsp:useBean id="Especialidade" type="model.Especialidade" scope="session"/>
<!DOCTYPE html>
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
        <br/>
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
        
        </br>
        <h2>Esta unidade atende a especialidade ${Especialidade.especialidade} pesquisada </h2>
        
        </br>
        <c:forEach var="unidade" items="${ListaEspecUnid}">
            <div class="row">
                <div class="col-md-8">
                    <h3> ${unidade.unidade} </h3>
                    <p> ${unidade.logradouro},${unidade.numero}</p>
                    <p> ${unidade.cidade} - ${unidade.estado}</p>
                    <p> CEP: ${unidade.cep}</p>
                </div>
            </div>
        </c:forEach>
        
        <div class="row">
            <div class="col-md-1">
                <a href="./servletbuscaespecialidade">Nova Pesquisa</a>
            </div>
            <div class="col-md-2">
                <a href="./sair">Menu Principal</a>
            </div> 
	</div>
                    
    </body>
</html>
