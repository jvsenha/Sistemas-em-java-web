<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="../assets/img/mapa.png">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
       <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/css/assets/img/trem.png">

        <title>
            Cadastro de Empresas
        </title>
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

    </head>

    <body class="">
        <div class="wrapper">
            <%@include file="../adm/sidebar.jsp" %>
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
                <div class="container-fluid mt-5 pt-3" >
                    <div class="col-6 row" style="margin-left: 20%; height: ">
                        <div class="formulario">
                            <form  name="cadastrarcliente" action="${pageContext.request.contextPath}/CadastrarEmpresa"  method="POST">

                                <h1 class="text-primary">CADASTRAR EMPRESA</h1>
                                <h4  class="text-primary">${menssagem}</h4>
                                <div class="input-group-text mt-2 mb-2 border-0 ">
                                    <label>Nome da Empresa:</label>
                                    <input type="text" placeholder="Nome Completo" id="campotel" class="form-control ml-3" maxlength="40" name="nomeEmp">
                                </div>


                                <div class="input-group-text mt-2 mb-2 border-0 ">
                                    <label>CNPJ:</label>
                                    <input oninput="mascara(this, 'cpf')" id="campotel" class="form-control ml-3" placeholder="CPF" autocomplete="off" type="text" name="cnpjEmp">
                                </div>


                                <div class="input-group-text mt-2 mb-2 border-0 ">
                                    <label>Razão Social:</label>
                                    <input oninput="mascara(this, 'rg')" id="campotel" class="form-control ml-3" placeholder="Razão Social" autocomplete="off" type="text" name="razaosocEmp">
                                </div>


                                <div class="input-group-text mt-2 mb-2 border-0 ">
                                    <label>Telefone:</label>
                                    <input oninput="mascara(this, 'tel')" id="campotel" class="form-control ml-3" placeholder="Ex.: xx xxxxx-xxxx" autocomplete="off" type="text" name="telefoneEmp">
                                </div>


                                <div class="input-group-text mt-2 mb-2 border-0 ">
                                    <label>CEP:</label>
                                    <input oninput="mascara(this, 'cep')" id="cep" class="form-control float-right ml-4" placeholder="CEP" autocomplete="off" type="text" name="cepEmp" MAXLENGTH=9 onblur="pesquisacep(this.value);">
                                </div>

                                <div class="input-group-text mt-2 mb-2 border-0 ">
                                    <label class="mr-2 ">Rua:</label>
                                    <input type="text" placeholder="Rua" id="rua" class="form-control m-3" maxlength="30" name="ruaEmp">
                                    <label class="m-3">Município:</label>
                                    <input type="text" placeholder="Cidade" id="cidade" class="form-control m-2 " maxlength="40" name="municipioEmp">
                                </div>

                                <div class="input-group-text mt-2 mb-2 border-0 ">
                                    <label>Estado:</label>
                                    <select class="form-select ml-3" aria-label="Default select example" name="ufEmp">
                                        <option value="AC">Acre</option>
                                        <option value="AL">Alagoas</option>
                                        <option value="AP">Amapá</option>
                                        <option value="AM">Amazonas</option>
                                        <option value="BA">Bahia</option>
                                        <option value="CE">Ceará</option>
                                        <option value="DF">Distrito Federal</option>
                                        <option value="ES">Espírito Santo</option>
                                        <option value="GO">Goiás</option>
                                        <option value="MA">Maranhão</option>
                                        <option value="MT">Mato Grosso</option>
                                        <option value="MS">Mato Grosso do Sul</option>
                                        <option value="MG">Minas Gerais</option>
                                        <option value="PA">Pará</option>
                                        <option value="PB">Paraíba</option>
                                        <option value="PR">Paraná</option>
                                        <option value="PE">Pernambuco</option>
                                        <option value="PI">Piauí</option>
                                        <option value="RJ">Rio de Janeiro</option>
                                        <option value="RN">Rio Grande do Norte</option>
                                        <option value="RS">Rio Grande do Sul</option>
                                        <option value="RO">Rondônia</option>
                                        <option value="RR">Roraima</option>
                                        <option value="SC">Santa Catarina</option>
                                        <option value="SP">São Paulo</option>
                                        <option value="SE">Sergipe</option>
                                        <option value="TO">Tocantins</option>
                                        <option value="EX">Estrangeiro</option>
                                    </select>
                                </div>


                                <div class="input-group-text mt-2 mb-2 border-0 ">
                                    <label>Email:</label>
                                    <input type="text" placeholder="Informe seu email" id="campotel" class="form-control ml-4" maxlength="100" name="emailEmp">
                                </div>

                                <button type="submit" class="btn btn-dark">CADASTRAR</button>
                            </form>




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
            </ul>
        </div>
    </div>
                                <script src="${pageContext.request.contextPath}/css/assets/js/core/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/css/assets/js/core/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/css/assets/js/core/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/css/assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
    <!--  Google Maps Plugin    -->
    <!-- Place this tag in your head or just before your close body tag. -->
    <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
    <!-- Chart JS -->
    <script src="${pageContext.request.contextPath}/css/assets/js/plugins/chartjs.min.js"></script>
    <!--  Notifications Plugin    -->
    <script src="${pageContext.request.contextPath}/css/assets/js/plugins/bootstrap-notify.js"></script>
    <!-- Control Center for Black Dashboard: parallax effects, scripts for the example pages etc -->
    <script src="${pageContext.request.contextPath}/css/assets/js/black-dashboard.min.js?v=1.0.0"></script><!-- Black Dashboard DEMO methods, don't include it in your project! -->
    <script src="${pageContext.request.contextPath}/css/assets/demo/demo.js"></script>
    <script>
        $(document).ready(function () {
            $().ready(function () {
                $sidebar = $('.sidebar');
                $navbar = $('.navbar');
                $main_panel = $('.main-panel');

                $full_page = $('.full-page');

                $sidebar_responsive = $('body > .navbar-collapse');
                sidebar_mini_active = true;
                white_color = false;

                window_width = $(window).width();

                fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();



                $('.fixed-plugin a').click(function (event) {
                    if ($(this).hasClass('switch-trigger')) {
                        if (event.stopPropagation) {
                            event.stopPropagation();
                        } else if (window.event) {
                            window.event.cancelBubble = true;
                        }
                    }
                });

                $('.fixed-plugin .background-color span').click(function () {
                    $(this).siblings().removeClass('active');
                    $(this).addClass('active');

                    var new_color = $(this).data('color');

                    if ($sidebar.length != 0) {
                        $sidebar.attr('data', new_color);
                    }

                    if ($main_panel.length != 0) {
                        $main_panel.attr('data', new_color);
                    }

                    if ($full_page.length != 0) {
                        $full_page.attr('filter-color', new_color);
                    }

                    if ($sidebar_responsive.length != 0) {
                        $sidebar_responsive.attr('data', new_color);
                    }
                });

                $('.switch-sidebar-mini input').on("switchChange.bootstrapSwitch", function () {
                    var $btn = $(this);

                    if (sidebar_mini_active == true) {
                        $('body').removeClass('sidebar-mini');
                        sidebar_mini_active = false;
                        blackDashboard.showSidebarMessage('Sidebar mini deactivated...');
                    } else {
                        $('body').addClass('sidebar-mini');
                        sidebar_mini_active = true;
                        blackDashboard.showSidebarMessage('Sidebar mini activated...');
                    }

                    // we simulate the window Resize so the charts will get updated in realtime.
                    var simulateWindowResize = setInterval(function () {
                        window.dispatchEvent(new Event('resize'));
                    }, 180);

                    // we stop the simulation of Window Resize after the animations are completed
                    setTimeout(function () {
                        clearInterval(simulateWindowResize);
                    }, 1000);
                });

                $('.switch-change-color input').on("switchChange.bootstrapSwitch", function () {
                    var $btn = $(this);

                    if (white_color == true) {

                        $('body').addClass('change-background');
                        setTimeout(function () {
                            $('body').removeClass('change-background');
                            $('body').removeClass('white-content');
                        }, 900);
                        white_color = false;
                    } else {

                        $('body').addClass('change-background');
                        setTimeout(function () {
                            $('body').removeClass('change-background');
                            $('body').addClass('white-content');
                        }, 900);

                        white_color = true;
                    }


                });

                $('.light-badge').click(function () {
                    $('body').addClass('white-content');
                });

                $('.dark-badge').click(function () {
                    $('body').removeClass('white-content');
                });
            });
        });
    </script>
    <script>
        $(document).ready(function () {
            // Javascript method's body can be found in assets/js/demos.js
            demo.initDashboardPageCharts();

        });
    </script>
    <script src="https://cdn.trackjs.com/agent/v3/latest/t.js"></script>
    <script>
        window.TrackJS &&
                TrackJS.install({
                    token: "ee6fab19c5a04ac1a32a645abde4613a",
                    application: "black-dashboard-free"
                });
    </script>
</body>

</html>
