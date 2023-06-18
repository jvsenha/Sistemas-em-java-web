<%-- 
    Document   : listarmaquinista
    Created on : 08/12/2022, 17:17:55
    Author     : joaos
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Maquinista</title>
    </head>
    <body>
              <%@include file="sidebar.jsp" %>
        
        <div class="container-fluid col-6  " >
                <div class="row tabela" >
                    <table class=" table table-hover " style="margin-top: 10%;"   >
                        <thead>
                            <tr>
                                <th class="border-top-0">NOME</th>
                                <th class="border-top-0">Login</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                        <c:forEach var="maq_emp" items="${maqemps}">
                                <tr>
                                      <th align="center">${maq_emp.nomeUsuario}</th>
                                      <th align="center">${maq_emp.loginUsuario}</th>
                                </tr>
                            </c:forEach>

                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
          
    </body>
</html>
