<%-- 
    Document   : errores
    Created on : Oct 8, 2021, 10:38:33 PM
    Author     : luciano
--%>
<%
    String error = (String)request.getSession().getAttribute("error");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Te encontraste errores: <%= error %></h1>
        <a href="index.jsp">Volver</a>
    </body>
</html>
