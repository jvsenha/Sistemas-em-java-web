<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="Your description">
        <meta name="author" content="Your name">
        <meta property="og:site_name" content="" /> <!-- website name -->
        <meta property="og:site" content="" /> <!-- website link -->
        <meta property="og:title" content=""/> <!-- title shown in the actual shared post -->
        <meta property="og:description" content="" /> <!-- description shown in the actual shared post -->
        <meta property="og:image" content="" /> <!-- image link, make sure it's jpg -->
        <meta property="og:url" content="" /> <!-- where do you want your post to link to -->
        <meta name="twitter:card" content="summary_large_image"> <!-- to have large image post format in Twitter -->
        <!-- Webpage Title -->
        <title>Login Do Cliente</title>
        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;700&display=swap" rel="stylesheet">
        <link href="../css/aos.min.css" rel="stylesheet" type="text/css"/>
        <!-- Bootstrap core CSS -->
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/signin.css" rel="stylesheet" type="text/css"/>
        <link href="../css/fontawesome-all.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <link href="../css/swiper.css" rel="stylesheet" type="text/css"/>
        <script src="../js/aos.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../js/purecounter.min.js" type="text/javascript"></script>
        <script src="../js/script.js" type="text/javascript"></script>
        <script src="../js/swiper.min.js" type="text/javascript"></script>
        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

           
                
            
        </style>
        
  <link rel="icon" href="${pageContext.request.contextPath}/assets/images/favicon.png">
    </head>
    <body class="text-center home2 py-5 d-flex align-items-center" >
        <main class="form-signin align-items-center">
                <%@include file="../navbar.jsp" %>
            <form name="login" action="${pageContext.request.contextPath}/LoginCliente" method="POST">      
                  <h1 class="h3 mb-3 fw-normal" style="color: white"><strong>Fazer login</strong></h1>

                <div style="color: #ffffff"><strong>${mensagemCL}</strong></div>
        <br>
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com" name="loginCliente">
                    <label for="floatingInput">Login</label>
                </div>
            <br>
                <div class="form-floating">
                    <input type="password" class="form-control" id="floatingPassword" placeholder="senha" name="senhaCliente">
                    <label for="floatingPassword">Senha</label>
                </div>


                <button style=" color: #ffffff; width: 40%"class="btn btn-secondary" type="submit">Login</button>

            </form>
        <br>
        <h1 class="h6 mb-1 fw-normal" style="color: white">Não é cadastrado?<a href="${pageContext.request.contextPath}/cliente/cadastrarcliente.jsp"><strong> cadastre-se aqui</strong></a></h1>
        </main>



    </body>
</html>
