<%-- 
    Document   : cadastraradmsis
    Created on : 03/12/2022, 17:09:26
    Author     : joaos
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
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
        <title>
            Cadastro de ADministrador
        </title>


        <style>
            .cadastrar{
                background: rgb(255,255,255);
                background: linear-gradient(90deg, rgba(255,255,255,1) 25%, rgba(235,224,238,1) 42%, rgba(143,85,162,1) 64%, rgba(93,9,121,1) 78%, rgba(38,21,43,1) 98%);
            }

            .form-control{
                height: 50px;
            }
        </style>
    </head>
    <body class="cadastrar  pb-lg-5">

        <div  class="container-fluid text-light  " > 
            <div class='row'>
               <nav class="navbar navbar-absolute navbar-transparent" style="position: absolute; top: 1%;">
            <div class="container-fluid">
                <div class="navbar-wrapper">
                    <a class="navbar-brand" style="color: #000" href="${pageContext.request.contextPath}/admemp/logaradmemp.jsp"><i class="bi bi-arrow-return-left fa-2x" ></i> </a>
                </div>
            </div>
        </nav>
            </div>
            <div class="row">
                <div class="col-6 m-3" style=" margin-left: 50px; ">
                    <h1 class="h3" style="color: #000; margin-top: 50px;" ><strong> Usuario, Registre-se Aqui</strong></h1>

                    <form name="cadastra" action="${pageContext.request.contextPath}/CadastrarAdmEmp" method="POST">  

                        <div  class="input-group-text mt-2 mb-2 border-0 ">
                            <span  class="input-group-text" id="basic-addon1" style="color: #000">Nome:</span>
                            <input name="nomeAdmempresa" style="background-color: #ffffff" type="text"  id="campotel" style="color: #000" class="form-control ml-3" placeholder="Nome"  aria-label="Nome" aria-describedby="basic-addon1">
                        </div>
                        <div class="input-group-text mt-2 mb-2 border-0 ">
                            <span  class="input-group-text" id="basic-addon1" style="color: #000">Empresa:</span>
                            <select class="form-select border-1 ml-3" aria-label="Default select example" name="idEmp">
                                <c:forEach var="empresa" items="${empresas}">
                                    <option value="${empresa.idEmpresa}" > ${empresa.nomeEmp}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="input-group-text mt-2 mb-2 border-0 ">
                            <span  class="input-group-text" id="basic-addon1" style="color: #000">@example.com</span>
                            <input name="emailAdmempresa" style="background-color: #ffffff" type="text" id="campotel" style="color: #000" class="form-control ml-3" placeholder="Insira o Email" aria-label="Recipient's username" aria-describedby="basic-addon2">
                        </div>

                        <div class="input-group-text mt-2 mb-2 border-0 ">
                            <span  class="input-group-text" id="basic-addon1" style="color: #000">Telefone</span>
                            <input name="telAdmempresa" style="background-color: #ffffff" type="text" id="campotel" style="color: #000" class="form-control ml-3" placeholder="Telefone" >
                        </div>

                        <div class="input-group-text mt-2 mb-2 border-0 ">
                            <span  class="input-group-text" id="basic-addon1" style="color: #000">Login</span>
                            <input name="loginAdmempresa" style="background-color: #ffffff; color: black" type="text" id="campotel" style="color: #000" class="form-control ml-3" placeholder="Username" aria-label="Username">
                        </div>
                        <div class="input-group-text mt-2 mb-2 border-0 ">
                            <span  class="input-group-text" id="basic-addon1" style="color: #000">Senha</span>
                            <input name="senhaAdmempresa" style="background-color: #ffffff; color: black" type="text" id="campotel" style="color: #000" class="form-control ml-3" placeholder="Server" aria-label="Server">
                        </div>
                        <div class="input-group-text mt-2 mb-2 border-0 " >
                            <span  class="input-group-text" id="basic-addon1" style="color: #000">Nascimento</span>
                            <input name="nascAdmempresa" type="date" id="campotel" style="color: #000" class="form-control ml-3" placeholder="Data">

                        </div>
                        <div class="input-group-text mt-2 mb-2 border-0 " >
                            <span  class="input-group-text" id="basic-addon1" style="color: #000">Rg</span>
                            <input name="rgAdmempresa" style="background-color: #ffffff; color: black" type="text" id="campotel" style="color: #000" class="form-control ml-3" placeholder="Rg">

                        </div>
                        <div class="input-group-text mt-2 mb-2 border-0 " >
                            <span  class="input-group-text" id="basic-addon1" style="color: #000">Cidade</span>
                            <input name="cidadeAdmempresa" style="background-color: #ffffff; color: black" type="text" id="campotel" style="color: #000" class="form-control ml-3" placeholder="Cidade">

                        </div>
                        <button style=" color: #ffffff;" class="btn btn-secondary bg-dark"   type="submit" >Criar Conta</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
