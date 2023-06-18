<%

    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpSession sessao = httpServletRequest.getSession();
    if (sessao.getAttribute("cliente") != null) {

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil Do Cliente</title>
        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link href="dist/css/style.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>   
        <link rel="icon" href="${pageContext.request.contextPath}/assets/images/favicon.png">
        <style>
            .backgrund{
                background-color:rgba(227, 228, 230, 0.6);
            }
            .subtitulo{

                color: black;
            }
            .gradiente{

                background: rgb(14,232,81);
                background: linear-gradient(0deg, rgba(14,232,81,1) 0%, rgba(0,218,188,1) 100%);
            }
            .cardbody{

                box-shadow: 1px 1px 1px 1px rgb(24, 106, 103);
                border-radius: 5px 5px 5px 5px;

            }
            .borda-form{
                border: 1px solid #212529;
            }

        </style>
    </head>

    <body class="backgrund" style=" margin-top: 100px; ">
        <%@include file="../Svg.jsp" %>
        <nav  style="background-color: #212529;" class="navbar navbar-expand-lg fixed-top navbar-dark " aria-label="Main navigation">
            <div class="container-fluid">
                <a style="margin-left: 65px;"  href="${pageContext.request.contextPath}/CerregarHomeCliente" class="nav-link text-white">
                    <p style=" position:absolute; left: 130px; top: 45px; " ></p>
                  <svg class="bi me-2" width="30" height="30"><use xlink:href="#voltar"/></svg>
                </a>
                <div class="container">
                    <div style="margin-left: 50%;"  class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault" >
                        <a class="navbar-brand logo-text ">UBEProf</a>

                    </div> <!-- end of navbar-collapse -->
                </div> 


                <div   style="margin-right: 3%;"  class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">
                    <ul       class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li  class="nav-item">
                            <a style=" font-size: 20px; " class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/LogoutCliente">Sair</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>



        <div  style="margin-bottom: 10%;" class="row">
            <!-- Column -->
            <div style="margin-left: 2%;     border-radius: 5px 5px 5px 5px;" class="col-lg-4 col-xlg-3 ">
                <div style=" background-color: white;     border-radius: 5px 5px 5px 5px; " class="card ">
                    <div class="cardbody">
                        <center class="mt-4"> <img src="assets/images/users/5.jpg"
                                                   class="rounded-circle" width="150" />
                            <h4 style="color: black;" class="card-title mt-2">${cliente.nomeUsuario}</h4>

                        </center>

                    </div>
                </div>
                <div style=" float: left;      border-radius: 5px 5px 5px 5px;" class="col-lg-12 col-xlg-12 ">
                    <div style=" background-color: white; " class="card ">
                        <div  class="cardbody">



                        </div>
                    </div>
                </div>
            </div>

            <div style=" margin-left: 2%; background-color: white;"  class="col-lg-7 col-xlg-8 cardbody">
                <div class="card">
                    <div  style=" background-color: white; " class="card-body">
                        <h2 style="color:black; margin-left: 1%; " class="subtitulo"> ${menssagemP}</h2>

                        <form  class="form-horizontal form-material mx-2" name="alterarprofessor" action="AlterarProfessor" >

                            <input type="hidden" value="${cliente.idUsuario}"  name="idUsuario" > 
                            <input type="hidden"  value="${cliente.idCliente}"   name="idProfessor" > 

                            <div class="form-group">
                                <label class="col-md-12 subtitulo">Nome:</label>
                                <div class="col-md-12">
                                    <input  type="text" placeholder="Nome" class="form-control borda-form form-control-line" value="${cliente.nomeUsuario}"  name="nomeProfessor" >
                                </div>
                            </div>
                            <br>

                            <div class="form-group">
                                <label for="example-email" class="col-md-12 subtitulo">Email:</label>
                                <div class="col-md-12">
                                    <input type="email" placeholder="Email" class="form-control borda-form form-control-line" value="${cliente.emailUsuario}" name="emailProfessor" >
                                </div>
                            </div>
                            <br>

                            <div class="form-group">
                                <label class="col-md-12 subtitulo">Senha:</label>
                                <div class="col-md-12">
                                    <input type="Senha" placeholder="Nome" class="form-control borda-form form-control-line" value="${cliente.senhaUsuario}" name="senhaProfessor" >
                                </div>
                            </div>

                            <br>
                            <div class="form-group">
                                <label class="col-md-12 subtitulo">Login:</label>
                                <div class="col-md-12">
                                    <input type="text" placeholder="Login" class="form-control borda-form form-control-line" value="${cliente.loginUsuario}"  name="loginProfessor" >
                                </div>
                            </div>
                            <br>
                            <div  class="form-group">
                                <label class="col-md-12 subtitulo">Telefone:</label>
                                <div class="col-xlg-3-12">
                                    <input type="text" placeholder="17988352523" class="form-control borda-form form-control-line" value="${cliente.telefoneUsuario}" name="telefoneProfessor" >
                                </div>
                            </div>

                            <div>
                                <div style=" float: left; width:45%" class="form-group">
                                    <label class="col-md-12 subtitulo">Cpf:</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Cpf" class="form-control borda-form form-control-line" value="${cliente.cpfCliente}" name="cpfCliente" >
                                    </div>
                                </div>

                                <div style=" float: right; width:45%" class="form-group">
                                    <label class="col-md-12 subtitulo">Cnpj:</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Cpf" class="form-control borda-form form-control-line" value="${cliente.cnpjCliente}" name="cpfCliente" >
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">

                                <label class="col-md-12 subtitulo">Endereço:</label>
                                <div class="col-md-12">
                                    <input type="text" placeholder="Cpf" class="form-control borda-form form-control-line" value="${cliente.enderecoCliente}" name="cpfCliente" >
                                </div>
                            </div>
                            <br>
                            <div class="form-group">
                                <label class="col-md-12 subtitulo"> Cidade:</label>
                                <div class="col-md-12">
                                    <input type="text" placeholder="Cpf" class="form-control borda-form form-control-line" value="${cliente.cidadeCliente}" name="cpfCliente" >
                                </div>
                            </div>
                            <br>
                            <div class="form-group">
                                <div class="col-sm-12">
                                    <input class=" subtitulo btn btn-secondary" type="submit" name="alterar" value="Alterar">
                                </div>
                            </div>

                        </form>
                    </div>

                </div>
            </div>
            <!-- Column -->
        </div>


    </body>
</html>
<%    } else {
        ((HttpServletResponse) response).sendRedirect("./index.jsp");

    }
%>