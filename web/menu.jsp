<%@page import="java.util.Enumeration" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado"%>
<%@page session="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if(tipo == 1){
        out.print("<div class='titulo-menu'>Administrador</div>");
        out.print("<div class='entrada-menu' pg='ver-proy.jsp'>Ver proyectos</div>");
        out.print("<div class='entrada-menu' pg='' style='cursor: default;'>Autorizaciones pendientes</div>");
        out.print("<div class='entrada-menu' pg='aut-proy-adm.jsp'>&nbsp;&nbsp;&nbsp;&nbsp;Proyectos</div>");
        out.print("<div class='entrada-menu' pg='aut-resp-adm.jsp'>&nbsp;&nbsp;&nbsp;&nbsp;Responsables</div>");
        out.print("<div class='entrada-menu' pg='aut-alum-adm.jsp'>&nbsp;&nbsp;&nbsp;&nbsp;Alumnos en proyectos</div><br /><br />");

}else if(tipo == 3){
        out.print("<div class='titulo-menu'>Responsable</div>");
        out.print("<div class='entrada-menu' pg='ver-proy.jsp'>Ver proyectos</div>");
        out.print("<div class='entrada-menu' pg='mis-proy.jsp'>Consultar mis proyectos</div>");
        out.print("<div class='entrada-menu' pg='reg-proy-resp.jsp'>Proponer Proyecto</div><br /><br />");

}else if (tipo == 2){
        out.print("<div class='titulo-menu'>Alumno</div>");
        out.print("<div class='entrada-menu' pg='ver-proy.jsp'>Ver proyectos</div>");
        out.print("<div class='entrada-menu' pg='mis-proy.jsp' >Consultar mis proyectos</div>");
}    
%>