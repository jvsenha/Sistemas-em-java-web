<%

    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpSession sessao = httpServletRequest.getSession();
    if (sessao.getAttribute("cliente") != null) {


%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html>
    <head>
       <meta charset="ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">



        <!-- SEO Meta Tags -->
        <meta name="description" content="Your description">
        <meta name="author" content="Your name">



        <!-- Webpage Title -->
        <title>Página Home do Cliente</title>



        <!-- Styles -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/fontawesome-all.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/csshomecliente.css" rel="stylesheet" type="text/css"/>



        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;700&display=swap" rel="stylesheet">
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
        <link rel="canonical" href="https://www.wrappixel.com/templates/niceadmin-lite/" />
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="assets/images/favicon.png">
        <!-- Custom CSS -->
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <link href="dist/css/style.min.css" rel="stylesheet" type="text/css"/>
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <!-- Favicon -->
        <link rel="icon" href="./assets/images/favicon.png">
        <style>
                 .botão1{
                position:  relative;
                left: 0%;
                margin-top: 0%;
                color: white;
                border-width: 2px;
                padding: 10px  9px;
                border: 1px solid rgba(14, 233, 81, 1);
               background-image: linear-gradient(to right, #1be75a , #11dbc0);
                box-shadow: 0px 0px  rgba(14, 233, 81, 1);
                border: 0px ;
                cursor: pointer;
                width: 30%;
                height: 10%;
            }
           
            .card {
                box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
                transition: 0.3s;
                margin-right: 20px;
                padding: 20px;
                width: 350px;
                box-shadow: 0 0 5px 0px #e2e2e2;
                cursor: pointer;
            }



            .card:hover {
                box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
            }



            .card:after,
            .card:before {
                content: "";
                position: absolute;
                buttom: 0;
                top: 0;
                left: 0;
                right: 0;
                transform: transform 0.3s ease-in-out;
            }



            .card:before {
                border-left: 1px solid black;
                border-right: 1px solid black;
                transform: scaleY(0);
            }



            .card:after {
                border-left: 1px solid black;
                border-right: 1px solid black;
                transform: scaleY(0);
            }



            .card:houver:before {
                transform: scaleY(1);
            }



            .card:houver:after {
                transform: scaleY(1);
            }



            .text-card {
                margin: 20px auto;
            }

            #divBusca{
                background-color:#fff;
                border:solid 1px;
                border-radius:15px;
                width:300px;
            }



            #txtBusca{
                float:left;
                background-color:transparent;
                padding-left:5px;
                font-style:italic;
                font-size:18px;
                border:none;
                height:32px;
                width:260px;
                margin-left: 2%;
            }

            #btnBusca{
                margin-top: 5px;
                margin-right: 2%;
            }
        </style>
    </head>

    <body>
        <nav style="background-color: #212529!important;" id="navbar" class="navbar navbar-expand-lg fixed-top navbar-dark" aria-label="Main navigation">
            <div class="container"> 
                <a style="margin-left: 0%;" class="navbar-brand logo-text" href="${pageContext.request.contextPath}/index.jsp">UBEProf</a> 
                <div class="container-fluid">
                    <form class="d-flex col-5" style="margin: auto;" action="${pageContext.request.contextPath}/BuscarCurso" role="search" >
                        <input name="nomeCurso" class="form-control me-2" type="search" placeholder="Pesquise Aqui..." aria-label="Search">
                        <button class=" botão1" style="height: 40px;" type="submit">Search</button>
                    </form>
                </div>
                <button class="navbar-toggler p-0 border-0" type="button" id="navbarSideCollapse" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button> <div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault" >
                    <ul class="navbar-nav ms-auto navbar-nav-scroll">
                        <li class="nav-item dropdown">
                            <a style="color: #ffffff;" class="nav-link dropdown-toggle" id="dropdown01" data-bs-toggle="dropdown" aria-expanded="false" href="#">
                                Opções
                            </a> <ul class="dropdown-menu" aria-labelledby="dropdown01">
                                <li><a class="dropdown-item" href="CarregarCliente?idUsuario=${usuario}">Seu Perfil</a></li>
                                <li><div class="dropdown-divider"></div></li>
                                <li><a class="dropdown-item" href="LogoutCliente">Sair</a></li>
                                <li><div class="dropdown-divider"></div></li>
                            </ul>
                        </li>
                    </ul>
                </div> <!-- end of navbar-collapse -->
            </div> <!-- end of container -->
        </nav> <!-- end of navbar -->
        <!-- end of navigation -->
        <div style="position: absolute; top: 100px;" class=" row col-12">
            <div class="py-5 d-flex align-items-center">
                <div class="text-center mx-auto mb-5 pb-3">
                    <h2 class="home_text text-card">Os melhores professores da sua e de outras regiões!</h2>
                    <h1 class="display-4 text-uppercase text-black">Professores</h1>
                    <h1 class=" h3 fw-bold text-h1">${mensagemCL}</h1>
                </div>
            </div>
        </div>
        <div style="position: absolute; top: 400px;left: 150px;" class="row col-12 d-flex ">
            <c:forEach var="professor" items="${dadosprofessores}">
                <div style=" margin: 20px;" class="card">
                    <img class="img-fuid w-80" src="${pageContext.request.contextPath}/assets/images/profile-img.jpg" alt="Avatar" style="width:100%">
                    <div class="team-overlay w-100 h-100 position-absolute top-50 start-50 translate-middle d-flex align-items-center justify-content-center">
                        <div class="d-flex align-items-center justify-content-start">
                            <a class="btn btn-secondary" href="${pageContext.request.contextPath}/VisualizarProfessor?idUsuario=${professor.idUsuario}&idCliente=${idcliente}">Mais Infomações</a></div>
                    </div>
                    <div class="bg-dark border-inner text-center ">
                        <h4 class="home_text text-card"><b>${professor.nomeUsuario}</b></h4>
                        <p class="text-white font-cliente text-card"></p>
                    </div>
                </div> </c:forEach>
            </div> <!-- JavaScript Libraries -->
            <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
            <script src="./csscliente/libcliente/easing/easing.min.js" type="text/javascript"></script>
            <script src="./csscliente/libcliente/waypoints/waypoints.min.js" type="text/javascript"></script>
            <script src="./csscliente/libcliente/counterup/counterup.min.js" type="text/javascript"></script>
            <script src="./csscliente/libcliente/owlcarousel/owl.carousel.min.js" type="text/javascript"></script> <!-- Template Javascript -->
            <script src="./js/script.js"></script> <!-- Custom scripts -->
            <script src="./csscliente/jscliente/main.js" type="text/javascript"></script>
        </body>
    </html>
<% } else {
        ((HttpServletResponse) response).sendRedirect("./index.jsp");
    }
%>

