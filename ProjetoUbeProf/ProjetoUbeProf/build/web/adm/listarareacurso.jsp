<%-- 
    Document   : listarareacurso
    Created on : 29 de mai. de 2022, 16:59:32
    Author     : joaos
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title> Home</title>
        
        <link rel="icon" type="image/png" sizes="16x16" href="assets/images/favicon.png">
        
        <link href="dist/css/style.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/styleperfil.css" rel="stylesheet" type="text/css"/>
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="assets/libs/chartist/dist/chartist.min.css" rel="stylesheet">
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
                <style>
            .backgrund{
                background-color: #e8e8e8;
            }
            .subtitulo{

                color: black;
            }
            .gradiente{

                background: rgb(14,232,81);
                background: linear-gradient(0deg, rgba(14,232,81,1) 0%, rgba(0,218,188,1) 100%);
            }
            .cardbody{

                box-shadow: 2px 4px 0px 4px rgba(14, 233, 81, 1);
                border-radius: 10px 20px 30px;
                ;
            }
            .borda-form{
                border: 1px solid #212529;
            }

        </style>
    </head>

    <body style="background-color: #212529!important;"  >
        <!-- ============================================================== -->
        <!-- Preloader - style you can find in spinners.css -->
        <!-- ============================================================== -->

        <%@include file="../Svg.jsp" %>
               <nav  style="background-color: black;" id="navbar" class="navbar navbar-expand-lg fixed-top navbar-dark" aria-label="Main navigation">
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
    </head>

        <div style="position: absolute; top: 150px; left:10%; " class="col-lg-4 col-xlg-3 ">
            <div style=" background-color: whitesmoke; border-radius: 10px 20px 30px;" class="card ">
                <div class="cardbody">
                    <center class="mt-4"> 
                        <h4 style="color: black;" class="card-title mt-2">Area</h4>
                        <table class="table table-hover" style="width: 95%">
                            <thead>
                                <tr>
                                    <th  style="padding-left: 4%;" class="border-top-0">ID</th>
                                    <th  style="padding-left: 4%;" class="border-top-0">NOME</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="area" items="${areas}">
                                    <tr>
                                        <th align="justify">${area.idArea}</th>
                                        <th align="justify">${area.nomeArea}</th>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </center>
                </div>
            </div>
        </div>
        <div style="position: absolute; top: 150px; right:10%; " class="col-lg-4 col-xlg-3 ">
            <div style=" background-color: whitesmoke; border-radius: 10px 20px 30px;" class="card ">
                <div class="cardbody">
                    <center class="mt-4"> 
                        <h4 style="color: black;" class="card-title mt-2">Curso</h4>
                        <table class="table table-hover" style="width: 95%">
                            <thead>
                                <tr>
                                    <th colspan="1"  style="padding-left: 4%;" class="border-top-0">ID</th>
                                    <th colspan="2"  style="padding-left: 4%;" class="border-top-0">NOME</th>
                                </tr>
                            </thead>
                            <tbody>
                                 <c:forEach var="curso" items="${cursos}">
                                <tr>
                                    <th  style="padding-left: 4%;"align="justify">${curso.idCurso}</th>
                                    <th style="padding-left: 4%;" align="justify">${curso.nomeCurso}</th>
                                </tr>
                                 </c:forEach>
                            </tbody>
                        </table>
                    </center>
                </div>
            </div>
        </div>
    </body>
</html>
