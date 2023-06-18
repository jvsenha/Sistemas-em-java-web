<%-- 
    Document   : sistema_de_estrelas
    Created on : 17/06/2022, 23:49:49
    Author     : joaos
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<link href="css/css.css" rel="stylesheet" type="text/css"/>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>    <link href="../css/csshomecliente.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <!-- JavaScript Bundle with Popper -->

    </head>
    <body>
    <c:choose>
                                    <c:when test="${avaliacao.notaAvaliacao=='1'}">
                                        <c:forEach var = "i" begin = "1" end = "1">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrela"/></svg> 
                                        </c:forEach>
                                        <c:forEach var = "i" begin = "1" end = "4">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrelavz"/></svg> 
                                        </c:forEach>
                                    </c:when>
                                    <c:when test="${avaliacao.notaAvaliacao=='2'}">
                                        <c:forEach var = "i" begin = "1" end = "2">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrela"/></svg> 
                                        </c:forEach>
                                        <c:forEach var = "i" begin = "1" end = "3">
                                            <svg class="bi me-2"width="20" height="20"><use xlink:href="#estrelavz"/></svg> 
                                        </c:forEach>
                                    </c:when>
                                    <c:when test="${avaliacao.notaAvaliacao=='3'}">
                                        <c:forEach var = "i" begin = "1" end = "3">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrela"/></svg> 
                                        </c:forEach>
                                        <c:forEach var = "i" begin = "1" end = "2">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrelavz"/></svg> 
                                        </c:forEach>
                                    </c:when>
                                    <c:when test="${avaliacao.notaAvaliacao=='4'}">
                                        <c:forEach var = "i" begin = "1" end = "4">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrela"/></svg> 
                                        </c:forEach>
                                        <c:forEach var = "i" begin = "1" end = "1">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrelavz"/></svg> 
                                        </c:forEach>
                                    </c:when>
                                    <c:otherwise>
                                        <c:forEach var = "i" begin = "1" end = "5">
                                            <svg class="bi me-2" width="20" height="20"><use xlink:href="#estrela"/></svg> 
                                        </c:forEach>
                                    </c:otherwise>
                                </c:choose>
    </body>
</html>
