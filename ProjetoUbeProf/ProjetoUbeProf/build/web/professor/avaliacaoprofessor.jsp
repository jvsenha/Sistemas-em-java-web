<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpSession sessao = httpServletRequest.getSession();
    if (sessao.getAttribute("professor") != null) {

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Minhas Avaliações</title>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">
        <link rel="icon" href="${pageContext.request.contextPath}/assets/images/favicon.png">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link href="${pageContext.request.contextPath}/dist/css/style.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/styleperfil.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/swiper.css" rel="stylesheet" type="text/css"/>
        <link href="../css/csshomecliente.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <!-- JavaScript Bundle with Popper -->
        <style>

            .botão{
                position:  relative;
                left: 0%;
                margin-top: 6%;
                color: white;
                border-width: 2px;
                padding: 10px 10px;
                border: 1px solid rgba(14, 233, 81, 1);
                box-shadow: 5px 5px  rgba(14, 233, 81, 1);
                background: transparent;
                cursor: pointer;
                width: 20%;
                height: 20%;
            }
            .botão:hover{
                background-image: linear-gradient(to right, #1be75a , #11dbc0);
                box-shadow: 0px 0px  rgba(14, 233, 81, 1);
                border: 0px ;
            }
            .botão1{
                position:  relative;
                left: 0%;
                margin-top: 6%;
                color: white;
                border-width: 2px;
                padding: 10px  9px;
                border: 1px solid rgba(14, 233, 81, 1);
                background: transparent;
                cursor: pointer;
                width: 10%;
                height: 10%;
            }
            .botão1:hover{
                background-image: linear-gradient(to right, #1be75a , #11dbc0);
                box-shadow: 0px 0px  rgba(14, 233, 81, 1);
                border: 0px ;
            }
        </style>
    </head>
    <body>

        <%@include file="../Svg.jsp" %>
        <nav  style="background-color: black; height: 80px;" id="navbar" class="navbar navbar-expand-lg fixed-top navbar-dark" aria-label="Main navigation">
            <a style="margin-left: 65px;" href="${pageContext.request.contextPath}/CarregarProfessor?idUsuario=${professor.idUsuario}" class="nav-link text-white">
                <svg class="bi me-2" width="30" height="30"><use xlink:href="#voltar"/></svg>
                Home
            </a>
            <div class="container">

                <div style="margin-left: 40%;"  class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault" >
                    <a class="navbar-brand logo-text">UBEProf</a>

                </div> <!-- end of navbar-collapse -->
            </div> <!-- end of container -->
        </nav>         

        <div style=" position: absolute; top: 15%; padding-left: 12%; padding-bottom: 40px;" class="col-10">
            <div class="">
                <h2>Avaliações</h2> 
                <hr style=" width:5%; height: 5px; background-color: #0ee951;   margin-top:9px;  opacity: 100;">  
                <p class="h4">Abaixo você encontra as avaliações de outros usuários sobre este professor. Caso você queira avaliar este professor também, é bem simples, basta clicar no botão "Avaliar esse Professor" e pronto! Legal né. </p>
            </div>

            <c:forEach var="avaliacao" items="${avaliacoes}">
                <div style="width: 110%; margin-left: -15px;" >
                    <hr style="width: 100%">
                    <div style="margin-left: 20px; padding-bottom: 20px;">
                        <div>
                            <h3 style="float: left; padding-right: 10px;" ><strong>${avaliacao.clienteAvaliacao}</strong></h3>
                            <div>
                                <c:choose>
                                    <c:when test="${avaliacao.notaAvaliacao=='1'}">
                                        <c:forEach var = "i" begin = "1" end = "1">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrela"/></svg> 
                                        </c:forEach>
                                        <c:forEach var = "i" begin = "1" end = "4">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrelavz"/></svg> 
                                        </c:forEach>
                                    </c:when>
                                    <c:when test="${avaliacao.notaAvaliacao=='2'}">
                                        <c:forEach var = "i" begin = "1" end = "2">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrela"/></svg> 
                                        </c:forEach>
                                        <c:forEach var = "i" begin = "1" end = "3">
                                            <svg class="bi me-2"width="20" height="20"><use xlink:href="#estrelavz"/></svg> 
                                        </c:forEach>
                                    </c:when>
                                    <c:when test="${avaliacao.notaAvaliacao=='3'}">
                                        <c:forEach var = "i" begin = "1" end = "3">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrela"/></svg> 
                                        </c:forEach>
                                        <c:forEach var = "i" begin = "1" end = "2">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrelavz"/></svg> 
                                        </c:forEach>
                                    </c:when>
                                    <c:when test="${avaliacao.notaAvaliacao=='4'}">
                                        <c:forEach var = "i" begin = "1" end = "4">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrela"/></svg> 
                                        </c:forEach>
                                        <c:forEach var = "i" begin = "1" end = "1">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrelavz"/></svg> 
                                        </c:forEach>
                                    </c:when>
                                    <c:otherwise>
                                        <c:forEach var = "i" begin = "1" end = "5">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrela"/></svg> 
                                        </c:forEach>
                                    </c:otherwise>
                                </c:choose>
                            </div>
                        </div>
                    </div>
                    <div style="margin-left: 20px; padding-bottom: 20px; font-size: 20px; color: #999999">
                        <p class="txtBusca">

                            ${avaliacao.comentarioAvaliacao}

                        </p>
                    </div>
                    <hr>
                </div>
            </c:forEach>
        </div>


    </body>
</html>
<%    } else {
        ((HttpServletResponse) response).sendRedirect("./index.jsp");

    }
%>