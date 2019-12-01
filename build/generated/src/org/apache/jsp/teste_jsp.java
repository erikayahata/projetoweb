package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class teste_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>Sistema de Saúde</title>\n");
      out.write("\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("        <br/>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <br/>\n");
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
      out.write("\t</div>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("              <form role=\"form\" action=\"pesquisaespecialidade\" method=\"POST\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                      <select name=\"cars\">\n");
      out.write("                          <option value=\"volvo\" name=\"txtNome\">xxxx</option>\n");
      out.write("                          <option value=\"saab\">Saab</option>\n");
      out.write("                          <option value=\"fiat\">Fiat</option>\n");
      out.write("                          <option value=\"audi\">Audi</option>\n");
      out.write("                      </select>\n");
      out.write("                      <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                          Pesquisar\n");
      out.write("                      </button>\n");
      out.write("\t\t</div>                   \n");
      out.write("               </form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
