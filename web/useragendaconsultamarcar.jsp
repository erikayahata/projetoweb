<!-- Projeto da disciplina Programacao WEB 
     UFABC - 3o quadrimestre 2019
     Desenvolvido por Erika Yahata
     Professor Francisco Isidro
-->
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:useBean id="ListaOpcao" type="java.util.List" scope="request"/>
<jsp:useBean id="Usuario" type="model.Usuario" scope="session"/>
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
                </br>
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
	<div class="row">
		<div class="col-md-12">
			<h3>
				Área do Usuário - Marcação de consulta
			</h3>
			<p>
				Escolha o horário de sua preferência e clique em Marcar.
			</p>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
                    <table class="table table-bordered table-hover table-sm" style="width:90%">
                        <thead>
                            <tr class="table-active">
                                <th>Escolha</th>
				<th>Data</th>
				<th>Horário</th>
				<th>Médico(a)</th>
                            </tr>
			</thead>
                        
                        <tbody>
                            <form role="form" action="marcarconsultas4" method="POST">
                                <div class="form-group">
                                    <c:forEach var="agenda" items="${ListaOpcao}">
                                        <tr>
                                            <td width="2%"><input type="radio" align="center" name="consulta" id="escolhe" value="${agenda.idagenda}"> </td>
                                            <td width="8%">${agenda.data}</td>
                                            <td width="5%">${agenda.horario}</td>
                                            <td width="75%">${agenda.medico}</td>
					</tr>
                                    </c:forEach>
                                        <input type="hidden" name="iduser" value="${Usuario.id}">
                        	</div>
                        </tbody>
                    </table>
                        	<br/>
                                <button type="submit" onclick="return valida();" class="btn btn-primary">
                                    Marcar
                        	</button>  
                                <p id="retorno"></p>
                            </form>
		</div>
	</div>
    </div>
<script language="javascript" >
function valida(){
    var escolha = document.getElementsByName('consulta'); 
    var x = false;
              
    for(i = 0; i < escolha.length; i++) { 
        if(escolha[i].checked){
          //  document.getElementById("retorno").innerHTML = "passou"; 
            x = true;
        } 
        else{
            document.getElementById("retorno").innerHTML = "Escolha uma data para consulta!";
        } 
    }
    return x;
}

</script>  

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>