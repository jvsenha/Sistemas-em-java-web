<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="../assets/img/mapa.png">
        <title>
            Cadastro de Produtos
        </title>
        <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
        <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
        <!-- Nucleo Icons -->
        <link href="../css/assets/css/nucleo-icons.css" rel="stylesheet" />
        <!-- CSS Files -->
        <link href="../css/assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="../css/assets/demo/demo.css" rel="stylesheet" />

        <link href="../css/cssempresa.css" rel="stylesheet" type="text/css"/>

    </head>

    <body class="">
        <div class="wrapper">
            <%@include file="sidebar.jsp" %>
            <div class="main-panel">
                <!-- Navbar -->
                <div class="modal modal-search fade" id="searchModal" tabindex="-1" role="dialog" aria-labelledby="searchModal" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <input type="text" class="form-control" id="inlineFormInputGroup" placeholder="SEARCH">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <i class="tim-icons icon-simple-remove"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-6 container">
                    <div class="formulario" style="margin-top: 10%">
                        <form  name="cadastrarcliente" action="${pageContext.request.contextPath}/CadastrarProduto"  method="POST">

                            <h1 class="text-primary">CADASTRAR PRODUTO</h1>
                            <div class="input-group-text mt-2 mb-2 border-0 " >
                                <span  class="input-group-text" style="color: #ffffff">Nome Produto:</span>
                                <input type="text" placeholder="Nome Completo" id="campotel" style="color: #ffffff" class="form-control ml-3" maxlength="40" name="nomeProd">
                            </div>
                            <div class="input-group-text mt-2 mb-2 border-0" >
                                <label  class="input-group-text" style="color: #ffffff" >Tipo Produto</label>
                                <select id="campotel" style="color: #70777e" class="form-control ml-3" name="tipoProd">
                                  <option value="Bens de consumo">Bens de consumo</option>
                                    <option value="Bens de comum">Bens de comum</option>
                                    <option value="Bens de emergência">Bens de emergência</option>
                                    <option value="Bens duráveis">Bens duráveis</option>
                                    <option value="Produtos especiais">Produtos especiais</option>
                                </select>
                            </div>
                            <div class="form">
                                <input  id="campotel" class="form-control" type="text" name="idEmpresa" hidden="true" value="${idemp}" >
                            </div>

                            <button type="submit" class="btn btn-dark">CADASTRAR</button>
                        </form>
                        <div class="text-primary">${menssagem}</div>



                    </div>
                </div>

            </div>


        </div>
    </div>
</div>
<div class="fixed-plugin">
    <div class="dropdown show-dropdown">
        <a href="#" data-toggle="dropdown">
            <i class="fa fa-cog fa-2x"> </i>
        </a>
        <ul class="dropdown-menu">
            <li class="header-title"> Sidebar Background</li>
            <li class="adjustments-line">
                <a href="javascript:void(0)" class="switch-trigger background-color">
                    <div class="badge-colors text-center">
                        <span class="badge filter badge-primary active" data-color="primary"></span>
                        <span class="badge filter badge-info" data-color="blue"></span>
                        <span class="badge filter badge-success" data-color="green"></span>
                    </div>
                    <div class="clearfix"></div>
                </a>
            </li>
            <li class="adjustments-line text-center color-change">
                <span class="color-label">LIGHT MODE</span>
                <span class="badge light-badge mr-2"></span>
                <span class="badge dark-badge ml-2"></span>
                <span class="color-label">DARK MODE</span>
            </li>
            <li class="button-container">
                <a href="https://www.creative-tim.com/product/black-dashboard" target="_blank" class="btn btn-primary btn-block btn-round">Download Now</a>
                <a href="https://demos.creative-tim.com/black-dashboard/docs/1.0/getting-started/introduction.html" target="_blank" class="btn btn-default btn-block btn-round">
                    Documentation
                </a>
            </li>
            <li class="header-title">Thank you for 95 shares!</li>
            <li class="button-container text-center">
                <button id="twitter" class="btn btn-round btn-info"><i class="fab fa-twitter"></i> &middot; 45</button>
                <button id="facebook" class="btn btn-round btn-info"><i class="fab fa-facebook-f"></i> &middot; 50</button>
                <br>
                <br>
                <a class="github-button" href="https://github.com/creativetimofficial/black-dashboard" data-icon="octicon-star" data-size="large" data-show-count="true" aria-label="Star ntkme/github-buttons on GitHub">Star</a>
            </li>
        </ul>
    </div>
</div>
</body>

</html>
