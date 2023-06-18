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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa</title>



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
        <!-- Custom CSS -->
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="${pageContext.request.contextPath}/dist/css/style.min.css" rel="stylesheet" type="text/css"/>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- Template Stylesheet -->
        <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>
        <!-- Favicon -->

        <link rel="icon" href="${pageContext.request.contextPath}/assets/images/favicon.png">
        <style>
            .filtro{
                border: 1px solid #000;
                box-shadow: 5px 5px rgba(14, 233, 81, 1); 
                height: 600px; 
                width: 300px; 
                position: absolute;
                top: 150px;
                left: 2%;
            }
            .filtro:hover{border: 1px solid #000;
                          box-shadow: 5px 5px 5px rgba(14, 233, 81, 1); 
                          height: 600px; width: 300px; 
                          position: absolute; top: 150px;
                          left: 2%;
            }
            .card-curso{
                margin: 10px; 
                height:16%;
                border: 1px solid #cccccc;
                box-shadow: 5px 5px rgba(14, 233, 81, 1);
                cursor: pointer;
            }
            .card-curso:hover {
                margin: 10px; 
                height:16%;
                border: 1px solid #cccccc;
                box-shadow: 5px 5px 5px rgba(14, 233, 81, 1);
            }
            .titulo h2{
                font-size: 32px;
                font-weight: bold;
                margin-bottom: 5px;
                padding-bottom: 5px;
                position: relative;
                color: #000000;
            }
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

            .text-card {
                margin: 20px auto;
            }
            .subtitulo{
                color: #666666;
                font-family: sans-serif;
                font-size:20px;
                padding-right: 50%;
                padding-bottom: 10px;
                font-weight: bold;
            }
            .avaliacao{
                position: relative;
                bottom:  73%;
                margin-left: 450px;
            }
            .container1 {
                display: block;
                margin: 15px;
                position: relative;
                padding-left: 35px;
                margin-bottom: 12px;
                cursor: pointer;
                font-size: 22px;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
            }

            /* Hide the browser's default checkbox */
            .container1 input {
                position: absolute;
                opacity: 0;
                cursor: pointer;
                height: 0;
                width: 0;
            }

            /* Create a custom checkbox */
            .checkmark1 {
                position: absolute;
                top: 0;
                left: 0;
                height: 25px;
                width: 25px;
                background-color: #eee;
            }

            /* On mouse-over, add a grey background color */
            .container1:hover input ~ .checkmark {
                background-color: #ccc;
            }

            /* When the checkbox is checked, add a blue background */
            .container1 input:checked ~ .checkmark {
                background-color: rgba(14, 233, 81, 1);
            }

            /* Create the checkmark/indicator (hidden when not checked) */
            .checkmark1:after {
                content: "";
                position: absolute;
                display: none;
            }

            /* Show the checkmark when checked */
            .container1 input:checked ~ .checkmark:after {
                display: block;
            }

            /* Style the checkmark/indicator */
            .container1 .checkmark:after {
                left: 9px;
                top: 5px;
                width: 5px;
                height: 10px;
                border: solid white;
                border-width: 0 3px 3px 0;
                -webkit-transform: rotate(45deg);
                -ms-transform: rotate(45deg);
                transform: rotate(45deg);
            }
        </style>

    </head>
    <body >
        <%@include file="../Svg.jsp" %>
        <nav style="background-color: #212529!important;" id="navbar" class="navbar navbar-expand-lg fixed-top navbar-dark" aria-label="Main navigation">
            <div class="container"> 
                <a style="margin-left: 0%;" class="navbar-brand logo-text" href="${pageContext.request.contextPath}/CerregarHomeCliente">UBEProf</a> 
                <div class="container-fluid">
                    <form class="d-flex col-5" style="margin: auto;" action="${pageContext.request.contextPath}/BuscarCurso" role="search" method="POST">
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
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/CarregarCliente?idUsuario=${usuario}">Seu Perfil</a></li>
                                <li><div class="dropdown-divider"></div></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/LogoutCliente">Sair</a></li>
                                <li><div class="dropdown-divider"></div></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/CerregarHomeCliente">Home</a></li>
                            </ul>
                        </li>
                    </ul>
                </div> <!-- end of navbar-collapse -->
            </div> <!-- end of container -->
        </nav>

        <div class="filtro" >
            <form action="${pageContext.request.contextPath}/FiltrosPesquisa" method="" >
                <input type="hidden" value="${nomeCurso}" name="nomeCurso">
                <input type="hidden" value="${cidade}" name="cidade">

                <label style="margin: 10px;"> 
                    <input name="numFiltro" type="radio"  style=" float: left; height: 25px; width: 25px; margin: 10px;" value='1' >
                    <p style=" margin-left: 2px;">Filtrar Pela região de ${cidade}</p>
                    <span class=""></span>
                </label>
                <hr>
                <label style="margin: 10px;" >

                    <input name="numFiltro" type="radio"  style="float: left; height: 25px; width: 25px; margin: 10px;" value='2'  >
                    <p style=" margin-left: 2px;">Filtrar Por avaliaçoes maiores de 3 Estrelas</p>
                    <span class=""></span>
                </label>
                <hr>
                <label style="margin: 10px;" >
                    <input name="numFiltro"  type="radio"  style=" float: left; height: 25px; width: 25px; margin: 10px;" value='3' >
                    <p style=" margin-left: 2px;">Filtrar Por avaliaçoes de 5 Estrelas</p>
                </label>
                <hr>
                <label style="margin: 10px;" >
                    <input name="numFiltro"  type="radio"  style=" float: left; height: 25px; width: 25px; margin: 10px;" value='0' >
                    <p style=" margin-left: 2px;">Limpar o Filtro de pesquisas</p>
                </label>
                <hr>
                <button class=" botão1" style=" margin-left:35%; height: 40px;" type="submit">Search</button>

            </form>
        </div>


        <div style="position: absolute;  top: 150px; left: 600px;" class=" col-12">

            <c:forEach var="cursoprofessor" items="${cursos}">
                <div    class="row col-6 card-curso">
                    <div>
                        <div>

                            <h2 Style=" padding-top: 5px;" class="titulo"> Curso de ${cursoprofessor.nomeCurso}</h2>
                            <p style="color: #000; font-family: sans-serif; font-size: 25px; " class="h5"> Professor ${cursoprofessor.nomeProfessor}</p>
                            <p class="subtitulo"> Cidade:${cursoprofessor.cidadeProfessor} </p>
                        </div>

                        <div  class="estrelas avaliacao">

                            <c:choose>
                                <c:when test="${cursoprofessor.avProfessor>='3'}">
                                    <span class="label label-success label-rounded">${cursoprofessor.avProfessor}</span> 
                                    <br />
                                </c:when>    
                                <c:otherwise>
                                    <span style="background-color: #dc3545;" class="label label-danger label-rounded">${cursoprofessor.avProfessor}</span> 
                                    <br />
                                </c:otherwise>
                            </c:choose>

                        </div>


                    </div> 
                </div>
            </c:forEach>

        </div>


        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="../csscliente/libcliente/easing/easing.min.js" type="text/javascript"></script>
        <script src="../csscliente/libcliente/waypoints/waypoints.min.js" type="text/javascript"></script>
        <script src="../csscliente/libcliente/counterup/counterup.min.js" type="text/javascript"></script>
        <script src="../csscliente/libcliente/owlcarousel/owl.carousel.min.js" type="text/javascript"></script> <!-- Template Javascript -->
        <script src="../js/script.js"></script> <!-- Custom scripts -->
        <script src="../csscliente/jscliente/main.js" type="text/javascript"></script>

    </body>
</html>
<%    } else {
        ((HttpServletResponse) response).sendRedirect("./index.jsp");

    }
%>