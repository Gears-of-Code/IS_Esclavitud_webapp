<%@page import="mx.gearsofcode.proyservsocial.logico.proyectos.*"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBConsultException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.impl.*" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado"%>
<%@page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
HttpSession sesion = request.getSession(false);

UsuarioRegistrado adm = (Admin) sesion.getAttribute("user");
String[][] proyectos;
String[][] alumPendientes;

 try{   
    proyectos = adm.verProyectos();    
    %>
    <br /><span class="titulo">Autorizaciones Pendientes: Alumnos</span><br /><br />	    
    <%	
    for(int i=0; i<proyectos.length; i++){  // hacemos un recorrido sobre los proyectos que hay
        out.println("<div class='entrada'><strong>"+proyectos[i][0]+"</strong></div>");
	   
        int id_p = Integer.parseInt((proyectos[i][1])); // ID del proyecto en cuestion.      
	int id_usr = adm.getId();  // ID del usuario en cuestion.
		
        Proyecto proy = adm.verDetallesProyecto(id_p); //hacemos un proyecto deacuerdo al ID que nos pasan.
        alumPendientes = proy.verListaPostulados(id_usr); // sacamos los alumnos postulados al proyecto en cuestion.

        for(int j=0; j<alumPendientes.length; j++){
out.println("<div class='entrada' align='left'>"+alumPendientes[j][1]);
out.println("<div class='button button-rechazar' pg='acep-alum.jsp?id_p="+proyectos[i][1]+"&id_u="+alumPendientes[j][0]+"&b=1'>Rechazar</div>");
out.println("<div class='button button-aceptar' pg='acep-alum.jsp?id_p="+proyectos[i][1]+"&id_u="+alumPendientes[j][0]+"&b=0'>Aceptar</div>");

out.println("<div class='button button-consultar' pg='perf-alum.jsp?id_u="+alumPendientes[j][0]+"'>Perfil</div>");
out.println("</div>");
	}
        out.println("<br><br>");
    }
}catch(DBConsultException e){
	out.println("Base de datos fuera de servicio. Intentelo más tarde.");
    out.println("<br>DBConsultException "+e.getMessage());
}catch(DBCreationException d){
	out.println("Base de datos fuera de servicio. Intentelo más tarde.");
    out.println("<br>DBCreationException: "+d.getMessage());
}

%>
