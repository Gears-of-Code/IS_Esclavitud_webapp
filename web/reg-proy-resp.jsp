<%@page session="false"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="info">
    <br><span class="titulo">Registro de Proyecto</span><br><br>			

    <form id="forma" name="forma" method="post" action="reg-proy-resp-db.jsp">
        <table>
            <tr>
                <td>Nombre del proyecto</td>
                <td><textarea name="nombre" cols="70" rows="1" id="nombre"></textarea></td>
            </tr>

            <tr>
              <td>Email</td>
              <td><textarea name="email" cols="70" rows="1" id="email"></textarea></td>
            </tr>
            <tr>
              <td>Teléfono</td>
              <td><textarea name="telefono" cols="70" rows="1" id="telefono"></textarea></td>
            </tr>
            <tr>
                <td>Dirección</td>
                <td><textarea name="direccion" cols="70" rows="4" id="direccion">Escriba aquí dirección, teléfono, correo electrónico</textarea></td>
            </tr>
            <tr>
                <td>Máximo de participantes</td>
                <td><input name="maxparticipantes" type="text" id="maxparticipantes" value="" size="5" /></td>
            </tr>
            <tr>
                <td>Descripción</td>
                <td><textarea name="descripcion" cols="70" rows="10" id="descripcion"></textarea></td>
            </tr>



            <tr>
                <td colspan=2><div class="button button-forma">Aceptar</div></td>
            </tr>
        </table>
        </form>
			 	
    </div>