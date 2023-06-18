<%-- 
    Document   : listarprodemp
    Created on : 08/12/2022, 23:37:27
    Author     : joaos
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="sidebar.jsp" %>
         <div class="container-fluid col-6  " >
                <div class="row tabela" >
                    <table class=" table " style="margin-top: 10%;"   >
                        <thead>
                            <tr>
                                <th class="border-top-0">NOME</th>
                                <th class="border-top-0">TIPO</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                        <c:forEach var="prodemp" items="${prodemps}">
                                <tr>
                                      <th align="center">${prodemp.nomeProdEmp}</th>
                                      <th align="center">${prodemp.tipoProdEmp}</th>
                                </tr>
                            </c:forEach>

                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
    </body>
</html>
