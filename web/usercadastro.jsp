<!-- Projeto da disciplina Programacao WEB 
     UFABC - 3o quadrimestre 2019
     Desenvolvido por Erika Yahata
     Professor Francisco Isidro
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/scripts.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Sistema de Saúde</title>

        <link href="css/style.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <script type="text/javascript">
            function buscaEndereco() {
                var cep = document.getElementById("cep").value;
                var xmlhttp = new XMLHttpRequest();
                var url = "http://cep.republicavirtual.com.br/web_cep.php?cep="+  cep + "&formato=json";
                xmlhttp.onreadystatechange = function () {
                    if (xmlhttp.status === 200) {
                        if (xmlhttp.readyState === 4) {
                            var endereco = JSON.parse(xmlhttp.responseText);
                            if (endereco.resultado == "1") {
                                document.getElementById("tipo").value = endereco.tipo_logradouro;
                                document.getElementById("logradouro").value = endereco.logradouro;
                                document.getElementById("bairro").value = endereco.bairro;
                                document.getElementById("cidade").value = endereco.cidade;
                                document.getElementById("estado").value = endereco.uf;
                            } else {
                                alert("Endereco nao encontrado pelo CEP informado");
                            }
                        }
                    }
                };
                xmlhttp.open("GET", url, true);
                xmlhttp.send();

            }
        </script>  
    </head>
      
    <body>
        <br/>
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
            <div class="row">
		<div class="col-md-1">
		</div>
		<div class="col-md-9">
                    <h3>Cadastro de novo usuário</h3>
			<form role="form" action="efetivacadastro" method="POST">
				<div class="form-group">
					<label for="exampleNome">
						Nome
					</label>
					<input type="text" class="form-control" id="exampleNome" name="txtNome">
                                </div>    
				<div class="form-group">
					<label for="exampleSobrenome">
						Sobrenome
					</label>
					<input type="text" class="form-control" id="exampleSobrenome" name="txtSobrenome">
                                </div>                             
				<div class="form-group">
					<label for="exampleCpf">
						CPF
					</label>
					<input type="text" class="form-control" id="exampleCpf" name="txtCpf">
                                </div>                               
				<div class="form-group">                                        
					<label for="exampleInputEmail1">
						Seu Email
					</label>
					<input type="email" class="form-control" id="exampleInputEmail1" name="txtEmail">
				</div>
				<div class="form-group">
					 
					<label for="exampleInputPassword1">
						Sua Senha
					</label>
					<input type="password" class="form-control" id="exampleInputPassword1" name="txtSenha">
				</div>

                        <div class="form-group">
                            <label for="cep">
                                Digite o CEP
                            </label>
                            <input type="text" class="form-control" id="cep" name="txtCep" onblur="buscaEndereco();"/>                            
                        </div>

                        <div class="form-group">
                            <label for="tipo">
                                Tipo do Logradouro
                            </label>
                            <input type="text" readonly="true" class="form-control" id="tipo" name="txtTipo" />
                        </div>
                        <div class="form-group">
                            <label for="logradouro">
                                Logradouro
                            </label>
                            <input type="text" readonly="true" class="form-control" id="logradouro" name="txtLogradouro" />
                        </div>
                        <div class="form-group">
                            <label for="numero">
                                Numero
                            </label>
                            <input type="text" class="form-control" id="numero" name="txtNumero" />
                        </div>
                        <div class="form-group">
                            <label for="complemento">
                                Complemento
                            </label>
                            <input type="text" class="form-control" id="complemento" name="txtComplemento" />
                        </div>
                        <div class="form-group">
                            <label for="bairro">
                                Bairro
                            </label>
                            <input type="text" readonly="true" class="form-control" id="bairro" name="txtBairro" />
                        </div>
                        <div class="form-group">
                            <label for="cidade">
                                Cidade
                            </label>
                            <input type="text" readonly="true"  class="form-control" id="cidade" name="txtCidade" />
                        </div>
                        <div class="form-group">
                            <label for="estado">
                                Estado
                            </label>
                            <input type="text" readonly="true" class="form-control" id="estado" name="txtEstado" />
                        </div>
				
				<button type="submit" class="btn btn-primary">
					Cadastrar
                                </button>
			</form>
		</div>
		<div class="col-md-2">
		</div>
	</div>
</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>