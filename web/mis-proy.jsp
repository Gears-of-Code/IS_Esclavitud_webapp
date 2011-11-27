<%@page import="java.lang.Integer"%>
<%@page import="java.lang.String"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBConsultException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>        
<%@page session="false" %>

<%
HttpSession sesion = request.getSession(false);
if(sesion == null){
    response.sendRedirect("iniciosesion.jsp");
}else{    
    UsuarioRegistrado usr = (UsuarioRegistrado)sesion.getAttribute("user");
    %>
<div id="info">
        <br><div class="titulo">Mis proyectos</div><br>
        <% 
        try{                                        
            String[][] proyectos = usr.verMisProyectos();

            for(int i = 0; i<proyectos.length; i++){
                
                out.println("<div class='entrada'>");
                    out.println("<div class='boton' pg='cons-proy.jsp?id_p="+proyectos[i][1]+"'><img src='imagenes/iconos/edit.png' /></div>");
                    out.println("<div class='info' align='left'>" + proyectos[i][0] +"</div>");
                out.println("</div>");
            }
        }catch(DBConsultException e){
            out.println("Base de datos fuera de servicio. Intentelo más tarde.");
            out.println("<br>Mensaje: "+e.getMessage());
        }catch(DBCreationException e){
            out.println("Base de datos fuera de servicio. Intentelo más tarde.");
            out.println("<br>Mensaje: "+e.getMessage());
        }
        %>
</div>

<% } %>
