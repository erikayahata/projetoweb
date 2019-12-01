<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:useBean id="ListaOpcao" type="java.util.List" scope="request"/>
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
                    <img class="resize" alt="Sistema de Saude logo" src="images/logo.png" align="center">
                </div>
                <div class="col-md-11">
                        <br/>
                        <h3 class="text-primary" align="left">
				Sistema de Saúde
			</h3>
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
        <br/>
	<div class="row">
		<div class="col-md-12">
                    <table class="table table-bordered table-hover table-sm">
                        <thead>
                            <tr>
                                <th>Escolha</th>
				<th>Data</th>
				<th>Horário</th>
				<th>Médico(a)</th>
                            </tr>
			</thead>
                        
                        <tbody>
                            <div class="row">
                                <div class="col-md-4">
                                    <form role="form"  action="marcarconsultas4" method="POST" >
                                        <div class="form-group">
                                            <c:forEach var="agenda" items="${ListaOpcao}">
                                                <tr>
                                                    <td><input type="radio" name="consulta" value="${agenda.idagenda}"> </td>
                                                    <td>${agenda.data}</td>
                                                    <td>${agenda.horario}</td>
                                                    <td>${agenda.medico}</td>
						</tr>
                                            </c:forEach>
                        		</div>
                        		<br/>
                                        <button type="submit" class="btn btn-primary">
                            			Marcar
                        		</button>   
                                    </form>
                		</div>
                            </div>
                        </tbody>
                    </table>
		</div>
	</div>
    </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>