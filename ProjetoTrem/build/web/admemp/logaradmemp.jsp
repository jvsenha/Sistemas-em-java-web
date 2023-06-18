<!doctype html>
<html lang="en">
      <head>
            <meta charset="utf-8" />
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
            <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
 <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/css/assets/img/trem.png">
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

            <title>
                Login
            </title>


            <style>
                .cadastrar{
                    background: rgb(255,255,255);
                    background: linear-gradient(90deg, rgba(255,255,255,1) 61%, rgba(222,204,227,1) 78%, rgba(161,112,177,1) 89%, rgba(93,9,121,1) 100%);
                }

                .form-control{
                    height: 50px;
                }
            </style>
        </head>


  <body  class="text-center cadastrar" style="background-color: #efefef">
      <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="../assets/img/mapa.png">
        <title>sidebar</title>
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
    </head>
    <body>
        <nav class="navbar navbar-absolute navbar-transparent" style="position: absolute; top: 1%;">
            <div class="container-fluid">
                <div class="navbar-wrapper">
                    <a class="navbar-brand" style="color: #000" href="${pageContext.request.contextPath}/indexnova.jsp"><i class="bi bi-arrow-return-left fa-2x" ></i> </a>
                </div>
            </div>
        </nav>
      <div class="col-5" style="margin: 10%;">
      <form class="form-signin" action="${pageContext.request.contextPath}/LoginAdmEmp" method="POST">
        <img class="mb-4" src="${pageContext.request.contextPath}/css/assets/img/administrador-da-web.png" alt="" width="150" height="150">
      <h1 class="h3 mb-3 font-weight-normal">Login Adiministrador Empresa</h1>
   <h6 class=" mb-3 font-weight-normal" style="color: #000"><b>${mensagem}</b></h6>
     
      <label for="inputEmail" class="sr-only">Email address</label>
      <input type="text" class="form-control m-3" style="color:black;" placeholder="Login" name="loginAdmemp" required autofocus>
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" class="form-control m-3" style="color:black;" placeholder="Senha"  name="senhaAdmemp" required>
      <div class="checkbox mb-3">
        <label>
                <a href="${pageContext.request.contextPath}/DadosAdmEmp">
         Cadastres-se aqui!
            </a>
        </label>
      </div>
      
      
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
    </form>
      </div>
  </body>
</html>
