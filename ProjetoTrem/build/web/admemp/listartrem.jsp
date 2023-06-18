<%-- 
    Document   : listartrem
    Created on : 08/12/2022, 18:07:45
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
                    <table class=" table table-hover " style="margin-top: 10%;"   >
                        <thead>
                            <tr>
                                <th class="border-top-0">ID TREM</th>
                                <th class="border-top-0">NOME</th>
                                <th class="border-top-0">MODELO</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                        <c:forEach var="trem" items="${trems}">
                                <tr>
                                      <th align="center">${trem.idTrem}</th>
                                      <th align="center">${trem.nomeTrem}</th>
                                      <th align="center">${trem.modeloTrem}</th>
                                </tr>
                            </c:forEach>

                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
    </body>
</html>
