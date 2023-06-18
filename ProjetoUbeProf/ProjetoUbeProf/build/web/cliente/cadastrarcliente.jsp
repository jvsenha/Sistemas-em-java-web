<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- SEO Meta Tags -->
        <meta name="description" content="Your description">
        <meta name="author" content="Your name">

        <!-- OG Meta Tags to improve the way the post looks when you share the page on Facebook, Twitter, LinkedIn -->
        <meta property="og:site_name" content="" /> <!-- website name -->
        <meta property="og:site" content="" /> <!-- website link -->
        <meta property="og:title" content=""/> <!-- title shown in the actual shared post -->
        <meta property="og:description" content="" /> <!-- description shown in the actual shared post -->
        <meta property="og:image" content="" /> <!-- image link, make sure it's jpg -->
        <meta property="og:url" content="" /> <!-- where do you want your post to link to -->
        <meta name="twitter:card" content="summary_large_image"> <!-- to have large image post format in Twitter -->

        <!-- Webpage Title -->
        <title>UBEProf</title>

        <!-- Styles -->
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;700&display=swap" rel="stylesheet">

        <link href="../css/aos.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <link href="../css/fontawesome-all.min.css" rel="stylesheet" type="text/css"/>

        <link href="../css/signin.css" rel="stylesheet" type="text/css"/>

        <link href="../css/style.css" rel="stylesheet" type="text/css"/>

        <link href="../css/swiper.css" rel="stylesheet" type="text/css"/>
        <script src="../js/scriptmasc.js" type="text/javascript"></script>
        <!-- Favicon -->
        <link rel="icon" href="../assets/images/favicon.png">
    </head>
    <body class="cadastrar d-flex align-items-center py-5" >
        <%@include file="../navbar.jsp" %>
           <div  style="margin-left: 55px; margin-top: 100px;" class="container-fluid text-light">
            <div class="row">
                <div style="width:50%">
                    <div>
                        <h1 class="h3  mb-3 fw-normal" style="color: white"><strong> Cliente, Registre-se Aqui</strong></h1>

                        <div style="color: white"><strong>${message}</strong></div>
                         <form name="login" action="${pageContext.request.contextPath}/CadastrarCliente" method="POST">  
                        <div class="row" > 
                            <div class="col-lg-6">
                                    <div class="form-group py-2">
                                        <input type="email" class="form-control form-control-input" id="exampleFormControlInput1" placeholder="Endereço de Email" data-ls-module="charCounter" maxlength="30" name="emailCliente">
                                    </div>                                
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group py-2">
                                    <input type="password" class="form-control form-control-input" id="exampleFormControlInput2" placeholder="Senha" data-ls-module="charCounter" maxlength="8" name="senhaCliente">
                                </div>                                 
                            </div>
                        </div>
                        <div class="form-group py-2">
                            <input type="text" class="form-control form-control-input" id="exampleFormControlInput3" placeholder="Login" data-ls-module="charCounter" maxlength="50" name="loginCliente">
                        </div>  
                        <div class="form-group py-2">
                            <input type="text" class="form-control form-control-input" id="exampleFormControlInput4" placeholder="Nome" data-ls-module="charCounter" maxlength="50" name="nomeCliente">
                        </div>                            
                        <div class="form-group py-2">
                            <input  oninput="mascara(this, 'tel')"  autocomplete="off" type="tel" class="form-control form-control-input" id="exampleFormControlInput4" placeholder="Telefone" data-ls-module="charCounter" maxlength="13" required name="telefoneCliente">
                        </div>
                        <div class="form-group py-2">
                            <input type="text" class="form-control form-control-input" id="exampleFormControlInput4" placeholder="Município" data-ls-module="charCounter" maxlength="30" name="cidadeCliente">
                        </div>   
                        <div class="form-group py-2">
                            <input type="text" class="form-control form-control-input" id="exampleFormControlInput4" placeholder="Endereço" data-ls-module="charCounter" maxlength="30" name="enderecoCliente">
                        </div>   
                        <div class="form-group py-2">
                            <input  oninput="mascara(this, 'cpf')"  autocomplete="off" type="text" class="form-control form-control-input" id="exampleFormControlInput4" placeholder="CPF" data-ls-module="charCounter" maxlength="14" name="cpfCliente">
                        </div>   
                        <div class="form-group py-2">
                            <input oninput="mascara(this, 'cnpj')"  autocomplete="off"  type="text" class="form-control form-control-input" id="exampleFormControlInput4" placeholder="CNPJ" data-ls-module="charCounter" maxlength="18" name="cnpjCliente">
                        </div>  
                          <div class="my-3">
                            <button style=" color: #ffffff;" class="btn btn-secondary bg-dark"   type="submit" >Criar Conta</button>
                        </div>
                         </form>
                       
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="../js/bootstrap.min.js"></script><!-- Bootstrap framework -->
    <script src="../js/purecounter.min.js"></script> <!-- Purecounter counter for statistics numbers -->
    <script src="../js/swiper.min.js"></script><!-- Swiper for image and text sliders -->
    <script src="../js/aos.js"></script><!-- AOS on Animation Scroll -->
    <script src="../js/script.js"></script>  <!-- Custom scripts -->
</body>
</html>