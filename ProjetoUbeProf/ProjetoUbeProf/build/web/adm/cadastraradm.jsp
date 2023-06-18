
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

    <head>
    
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords"
              content="wrappixel, admin dashboard, html css dashboard, web dashboard, bootstrap 5 admin, bootstrap 5, css3 dashboard, bootstrap 5 dashboard, Nice lite admin bootstrap 5 dashboard, frontend, responsive bootstrap 5 admin template, Nice admin lite design, Nice admin lite dashboard bootstrap 5 dashboard template">
        <meta name="description"
              content="Nice Admin Lite is powerful and clean admin dashboard template, inpired from Bootstrap Framework">
        <meta name="robots" content="noindex,nofollow">
        <title>Nice Admin Lite Template by WrapPixel</title>
        <link rel="canonical" href="https://www.wrappixel.com/templates/niceadmin-lite/" />
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="assets/images/favicon.png">
        <!-- Custom CSS -->
        <link href="../assets/libs/chartist/dist/chartist.min.css" rel="stylesheet">
        <!-- Custom CSS -->
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
        <script src="../js/scriptmasc.js" type="text/javascript"></script>
        <script src="../js/aos.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../js/purecounter.min.js" type="text/javascript"></script>
        <script src="../js/script.js" type="text/javascript"></script>
        <script src="../js/swiper.min.js" type="text/javascript"></script>

    </head>

    <body style="background-color: #212529!important;">
        <%@include file="../Svg.jsp" %>
        <nav style="background-color: black;"  id="navbar" class="navbar navbar-expand-lg fixed-top navbar-dark" aria-label="Main navigation">
            <a style="margin-left: 65px;" href="../homeadm.jsp" class="nav-link text-white">
                <svg class="bi me-2" width="30" height="30"><use xlink:href="#voltar"/></svg>
                Home
            </a>
            <div class="container">

                <div style="margin-left: 40%;"  class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault" >
                    <a class="navbar-brand logo-text">UBEProf</a>

                </div> <!-- end of navbar-collapse -->
            </div> <!-- end of container -->
        </nav>  

        <div class="page-wrapper" style="  margin: auto; margin-top: 4%; width: 90%; " >
            <!-- ============================================================== -->
            <!-- Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <div class="page-breadcrumb">
                <div class="row">
                    <div class="col-5 align-self-center">
                        <h4 class="page-title"> Cadastro de Adm</h4>
                    </div>
                </div>
            </div>

            <div class="container-fluid" >

                <div class="row">
                    <div class="col-12">
                        <div class="card card-body">
                            <h4 class="card-title">Novo Administrador</h4>
                            <h5 class="card-subtitle">Informaçoes necessárias</h5>
                            <form class="form-horizontal mt-4" action="${pageContext.request.contextPath}/CadastrarAdm" method="POST">
                                <div class="form-group">
                                    <label>Nome:</label>
                                    <input type="text" class="form-control"  placeholder="Nome" name="nomeAdmin">
                                </div>
                                <br>
                                <div class="form-group">
                                    <label for="example-email">Email:</label>
                                    <input type="email" id="example-email" class="form-control" placeholder="Email" name="emailAdmin">
                                </div>
                                <br>
                                <div class="form-group">
                                    <label>Senha:</label>
                                    <input type="password" class="form-control"   placeholder="Senha" name="senhaAdmin">
                                </div>
                                <br>
                                <div class="form-group">
                                    <label>Login:</label>
                                    <input type="text" class="form-control" placeholder="Login" name="loginAdmin">
                                </div>
                                <br>
                                <div class="form-group">
                                    <label>Telefone:</label>
                                    <input oninput="mascara(this, 'tel')"  autocomplete="off"  type="tel" class="form-control" id="exampleFormControlInput4" placeholder="Telefone" data-ls-module="charCounter" maxlength="13" pattern="[0-9]{11}" required name="telefoneAdmin">
                                </div>
                                <br>
                                <div class="form-group">
                                    <label>Default file upload</label>
                                    <input type="file" class="form-control">
                                </div>
                                <br>
                                <div class="my-3">
                                    <button style="color: white; background-color: black" class="btn btn-dark form-control-submit-button" type="submit" >Criar Conta</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>

        </div>


        <script src="../assets/libs/jquery/dist/jquery.min.js"></script>
        <!-- Bootstrap tether Core JavaScript -->
        <script src="../assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
        <!-- slimscrollbar scrollbar JavaScript -->
        <script src="../assets/extra-libs/sparkline/sparkline.js"></script>
        <!--Wave Effects -->
        <script src="../dist/js/waves.js"></script>
        <!--Menu sidebar -->
        <script src="../dist/js/sidebarmenu.js"></script>
        <!--Custom JavaScript -->
        <script src="../dist/js/custom.min.js"></script>
    </body>

</html>

