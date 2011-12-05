<%@page session="false"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd"><head>
<title>Registro de Responsable</title>
<link href="estilo.css" rel="stylesheet" type="text/css" />

<script src="jquery-1.6.3.min.js"></script>
<script>
$(document).ready(function(){
    $.getScript("funciones.js");
});
</script>

</head>

	<span class='titulo'>Registro</span><br>
<form id="forma" name="forma" method="post" action="reg-resp-db.jsp">
    <label for="usuario"></label>
    <table border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td>Usuario</td>
        <td><input type="text" name="usuario" id="usuario" /></td>
      </tr>
      <tr>
        <td>Contraseña</td>
        <td><input type="password" name="contrasena" id="contrasena" /></td>
      </tr>
      <tr>
        <td>Nombre</td>
        <td><input type="text" name="nombre" id="nombre" /></td>
      </tr>
      <tr>
        <td>Telefono</td>
        <td><input type="text" name="telefono" id="telefono" /></td>
      </tr>
      <tr>
        <td>Email</td>
        <td><input type="text" name="email" id="email" /></td>
      </tr>
      <tr>
        <td>Descripción</td>
        <td><textarea name="descripcion" id="descripcion"></textarea></td>
      </tr>
      <tr>
        <td>Sitio web</td>
        <td><input name="sitioweb" type="text" id="sitioweb" value="http://www." /></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td colspan="2"><div class="button button-forma">Completar registro</div></td>
      </tr>
    </table>
  </form>