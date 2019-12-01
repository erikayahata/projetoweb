<!-- Projeto da disciplina Programacao WEB 
     UFABC - 3o quadrimestre 2019
     Desenvolvido por Erika Yahata
     Professor Francisco Isidro
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:useBean id="Lista" type="java.util.List" scope="request"/>
<jsp:useBean id="Lista2" type="java.util.List" scope="request"/>

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
                    <h1>
			Pesquise uma especialidade ou unidade de atendimento 
                    </h1>
		</div>
            </div>
	</div>
        
        </br>
        <div class="row">
            <div class="col-md-12">
                <form role="form" action="pesquisaretorno?id=${lista.especialidade}?unidade=${lista2.unidade}" method="GET">
                    <!-- lista especialidade -->
                    <div class="form-group">
                        <select name="txtEspecialidade" id="espectype">
                            <option value="nulo">Especialidade</option>
                                <c:forEach var="especialidade" items="${Lista}">
                                    
                                 <!--   <a href="detalheProduto?id=${produto.id}">${produto.titulo}</a> -->
                                    <option value="${especialidade.especialidade}">${especialidade.especialidade}</option>
                                </c:forEach>
                        </select>
                    </div>
                   
                    <!-- lista unidade de atendimento -->
                    <div class="form-group">
                        <select name="txtUnidade" id="unidtype">
                            <option value="nulo">Unidade</option>
                            <c:forEach var="unidade" items="${Lista2}">
                                <option value="${unidade.unidade}">${unidade.unidade}</option>
                            </c:forEach> -->
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
        var comboNome = document.getElementById("espectype");
        var comboUnid = document.getElementById("unidtype");;
        if (comboNome.options[comboNome.selectedIndex].value === "nulo" && comboUnid.options[comboUnid.selectedIndex].value === "nulo"){
             //   alert("Selecione uma especialidade ou unidade");
                document.getElementById("retorno").innerHTML = "Selecione uma especialidade ou unidade ou ambas!";
                return false;
        }
    }
</script>


    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>