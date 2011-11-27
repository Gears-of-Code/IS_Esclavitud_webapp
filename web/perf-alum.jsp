<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl"%>
<%@page import="java.lang.Integer"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>        
<%@page session="false" %>


<%
HttpSession sesion = request.getSession(false);
if(sesion == null){
    response.sendRedirect("iniciosesion.jsp");
}else{
    int id = Integer.parseInt(request.getParameter("id_u"));
    
    Alumno alum = new AlumnoImpl();
    alum = (Alumno)(alum.verDetallesUsuario(id));
%>
    
<div id="info">
    <span class="titulo">Perfil de <% out.println(alum.getNombre()); %> </span><br /><br />
    
    <div class="bloqueinfo" align="left">Carrera: <% out.println(alum.getCarrera()); %></div>
    <div class="bloqueinfo" align="left">Porcentaje: <% out.println(alum.getPorcentaje()+"%"); %></div>              
</div>

<% } %>