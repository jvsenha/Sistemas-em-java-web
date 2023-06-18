
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

      
        <!-- Webpage Title -->
        <title>Cadastre-se aqui</title>

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
         <script src="../js/scriptmasc.js" type="text/javascript"></script>
    </head>
    <body class="cadastrar1 d-flex align-items-center py-5" >
        <%@include file="../navbar.jsp" %>
        <div  style="margin-left: 55px; margin-top: 100px;" class="container-fluid text-light">
            <div class="row">
                <div style="width:50%">
                    <div>
                        <h1 class="h3  mb-3 fw-normal" style="color: white"><strong>Professor, Registre-se aqui</strong></h1>

                        <div style="color: white"><strong>${mesagem}</strong></div>
                        <form name="login" action="${pageContext.request.contextPath}/CadastrarProfessor" method="POST">  
                            <div>
                                <div class="row" >
                                    <div class="col-lg-6">
                                        <div class="form-group py-2">
                                            <input type="email" class="form-control form-control-input" id="exampleFormControlInput1" placeholder="Endereço de Email" data-ls-module="charCounter" maxlength="30" name="emailProfessor">
                                        </div>                                
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group py-2">
                                            <input type="password" class="form-control form-control-input" id="exampleFormControlInput2" placeholder="Senha" data-ls-module="charCounter" maxlength="8" name="senhaProfessor">
                                        </div>                                 
                                    </div>
                                </div>
                                <div class="form-group py-2">
                                    <input type="text" class="form-control form-control-input" id="exampleFormControlInput3" placeholder="Login" data-ls-module="charCounter" maxlength="50" name="loginProfessor">
                                </div>  
                                <div class="form-group py-2">
                                    <input type="text" class="form-control form-control-input" id="exampleFormControlInput4" placeholder="Nome"data-ls-module="charCounter" maxlength="50" name="nomeProfessor">
                                </div>                            
                                <div class="form-group py-2">
                                    <input input oninput="mascara(this, 'tel')"  autocomplete="off"  type="tel" class="form-control form-control-input" id="exampleFormControlInput4" placeholder="Telefone" data-ls-module="charCounter" maxlength="13"  name="telefoneProfessor">
                                </div>    
                                <div class="form-group py-2">
                                    <input type="text" class="form-control form-control-input" id="exampleFormControlInput4" placeholder="Município" data-ls-module="charCounter" maxlength="30"  name="cidadeProfessor">
                                </div>    
                                <div class="form-group py-2">
                                          <input oninput="mascara(this, 'cpf')"  autocomplete="off" type="text" class="form-control form-control-input" id="exampleFormControlInput4" placeholder="CPF" data-ls-module="charCounter" maxlength="14" name="cpfProfessor">
                                </div>    
                            </div>
                            <div class="my-3">
                                         <button style=" color: #ffffff;"class="btn btn-secondary bg-dark"  type="submit" >Criar Conta</button>
                            </div>   
                            </form>
                            </div>
                        

                    </div>
                </div>
            </div>

    <script src="js/bootstrap.min.js"></script><!-- Bootstrap framework -->
    <script src="js/purecounter.min.js"></script> <!-- Purecounter counter for statistics numbers -->
    <script src="js/swiper.min.js"></script><!-- Swiper for image and text sliders -->
    <script src="js/aos.js"></script><!-- AOS on Animation Scroll -->
    <script src="js/script.js"></script>  <!-- Custom scripts -->
</body>
</html>
