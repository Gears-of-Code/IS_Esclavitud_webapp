<%@page session="false"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="estilo.css" rel="stylesheet" type="text/css" />
<script src="jquery-1.6.3.min.js"></script>
<title>Inicio de Sesion</title>
</head>


<body>

<div class="container-logo">
    <div id='login_site' align="center">
	<div id="logo_sesion"><img src="imagenes/logo.png" /></div>
        <fieldset>
	<form id='forma' method='post' action="verificador.jsp" name="forma" accept-charset='UTF-8'>
            <legend align="center">Inicio de Sesión</legend>

            <input type='hidden' name='submitted' id='submitted' value='1'/>

            <div class='container' align="right">
                Usuario:<input type="text" name="nombre" maxlength='30' />                    
            </div>

            <div class='container' align="right">
                Password:<input type="password" name="password" maxlength='30' />            
            </div>

            <div class='container' align="center">

                <div class="button button-reg">
                    Registrarse
                </div>

                <div class="button button-forma">
                    Entrar
                </div>
            </div>
        </form>
        </fieldset>

    <script>
    $('.button.button-reg').click(function(){
        document.location.href= 'reg-resp.jsp';
    });

    $('.button-forma').click(function(){
            $("#forma").submit();
    });
    </script>

    </div>
</div>
</body>
</html>