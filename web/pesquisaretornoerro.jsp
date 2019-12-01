<!DOCTYPE html>
<!-- Projeto da disciplina Programacao WEB 
     UFABC - 3o quadrimestre 2019
     Desenvolvido por Erika Yahata
     Professor Francisco Isidro
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:useBean id="erroSTR" type="java.lang.String" scope="request" />

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
    <br/>
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
        </br>
        <div class="row">
            <div class="col-md-12">
                <div class="page-header">
                    <h2>${erroSTR}</h2>
                </div>
            </div>
        </div>
                                
        </br>
        <div class="row">
            <div class="col-md-1">
                <a href="./servletbuscaespecialidade">Nova Pesquisa</a>
            </div>
            <div class="col-md-2">
                <a href="./sair">Menu Principal</a>
            </div> 
        </div>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>