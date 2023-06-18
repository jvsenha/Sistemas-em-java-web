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
        <link rel="icon" type="image/png" href="css/assets/img/trem.png">
        <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
        <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
        <!-- Nucleo Icons -->
        <link href="${pageContext.request.contextPath}/css/assets/css/nucleo-icons.css" rel="stylesheet" />
        <!-- CSS Files -->
        <link href="${pageContext.request.contextPath}/css/assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="${pageContext.request.contextPath}/css/assets/demo/demo.css" rel="stylesheet" />

        <link href="${pageContext.request.contextPath}/css/cssempresa.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/css/assets/img/trem.png">  <title>
            Cadastro de Empresas
        </title>


        <style>
                

            .form-control{
                height: 50px;
            }
        </style>
    </head>
    <body >
        <div class="wrapper">
            <div >
         <%@include file="sidebar.jsp" %>
            </div>

            
            
            
            
            
            
             <div class="col-6 container">
                    <div class="formulario" style="margin-top: 10%;">

                        <h1 class="text-primary">CADASTRAR PRODUTO</h1>
                         <div class="h3">${menssagem}</div>
                         <form name="cadastra" action="${pageContext.request.contextPath}/CadastrarMaquinista" method="POST">  

                        <div  class="input-group-text mt-2 mb-2 border-0 ">
                           <span  class="input-group-text mr-2" id="basic-addon1">Nome:</span>
                            <input name="nomemaquinista"  type="text" id="campotel" class="form-control" style="color: #000" class="form-control ml-3"  placeholder="Nome"  aria-label="Nome" aria-describedby="basic-addon1">
                        </div>
                        <div class="input-group-text mt-2 mb-2 border-0 ">
                             <span  class="input-group-text" id="basic-addon1" >Empresa:</span>
                            <select class="form-select ml-3" aria-label="Default select example" name="idEmp">
                                <c:forEach var="empresa" items="${empresas}">
                                    <option value="${empresa.idEmpresa}" > ${empresa.nomeEmp}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div  class="input-group-text mt-2 mb-2 border-0 ">
                            <span class="input-group-text mr-2" id="basic-addon2" >@example.com</span>
                            <input name="emailmaquinista"  type="text" id="campotel" class="form-control"style="color: #000" class="form-control ml-3"  placeholder="Insira o Email" aria-label="Recipient's username" aria-describedby="basic-addon2">
                        </div>

                        <div  class="input-group-text mt-2 mb-2 border-0 ">
                            <span class="input-group-text mr-2" >Telefone</span>
                            <input name="telmaquinista"  type="text"id="campotel" class="form-control" style="color: #000" class="form-control ml-3"  placeholder="Telefone" >
                        </div>

                        <div  class="input-group-text mt-2 mb-2 border-0 ">
                            <span class="input-group-text mr-2" >Login</span>
                            <input name="loginmaquinista"  type="text" id="campotel" class="form-control" style="color: #000" class="form-control ml-3"  placeholder="Username" aria-label="Username">
                        </div>
                        <div  class="input-group-text mt-2 mb-2 border-0 ">
                            <span class="input-group-text mr-2" >Senha</span>
                            <input name="senhamaquinista"  type="text" id="campotel" class="form-control" style="color: #000" class="form-control ml-3"  placeholder="Server" aria-label="Server">
                        </div>
                        <div  class="input-group-text mt-2 mb-2 border-0 " >
                            <span class="input-group-text mr-2" >Nascimento</span>
                            <input name="nascmaquinista" type="date" id="campotel" class="form-control" style="color: #000" class="form-control ml-3"  placeholder="Data">

                        </div>
                        <div  class="input-group-text mt-2 mb-2 border-0 ">
                            <span class="input-group-text mr-2">Rg</span>
                            <input name="rgmaquinista" id="campotel" class="form-control" type="text"  style="color: #000" class="form-control ml-3"  placeholder="Rg">

                        </div>
                        <div  class="input-group-text mt-2 mb-2 border-0 ">
                            <span class="input-group-text mr-2" >Cidade</span>
                            <input name="cidademaquinista"  type="text"  style="color: #000" id="campotel" class="form-control"  placeholder="Cidade">

                        </div>
                        <button style=" color: #ffffff;" class="btn btn-secondary bg-dark m-3"   type="submit" >Criar Conta</button>
                    </form>
                       



                    </div>
                </div>
            
            
            
            
            
            
      
   </div>
        </div>
    </body>
</html>
