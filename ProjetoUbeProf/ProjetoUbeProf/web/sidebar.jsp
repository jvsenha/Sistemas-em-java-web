<%-- 
    Document   : Sidebar
    Created on : 09/05/2022, 16:16:46
    Author     : AlunoRemoto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en">

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
        <title></title>
        <link rel="canonical" href="https://www.wrappixel.com/templates/niceadmin-lite/" />
        <!-- Favicon icon -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" type="image/png" sizes="16x16" href="assets/images/favicon.png">
        <!-- Custom CSS -->
        <link href="assets/libs/chartist/dist/chartist.min.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link href="dist/css/style.min.css" rel="stylesheet">
        <link href="css/sidebars.css" rel="stylesheet" type="text/css"/>
        <script src="js/sidebars.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
     <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
     <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
 <![endif]-->
    </head>

    <body>
        <div class="d-flex flex-column flex-shrink-0 p-1 text-white bg-dark" style="position: absolute; top: 60px; width: 200px; height: 100%; ">
          
            <ul class="nav nav-pills flex-column mb-auto" >

                <li>
                    <a href="ListarAdm" class="nav-link text-white" aria-current="page">
                        <svg class="bi me-2" width="16" height="16"><use xlink:href="#speedometer2"/></svg>
                        Administradores
                    </a>
                </li>
                <li>
                    <a href="ListarCliente" class="nav-link text-white">
                        <svg class="bi me-2" width="16" height="16"><use xlink:href="#table"/></svg>
                        Clientes
                    </a>
                </li>
                <li>
                    <a href="ListarProfessor" class="nav-link text-white">
                        <svg class="bi me-2" width="16" height="16"><use xlink:href="#grid"/></svg>
                        Professores
                    </a>
                </li>
                <li>
                
                    <a  href="CarregarAdm" class="nav-link text-white">
                        <svg class="bi me-2" width="16" height="16"><use xlink:href="#people-circle"/></svg>
                        Perfil
                    </a>
               
                </li>
                <li>
                
                    <a  href="indexadm.jsp" class="nav-link text-white">
                        <svg class="bi me-2" width="16" height="16"><use xlink:href="#people-circle"/></svg>
                        Home
                    </a>
               
                </li>
                <li>
                    <a href="cadastraradm.jsp" class="nav-link text-white" style="text-align: " >
                        <svg class="bi me-2" width="16" height="16"><use xlink:href="#new-adm"/></svg>
                        Cadastrar Novo Adiministrador
                    </a>
                </li>
            </ul>
            
                    </div>

    </body>
</html>
