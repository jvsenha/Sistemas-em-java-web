package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- SEO Meta Tags -->\n");
      out.write("        <meta name=\"description\" content=\"Your description\">\n");
      out.write("        <meta name=\"author\" content=\"Your name\">\n");
      out.write("\n");
      out.write("        <!-- OG Meta Tags to improve the way the post looks when you share the page on Facebook, Twitter, LinkedIn -->\n");
      out.write("        <meta property=\"og:site_name\" content=\"\" /> <!-- website name -->\n");
      out.write("        <meta property=\"og:site\" content=\"\" /> <!-- website link -->\n");
      out.write("        <meta property=\"og:title\" content=\"\"/> <!-- title shown in the actual shared post -->\n");
      out.write("        <meta property=\"og:description\" content=\"\" /> <!-- description shown in the actual shared post -->\n");
      out.write("        <meta property=\"og:image\" content=\"\" /> <!-- image link, make sure it's jpg -->\n");
      out.write("        <meta property=\"og:url\" content=\"\" /> <!-- where do you want your post to link to -->\n");
      out.write("        <meta name=\"twitter:card\" content=\"summary_large_image\"> <!-- to have large image post format in Twitter -->\n");
      out.write("\n");
      out.write("        <!-- Webpage Title -->\n");
      out.write("        <title>UBEProf</title>\n");
      out.write("\n");
      out.write("        <!-- Styles -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"./css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"./css/fontawesome-all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"./css/aos.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"./css/swiper.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"./css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"icon\" href=\"./assets/images/favicon.png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav id=\"navbar\" class=\"navbar navbar-expand-lg fixed-top navbar-dark\" aria-label=\"Main navigation\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <!-- Image Logo -->\n");
      out.write("                <!-- <a class=\"navbar-brand logo-image\" href=\"index.html\"><img src=\"images/logo.svg\" alt=\"alternative\"></a> -->\n");
      out.write("\n");
      out.write("                <!-- Text Logo - Use this if you don't have a graphic logo -->\n");
      out.write("                <a class=\"navbar-brand logo-text\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("index.html\">UBEProf</a>\n");
      out.write("\n");
      out.write("                <button class=\"navbar-toggler p-0 border-0\" type=\"button\" id=\"navbarSideCollapse\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"navbar-collapse offcanvas-collapse\" id=\"navbarsExampleDefault\" >\n");
      out.write("                    <ul class=\"navbar-nav ms-auto navbar-nav-scroll\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                                 <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Página Inicial</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" id=\"dropdown01\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\">Drop</a>\n");
      out.write("\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"article.html\">Article Details</a></li>\n");
      out.write("                                <li><div class=\"dropdown-divider\"></div></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"terms.html\">Terms Conditions</a></li>\n");
      out.write("                                <li><div class=\"dropdown-divider\"></div></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"privacy.html\">Privacy Policy</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\"  href=\"adm/loginadmin.jsp\">Area restrita</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <span class=\"nav-item social-icons\">\n");
      out.write("                        <span class=\"fa-stack\">\n");
      out.write("                            <a href=\"#your-link\">\n");
      out.write("                                <i class=\"fas fa-circle fa-stack-2x\"></i>\n");
      out.write("                                <i class=\"fab fa-facebook-f fa-stack-1x\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"fa-stack\">\n");
      out.write("                            <a href=\"#your-link\">\n");
      out.write("                                <i class=\"fas fa-circle fa-stack-2x\"></i>\n");
      out.write("                                <i class=\"fab fa-twitter fa-stack-1x\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </span>\n");
      out.write("                    </span>\n");
      out.write("                </div> <!-- end of navbar-collapse -->\n");
      out.write("            </div> <!-- end of container -->\n");
      out.write("        </nav> <!-- end of navbar -->\n");
      out.write("        <!-- end of navigation -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Home -->\n");
      out.write("        <section class=\"home py-5 d-flex align-items-center\" id=\"header\">\n");
      out.write("            <div class=\"container text-light py-5\"  data-aos=\"fade-right\"> \n");
      out.write("                <h1 class=\"headline\"><span class=\"home_text\">UBEProf</span>><br>A maneira mais rápida de aprender!</h1>\n");
      out.write("                <p class=\"para para-light py-3\">Aprender nunca foi tão facíl, a UBEProf vai te entregar os melhores professores para a área que você mais gostar. Com todo tipo de curso, você pode se especializar no que você quiser!!</p>\n");
      out.write("                <div class=\"d-flex align-items-center\">\n");
      out.write("                     <p>Qual tipo de usuário é você</p>  \n");
      out.write("                    <p class=\"p-2\"><i class=\"fas fa-question\"></i></p>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"my-3\">\n");
      out.write("                        <a  style=\" color: #ffffff;width: 20%\"class=\"btn btn-secondary\" href=\"professor/loginprofessor.jsp\">Professor</a></div>\n");
      out.write("                    <div class=\"my-3\">\n");
      out.write("                        <a style=\" color: #ffffff;width: 20%\"class=\"btn btn-secondary\" href=\"cliente/logincliente.jsp\">Cliente</a></div>\n");
      out.write("                        \n");
      out.write("                </div>         \n");
      out.write("            </div> <!-- end of container -->\n");
      out.write("        </section> <!-- end of home -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <section class=\"footer text-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" data-aos=\"fade-right\">\n");
      out.write("                    <div class=\"col-lg-3 py-4 py-md-5\">\n");
      out.write("                        <div class=\"d-flex align-items-center\">\n");
      out.write("                            <h4 class=\"\">Mirko</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <p class=\"py-3 para-light\">Lorem ipsum dolor sit amet consectetur adipisicing elit. Minus animi repudiandae explicabo esse maxime, impedit rem voluptatibus amet error quas.</p>\n");
      out.write("                        <div class=\"d-flex\">\n");
      out.write("                            <div class=\"me-3\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fab fa-facebook-f fa-2x py-2\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"me-3\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fab fa-twitter fa-2x py-2\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"me-3\">\n");
      out.write("                                <a href=\"#your-link\">\n");
      out.write("                                    <i class=\"fab fa-instagram fa-2x py-2\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> <!-- end of col -->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 py-4 py-md-5\">\n");
      out.write("                        <div>\n");
      out.write("                            <h4 class=\"py-2\">Quick Links</h4>\n");
      out.write("                            <div class=\"d-flex align-items-center py-2\">\n");
      out.write("                                <i class=\"fas fa-caret-right\"></i>\n");
      out.write("                                <a href=\"#about\"><p class=\"ms-3\">About</p></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex align-items-center py-2\">\n");
      out.write("                                <i class=\"fas fa-caret-right\"></i>\n");
      out.write("                                <a href=\"#\"><p class=\"ms-3\">Services</p></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex align-items-center py-2\">\n");
      out.write("                                <i class=\"fas fa-caret-right\"></i>\n");
      out.write("                                <a href=\"#\"><p class=\"ms-3\">Plans</p></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex align-items-center py-2\">\n");
      out.write("                                <i class=\"fas fa-caret-right\"></i>\n");
      out.write("                                <a href=\"#\"><p class=\"ms-3\">Contact</p></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> <!-- end of col -->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 py-4 py-md-5\">\n");
      out.write("                        <div>\n");
      out.write("                            <h4 class=\"py-2\">Useful Links</h4>\n");
      out.write("                            <div class=\"d-flex align-items-center py-2\">\n");
      out.write("                                <i class=\"fas fa-caret-right\"></i>\n");
      out.write("                                <a href=\"privacy.html\"><p class=\"ms-3\">Privacy</p></a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex align-items-center py-2\">\n");
      out.write("                                <i class=\"fas fa-caret-right\"></i>\n");
      out.write("                                <a href=\"terms.html\"><p class=\"ms-3\">Terms</p></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex align-items-center py-2\">\n");
      out.write("                                <i class=\"fas fa-caret-right\"></i>\n");
      out.write("                                <a href=\"#your-link\"><p class=\"ms-3\">Disclaimer</p></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex align-items-center py-2\">\n");
      out.write("                                <i class=\"fas fa-caret-right\"></i>\n");
      out.write("                                <a href=\"#your-link\"><p class=\"ms-3\">FAQ</p></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> <!-- end of col -->\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 py-4 py-md-5\">\n");
      out.write("                        <div class=\"d-flex align-items-center\">\n");
      out.write("                            <h4>Newsletter</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <p class=\"py-3 para-light\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Laboriosam, ab.</p>\n");
      out.write("                        <div class=\"d-flex align-items-center\">\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                                <input type=\"text\" class=\"form-control p-2\" placeholder=\"Enter Email\" aria-label=\"Recipient's email\">\n");
      out.write("                                <button class=\"btn-secondary text-light\"><i class=\"fas fa-envelope fa-lg\"></i></button>       \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> <!-- end of col -->\n");
      out.write("                </div> <!-- end of row -->\n");
      out.write("            </div> <!-- end of container -->\n");
      out.write("        </section> <!-- end of footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back To Top Button -->\n");
      out.write("        <button onclick=\"topFunction()\" id=\"myBtn\">\n");
      out.write("            <img src=\"assets/images/up-arrow.png\" alt=\"alternative\">\n");
      out.write("        </button>\n");
      out.write("        <!-- end of back to top button -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Scripts -->\n");
      out.write("        <script src=\"./js/bootstrap.min.js\"></script><!-- Bootstrap framework -->\n");
      out.write("        <script src=\"./js/purecounter.min.js\"></script> <!-- Purecounter counter for statistics numbers -->\n");
      out.write("        <script src=\"./js/swiper.min.js\"></script><!-- Swiper for image and text sliders -->\n");
      out.write("        <script src=\"./js/aos.js\"></script><!-- AOS on Animation Scroll -->\n");
      out.write("        <script src=\"./js/script.js\"></script>  <!-- Custom scripts -->\n");
      out.write("    </body>\n");
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
