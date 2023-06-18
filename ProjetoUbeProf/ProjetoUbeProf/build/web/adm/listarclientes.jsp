<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

HttpServletRequest httpServletRequest =(HttpServletRequest) request;
HttpSession sessao = httpServletRequest.getSession();
if(sessao.getAttribute("administrador") != null){

        %>

<%@page import="java.util.List"%>
<%@page import="br.com.projetoubeprof.model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >

     <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Tell the browser to be responsive to screen width -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords"
              content="wrappixel, admin dashboard, html css dashboard, web dashboard, bootstrap 5 admin, bootstrap 5, css3 dashboard, bootstrap 5 dashboard, Nice lite admin bootstrap 5 dashboard, frontend, responsive bootstrap 5 admin template, Nice admin lite design, Nice admin lite dashboard bootstrap 5 dashboard template">
        <meta name="description"
              content="Nice Admin Lite is powerful and clean admin dashboard template, inpired from Bootstrap Framework">
        <meta name="robots" content="noindex,nofollow">
        <title>Lista de Professores </title>
        <link rel="canonical" href="https://www.wrappixel.com/templates/niceadmin-lite/" />
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="assets/images/favicon.png">
        <!-- Custom CSS -->
        <link href="assets/libs/chartist/dist/chartist.min.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link href="dist/css/style.min.css" rel="stylesheet" type="text/css"/>
        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;700&display=swap" rel="stylesheet">

        <link href="css/signin.css" rel="stylesheet" type="text/css"/>
     
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/swiper.css" rel="stylesheet" type="text/css"/>
        <script src="js/aos.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/purecounter.min.js" type="text/javascript"></script>
        <script src="js/script.js" type="text/javascript"></script>
        <script src="js/swiper.min.js" type="text/javascript"></script>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body style="background-color: #212529!important;">
        <!-- ============================================================== -->
        <!-- Preloader - style you can find in spinners.css -->
        <!-- ============================================================== -->

        <%@include file="../Svg.jsp" %>
               <nav  style="background-color: black;"  id="navbar" class="navbar navbar-expand-lg fixed-top navbar-dark" aria-label="Main navigation">
            <a style="margin-left: 65px;" href="homeadm.jsp" class="nav-link text-white">
                <svg class="bi me-2" width="30" height="30"><use xlink:href="#voltar"/></svg>
                Home
            </a>
            <div class="container">

                <div style="margin-left: 40%;"  class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault" >
                    <a class="navbar-brand logo-text">UBEProf</a>

                </div> <!-- end of navbar-collapse -->
            </div> <!-- end of container -->
        </nav> 
        <div class="page-wrapper"  style="margin:auto;  margin-top: 50px; width:90%; height: 90%;" >
            <!-- ============================================================== -->
            <!-- Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <div class="page-breadcrumb">
                <div class="row">

                    <div class="container-fluid" >
                        <!-- ============================================================== -->
                        <!-- Start Page Content -->
                        <!-- ============================================================== -->
                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">

                                        <div>
                                            <div class="card-body">
                                                <h4 class="card-title">${msgLc}</h4>
                                            </div>
                                            <table class="table">
                                                <tr>
                                                    <th >Id do Cliente</th>
                                                    <th>Nome do cliente</th>
                                                    <th>Email</th>
                                                    <th>Login</th>
                                                    <th>Status</th>
                                                    <th>tipo</th>
                                                    <th>Ativar/Desativar</th>

                                                </tr>

                                                <c:forEach var="cliente" items="${clientes}">
                                                    <tr>
                                                        <th align="center">${cliente.idCliente}</th>
                                                        <th align="center">${cliente.nomeUsuario}</th>
                                                        <th align="center">${cliente.emailUsuario}</th>
                                                        <th align="center">${cliente.loginUsuario}</th>
                                                        <th align="center">
                                                    <c:choose>
                                                        <c:when test="${cliente.statusUsuario=='1'}">
                                                            <span class="label label-success label-rounded">ATIVO</span> 
                                                            <br />
                                                        </c:when>    
                                                        <c:otherwise>
                                                            <span style="background-color: #dc3545;" class="label label-danger label-rounded">DESATIVO</span> 
                                                            <br />
                                                        </c:otherwise>
                                                    </c:choose>
                                                </th>
                                                        <th align="center">${cliente.tipoUsuario}</th>
                                                        <th align="center">
                                                            <c:choose>
                                                                <c:when test="${cliente.statusUsuario=='1'}">
                                                                    <a href="InativarCliente?idUsuario=${cliente.idUsuario}" style=" border-radius: 0.25rem; border: 1px solid transparent;"  class="btn-danger"> Desativar</a>
                                                                    <br />
                                                                </c:when>    
                                                                <c:otherwise>
                                                                    <a href="AtivarCliente?idUsuario=${cliente.idUsuario}" style=" border-radius: 0.25rem; border: 1px solid transparent; width:80px; " class="btn-success" > ativar</a>
                                                                    <br />
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </th>
                                                    </tr>
                                                </c:forEach>

                                            </table>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>


                    </div>
                </div>
            </div>
        </div>
        <script src="assets/libs/jquery/dist/jquery.min.js"></script>
        <!-- Bootstrap tether Core JavaScript -->
        <script src="assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
        <!-- slimscrollbar scrollbar JavaScript -->
        <script src="assets/extra-libs/sparkline/sparkline.js"></script>
        <!--Wave Effects -->
        <script src="dist/js/waves.js"></script>
        <!--Menu sidebar -->
        <script src="dist/js/sidebarmenu.js"></script>
        <!--Custom JavaScript -->
        <script src="dist/js/custom.min.js"></script>
    </body>

</html>
<%
    } else {
((HttpServletResponse) response).sendRedirect("./index.jsp");

}
%>