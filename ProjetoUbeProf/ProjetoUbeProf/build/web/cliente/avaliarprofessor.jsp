<%

    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpSession sessao = httpServletRequest.getSession();
    if (sessao.getAttribute("cliente") != null) {

%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Avalie o Professor</title>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;700&display=swap" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/css/signin.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <style>
            .text-h1{
                
            }

            .estrelas input[type=radio] {
                display: none;
            }
            .estrelas label i.fa{
                font-size: 2.5em
            }
            .estrelas label i.fa:before {
                content:'\f005';
                color: #FC0;
            }
            .estrelas input[type=radio]:checked ~ label i.fa:before {
                color: #CCC;
            }
            .botão{
                position:  relative;
               
                bottom: -90%;
                color: black;
                border-width: 2px;
                padding: 10px 30px;
                border: 1px solid rgba(14, 233, 81, 1);
                box-shadow: 5px 5px  rgba(14, 233, 81, 1);
                background: transparent;
                cursor: pointer;
            }
            .botão:hover{
                background-image: linear-gradient(to right, #1be75a , #11dbc0);
                box-shadow: 0px 0px  rgba(14, 233, 81, 1);
                border: 0px ;
            }
        </style>
    </head>
    <body>
        <%@include file="../Svg.jsp" %>
        <nav style="background-color: black;"  id="navbar" class="navbar navbar-expand-lg fixed-top navbar-dark" aria-label="Main navigation">
            <a style="margin-left: 65px;" href="${pageContext.request.contextPath}/CerregarHomeCliente" class="nav-link text-white">
                <svg class="bi me-2" width="30" height="30"><use xlink:href="#voltar"/></svg>
                Home
            </a>
            <div class="container">

                <div style="margin-left: 40%;"  class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault" >
                    <a class="navbar-brand logo-text">UBEProf</a>

                </div> <!-- end of navbar-collapse -->
            </div> <!-- end of container -->
        </nav>
           
        <form  action="${pageContext.request.contextPath}/CadastrarAvaliacao" method="POST" >
       <input type="hidden" value="${professor.idProfessor}"  name="idProfessor" > 
       <input type="hidden" value="${cliente.idCliente}"  name="idCliente" > 
       <input type="hidden" value="${cliente.nomeUsuario}"  name="clienteAvaliacao" > 




            <div style="margin-top: -10%; position: absolute; left: 5%;" >
                <h1 class=" h3  fw-bold text-h1" ><strong>Qual a sua nota?</strong></h1>
                 <hr style=" width:40%; height: 5px; background-color: #0ee951;   margin-top:-9px;  opacity: 100;">  
                <h1 class=" h6  fw-bold" style="color:#979797;"><strong>Escolha uma de 1 a 5 estrelas para avaliar?</strong></h1>
                <div style=" position: absolute; left: 0%;  padding-top: 10px;" class="estrelas">
                    <input type="radio" id="cm_star-empty" name="notaAvaliacao" value="" checked/>
                    <label for="cm_star-1"><i class="fa"></i></label>
                    <input type="radio" id="cm_star-1" name="notaAvaliacao" value="1"/>
                    <label for="cm_star-2"><i class="fa"></i></label>
                    <input type="radio" id="cm_star-2" name="notaAvaliacao" value="2"/>
                    <label for="cm_star-3"><i class="fa"></i></label>
                    <input type="radio" id="cm_star-3" name="notaAvaliacao" value="3"/>
                    <label for="cm_star-4"><i class="fa"></i></label>
                    <input type="radio" id="cm_star-4" name="notaAvaliacao" value="4"/>
                    <label for="cm_star-5"><i class="fa"></i></label>
                    <input type="radio" id="cm_star-5" name="notaAvaliacao" value="5"/>
                </div>
            </div>






            <div style=" margin-bottom: 10%;  position: absolute; left: 5%;" >
                <h1 class=" h3  fw-bold text-h1"><strong>Oque voçe pode falar sobre este Professor?</strong></h1>
                 <hr style=" width:40%; height: 5px; background-color: #0ee951;   margin-top:-6px;  opacity: 100;">  
                 <textarea type="text" style=" width: 400px; height: 200px;" rows="10" cols="40" maxlength="500" name="comentarioAvaliacao"></textarea>>
                <a style="position: absolute; left: 0px; top: 110%;"  >   <button class="botão" type="submit" >Avaliar</button></a>
            </div>
            
     
            
            
           
        </form>
    </body>
</html>
<%    } else {
        ((HttpServletResponse) response).sendRedirect("./index.jsp");

    }
%>