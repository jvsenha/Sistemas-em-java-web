package org.apache.jsp.cliente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buscacliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/cliente/../Svg.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pesquisa</title>\n");
      out.write("        \n");
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
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"../dist/css/style.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Template Stylesheet -->\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Favicon -->\n");
      out.write(" \n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/images/favicon.png\">\n");
      out.write("        <style>\n");
      out.write("             .botão1{\n");
      out.write("                position:  relative;\n");
      out.write("                left: 0%;\n");
      out.write("                margin-top: 0%;\n");
      out.write("                color: white;\n");
      out.write("                border-width: 2px;\n");
      out.write("                padding: 10px  9px;\n");
      out.write("                border: 1px solid rgba(14, 233, 81, 1);\n");
      out.write("               background-image: linear-gradient(to right, #1be75a , #11dbc0);\n");
      out.write("                box-shadow: 0px 0px  rgba(14, 233, 81, 1);\n");
      out.write("                border: 0px ;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 30%;\n");
      out.write("                height: 10%;\n");
      out.write("            }\n");
      out.write("            .estrelas input[type=radio] {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .estrelas label i.fa{\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .estrelas label i.fa:before {\n");
      out.write("                content:'\\f005';\n");
      out.write("                color: #FC0;\n");
      out.write("            }\n");
      out.write("            .estrelas input[type=radio]:checked ~ label i.fa:before {\n");
      out.write("                color: #CCC;\n");
      out.write("            }\n");
      out.write("            .text-card {\n");
      out.write("                margin: 20px auto;\n");
      out.write("            }\n");
      out.write("            .subtitulo{\n");
      out.write("                color: #666666;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size:20px;\n");
      out.write("                padding-right: 50%;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .avaliacao{\n");
      out.write("                position: absolute;\n");
      out.write("                bottom:  73%;\n");
      out.write("                margin-left: 450px;\n");
      out.write("            }\n");
      out.write("            .container1 {\n");
      out.write("                display: block;\n");
      out.write("                margin: 15px;\n");
      out.write("                position: relative;\n");
      out.write("                padding-left: 35px;\n");
      out.write("                margin-bottom: 12px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 22px;\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("                -moz-user-select: none;\n");
      out.write("                -ms-user-select: none;\n");
      out.write("                user-select: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Hide the browser's default checkbox */\n");
      out.write("            .container1 input {\n");
      out.write("                position: absolute;\n");
      out.write("                opacity: 0;\n");
      out.write("                cursor: pointer;\n");
      out.write("                height: 0;\n");
      out.write("                width: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Create a custom checkbox */\n");
      out.write("            .checkmark1 {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                height: 25px;\n");
      out.write("                width: 25px;\n");
      out.write("                background-color: #eee;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* On mouse-over, add a grey background color */\n");
      out.write("            .container1:hover input ~ .checkmark {\n");
      out.write("                background-color: #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* When the checkbox is checked, add a blue background */\n");
      out.write("            .container1 input:checked ~ .checkmark {\n");
      out.write("                background-color: rgba(14, 233, 81, 1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Create the checkmark/indicator (hidden when not checked) */\n");
      out.write("            .checkmark1:after {\n");
      out.write("                content: \"\";\n");
      out.write("                position: absolute;\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Show the checkmark when checked */\n");
      out.write("            .container1 input:checked ~ .checkmark:after {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the checkmark/indicator */\n");
      out.write("            .container1 .checkmark:after {\n");
      out.write("                left: 9px;\n");
      out.write("                top: 5px;\n");
      out.write("                width: 5px;\n");
      out.write("                height: 10px;\n");
      out.write("                border: solid white;\n");
      out.write("                border-width: 0 3px 3px 0;\n");
      out.write("                -webkit-transform: rotate(45deg);\n");
      out.write("                -ms-transform: rotate(45deg);\n");
      out.write("                transform: rotate(45deg);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <svg xmlns=\"http://www.w3.org/2000/svg\" style=\"display: none;\">\n");
      out.write("    <symbol id=\"bootstrap\" viewBox=\"0 0 118 94\">\n");
      out.write("        <title>Bootstrap</title>\n");
      out.write("        <path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M24.509 0c-6.733 0-11.715 5.893-11.492 12.284.214 6.14-.064 14.092-2.066 20.577C8.943 39.365 5.547 43.485 0 44.014v5.972c5.547.529 8.943 4.649 10.951 11.153 2.002 6.485 2.28 14.437 2.066 20.577C12.794 88.106 17.776 94 24.51 94H93.5c6.733 0 11.714-5.893 11.491-12.284-.214-6.14.064-14.092 2.066-20.577 2.009-6.504 5.396-10.624 10.943-11.153v-5.972c-5.547-.529-8.934-4.649-10.943-11.153-2.002-6.484-2.28-14.437-2.066-20.577C105.214 5.894 100.233 0 93.5 0H24.508zM80 57.863C80 66.663 73.436 72 62.543 72H44a2 2 0 01-2-2V24a2 2 0 012-2h18.437c9.083 0 15.044 4.92 15.044 12.474 0 5.302-4.01 10.049-9.119 10.88v.277C75.317 46.394 80 51.21 80 57.863zM60.521 28.34H49.948v14.934h8.905c6.884 0 10.68-2.772 10.68-7.727 0-4.643-3.264-7.207-9.012-7.207zM49.948 49.2v16.458H60.91c7.167 0 10.964-2.876 10.964-8.281 0-5.406-3.903-8.178-11.425-8.178H49.948z\"></path>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"home\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M8.354 1.146a.5.5 0 0 0-.708 0l-6 6A.5.5 0 0 0 1.5 7.5v7a.5.5 0 0 0 .5.5h4.5a.5.5 0 0 0 .5-.5v-4h2v4a.5.5 0 0 0 .5.5H14a.5.5 0 0 0 .5-.5v-7a.5.5 0 0 0-.146-.354L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.354 1.146zM2.5 14V7.707l5.5-5.5 5.5 5.5V14H10v-4a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5v4H2.5z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"speedometer2\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M8 4a.5.5 0 0 1 .5.5V6a.5.5 0 0 1-1 0V4.5A.5.5 0 0 1 8 4zM3.732 5.732a.5.5 0 0 1 .707 0l.915.914a.5.5 0 1 1-.708.708l-.914-.915a.5.5 0 0 1 0-.707zM2 10a.5.5 0 0 1 .5-.5h1.586a.5.5 0 0 1 0 1H2.5A.5.5 0 0 1 2 10zm9.5 0a.5.5 0 0 1 .5-.5h1.5a.5.5 0 0 1 0 1H12a.5.5 0 0 1-.5-.5zm.754-4.246a.389.389 0 0 0-.527-.02L7.547 9.31a.91.91 0 1 0 1.302 1.258l3.434-4.297a.389.389 0 0 0-.029-.518z\"/>\n");
      out.write("        <path fill-rule=\"evenodd\" d=\"M0 10a8 8 0 1 1 15.547 2.661c-.442 1.253-1.845 1.602-2.932 1.25C11.309 13.488 9.475 13 8 13c-1.474 0-3.31.488-4.615.911-1.087.352-2.49.003-2.932-1.25A7.988 7.988 0 0 1 0 10zm8-7a7 7 0 0 0-6.603 9.329c.203.575.923.876 1.68.63C4.397 12.533 6.358 12 8 12s3.604.532 4.923.96c.757.245 1.477-.056 1.68-.631A7 7 0 0 0 8 3z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"table\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M0 2a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V2zm15 2h-4v3h4V4zm0 4h-4v3h4V8zm0 4h-4v3h3a1 1 0 0 0 1-1v-2zm-5 3v-3H6v3h4zm-5 0v-3H1v2a1 1 0 0 0 1 1h3zm-4-4h4V8H1v3zm0-4h4V4H1v3zm5-3v3h4V4H6zm4 4H6v3h4V8z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"people-circle\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z\"/>\n");
      out.write("        <path fill-rule=\"evenodd\" d=\"M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"grid\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M1 2.5A1.5 1.5 0 0 1 2.5 1h3A1.5 1.5 0 0 1 7 2.5v3A1.5 1.5 0 0 1 5.5 7h-3A1.5 1.5 0 0 1 1 5.5v-3zM2.5 2a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3zm6.5.5A1.5 1.5 0 0 1 10.5 1h3A1.5 1.5 0 0 1 15 2.5v3A1.5 1.5 0 0 1 13.5 7h-3A1.5 1.5 0 0 1 9 5.5v-3zm1.5-.5a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3zM1 10.5A1.5 1.5 0 0 1 2.5 9h3A1.5 1.5 0 0 1 7 10.5v3A1.5 1.5 0 0 1 5.5 15h-3A1.5 1.5 0 0 1 1 13.5v-3zm1.5-.5a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3zm6.5.5A1.5 1.5 0 0 1 10.5 9h3a1.5 1.5 0 0 1 1.5 1.5v3a1.5 1.5 0 0 1-1.5 1.5h-3A1.5 1.5 0 0 1 9 13.5v-3zm1.5-.5a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"collection\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M2.5 3.5a.5.5 0 0 1 0-1h11a.5.5 0 0 1 0 1h-11zm2-2a.5.5 0 0 1 0-1h7a.5.5 0 0 1 0 1h-7zM0 13a1.5 1.5 0 0 0 1.5 1.5h13A1.5 1.5 0 0 0 16 13V6a1.5 1.5 0 0 0-1.5-1.5h-13A1.5 1.5 0 0 0 0 6v7zm1.5.5A.5.5 0 0 1 1 13V6a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-.5.5h-13z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"calendar3\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M14 0H2a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2zM1 3.857C1 3.384 1.448 3 2 3h12c.552 0 1 .384 1 .857v10.286c0 .473-.448.857-1 .857H2c-.552 0-1-.384-1-.857V3.857z\"/>\n");
      out.write("        <path d=\"M6.5 7a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm-9 3a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm-9 3a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2zm3 0a1 1 0 1 0 0-2 1 1 0 0 0 0 2z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"chat-quote-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M16 8c0 3.866-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.584.296-1.925.864-4.181 1.234-.2.032-.352-.176-.273-.362.354-.836.674-1.95.77-2.966C.744 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7zM7.194 6.766a1.688 1.688 0 0 0-.227-.272 1.467 1.467 0 0 0-.469-.324l-.008-.004A1.785 1.785 0 0 0 5.734 6C4.776 6 4 6.746 4 7.667c0 .92.776 1.666 1.734 1.666.343 0 .662-.095.931-.26-.137.389-.39.804-.81 1.22a.405.405 0 0 0 .011.59c.173.16.447.155.614-.01 1.334-1.329 1.37-2.758.941-3.706a2.461 2.461 0 0 0-.227-.4zM11 9.073c-.136.389-.39.804-.81 1.22a.405.405 0 0 0 .012.59c.172.16.446.155.613-.01 1.334-1.329 1.37-2.758.942-3.706a2.466 2.466 0 0 0-.228-.4 1.686 1.686 0 0 0-.227-.273 1.466 1.466 0 0 0-.469-.324l-.008-.004A1.785 1.785 0 0 0 10.07 6c-.957 0-1.734.746-1.734 1.667 0 .92.777 1.666 1.734 1.666.343 0 .662-.095.931-.26z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"cpu-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M6.5 6a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3z\"/>\n");
      out.write("        <path d=\"M5.5.5a.5.5 0 0 0-1 0V2A2.5 2.5 0 0 0 2 4.5H.5a.5.5 0 0 0 0 1H2v1H.5a.5.5 0 0 0 0 1H2v1H.5a.5.5 0 0 0 0 1H2v1H.5a.5.5 0 0 0 0 1H2A2.5 2.5 0 0 0 4.5 14v1.5a.5.5 0 0 0 1 0V14h1v1.5a.5.5 0 0 0 1 0V14h1v1.5a.5.5 0 0 0 1 0V14h1v1.5a.5.5 0 0 0 1 0V14a2.5 2.5 0 0 0 2.5-2.5h1.5a.5.5 0 0 0 0-1H14v-1h1.5a.5.5 0 0 0 0-1H14v-1h1.5a.5.5 0 0 0 0-1H14v-1h1.5a.5.5 0 0 0 0-1H14A2.5 2.5 0 0 0 11.5 2V.5a.5.5 0 0 0-1 0V2h-1V.5a.5.5 0 0 0-1 0V2h-1V.5a.5.5 0 0 0-1 0V2h-1V.5zm1 4.5h3A1.5 1.5 0 0 1 11 6.5v3A1.5 1.5 0 0 1 9.5 11h-3A1.5 1.5 0 0 1 5 9.5v-3A1.5 1.5 0 0 1 6.5 5z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"gear-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M9.405 1.05c-.413-1.4-2.397-1.4-2.81 0l-.1.34a1.464 1.464 0 0 1-2.105.872l-.31-.17c-1.283-.698-2.686.705-1.987 1.987l.169.311c.446.82.023 1.841-.872 2.105l-.34.1c-1.4.413-1.4 2.397 0 2.81l.34.1a1.464 1.464 0 0 1 .872 2.105l-.17.31c-.698 1.283.705 2.686 1.987 1.987l.311-.169a1.464 1.464 0 0 1 2.105.872l.1.34c.413 1.4 2.397 1.4 2.81 0l.1-.34a1.464 1.464 0 0 1 2.105-.872l.31.17c1.283.698 2.686-.705 1.987-1.987l-.169-.311a1.464 1.464 0 0 1 .872-2.105l.34-.1c1.4-.413 1.4-2.397 0-2.81l-.34-.1a1.464 1.464 0 0 1-.872-2.105l.17-.31c.698-1.283-.705-2.686-1.987-1.987l-.311.169a1.464 1.464 0 0 1-2.105-.872l-.1-.34zM8 10.93a2.929 2.929 0 1 1 0-5.86 2.929 2.929 0 0 1 0 5.858z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"speedometer\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M8 2a.5.5 0 0 1 .5.5V4a.5.5 0 0 1-1 0V2.5A.5.5 0 0 1 8 2zM3.732 3.732a.5.5 0 0 1 .707 0l.915.914a.5.5 0 1 1-.708.708l-.914-.915a.5.5 0 0 1 0-.707zM2 8a.5.5 0 0 1 .5-.5h1.586a.5.5 0 0 1 0 1H2.5A.5.5 0 0 1 2 8zm9.5 0a.5.5 0 0 1 .5-.5h1.5a.5.5 0 0 1 0 1H12a.5.5 0 0 1-.5-.5zm.754-4.246a.389.389 0 0 0-.527-.02L7.547 7.31A.91.91 0 1 0 8.85 8.569l3.434-4.297a.389.389 0 0 0-.029-.518z\"/>\n");
      out.write("        <path fill-rule=\"evenodd\" d=\"M6.664 15.889A8 8 0 1 1 9.336.11a8 8 0 0 1-2.672 15.78zm-4.665-4.283A11.945 11.945 0 0 1 8 10c2.186 0 4.236.585 6.001 1.606a7 7 0 1 0-12.002 0z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"toggles2\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M9.465 10H12a2 2 0 1 1 0 4H9.465c.34-.588.535-1.271.535-2 0-.729-.195-1.412-.535-2z\"/>\n");
      out.write("        <path d=\"M6 15a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm0 1a4 4 0 1 1 0-8 4 4 0 0 1 0 8zm.535-10a3.975 3.975 0 0 1-.409-1H4a1 1 0 0 1 0-2h2.126c.091-.355.23-.69.41-1H4a2 2 0 1 0 0 4h2.535z\"/>\n");
      out.write("        <path d=\"M14 4a4 4 0 1 1-8 0 4 4 0 0 1 8 0z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"tools\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M1 0L0 1l2.2 3.081a1 1 0 0 0 .815.419h.07a1 1 0 0 1 .708.293l2.675 2.675-2.617 2.654A3.003 3.003 0 0 0 0 13a3 3 0 1 0 5.878-.851l2.654-2.617.968.968-.305.914a1 1 0 0 0 .242 1.023l3.356 3.356a1 1 0 0 0 1.414 0l1.586-1.586a1 1 0 0 0 0-1.414l-3.356-3.356a1 1 0 0 0-1.023-.242L10.5 9.5l-.96-.96 2.68-2.643A3.005 3.005 0 0 0 16 3c0-.269-.035-.53-.102-.777l-2.14 2.141L12 4l-.364-1.757L13.777.102a3 3 0 0 0-3.675 3.68L7.462 6.46 4.793 3.793a1 1 0 0 1-.293-.707v-.071a1 1 0 0 0-.419-.814L1 0zm9.646 10.646a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708zM3 11l.471.242.529.026.287.445.445.287.026.529L5 13l-.242.471-.026.529-.445.287-.287.445-.529.026L3 15l-.471-.242L2 14.732l-.287-.445L1.268 14l-.026-.529L1 13l.242-.471.026-.529.445-.287.287-.445.529-.026L3 11z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"chevron-right\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path fill-rule=\"evenodd\" d=\"M4.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L10.293 8 4.646 2.354a.5.5 0 0 1 0-.708z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"geo-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path fill-rule=\"evenodd\" d=\"M4 4a4 4 0 1 1 4.5 3.969V13.5a.5.5 0 0 1-1 0V7.97A4 4 0 0 1 4 3.999zm2.493 8.574a.5.5 0 0 1-.411.575c-.712.118-1.28.295-1.655.493a1.319 1.319 0 0 0-.37.265.301.301 0 0 0-.057.09V14l.002.008a.147.147 0 0 0 .016.033.617.617 0 0 0 .145.15c.165.13.435.27.813.395.751.25 1.82.414 3.024.414s2.273-.163 3.024-.414c.378-.126.648-.265.813-.395a.619.619 0 0 0 .146-.15.148.148 0 0 0 .015-.033L12 14v-.004a.301.301 0 0 0-.057-.09 1.318 1.318 0 0 0-.37-.264c-.376-.198-.943-.375-1.655-.493a.5.5 0 1 1 .164-.986c.77.127 1.452.328 1.957.594C12.5 13 13 13.4 13 14c0 .426-.26.752-.544.977-.29.228-.68.413-1.116.558-.878.293-2.059.465-3.34.465-1.281 0-2.462-.172-3.34-.465-.436-.145-.826-.33-1.116-.558C3.26 14.752 3 14.426 3 14c0-.599.5-1 .961-1.243.505-.266 1.187-.467 1.957-.594a.5.5 0 0 1 .575.411z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"new-adm\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z\"/>\n");
      out.write("        <path fill-rule=\"evenodd\" d=\"M13.5 5a.5.5 0 0 1 .5.5V7h1.5a.5.5 0 0 1 0 1H14v1.5a.5.5 0 0 1-1 0V8h-1.5a.5.5 0 0 1 0-1H13V5.5a.5.5 0 0 1 .5-.5z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"voltar\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path  fill=\"white\" d=\"M8 0a8 8 0 1 0 0 16A8 8 0 0 0 8 0zm3.5 7.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5H11.5z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"professor\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M8.211 2.047a.5.5 0 0 0-.422 0l-7.5 3.5a.5.5 0 0 0 .025.917l7.5 3a.5.5 0 0 0 .372 0L14 7.14V13a1 1 0 0 0-1 1v2h3v-2a1 1 0 0 0-1-1V6.739l.686-.275a.5.5 0 0 0 .025-.917l-7.5-3.5Z\"/>\n");
      out.write("        <path d=\"M4.176 9.032a.5.5 0 0 0-.656.327l-.5 1.7a.5.5 0 0 0 .294.605l4.5 1.8a.5.5 0 0 0 .372 0l4.5-1.8a.5.5 0 0 0 .294-.605l-.5-1.7a.5.5 0 0 0-.656-.327L8 10.466 4.176 9.032Z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"adm\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M6 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm-5 6s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zM11 3.5a.5.5 0 0 1 .5-.5h4a.5.5 0 0 1 0 1h-4a.5.5 0 0 1-.5-.5zm.5 2.5a.5.5 0 0 0 0 1h4a.5.5 0 0 0 0-1h-4zm2 3a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1h-2zm0 3a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1h-2z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol id=\"cliente\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V2zm4.5 0a.5.5 0 0 0 0 1h3a.5.5 0 0 0 0-1h-3zM8 11a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm5 2.755C12.146 12.825 10.623 12 8 12s-4.146.826-5 1.755V14a1 1 0 0 0 1 1h8a1 1 0 0 0 1-1v-.245z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol  id=\"cadeado\" fill=\"#e7e5e4\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M8 1a2 2 0 0 1 2 2v4H6V3a2 2 0 0 1 2-2zm3 6V3a3 3 0 0 0-6 0v4a2 2 0 0 0-2 2v5a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V9a2 2 0 0 0-2-2z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol  id=\"loc\" fill=\"black\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M12.166 8.94c-.524 1.062-1.234 2.12-1.96 3.07A31.493 31.493 0 0 1 8 14.58a31.481 31.481 0 0 1-2.206-2.57c-.726-.95-1.436-2.008-1.96-3.07C3.304 7.867 3 6.862 3 6a5 5 0 0 1 10 0c0 .862-.305 1.867-.834 2.94zM8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10z\"/>\n");
      out.write("        <path d=\"M8 8a2 2 0 1 1 0-4 2 2 0 0 1 0 4zm0 1a3 3 0 1 0 0-6 3 3 0 0 0 0 6z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol  id=\"envelope\" fill=\"black\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4Zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2Zm13 2.383-4.708 2.825L15 11.105V5.383Zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741ZM1 11.105l4.708-2.897L1 5.383v5.722Z\"/>   \n");
      out.write("    </symbol>\n");
      out.write("    <symbol  id=\"phone\" fill=\"black\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M3 2a2 2 0 0 1 2-2h6a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V2zm6 11a1 1 0 1 0-2 0 1 1 0 0 0 2 0z\"/>\n");
      out.write("    </symbol>\n");
      out.write("    <symbol  id=\"desc\" fill=\"black\" viewBox=\"0 0 16 16\">\n");
      out.write("         <path d=\"M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z\"/>\n");
      out.write("\n");
      out.write("    </symbol>\n");
      out.write("    <symbol  id=\"pesquisa\" fill=\"white\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z\"/>\n");
      out.write("\n");
      out.write("    </symbol>\n");
      out.write("    <symbol  id=\"estrela\" fill=\"#FC0\" viewBox=\"0 0 16 16\">\n");
      out.write("       \n");
      out.write("  <path d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\"/>\n");
      out.write("\n");
      out.write("    </symbol>\n");
      out.write("    <symbol  id=\"estrelavz\" fill=\"#CCC\" viewBox=\"0 0 16 16\">\n");
      out.write("       \n");
      out.write("  <path d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\"/>\n");
      out.write("\n");
      out.write("    </symbol>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </svg>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("              <nav style=\"background-color: #212529!important;\" id=\"navbar\" class=\"navbar navbar-expand-lg fixed-top navbar-dark\" aria-label=\"Main navigation\">\n");
      out.write("            <div class=\"container\"> \n");
      out.write("                <a style=\"margin-left: 0%;\" class=\"navbar-brand logo-text\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("index.html\">UBEProf</a> \n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <form class=\"d-flex col-5\" style=\"margin: auto;\" role=\"search\">\n");
      out.write("                        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Pesquise Aqui...\" aria-label=\"Search\">\n");
      out.write("                        <button class=\" botão1\" style=\"height: 40px;\" type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"navbar-toggler p-0 border-0\" type=\"button\" id=\"navbarSideCollapse\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button> <div class=\"navbar-collapse offcanvas-collapse\" id=\"navbarsExampleDefault\" >\n");
      out.write("                     <ul class=\"navbar-nav ms-auto navbar-nav-scroll\">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a style=\"color: #ffffff;\" class=\"nav-link dropdown-toggle\" id=\"dropdown01\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\">\n");
      out.write("                                Opções\n");
      out.write("                            </a> <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CarregarCliente?idUsuario=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Seu Perfil</a></li>\n");
      out.write("                                <li><div class=\"dropdown-divider\"></div></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LogoutCliente\">Sair</a></li>\n");
      out.write("                                <li><div class=\"dropdown-divider\"></div></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CerregarHomeCliente\">Home</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div> <!-- end of navbar-collapse -->\n");
      out.write("            </div> <!-- end of container -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("           <div style=\" border: 1px solid #000; box-shadow: 5px 5px rgba(14, 233, 81, 1); height: 600px; width: 300px;  position: absolute; top: 150px; left: 2%;\" >\n");
      out.write("            <label class=\"container1\"> <p style=\" margin-left: 2px;\">Filtrar Pela minha região</p>\n");
      out.write("                <input type=\"checkbox\" >\n");
      out.write("                <span class=\"checkmark1\"></span>\n");
      out.write("            </label>\n");
      out.write("            <hr>\n");
      out.write("            <label class=\"container1\" ><p style=\" margin-left: 2px;\">Filtrar Por avaliaçoes maiores de 3 Estrelas</p>\n");
      out.write("                <input type=\"checkbox\" >\n");
      out.write("                <span class=\"checkmark1\"></span>\n");
      out.write("            </label>\n");
      out.write("            <hr>\n");
      out.write("            <label class=\"container1\" ><p style=\" margin-left: 2px;\">Filtrar Por avaliaçoes de 5 Estrelas</p>\n");
      out.write("                <input type=\"checkbox\" >\n");
      out.write("                <span class=\"checkmark1\"></span>\n");
      out.write("            </label>\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div style=\"position: absolute;  top: 150px; left: 600px;\" class=\" col-12\">\n");
      out.write("       \n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("            <script src=\"../csscliente/libcliente/easing/easing.min.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"../csscliente/libcliente/waypoints/waypoints.min.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"../csscliente/libcliente/counterup/counterup.min.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"../csscliente/libcliente/owlcarousel/owl.carousel.min.js\" type=\"text/javascript\"></script> <!-- Template Javascript -->\n");
      out.write("            <script src=\"../js/script.js\"></script> <!-- Custom scripts -->\n");
      out.write("            <script src=\"../csscliente/jscliente/main.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("cursoprofessor");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cursos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("             <div  style=\"  margin: 10px; height:16%; border: 1px solid #cccccc; box-shadow: 5px 5px rgba(14, 233, 81, 1);\"  class=\"row col-6   \">\n");
          out.write("                <div>\n");
          out.write("                    <div>\n");
          out.write("                        \n");
          out.write("                        <h3 Style=\" padding-top: 5px; \"> Curso de ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cursoprofessor.nomeCurso}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                        <p style=\"color: #000; font-family: sans-serif; font-size: 25px; \" class=\"h5\"> Professor ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cursoprofessor.nomeUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        <p class=\"subtitulo\"> Cidade:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cursoprofessor.cidadeProfessor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </p>\n");
          out.write("                    </div>\n");
          out.write("            \n");
          out.write("                        <div  class=\"estrelas avaliacao\">\n");
          out.write("                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cursoprofessor.avProfessor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                        </div>\n");
          out.write("              \n");
          out.write("\n");
          out.write("                </div> \n");
          out.write("            </div>\n");
          out.write("            ");
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
