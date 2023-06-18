<%-- 
    Document   : cadastrartrem
    Created on : 08/12/2022, 18:24:22
    Author     : joaos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="apple-touch-icon" sizes="76x76" href="${pageContext.request.contextPath}/assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/img/mapa.png">
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/css/assets/img/trem.png">
        <title>
            Cadastro de Trem
        </title>
        <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
        <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
        <!-- Nucleo Icons -->
        <link href="${pageContext.request.contextPath}/css/assets/css/nucleo-icons.css" rel="stylesheet" />
        <!-- CSS Files -->
        <link href="${pageContext.request.contextPath}/css/assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="${pageContext.request.contextPath}/css/assets/demo/demo.css" rel="stylesheet" />

        <link href="${pageContext.request.contextPath}/css/cssempresa.css" rel="stylesheet" type="text/css" />

    </head>

    <body>
        <%@include file="sidebar.jsp" %>
        <div class="main-panel">
            <div class="col-6" style=" margin-left: 20%; margin-top:5%  ">
                <div class="formulario">
                    <form action="${pageContext.request.contextPath}/CadastrarTrem" method="">
                        <h1 class="text-primary">CADASTRAR TREM</h1>
                        <div class="h3">${menssagem}</div>
                        <div class="form">
                            <label>Nome do trem:</label>
                            <input type="text" placeholder="Nome Completo" id="campotel"
                                   class="form-control" maxlength="40" name="nomeTrem">
                        </div>
                        <br>
                        <div class="form">
                            <label>Modelo Trem</label>
                            <input oninput="mascara(this, 'cpf')" id="campotel" class="form-control"
                                   placeholder="CPF" autocomplete="off" type="text" name="modeloTrem">

                        </div>
                        <br>

                        <div class="form">
                            <label>Tipo Comb Trem</label>
                            <input oninput="mascara(this, 'rg')" id="campotel" class="form-control"
                                   placeholder="Razão Social" autocomplete="off" type="text"
                                   name="tpcombTrem">
                        </div>
                        <div class="form">
                            <input  id="campotel" class="form-control" type="text" name="idEmpresa" hidden="true" value="${idemp}" >
                        </div>
                        <br>
                        <div style="position: relative; left:-15" class="col-sm-12">
                            <input class=" btn btn-secondary" type="submit"
                                   name="cadastrar" value="Cadastrar">
                        </div>
                    </form>
                </div>
            </div>
            


        </div>

    </body>

</html>
