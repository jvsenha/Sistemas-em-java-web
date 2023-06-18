<%-- 
    Document   : listaradmsdt
    Created on : 04/12/2022, 15:10:53
    Author     : joaos
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/css/assets/img/trem.png">
        <title>Lista Adm Desativado</title>
        <style>
            .tabela{
                width: 60%;
                position: absolute;
                top: 10%;
                left: 30%;

            }
        </style>
    </head>
    <body>
        <div class="wrapper">
            <%@include file="sidebar.jsp" %>
            <div class="container-fluid ">
                <div class="row tabela">
                    <h3 style="margin-bottom: 5px">${menssagem}</h3>
                        <hr style="background-color:#ffffff; opacity:100%; width: 100%; height: 5px; margin-top: -5px; border-radius: 10px 20px 30px; ">
                    <table class=" table    ">
                        <thead>
                                        <tr>
                                            <th class="border-top-0">NOME</th>
                                            <th class="border-top-0">STATUS</th>
                                            <th class="border-top-0">NOME USUARIO</th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <c:forEach var="administrador" items="${administradores}">
                                            <tr>
                                                <th align="center">${administrador.nomeUsuario}</th>
                                                <th align="center">
                                                    <c:choose>
                                                        <c:when test="${administrador.statusUsuario=='1'}">
                                                            <span class="label label-success label-rounded">ATIVO</span> 
                                                            <br />
                                                        </c:when>    
                                                        <c:otherwise>
                                                            <span class="label label-danger label-rounded">DESATIVO</span> 
                                                            <br />
                                                        </c:otherwise>
                                                    </c:choose>
                                                </th>
                                                <th align="center">${administrador.loginUsuario}</th>
                                                <th align="center">
                                                    <c:choose>
                                                        <c:when test="${administrador.statusUsuario=='1'}">
                                                            <a  href="InativarAdm?idUsuario=${administrador.idUsuario}" style=" border-radius: 0.25rem; border: 1px solid transparent;" class="btn-danger"> Desativar</a>
                                                            <br />
                                                        </c:when>    
                                                        <c:otherwise>
                                                            <a href="AtivarAdm?idUsuario=${administrador.idUsuario}" style=" border-radius: 0.25rem; border: 1px solid transparent; width:80px; " class="btn-success" > ativar</a>
                                                            <br />
                                                        </c:otherwise>
                                                    </c:choose>
                                                </th>
                                            </tr>
                                        </c:forEach>

                                        </tr>
                                    </tbody>

                            </tr>
                        </tbody>
                    </table>
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
        <!--   Core JS Files   -->
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

