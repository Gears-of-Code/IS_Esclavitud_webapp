<%@page import="java.lang.Integer"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosFactoryImpl" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>        
<%@page session="false" %>

<%
HttpSession sesion = request.getSession(false);
if(sesion == null){
    response.sendRedirect("iniciosesion.jsp");
}else{
    int id = Integer.parseInt(request.getParameter("id_u"));
    
    Responsable res = new UsuariosFactoryImpl().createResponsable();
    res = (Responsable)(res.verDetallesUsuario(id));
    
%>
    
<div id="info">
    <span class="titulo">Perfil de <% out.println(res.getNombre()); %> </span><br /><br />
    
    <div class="bloqueinfo" align="left">Teléfono: <% out.println(res.getTelefono()); %></div>
    <div class="bloqueinfo" align="left">Sitio web: <% out.println(res.getSitioweb()); %></div>
    <div class="bloqueinfo" align="left">Email: <% out.println(res.getEmail()); %></div>
        
    <div class="bloqueinfo" align="left">
        Descripcion: <% out.println(res.getDescripcion()); %>
    </div>
</div>

<% } %>