package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>Sistema de Saúde</title>\n");
      out.write("    \n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("                <div class=\"col-md-1\">\n");
      out.write("                    <img class=\"resize\" alt=\"Sistema de Saude logo\" src=\"images/logo.png\" align=\"center\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-11\">\n");
      out.write("                        <br/>\n");
      out.write("                        <h3 class=\"text-primary\" align=\"left\">\n");
      out.write("\t\t\t\tSistema de Saúde\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t</div> \n");
      out.write("            \t<div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("\t\t\t<div class=\"carousel slide\" id=\"carousel-793235\">\n");
      out.write("\t\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t\t<li data-slide-to=\"0\" data-target=\"#carousel-793235\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li data-slide-to=\"1\" data-target=\"#carousel-793235\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li data-slide-to=\"2\" data-target=\"#carousel-793235\" class=\"active\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ol>\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\" >\n");
      out.write("\t\t\t\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t\t<img class=\"d-block w-100\" alt=\"Carousel Bootstrap First\" src=\"https://www.layoutit.com/img/sports-q-c-1600-500-1.jpg\">\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\t\t\tAgendamento Consciente\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tNão agende consultas que não possa comparecer. Há outras pessoas na fila necessitando da mesma consulta.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"carousel-item\" >\n");
      out.write("                                            <img class=\"d-block w-100\" alt=\"Carousel Bootstrap Second\" src=\"images/foto1.png\">\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("                                                    \t<h4>\n");
      out.write("\t\t\t\t\t\t\t\t<font color=\"black\"> Agendamento online </font>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("                                                            <br/>\n");
      out.write("\t\t\t\t\t\t\t\t<font color=\"black\">Evite filas. Faça seu agendamento online pelo portal da Saúde!  </font>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"carousel-item active\">\n");
      out.write("\t\t\t\t\t\t<img class=\"d-block w-100\" alt=\"Carousel Bootstrap Third\" src=\"https://www.layoutit.com/img/sports-q-c-1600-500-3.jpg\">\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\t\t\t<font color=\"red\">Medicamentos </font>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tSiga as instrucões do médico. Não faça uso de medicamento por conta própria.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div> <a class=\"carousel-control-prev\" href=\"#carousel-793235\" data-slide=\"prev\"><span class=\"carousel-control-prev-icon\"></span> <span class=\"sr-only\">Previous</span></a> <a class=\"carousel-control-next\" href=\"#carousel-793235\" data-slide=\"next\"><span class=\"carousel-control-next-icon\"></span> <span class=\"sr-only\">Next</span></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<h2>\n");
      out.write("\t\t\t\tPesquise uma unidade\n");
      out.write("\t\t\t</h2>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tPesquise uma unidade pela localização ou pela especialidade desejada.\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t<!--<a class=\"btn\" href=\"pesquisa.jsp\">Detalhes »</a>-->\n");
      out.write("                                <!--<a class=\"btn\" href=\"./servletpesquisa\">Detalhes »</a> -->\n");
      out.write("                                <!-- chamar o servlet buscaespecialidade para trazer a lista e preencher os botoes dropdown -->\n");
      out.write("                                <a class=\"btn\" href=\"./servletbuscaespecialidade\">Detalhes »</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<h2>\n");
      out.write("\t\t\t\tAgendamento online\n");
      out.write("\t\t\t</h2>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tRealize seu agendamento ou cancelamento de consultas.\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t<a class=\"btn\" href=\"./servletlogin\">Detalhes »</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t<h2>\n");
      out.write("\t\t\t\tConsulte seu histórico\n");
      out.write("\t\t\t</h2>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tConsulte seu histórico de consultas.\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t<a class=\"btn\" href=\"./servletlogin\">Detalhes »</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("\n");
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
