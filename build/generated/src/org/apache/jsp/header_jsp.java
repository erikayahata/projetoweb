package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-1\">\n");
      out.write("                <img class=\"resize\" alt=\"Sistema de Saude logo\" src=\"images/logo.png\" align=\"center\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <h3 class=\"text-primary\" align=\"left\">\n");
      out.write("                    Sistema de Saúde\n");
      out.write("                </h3>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"btn-group\" role=\"group\">\n");
      out.write("                            <button class=\"btn btn-secondary\" type=\"button\">\n");
      out.write("                                <a href=\"./userarea\">Principal</a>\n");
      out.write("                            </button> \n");
      out.write("                            <button class=\"btn btn-secondary\" type=\"button\">\n");
      out.write("                                <a href=\"./marcarconsulta\">Marcar Consulta</a>\n");
      out.write("                            </button> \n");
      out.write("                            <button class=\"btn btn-secondary\" type=\"button\">\n");
      out.write("                                <a href=\"./gerenciaragenda?iduser=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usuario.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Gerenciar Agenda</a>\n");
      out.write("                            </button> \n");
      out.write("                            <button class=\"btn btn-secondary\" type=\"button\">\n");
      out.write("                                <a href=\"./resultadoexame?iduser=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usuario.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Resultado de Exames</a>\n");
      out.write("                            </button> \n");
      out.write("                            <button class=\"btn btn-secondary\" type=\"button\">\n");
      out.write("                                <a href=\"./historicoconsulta?iduser=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usuario.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Histórico</a>\n");
      out.write("                            </button> \n");
      out.write("                            <button class=\"btn btn-secondary\" type=\"button\">\n");
      out.write("                                <a href=\"./sair\">Sair</a>\n");
      out.write("                            </button> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"col-md-1\">\n");
      out.write("\n");
      out.write("                <img class=\"resize\" alt=\"Sistema de Saude logo\" src=\"images/raiox2.png\" align=\"right\"> \n");
      out.write("                <p align=\"right\">\n");
      out.write("                    Olá, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usuario.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
