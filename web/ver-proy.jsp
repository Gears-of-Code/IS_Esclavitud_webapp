
<%@page import="mx.gearsofcode.proyservsocial.logico.proyectos.*"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*" %>
<%@page import="java.lang.Integer"%>
<%@page import="java.lang.String"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBConsultException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
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
        <br><div class="titulo">Ver proyectos</div><br>
        <% 
        try{                                        
            String[][] proyectos = usr.verProyectos();

            for(int i = 0; i<proyectos.length; i++){
                
                out.println("<div class='entrada'>");
                    out.println("<div class='boton' pg='cons-proy.jsp?id_p="+proyectos[i][1]+"'><img src='imagenes/iconos/edit.png' /></div>");
                    out.println("<div class='info' align='left'>" + proyectos[i][0] +"</div>");
                out.println("</div>");
            }
        }catch(DBConsultException e){
			out.println("Base de datos fuera de servicio. Intentelo más tarde.");
            out.println("Error DB Consult Exception");
            out.println("<br>Mensaje: "+e.getMessage());
        }catch(DBCreationException d){
			out.println("Base de datos fuera de servicio. Intentelo más tarde.");
            out.println("Error DB Creation Exception");
            out.println("<br>Mensaje: "+d.getMessage());
        }
        %>
</div>

<% } %>
