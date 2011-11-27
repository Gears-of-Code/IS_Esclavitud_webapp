<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.Admin"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBConsultException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado"%>
<%@page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
HttpSession misesion = request.getSession(false);

Admin usuario = (Admin) misesion.getAttribute("user");
String[][] proyectos;

try{
    proyectos = usuario.verMisProyectos();
%>

<div id="info">
	<br /><span class="titulo">Autorizaciones Pendientes: Proyectos</span><br /><br />
        
        <%
        for(int i=0; i<proyectos.length; i++){
            out.println("<div class='entrada'>");
                out.println("<div class='button button-aceptar' pg='acep-proy.jsp?id_p="+proyectos[i][1]+"&b=0'>Aceptar</div>");
                out.println("<div class='button button-consultar' pg='cons-proy-adm.jsp?id_p="+proyectos[i][1]+"'>Perfil</div>");
                out.println("<div class='button button-rechazar' pg='acep-proy.jsp?id_p="+proyectos[i][1]+"&b=1'>Rechazar</div>");
                out.println("<div class='info' align='left'>"+proyectos[i][0]+"</div>  ");
            out.println("</div>");
        }
        %>
</div>

 <%
}catch(DBConsultException e){
	out.println("Base de datos fuera de servicio. Intentelo más tarde.");
    out.println("<br>DBConsultException "+e.getMessage());
}catch(DBCreationException d){
	out.println("Base de datos fuera de servicio. Intentelo más tarde.");
    out.println("<br>DBCreationException: "+d.getMessage());
}

%>
