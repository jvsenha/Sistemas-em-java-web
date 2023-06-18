<%-- 
    Document   : sidebar
    Created on : 8 de nov. de 2022, 08:08:02
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/css/assets/img/trem.png">
        <title>sidebar</title>
        <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
        <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

        <!-- Nucleo Icons -->
        <link href="${pageContext.request.contextPath}/css/assets/css/nucleo-icons.css" rel="stylesheet" />
        <!-- CSS Files -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
        <link href="${pageContext.request.contextPath}/css/assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="${pageContext.request.contextPath}/css/assets/demo/demo.css" rel="stylesheet" />

        <link href="${pageContext.request.contextPath}/css/cssempresa.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-absolute navbar-transparent">
            <div class="container-fluid">
                <div class="navbar-wrapper">
                    <a class="navbar-brand" href="${pageContext.request.contextPath}/indexnova.jsp">Home</a>
                </div>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-bar navbar-kebab"></span>
                    <span class="navbar-toggler-bar navbar-kebab"></span>
                    <span class="navbar-toggler-bar navbar-kebab"></span>
                </button>
                <div class="collapse navbar-collapse" id="navigation">
                    <ul class="navbar-nav ml-auto">
                        <li class="search-bar input-group">
                            <button class="btn btn-link" id="search-button" data-toggle="modal" data-target="#searchModal"><i class="tim-icons icon-zoom-split" ></i>
                                <span class="d-lg-none d-md-block">Search</span>
                            </button>
                        </li>
                        <li class="search-bar input-group">
                            <button class="btn btn-link"  >
                                <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/LogoutAdmSis"><i class="bi bi-box-arrow-right"></i></a>
                            </button>
                        </li>
                        <li class="dropdown nav-item">
                            <a href="javascript:void(0)" class="dropdown-toggle nav-link" data-toggle="dropdown">
                                <div class="notification d-none d-lg-block d-xl-block"></div>
                                <i class="tim-icons icon-bell-55"></i>
                                <p class="d-lg-none">
                                    Notifications
                                </p>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-right dropdown-navbar">
                                <li class="nav-link"><a href="#" class="nav-item dropdown-item">Mike John responded to your email</a></li>
                                <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">You have 5 more tasks</a></li>
                                <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">Your friend Michael is in town</a></li>
                                <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">Another notification</a></li>
                                <li class="nav-link"><a href="javascript:void(0)" class="nav-item dropdown-item">Another one</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="sidebar" >
            <!--
              Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red"
            -->
            <div class="sidebar-wrapper" style="overflow-y: scroll;">
                <div class="logo">
                    <center><a href="javascript:void(0)" class="simple-text logo-normal">
                            Cadastrar Empresa
                        </a></center>
                </div>
                <ul class="nav">
                    <li>
                        <a href="${pageContext.request.contextPath}/adm/dashboard.jsp">
                            <i class="tim-icons icon-chart-pie-36"></i>
                            <p>Painel de Controle</p>
                        </a>
                    </li>
                    <li>
                        <a href="./notificacao.jsp">
                            <i class="tim-icons icon-bell-55"></i>
                            <p>Alerta de Acidentes</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/SolicitacaoAdmSis">
                            <i class="tim-icons icon-bell-55"></i>
                            <p>Solicitaçoes</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/ListarAdmSisDt">
                            <i class="bi bi-person-fill-check"></i>
                            <p>Administradores Desativos</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/ListarTrem">
                            <i class="bi bi-train-freight-front-fill"></i>
                            <p>Lista de trems</p>
                        </a>
                    </li>
                    <li class="">
                        <a href="${pageContext.request.contextPath}/ListarAdmSisAt">
                            <i class="tim-icons icon-single-02"></i>
                            <p>Administrador Ativos</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/adm/cadastrarempresa.jsp">
                            <i class="bi bi-building-fill-add"></i>
                            <p>Cadastrar Empresa</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/ListarEmpresa">
                            <i class="bi bi-building-fill-check"></i>
                            <p>Empresas Cadastradas</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/adm/cadastrarterminal.jsp">
                            <i class="bi bi-geo-fill"></i>
                            <p>Cadastrar Terminal</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/ListarTerminal">
                            <i class="bi bi-pin-map-fill"></i>
                            <p>Terminais Cadastrados</p>
                        </a>
                    </li>
             
                </ul>
            </div>
        </div>
    </body>
</html>
