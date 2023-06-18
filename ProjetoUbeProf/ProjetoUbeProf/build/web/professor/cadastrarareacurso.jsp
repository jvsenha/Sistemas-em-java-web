<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpSession sessao = httpServletRequest.getSession();
    if (sessao.getAttribute("professor") != null) {

%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meus Cursos</title>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">
        <link rel="icon" href="${pageContext.request.contextPath}/assets/images/favicon.png">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link href="${pageContext.request.contextPath}/dist/css/style.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/styleperfil.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/swiper.css" rel="stylesheet" type="text/css"/>
        <link href="../css/csshomecliente.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
        <style>
            .botão{
                position:  relative;
                left: 0%;
                margin-top: 6%;
                color: white;
                border-width: 2px;
                padding: 10px 10px;
                border: 1px solid rgba(14, 233, 81, 1);
                box-shadow: 5px 5px  rgba(14, 233, 81, 1);
                background: transparent;
                cursor: pointer;
                width: 20%;
                height: 20%;
            }
            .botão:hover{
                background-image: linear-gradient(to right, #1be75a , #11dbc0);
                box-shadow: 0px 0px  rgba(14, 233, 81, 1);
                border: 0px ;
            }
            .botão1{
                position:  relative;
                left: 0%;
                margin-top: 6%;
                color: white;
                border-width: 2px;
                padding: 10px  9px;
                border: 1px solid rgba(14, 233, 81, 1);
                background: transparent;
                cursor: pointer;
                width: 10%;
                height: 10%;
            }
            .botão1:hover{
                background-image: linear-gradient(to right, #1be75a , #11dbc0);
                box-shadow: 0px 0px  rgba(14, 233, 81, 1);
                border: 0px ;
            }
        </style>
    </head>
    <body>
        <%@include file="../Svg.jsp" %>
        <nav  style="background-color: black; height: 80px;" id="navbar" class="navbar navbar-expand-lg fixed-top navbar-dark" aria-label="Main navigation">
            <a style="margin-left: 65px;" href="${pageContext.request.contextPath}/CarregarProfessor?idUsuario=${professor.idUsuario}" class="nav-link text-white">
                <svg class="bi me-2" width="30" height="30"><use xlink:href="#voltar"/></svg>
                Home
            </a>
            <div class="container">

                <div style="margin-left: 40%;"  class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault" >
                    <a class="navbar-brand logo-text">UBEProf</a>

                </div> <!-- end of navbar-collapse -->
            </div> <!-- end of container -->
        </nav> 
        <label style="position: absolute; top: 17%; left: 30%;"  for="inputEmail4" class=" h3 form-label">${menssagemP}</label>
        <form style="position: absolute; top: 27%; left: 30%;" action="${pageContext.request.contextPath}/ListarCursoProfessor" class="row g-3 col-md-6" method="POST">

            <div style="float: left; " class="col-md-6">
                <label  for="inputEmail4" class=" h3 form-label">Area</label>
                <select name="idArea" class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
                    <option> Selecione a  Area </option>
                    <c:forEach var="area" items="${areas}">
                        <option value="${area.idArea}" > ${area.nomeArea}</option>
                    </c:forEach>
                </select>

            </div>
            <input type="hidden" value="${professor.idProfessor}"  name="idProfessor" > 
            <div style="margin: auto; margin-top: 4%;" class="col-md-6">
                <button  style="  background-color:  black;" type="submit" class=" botão1" ><svg    style=" margin-left: 0 ;" class="bi me-2" width="20" height="20"><use xlink:href="#pesquisa"/></svg></i></button>
            </div>
        </form>



        <form style="position: absolute; top: 47%; left: 30%;" action="${pageContext.request.contextPath}/CadastrarCursoProfessor" class="row g-3 col-md-6">
            <input type="hidden" value="${professor.idUsuario}"  name="idUsuario" > 

            <input type="hidden" value="${professor.idProfessor}"  name="idProfessor" > 
           
           
            <div class="col-md-12">
                <label for="inputPassword4" class=" h3 form-label">Curso</label>
                <br>
                <c:forEach var="curso" items="${cursos}">
                    <input type="hidden" value="${curso.areaCurso.idArea}"  name="idArea" >
                    <input name="idCurso" type="radio"  style="height: 15px; width: 15px;" value="${curso.idCurso}"> 
                    <label style="font-size: 20px">${curso.nomeCurso}</label>
                    <br>
                </c:forEach>

            </div>


            <div  style="margin-top: 100px;" class="col-12">
                <button  style=" height: 50px;  background-color:  black;" type="submit" class=" col-md-3 botão">Cadastrar</button>
            </div>

        </form>

        <div style="position: absolute; top: 27%; left: 60%;" class="container-fluid">

            <div class="row">
                <div  class="col-4">
                    <div class="card">
                        <div class="card-body">
                            <div>
                                <div class="card-body">
                                    <h4 class="card-title"> Meus Cursos</h4>



                                </div>

                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th class="border-top-0">Id do curso</th>
                                            <th class="border-top-0">NOME do curso</th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <c:forEach var="cursoprofessor" items="${cursoprofessores}">
                                            <tr>
                                                <th align="center">${cursoprofessor.idCurso.idCurso}</th>

                                                <th align="center">${cursoprofessor.nomeCurso}</th>

                                            </tr>
                                        </c:forEach>

                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </body>
</html>
<%    } else {
        ((HttpServletResponse) response).sendRedirect("./index.jsp");

    }
%>