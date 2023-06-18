<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  
        <title>UBEProf</title>

        <!-- Styles -->
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;700&display=swap" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/fontawesome-all.min.css" rel="stylesheet">
        <link href="css/aos.min.css" rel="stylesheet">
        <link href="css/swiper.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">

        <!-- Favicon -->
        <link rel="icon" href="./assets/images/favicon.png">
    </head>
    <body>
        <%@include file="Svg.jsp" %>
        <!-- Navigation -->
        <nav id="navbar" class="navbar navbar-expand-lg fixed-top navbar-dark" aria-label="Main navigation">
            <div class="container">

                <!-- Image Logo -->
                <!-- <a class="navbar-brand logo-image" href="index.html"><img src="images/logo.svg" alt="alternative"></a> -->

                <!-- Text Logo - Use this if you don't have a graphic logo -->
                <a class="navbar-brand logo-text" href="${pageContext.request.contextPath}index.html">UBEProf</a>

                <button class="navbar-toggler p-0 border-0" type="button" id="navbarSideCollapse" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault" >
                    <ul class="navbar-nav ms-auto navbar-nav-scroll">
                    
                        
                        <li class="nav-item ">

                            <a  class="nav-link"  href="adm/loginadmin.jsp">Area restrita   <svg style=" position:relative; bottom:  5px;"  class="fas fa-briefcase alert-link " width="22" height="22"><use xlink:href="#cadeado"/></svg> </a>
                         
                         
                        </li>
                    </ul>
                </div> <!-- end of navbar-collapse -->
            </div> <!-- end of container -->
        </nav> <!-- end of navbar -->
        <!-- end of navigation -->


        <!-- Home -->
        <section class="home py-5 d-flex align-items-center" id="header">
            <div class="container text-light py-5"  data-aos="fade-right"> 
                <h1 class="headline"><span class="home_text">UBEProf</span>><br>A maneira mais rápida de aprender!</h1>
                <p class="para para-light py-3">Aprender nunca foi tão facíl, a UBEProf vai te entregar os melhores professores para a área que você mais gostar. Com todo tipo de curso, você pode se especializar no que você quiser!!</p>
                <div class="d-flex align-items-center">
                     <p>Qual tipo de usuário é você</p>  
                    <p class="p-2"><i class="fas fa-question"></i></p>
                </div>
                <div>
                    <div class="my-3">
                        <a  style=" color: #ffffff;width: 20%"class="btn btn-secondary" href="professor/loginprofessor.jsp">Professor</a></div>
                    <div class="my-3">
                        <a style=" color: #ffffff;width: 20%"class="btn btn-secondary" href="cliente/logincliente.jsp">Cliente</a></div>
                        
                </div>         
            </div> <!-- end of container -->
        </section> <!-- end of home -->


        <!-- Footer -->
        <section class="footer text-light">
            <div class="container">
                <div class="row" data-aos="fade-right">
                    <div class="col-lg-3 py-4 py-md-5">
                        <div class="d-flex align-items-center">
                            <h4 class="">Mirko</h4>
                        </div>
                        <p class="py-3 para-light">Lorem ipsum dolor sit amet consectetur adipisicing elit. Minus animi repudiandae explicabo esse maxime, impedit rem voluptatibus amet error quas.</p>
                        <div class="d-flex">
                            <div class="me-3">
                                <a href="#your-link">
                                    <i class="fab fa-facebook-f fa-2x py-2"></i>
                                </a>
                            </div>
                            <div class="me-3">
                                <a href="#your-link">
                                    <i class="fab fa-twitter fa-2x py-2"></i>
                                </a>
                            </div>
                            <div class="me-3">
                                <a href="#your-link">
                                    <i class="fab fa-instagram fa-2x py-2"></i>
                                </a>
                            </div>
                        </div>
                    </div> <!-- end of col -->

                    <div class="col-lg-3 py-4 py-md-5">
                        <div>
                            <h4 class="py-2">Quick Links</h4>
                            <div class="d-flex align-items-center py-2">
                                <i class="fas fa-caret-right"></i>
                                <a href="#about"><p class="ms-3">About</p></a>
                            </div>
                            <div class="d-flex align-items-center py-2">
                                <i class="fas fa-caret-right"></i>
                                <a href="#"><p class="ms-3">Services</p></a>
                            </div>
                            <div class="d-flex align-items-center py-2">
                                <i class="fas fa-caret-right"></i>
                                <a href="#"><p class="ms-3">Plans</p></a>
                            </div>
                            <div class="d-flex align-items-center py-2">
                                <i class="fas fa-caret-right"></i>
                                <a href="#"><p class="ms-3">Contact</p></a>
                            </div>
                        </div>
                    </div> <!-- end of col -->

                    <div class="col-lg-3 py-4 py-md-5">
                        <div>
                            <h4 class="py-2">Useful Links</h4>
                            <div class="d-flex align-items-center py-2">
                                <i class="fas fa-caret-right"></i>
                                <a href="privacy.html"><p class="ms-3">Privacy</p></a>

                            </div>
                            <div class="d-flex align-items-center py-2">
                                <i class="fas fa-caret-right"></i>
                                <a href="terms.html"><p class="ms-3">Terms</p></a>
                            </div>
                            <div class="d-flex align-items-center py-2">
                                <i class="fas fa-caret-right"></i>
                                <a href="#your-link"><p class="ms-3">Disclaimer</p></a>
                            </div>
                            <div class="d-flex align-items-center py-2">
                                <i class="fas fa-caret-right"></i>
                                <a href="#your-link"><p class="ms-3">FAQ</p></a>
                            </div>
                        </div>
                    </div> <!-- end of col -->

                    <div class="col-lg-3 py-4 py-md-5">
                        <div class="d-flex align-items-center">
                            <h4>Newsletter</h4>
                        </div>
                        <p class="py-3 para-light">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Laboriosam, ab.</p>
                        <div class="d-flex align-items-center">
                            <div class="input-group mb-3">
                                <input type="text" class="form-control p-2" placeholder="Enter Email" aria-label="Recipient's email">
                                <button class="btn-secondary text-light"><i class="fas fa-envelope fa-lg"></i></button>       
                            </div>
                        </div>
                    </div> <!-- end of col -->
                </div> <!-- end of row -->
            </div> <!-- end of container -->
        </section> <!-- end of footer -->


        <!-- Back To Top Button -->
        <button onclick="topFunction()" id="myBtn">
            <img src="assets/images/up-arrow.png" alt="alternative">
        </button>
        <!-- end of back to top button -->


        <!-- Scripts -->
        <script src="./js/bootstrap.min.js"></script><!-- Bootstrap framework -->
        <script src="./js/purecounter.min.js"></script> <!-- Purecounter counter for statistics numbers -->
        <script src="./js/swiper.min.js"></script><!-- Swiper for image and text sliders -->
        <script src="./js/aos.js"></script><!-- AOS on Animation Scroll -->
        <script src="./js/script.js"></script>  <!-- Custom scripts -->
    </body>
</html>