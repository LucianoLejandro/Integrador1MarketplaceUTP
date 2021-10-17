<%-- 
    Document   : index
    Created on : Oct 8, 2021, 10:11:41 PM
    Author     : luciano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario</h1>
        <form action="cvendedor.do" method="post">
            Nombres <input type="text" name="txtvnombres"/><br/>
            Apellido Pat <input type="text" name="txtvapellidop"/><br/>
            Apellido Mat <input type="text" name="txtvapellidom"/><br/>
            Usuario <input type="text" name="txtvusuario"/><br/>
            Contraseña <input type="text" name="txtvcontrasenia"/><br/>
            <input type="submit" value="Enviar datos"/>
            
        </form>
    </body>
</html>
