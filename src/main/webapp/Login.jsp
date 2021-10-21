<%-- 
    Document   : login
    Created on : 20 oct. 2021, 22:47:48
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Sesion</title>
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="contenedor1">
            <h1>Iniciar Sesion</h1>
            <form id="form1">
                <img src="imagen/user.png" alt=""/>
                <input type="text" name="" placeholder="Username"/>
                <hr>
                <img src="imagen/user.png" alt=""/>
                <input type="password" name="" placeholder="Password"/>
                <hr>
                <input type="submit" value="Iniciar Sesión"/>
                
            </form>
            
        </div>
        <div id="contenedor2">
            <form id="form2">
                <input type="submit" value="Crear Cuenta"/>
                <input type="submit" value="Crear Cuenta de Empresa"/>
            </form>
            <div id="referencias">
                <a>Marketplace UTP</a>
                <a href="">Term of Use</a>
                <a href="">Privacy Policy</a>
            </div>
        </div>
    </body>
</html>
