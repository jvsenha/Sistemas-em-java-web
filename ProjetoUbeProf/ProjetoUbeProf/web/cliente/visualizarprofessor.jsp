<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpSession sessao = httpServletRequest.getSession();
    if (sessao.getAttribute("cliente") != null) {

%>
<html>
    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Webpage Title -->
        <title>Página de Visualizar Professor</title>

        <link href="${pageContext.request.contextPath}/css/fontawesome-all.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/cssvisualizarprofessor/stylevizualizarprofessor.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="${pageContext.request.contextPath}/assets/images/favicon.png">
        <link href="../dist/css/style.css" rel="stylesheet" type="text/css"/>

        <style>
            .texto{
                font-size: 20px;
                margin-left: 25px;
                position: relative;
                color: #000000;
                width: 690px;
                word-break: break-all;
            }
            .h4-gd{
                width: 700px;
            }
            .botão{
                position:  relative;
                left: 80%;
                bottom: -90%;
                color: black;
                border-width: 2px;
                padding: 10px 30px;
                border: 1px solid rgba(14, 233, 81, 1);
                box-shadow: 5px 5px  rgba(14, 233, 81, 1);
                background: transparent;
                cursor: pointer;
            }
            .botão:hover{
                background-image: linear-gradient(to right, #1be75a , #11dbc0);
                box-shadow: 0px 0px  rgba(14, 233, 81, 1);
                border: 0px ;
            }
            .titulo h2{
                font-size: 32px;
                font-weight: bold;
                margin-bottom: 5px;
                padding-bottom: 5px;
                position: relative;
                color: #000000;
            }
            .sub-titulo{
                font-size: 25px;
                font-weight: bold;
                margin-top: 5px;
                padding-top: 5px;
                position: relative;
                color: #000000;
            }
        </style>
    </head>
    <body>
        <%@include file="../Svg.jsp" %>

        <!-- ======= Mobile nav toggle button ======= -->
        <i class="bi bi-list mobile-nav-toggle d-xl-none"></i>

        <!-- ======= Header ======= -->
        <header id="header">
            <div class="d-flex flex-column">

                <div class="profile">
                    <a style=" position: absolute; top: 15px; margin-left: 5px; " href="${pageContext.request.contextPath}/CerregarHomeCliente" class="nav-link text-white">
                        <svg class="bi me-2" width="30" height="30"><use xlink:href="#voltar"/></svg>

                    </a>
                    <img src="${pageContext.request.contextPath}/assets/images/profile-img.jpg" alt="" class="img-fluid rounded-circle">
                    <h1 class="text-light"><a href="visualizarprofessor.jsp">${professor.nomeUsuario}</a></h1>
                </div>

                <nav id="nav-menu" class="nav-menu">
                    <ul>
                        <li><a href="#infopessoais" class="nav-link scrollto"><i class="fas fa-user"></i> <span>Informações Pessoais</span></a></li>
                        <li><a href="#cursos" class="nav-link scrollto"><i class="fas fa-server"></i> <span>Cursos</span></a></li>
                        <li><a href="#avaliacao" class="nav-link scrollto"><i class="fas fa-star"></i> <span>Avaliações</span></a></li>
                    </ul>
                </nav><!-- .nav-menu -->
            </div>
        </header><!-- End Header -->

        <main id="main">

            <!-- ======= Infopessoais Section ======= -->
            <section style="margin-top: 80px;" id="infopessoais" class="infopessoais">
                <div class="container">
                    <div class="section-title">
                        <h2>Informações Pessoais</h2>
                    </div>

                    <div class="row">
                        <div class="col-lg-4" data-aos="fade-right">
                            <img src="${pageContext.request.contextPath}/assets/images/profile-img.jpg" class="img-fluid" alt="">
                        </div>
                        <div class="col-lg-8 pt-4 pt-lg-0 content" data-aos="fade-left">
                            <div class="row">
                                <div class="col-lg-12">

                                    <div class="col-lg-12 d-flex align-items-stretch">
                                        <div class="infopessoais">

                                            <div style="margin:10px; " class="address col-5">
                                                <svg style="float: left;" class="bi me-1 " width="22" height="22"><use xlink:href="#loc"/></svg>
                                                <h4><strong>Nome:</strong></h4>
                                                <p class="texto">${professor.nomeUsuario}</p>
                                            </div>
                                            <div style="margin:10px;" class="address">
                                                <svg style="float: left;" class="bi me-1 " width="22" height="22"><use xlink:href="#loc"/></svg>
                                                <h4 class="col-lg-12"><strong>Município:</strong></h4>
                                                <p  class="texto">${professor.cidadeProfessor}</p>
                                            </div>
                                            <div style="margin:10px;" class="email ">
                                                <svg style="float: left;" class="bi me-1 " width="22" height="22"><use xlink:href="#envelope"/></svg>

                                                <h4 class="h4-gd"><strong>Endereço de email do professor:</strong></h4>
                                                <p  class="texto">${professor.emailUsuario}</p>
                                            </div>

                                            <div  style="margin:10px;"class="phone">
                                                <svg style="float: left;" class="bi me-1 " width="22" height="22"><use xlink:href="#phone"/></svg>

                                                <h4 class="col-lg-12"><strong>Telefone:</strong></h4>
                                                <p class="texto">${professor.telefoneUsuario}</p>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </section><!-- End Infopessoais Section -->

            <section  id="cursos" class="cursos">
                <div class="container">

                    <div class="section-title">
                        <h2>Cursos</h2>
                        <p >Todos os cursos que o Professor pode oferecer apareceram logo abaixo, Observe qual lhe interessa e seja relevante a sua busca. Facil e Rápido!</p>
                    </div>
                    <c:forEach var="curso_professor" items="${cursosProf}">
                        <div style=" margin-top: 5%;" class="icon-box d-inline-flex" data-aos="fade-up" data-aos-delay="200">
                            <div class="icon "><i class="fas fa-briefcase"></i></div>
                            <h4 class="title" style="margin-left:10px; margin-top: 15px; padding-right: 30px;"><a href="#cursos">${curso_professor.nomeCurso}</a></h4>
                        </div>

                    </c:forEach>
                </div>
            </section><!-- End Cursos Section -->


            <!-- ======= Testimonials Section ======= -->
            <section id="avaliacao" class="avaliacao section-bg">
                <div class="container">
                    <div class="section-title">
                        <h2>Avaliações</h2>
                        <p style="margin-left: 10px;">Abaixo você encontra as avaliações de outros usuários sobre este professor. Caso você queira avaliar este professor também, é bem simples, basta clicar no botão "Avaliar esse Professor" e pronto! Legal né. </p>
                    </div>

                    <c:forEach var="avaliacao" items="${avaliacoes}">
                        <div style="width: 110%; margin-left: -15px;" class="container" >
                            <hr>
                            <div style="margin-left: 20px; padding-bottom: 20px;" class="titulo">
                                <h2>${avaliacao.clienteAvaliacao}</h2>
                                <%@include file="../sistema_de_estrelas.jsp" %> 
                                <p class="sub-titulo">
                                    <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                                    ${avaliacao.comentarioAvaliacao}
                                    <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                                </p>

                            </div>
                            <hr>
                        </div>
                    </c:forEach>
                    <a  href="${pageContext.request.contextPath}/AvaliarProfessor?idUsuario=${professor.idUsuario}&idCliente=${idcliente}">   <button class="botão" type="submit" >Avaliar o professor</button></a>
                </div>



            </section><!-- End Testimonials Section -->

        </main><!-- End #main -->

        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="${pageContext.request.contextPath}/csscliente/libcliente/easing/easing.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/csscliente/libcliente/waypoints/waypoints.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/csscliente/libcliente/counterup/counterup.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/csscliente/libcliente/owlcarousel/owl.carousel.min.js" type="text/javascript"></script>

        <script src="${pageContext.request.contextPath}/js/jsvisualizarprofessor/glightbox.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/jsvisualizarprofessor/typed.min.js" type="text/javascript"></script>

        <!-- Template Javascript -->
        <script src="${pageContext.request.contextPath}/js/script.js"></script>  <!-- Custom scripts -->
        <script src="${pageContext.request.contextPath}/csscliente/jscliente/main.js" type="text/javascript"></script>      
    </body>
</html>
<%    } else {
        ((HttpServletResponse) response).sendRedirect("./index.jsp");

    }
%>