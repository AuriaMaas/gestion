package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/styles.css\"/>\n");
      out.write("        <title>Login | Dyjamir</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br><br>\n");
      out.write("        <!--logo-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"valign-wrapper\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col s12 m12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-image\">\n");
      out.write("                                <img src=\"images/logo.jfif\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--formulario-->\n");
      out.write("            <div class=\"valign-wrapper\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <form action=\"Login\" method=\"POST\" class=\"col s11\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("                                <input id=\"icon_prefix\" type=\"text\" name=\"user\" class=\"validate\">\n");
      out.write("                                <label for=\"icon_prefix\">Usuario</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <i class=\"material-icons prefix\">lock</i>\n");
      out.write("                                <input id=\"icon_telephone\" type=\"password\" name=\"pwd\" class=\"validate\">\n");
      out.write("                                <label for=\"icon_telephone\">Contraseña</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <i class=\"material-icons right\">send</i>\n");
      out.write("                        <input id=\"icon_send\" type=\"submit\" class=\"btn waves-effect waves-green btn-large\">\n");
      out.write("                        <label for=\"icon_send\">Entrar</label>\n");
      out.write("                        \n");
      out.write("                        <div class=\"container\"> \n");
      out.write("                            ");

                                try{
                                    if((String)request.getSession().getAttribute("login")==null) {

                                    } else {
                                        out.println((String)request.getSession().getAttribute("login"));
                                    }
                                } catch(Exception e) {
                                    out.println("");
                                }
                            
      out.write("  \n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
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
