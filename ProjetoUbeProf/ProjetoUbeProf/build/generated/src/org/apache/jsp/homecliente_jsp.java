package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homecliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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



    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpSession sessao = httpServletRequest.getSession();
    if (sessao.getAttribute("cliente") != null) {



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- SEO Meta Tags -->\n");
      out.write("        <meta name=\"description\" content=\"Your description\">\n");
      out.write("        <meta name=\"author\" content=\"Your name\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Webpage Title -->\n");
      out.write("        <title>Página Home do Cliente</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Styles -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/fontawesome-all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/csshomecliente.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!-- JavaScript Bundle with Popper -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"canonical\" href=\"https://www.wrappixel.com/templates/niceadmin-lite/\" />\n");
      out.write("        <!-- Favicon icon -->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"assets/images/favicon.png\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"dist/css/style.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Template Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"icon\" href=\"./assets/images/favicon.png\">\n");
      out.write("        <style>\n");
      out.write("            .card {\n");
      out.write("                box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);\n");
      out.write("                transition: 0.3s;\n");
      out.write("                margin-right: 20px;\n");
      out.write("                padding: 20px;\n");
      out.write("                width: 350px;\n");
      out.write("                box-shadow: 0 0 5px 0px #e2e2e2;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .card:hover {\n");
      out.write("                box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .card:after,\n");
      out.write("            .card:before {\n");
      out.write("                content: \"\";\n");
      out.write("                position: absolute;\n");
      out.write("                buttom: 0;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("                transform: transform 0.3s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .card:before {\n");
      out.write("                border-left: 1px solid black;\n");
      out.write("                border-right: 1px solid black;\n");
      out.write("                transform: scaleY(0);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .card:after {\n");
      out.write("                border-left: 1px solid black;\n");
      out.write("                border-right: 1px solid black;\n");
      out.write("                transform: scaleY(0);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .card:houver:before {\n");
      out.write("                transform: scaleY(1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .card:houver:after {\n");
      out.write("                transform: scaleY(1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .text-card {\n");
      out.write("                margin: 20px auto;\n");
      out.write("            }\n");
      out.write("      \n");
      out.write("            #divBusca{\n");
      out.write("                background-color:#fff;\n");
      out.write("                border:solid 1px;\n");
      out.write("                border-radius:15px;\n");
      out.write("                width:300px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            #txtBusca{\n");
      out.write("                float:left;\n");
      out.write("                background-color:transparent;\n");
      out.write("                padding-left:5px;\n");
      out.write("                font-style:italic;\n");
      out.write("                font-size:18px;\n");
      out.write("                border:none;\n");
      out.write("                height:32px;\n");
      out.write("                width:260px;\n");
      out.write("                margin-left: 2%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #btnBusca{\n");
      out.write("                margin-top: 5px;\n");
      out.write("                margin-right: 2%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav style=\"background-color: #212529!important;\" id=\"navbar\" class=\"navbar navbar-expand-lg fixed-top navbar-dark\" aria-label=\"Main navigation\">\n");
      out.write("            <div class=\"container\"> <a style=\"margin-left: 0%;\" class=\"navbar-brand logo-text\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("index.html\">UBEProf</a> <div style=\"margin-left: 30%;\" id=\"divBusca\">\n");
      out.write("                  \n");
      out.write("                    <input type=\"text\" id=\"txtBusca\" placeholder=\"Buscar Professores\"/>\n");
      out.write("                      <a href=\"cliente/buscacliente.jsp\" >\n");
      out.write("                    <img style=\"width: 7%;\" src=\"./assets/images/lupa.png\" id=\"btnBusca\" alt=\"Buscar\"/>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"navbar-toggler p-0 border-0\" type=\"button\" id=\"navbarSideCollapse\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button> <div class=\"navbar-collapse offcanvas-collapse\" id=\"navbarsExampleDefault\" >\n");
      out.write("                    <ul class=\"navbar-nav ms-auto navbar-nav-scroll\">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a style=\"color: #ffffff;\" class=\"nav-link dropdown-toggle\" id=\"dropdown01\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\">\n");
      out.write("                                Opções\n");
      out.write("                            </a> <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"CarregarCliente?idUsuario=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Seu Perfil</a></li>\n");
      out.write("                                <li><div class=\"dropdown-divider\"></div></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"LogoutCliente\">Sair</a></li>\n");
      out.write("                                <li><div class=\"dropdown-divider\"></div></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div> <!-- end of navbar-collapse -->\n");
      out.write("            </div> <!-- end of container -->\n");
      out.write("        </nav> <!-- end of navbar -->\n");
      out.write("        <!-- end of navigation -->\n");
      out.write("        <div style=\"position: absolute; top: 100px;\" class=\" row col-12\">\n");
      out.write("            <div class=\"py-5 d-flex align-items-center\">\n");
      out.write("                <div class=\"text-center mx-auto mb-5 pb-3\">\n");
      out.write("                    <h2 class=\"home_text text-card\">Os melhores professores da sua e de outras regiões!</h2>\n");
      out.write("                    <h1 class=\"display-4 text-uppercase text-black\">Professores</h1>\n");
      out.write("                    <h1 class=\" h3 fw-bold text-h1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"position: absolute; top: 400px;left: 150px;\" class=\"row col-12 d-flex \">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div> <!-- JavaScript Libraries -->\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("            <script src=\"./csscliente/libcliente/easing/easing.min.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"./csscliente/libcliente/waypoints/waypoints.min.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"./csscliente/libcliente/counterup/counterup.min.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"./csscliente/libcliente/owlcarousel/owl.carousel.min.js\" type=\"text/javascript\"></script> <!-- Template Javascript -->\n");
      out.write("            <script src=\"./js/script.js\"></script> <!-- Custom scripts -->\n");
      out.write("            <script src=\"./csscliente/jscliente/main.js\" type=\"text/javascript\"></script>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
 } else {
        ((HttpServletResponse) response).sendRedirect("./index.jsp");
    }

      out.write('\n');
      out.write('\n');
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("professor");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dadosprofessores}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div style=\" margin: 20px;\" class=\"card\">\n");
          out.write("                    <img class=\"img-fuid w-80\" src=\"./assets/images/team-1.jpg\" alt=\"Avatar\" style=\"width:100%\">\n");
          out.write("                    <div class=\"team-overlay w-100 h-100 position-absolute top-50 start-50 translate-middle d-flex align-items-center justify-content-center\">\n");
          out.write("                        <div class=\"d-flex align-items-center justify-content-start\">\n");
          out.write("                            <a class=\"btn btn-secondary\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/VisualizarProfessor?idUsuario=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${professor.idUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&idCliente=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idcliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Mais Infomações</a></div>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"bg-dark border-inner text-center \">\n");
          out.write("                        <h4 class=\"home_text text-card\"><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${professor.nomeUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></h4>\n");
          out.write("                        <p class=\"text-white font-cliente text-card\"></p>\n");
          out.write("                    </div>\n");
          out.write("                </div> ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
