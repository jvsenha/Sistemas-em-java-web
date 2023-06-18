<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Tell the browser to be responsive to screen width -->
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
        <link href="assets/libs/chartist/dist/chartist.min.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link href="dist/css/style.min.css" rel="stylesheet" type="text/css"/>
        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;700&display=swap" rel="stylesheet">
        <link href="css/aos.min.css" rel="stylesheet" type="text/css"/>
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/signin.css" rel="stylesheet" type="text/css"/>
        <link href="css/fontawesome-all.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/swiper.css" rel="stylesheet" type="text/css"/>
        <script src="js/aos.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/purecounter.min.js" type="text/javascript"></script>
        <script src="js/script.js" type="text/javascript"></script>
        <script src="js/swiper.min.js" type="text/javascript"></script>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body style="background-color: #212529!important;">
        <div class="preloader">
            <div class="lds-ripple">
                <div class="lds-pos"></div>
                <div class="lds-pos"></div>
            </div>
        </div>
        <nav style="background-color: black;"  id="navbar" class="navbar navbar-expand-lg fixed-top navbar-dark" aria-label="Main navigation">
            <a style="margin-left: 65px;" href="homeadm.jsp" class="nav-link text-white">
                <svg class="bi me-2" width="30" height="30"><use xlink:href="#voltar"/></svg>
                Home
            </a>
            <div class="container">

                <div style="margin-left: 40%;"  class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault" >
                    <a class="navbar-brand logo-text">UBEProf</a>

                </div> <!-- end of navbar-collapse -->
            </div> <!-- end of container -->
        </nav> 
        <%@include  file="../Svg.jsp"%>

        <div   style="margin:auto;  margin-top: 100px; width:90%;" class="page-wrapper">
            <!-- ============================================================== -->
            <!-- Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <div class="page-breadcrumb">
                <div class="row">
                    <div class="col-5 align-self-center">
                        <h4 class="page-title">Profile</h4>
                        <br>
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- End Bread crumb and right sidebar toggle -->
                <!-- ============================================================== -->
                <!-- ============================================================== -->
                <!-- Container fluid  -->
                <!-- ============================================================== -->
                <div class="container-fluid">
                    <!-- ============================================================== -->
                    <!-- Start Page Content -->
                    <!-- ============================================================== -->
                    <!-- Row -->
                    <div class="row">
                        <!-- Column -->
                        <div class="col-lg-4 col-xlg-3">
                            <div class="card">
                                <div class="card-body">
                                    <center class="mt-4"> <img src="assets/images/users/5.jpg"
                                                               class="rounded-circle" width="150" />
                                        <h4 class="card-title mt-2">${administrador.nomeUsuario}</h4>

                                    </center>
                                </div>
                                <div>
                                    <hr>
                                </div>
                            </div>
                        </div>
                        <!-- Column -->
                        <!-- Column -->
                        <div class="col-lg-8 col-xlg-9">
                            <div class="card">
                                <div class="card-body">
                                    <p style="color:#fff;"> ${mensagem}</p>

                                    <form class="form-horizontal form-material mx-2" name="alteraradministrador" action="AlterarAdm" >

                                        <input type="hidden" value="${administrador.idUsuario}"  name="idUsuario" > 
                                        <input type="hidden"  value="${administrador.idAdministrador}"   name="idAdministrador" > 

                                        <div class="form-group">
                                            <label class="col-md-12">Nome:</label>
                                            <div class="col-md-12">
                                                <input type="text" placeholder="Nome" class="form-control form-control-line" value="${administrador.nomeUsuario}"  name="nomemaquinista" >
                                            </div>
                                        </div>
                                            
                                        <div class="form-group">
                                            <label for="example-email" class="col-md-12">Email:</label>
                                            <div class="col-md-12">
                                                <input type="email" placeholder="Email" class="form-control form-control-line" value="${administrador.emailUsuario}" name="emailmaquinista" >
                                            </div>
                                        </div>
                                            
                                        <div class="form-group">
                                            <label for="example-email" class="col-md-12">Telefone:</label>
                                            <div class="col-md-12">
                                                <input type="number" placeholder="Telefone" class="form-control form-control-line" value="${administrador.telUsuario}" name="telmaquinista" >
                                            </div>
                                        </div>
                                            
                                        <div class="form-group">
                                            <label class="col-md-12">Login:</label>
                                            <div class="col-md-12">
                                                <input type="text" placeholder="Login" class="form-control form-control-line" value="${administrador.loginUsuario}"  name="loginmaquinista" >
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-md-12">Senha:</label>
                                            <div class="col-md-12">
                                                <input type="Senha" class="form-control form-control-line" value="${administrador.senhaUsuario}" name="senhamaquinista" >
                                            </div>
                                        </div>
                                            
                                        <div class="form-group">
                                            <label class="col-md-12">Cidade:</label>
                                            <div class="col-md-12">
                                                <input type="text" class="form-control form-control-line" value="${administrador.cidadeUsuario}" name="cidademaquinista" >
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <div class="my-3">
                                                <button style="color: white; background-color: black" class="btn btn-dark form-control-submit-button" type="submit" >Alterar</button>
                                            </div>
                                        </div>

                                    </form>
                                </div>

                            </div>
                        </div>
                        <!-- Column -->
                    </div>

                </div>

            </div>

        </div>

        <script src="assets/libs/jquery/dist/jquery.min.js"></script>
        <!-- Bootstrap tether Core JavaScript -->
        <script src="assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
        <!-- slimscrollbar scrollbar JavaScript -->
        <script src="assets/extra-libs/sparkline/sparkline.js"></script>
        <!--Wave Effects -->
        <script src="dist/js/waves.js"></script>
        <!--Menu sidebar -->
        <script src="dist/js/sidebarmenu.js"></script>
        <!--Custom JavaScript -->
        <script src="dist/js/custom.min.js"></script>
    </body>

</html>