<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

HttpServletRequest httpServletRequest =(HttpServletRequest) request;
HttpSession sessao = httpServletRequest.getSession();
if(sessao.getAttribute("administrador") != null){

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Tell the browser to be responsive to screen width -->
        <title> Home</title>
        <link rel="canonical" href="https://www.wrappixel.com/templates/niceadmin-lite/" />
        <!-- Favicon icon -->
        <!-- Custom CSS -->
        <link href="css/sidebars.css" rel="stylesheet" type="text/css"/>
        <script src="js/sidebars.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <link href="dist/css/style.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/styleperfil.css" rel="stylesheet" type="text/css"/>
        <link href="css/swiper.css" rel="stylesheet" type="text/css"/>
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
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
        <link rel="icon" href="${pageContext.request.contextPath}/assets/images/favicon.png">
    </head>
    <body style="background-color: #212529!important;">
        <%@include  file="Svg.jsp"%>
        <nav id="navbar" class="navbar navbar-expand-lg fixed-top " style="background-color: black" aria-label="Main navigation">

            <div class="container" style="margin-left: 45%">


                <a class="navbar-brand logo-text" >UBEProf</a>


            </div>
            <div  style="margin-right: 10%" class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault" >
                <ul class="navbar-nav ms-auto navbar-nav-scroll">
                    <li class="nav-item">
                        <a style="align:right; font-size: 20px;margin-left: 30px;  " class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/LogoutAdm">Sair</a>
                    </li>
                </ul>


            </div> <!-- end of navbar-collapse --><!-- end of container -->
        </nav> 
                    
                        <h1 style="position: absolute; top: 100px; left: 13%; color: white; ">${mensagemadm}</h1>
        <div style="position: absolute; top: 100px; left: 8%;" class="col-lg-12 col-xlg-12 "">
            <div style="position: absolute; top: 100px; left:5%; " class="col-lg-2 col-xlg-3 ">
                <div style=" background-color: whitesmoke; border-radius: 10px 20px 30px;" class="card ">
                    <div class="cardbody">
                        <center class="mt-4"> 
                            <a href="ListarAreaCurso" class="nav-link text-white" aria-current="page">
                                 <svg style="color: black;" class="bi me-2" width="25" height="25"><use xlink:href="#collection"/></svg>
                            <h4 style="color: black;" class="card-title mt-2">Areas e Cursos</h4>
                            </a>
                        </center>
                    </div>
                </div>
            </div>
            <div style="position: absolute; top: 100px; left:25%; " class="col-lg-2 col-xlg-3 ">
                <div style=" background-color: whitesmoke; border-radius: 10px 20px 30px;" class="card ">
                    <div class="cardbody">
                        <center class="mt-4"> 
                            <a href="ListarAdm" class="nav-link text-white" aria-current="page">
                                <svg style="color: black;" class="bi me-2" width="25" height="25"><use xlink:href="#adm"/></svg>
                                <h4 style="color: black;" class="card-title mt-2">  Administradores</h4>
                            </a>

                        </center>
                    </div>
                </div>
            </div>
            <div style="position: absolute; top: 100px; left:45%; " class="col-lg-2 col-xlg-3 ">
                <div style=" background-color: whitesmoke; border-radius: 10px 20px 30px;" class="card ">
                    <div class="cardbody">
                        <center class="mt-4"> 
                            <a  href="ListarCliente" class="nav-link text-white">
                                <svg style="color: black;" class="bi me-2" width="25" height="25"><use xlink:href="#cliente"/></svg>
                                <h4 style="color: black;" class="card-title mt-2"> Clientes</h4>
                            </a>
                        </center>
                    </div>
                </div>
            </div>
            <div style="position: absolute; top: 100px; left:65%; " class="col-lg-2 col-xlg-3 ">
                <div style=" background-color: whitesmoke; border-radius: 10px 20px 30px;" class="card ">
                    <div class="cardbody">
                        <center class="mt-4"> 
                            <a href="ListarProfessor" class="nav-link text-white">
                                <svg style="color: black;" class="bi me-2" width="25" height="25"><use xlink:href="#professor"/></svg>
                                <h4 style="color: black;" class="card-title mt-2"> Professores</h4> 
                            </a>

                        </center>
                    </div>
                </div>
            </div>
            <div style="position: absolute; top: 300px; left:5%;" class="col-lg-2 col-xlg-3 ">
                <div style="  height: 145px; background-color: whitesmoke; border-radius: 10px 20px 30px;" class="card ">
                    <div  style="  height: 145px;"  class="cardbody ">
                        <center class="mt-4">
                            <a  href="CarregarAdm?idUsuario=${usuario}" class="nav-link text-white">
                                <svg style="color: black;" class="bi me-2" width="25" height="25"><use xlink:href="#people-circle"/></svg>
                                <h4 style="color: black;" class="card-title mt-2">Perfil</h4>
                            </a>
                        </center>
                    </div>
                </div>
            </div>
            <div style="position: absolute; top: 300px; left:25%; " class="col-lg-2 col-xlg-3 ">
                <div style=" background-color: whitesmoke; border-radius: 10px 20px 30px;" class="card ">
                    <div class="cardbody">
                        <center class="mt-4">
                            <a href="adm/cadastrararea.jsp" class="nav-link text-white" style="text-align: " >
                                <svg style="color: black;"class="bi me-2" width="25" height="25"><use xlink:href="#new-adm"/></svg>
                                <h4 style="color: black;" class="card-title mt-2">Cadastrar Nova Area</h4>
                            </a>
                        </center>
                    </div>
                </div>
            </div>
            <div style="position: absolute; top: 300px; left:45%; " class="col-lg-2 col-xlg-3 ">
                <div style=" background-color: whitesmoke; border-radius: 10px 20px 30px;" class="card ">
                    <div class="cardbody">
                        <center class="mt-4">
                            <a href="ListarAreaCursoAdm" class="nav-link text-white" style="text-align: " >
                                <svg style="color: black;"class="bi me-2" width="25" height="25"><use xlink:href="#new-adm"/></svg>
                                <h4 style="color: black;" class="card-title mt-2">Cadastrar Novo Curso</h4>
                            </a>
                        </center>
                    </div>
                </div>
            </div>
            <div style="position: absolute; top: 300px; left:65%; " class="col-lg-2 col-xlg-3 ">
                <div style=" background-color: whitesmoke; border-radius: 10px 20px 30px;" class="card ">
                    <div class="cardbody">
                        <center class="mt-4">  
                            <a href="adm/cadastraradm.jsp" class="nav-link text-white" style="text-align: " >
                                <svg style="color: black;" class="bi me-2" width="25" height="25"><use xlink:href="#new-adm"/></svg>
                                <h4 style="color: black;" class="card-title mt-2">  Cadastrar Novo Adiministrador </h4>
                            </a>
                        </center>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
<%
    } else {
((HttpServletResponse) response).sendRedirect("./index.jsp");

}
%>