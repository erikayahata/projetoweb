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
                    Área do Usuário - Consultas agendadas
		</h3>
                <p>
                    Acompanhe sua agenda de consultas.
                </p>
            </div>
	</div>
        
        <div class="row">
            <div class="col-md-10" id="tabela">

                    <table class="table table-bordered table-hover table-sm" style="width:90%">
                        <thead>
                            <tr class="table-active">
                                <th>Data</th>
                                <th>Horário</th>
                                <th>Especialidade</th>
                                <th>Médico(a)</th>
                                <th>Local</th>
                                <th>Opções</th>
                            </tr>
                        </thead>
                        <c:if test="${Lista.size() != 0}">
                        <tbody>
                            <c:forEach var="consulta" items="${Lista}">
                                <input type="hidden" name="consulta" value="${consulta.idagenda}">
                                <tr>
                                    <td id="data">${consulta.data}</td>
                                    <td id="horario">${consulta.horario}</td>
                                    <td id="especialidade">${consulta.especialidade}</td>
                                    <td id="medico">${consulta.medico}</td>
                                    <td id="unidade">${consulta.unidade}</td>
                                    <td><a href="./cancelaconsulta?iduser=${Usuario.id}&idagenda=${consulta.idagenda}">Cancelar</a>
                                        <!--<a href="./imprimeconsulta?iduser=${Usuario.id}&idagenda=${consulta.idagenda}">Imprimir</a> -->
                                        <!--<input type="button" value="Imprimir" id="imprime" onclick="CriaPDF()"/>-->
                                       <a href="#" value="Imprimir" id="imprime" onclick="CriaPDF('${Usuario.nome}','${consulta.data}','${consulta.horario}','${consulta.medico}','${consulta.especialidade}','${consulta.unidade}')">Imprimir</a> 
                                        <!--<a href="#" value="Imprimir" id="imprime" onclick="CriaPDF()">Imprimir</a> -->
                                    </td>
                                    
                                </tr>
                            </c:forEach>
                        </tbody>
                         </c:if>
                    </table>
                <c:if test="${Lista.size() == 0}">
                    Nenhuma consulta agendada
                 </c:if>   

            </div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
<script>
    function CriaPDF(nome,data,horario,medico,especialidade,unidade){
        var win = window.open('', '', 'height=700,width=700');
        win.document.write('<html><head>');
        win.document.write('<title>Confirmação de Consulta</title>');
        win.document.write('</head>');
        win.document.write('<body>');
        win.document.write('<div class="container-fluid"><div class="row">');
        win.document.write('<div class="col-md-1">');
        win.document.write('<img class="resize" height=80px width=80px; alt="Sistema de Saude logo" src="images/logo.png" align="center"></div>');
        win.document.write('<div class="col-md-9"><h3 class="text-primary" align="left">Sistema de Saúde</h3></div></div>');
        win.document.write('<div class="row"><h2>CONFIRMAÇÃO DE AGENDAMENTO</h2></div>');
        win.document.write('<div class="row">');
        win.document.write('<p> Paciente: ');
        win.document.write(nome);
        win.document.write('</p>');
        win.document.write('<p> Especialidade: ');
        win.document.write(especialidade);
        win.document.write('</p>');
        win.document.write('<p> Data: ');
        win.document.write(data);
        win.document.write('&nbsp;&nbsp;&nbsp;&nbsp;Horário: ');
        win.document.write(horario);       
        win.document.write('</p>');
        win.document.write('<p> Unidade: ');
        win.document.write(unidade);
        win.document.write('</p>');
        win.document.write('<p> Médico(a): ');
        win.document.write(medico);
        win.document.write('</p>');
        win.document.write('</br></br><p> Por favor, tente chegar com 30 minutos de antecedência ao horário da consulta marcada.</p>');
        win.document.write('<p> Traga sua carteirinha do SUS e um documento com foto.</p>');
        win.document.write('<p> Caso não seja possível comparecer à consulta, por favor, faça o cancelamento o mais breve possível.</p>');
        win.document.write('<p>Dessa forma, você contribui para que outros pacientes tenham a chance de realizar a consulta.</p>');
        win.document.write('</div>');
        win.document.write('</body></html>');
        win.document.close(); 
        win.print();
        return false;        
    }
    
</script>
</html>