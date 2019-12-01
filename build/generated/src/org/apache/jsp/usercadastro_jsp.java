package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usercadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title>Sistema de Saúde</title>\n");
      out.write("\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function buscaEndereco() {\n");
      out.write("                var cep = document.getElementById(\"cep\").value;\n");
      out.write("                var xmlhttp = new XMLHttpRequest();\n");
      out.write("                var url = \"http://cep.republicavirtual.com.br/web_cep.php?cep=\"+  cep + \"&formato=json\";\n");
      out.write("                xmlhttp.onreadystatechange = function () {\n");
      out.write("                    if (xmlhttp.status === 200) {\n");
      out.write("                        if (xmlhttp.readyState === 4) {\n");
      out.write("                            var endereco = JSON.parse(xmlhttp.responseText);\n");
      out.write("                            if (endereco.resultado == \"1\") {\n");
      out.write("                                document.getElementById(\"tipo\").value = endereco.tipo_logradouro;\n");
      out.write("                                document.getElementById(\"logradouro\").value = endereco.logradouro;\n");
      out.write("                                document.getElementById(\"bairro\").value = endereco.bairro;\n");
      out.write("                                document.getElementById(\"cidade\").value = endereco.cidade;\n");
      out.write("                                document.getElementById(\"estado\").value = endereco.uf;\n");
      out.write("                            } else {\n");
      out.write("                                alert(\"Endereco nao encontrado pelo CEP informado\");\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xmlhttp.open(\"GET\", url, true);\n");
      out.write("                xmlhttp.send();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>  \n");
      out.write("    </head>\n");
      out.write("      \n");
      out.write("    <body>\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <br/>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-1\">\n");
      out.write("                        <img class=\"resize\" alt=\"Sistema de Saude logo\" src=\"images/logo.png\" align=\"center\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-11\">\n");
      out.write("                            <br/>\n");
      out.write("                            <h3 class=\"text-primary\" align=\"left\">\n");
      out.write("                                    Sistema de Saúde\n");
      out.write("                            </h3>\n");
      out.write("                    </div> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-1\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t<form role=\"form\" action=\"efetivacadastro\" method=\"POST\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"exampleNome\">\n");
      out.write("\t\t\t\t\t\tNome\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"exampleNome\" name=\"txtNome\">\n");
      out.write("                                </div>    \n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"exampleSobrenome\">\n");
      out.write("\t\t\t\t\t\tSobrenome\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"exampleSobrenome\" name=\"txtSobrenome\">\n");
      out.write("                                </div>                             \n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"exampleCpf\">\n");
      out.write("\t\t\t\t\t\tCPF\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"exampleCpf\" name=\"txtCpf\">\n");
      out.write("                                </div>                               \n");
      out.write("\t\t\t\t<div class=\"form-group\">                                        \n");
      out.write("\t\t\t\t\t<label for=\"exampleInputEmail1\">\n");
      out.write("\t\t\t\t\t\tSeu Email\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" name=\"txtEmail\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t\t<label for=\"exampleInputPassword1\">\n");
      out.write("\t\t\t\t\t\tSua Senha\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"txtSenha\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"cep\">\n");
      out.write("                                Digite o CEP\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"cep\" name=\"txtCep\" onblur=\"buscaEndereco();\"/>                            \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"tipo\">\n");
      out.write("                                Tipo do Logradouro\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" readonly=\"true\" class=\"form-control\" id=\"tipo\" name=\"txtTipo\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"logradouro\">\n");
      out.write("                                Logradouro\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" readonly=\"true\" class=\"form-control\" id=\"logradouro\" name=\"txtLogradouro\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"numero\">\n");
      out.write("                                Numero\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"numero\" name=\"txtNumero\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"complemento\">\n");
      out.write("                                Complemento\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"complemento\" name=\"txtComplemento\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"bairro\">\n");
      out.write("                                Bairro\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" readonly=\"true\" class=\"form-control\" id=\"bairro\" name=\"txtBairro\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"cidade\">\n");
      out.write("                                Cidade\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" readonly=\"true\"  class=\"form-control\" id=\"cidade\" name=\"txtCidade\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"estado\">\n");
      out.write("                                Estado\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" readonly=\"true\" class=\"form-control\" id=\"estado\" name=\"txtEstado\" />\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("\t\t\t\t\tCadastrar\n");
      out.write("                                </button>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
