<%@page import="mx.gearsofcode.proyservsocial.logico.proyectos.*"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBConsultException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.impl.*" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*" %>
<%@page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
HttpSession sesion = request.getSession(false);

UsuarioRegistrado adm = (Admin)sesion.getAttribute("user");
String[][] proyectos;
String[][] alumPendientes;

 try{   
    proyectos = adm.verProyectos();    
    %>
	<div id="info">
	
	    <br /><span class="titulo">Autorizaciones Pendientes: Alumnos</span><br /><br />
	    
<%
    for(int i=0; i<proyectos.length; i++){
        out.println("<b>" + proyectos[i][0] + "</b>");
        
        int id_p = Integer.parseInt((proyectos[i][1]));                
		int id_usr = adm.getId();
		
        Proyecto proy = adm.verDetallesProyecto(id_p);
        alumPendientes = proy.verListaPostulados(id_usr);

        for(int j=0; s<alumPendientes.length; j++){
			out.println("<div class='entrada'>");
			out.println("<div class='button button-rechazar' pg='acep-alum.jsp?id_p="+alumPendientes[s][1]+"&b=0'>Rechazar</div>");
			out.println("<div class='button button-aceptar' pg='acep-alum.jsp?id_p="+alumPendientes[s][1]+"'>Aceptar</div>");                
			out.println("<div class='button button-consultar' pg='perf-alum.jsp?id_p="+alumPendientes[s][1]+"&b=1'>Perfil</div>");
			out.println("</div>");
        }
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
