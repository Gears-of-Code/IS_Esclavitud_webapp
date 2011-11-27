<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBConsultException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*" %>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page session="false"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
HttpSession sesion = request.getSession(false);

Admin usr = (Admin)sesion.getAttribute("user");
String[][] respPendientes;

try{
    respPendientes  = usr.dameRespPendientes();
    
    %>
    <div id="info">
        <br><span class="titulo">Autorizaciones Pendientes: Responsables</span><br><br>

        <%
        for(int i=0; i<respPendientes.length; i++){
            out.println("<div class='entrada'>");
            out.println("<div class='button button-aceptar' pg='acep-resp.jsp?id_u="+respPendientes[i][0]+"&b=0'>Aceptar</div>");                
            out.println("<div class='button button-consultar' pg='perf-res.jsp?id_u="+respPendientes[i][0]+"'>Perfil</div>");
            out.println("<div class='button button-rechazar' pg='acep-resp.jsp?id_u="+respPendientes[i][0]+"&b=1'>Rechazar</div>");
            out.println("<div class='info' align='left'>"+respPendientes[i][1]+"</div>  ");
            out.println("</div>");
        }
        %>
        </div>
        <%
}catch(DBConsultException e){
    out.println("DBConsultException "+e.getMessage());
}catch(DBCreationException d){
    out.println("DBCreationException: "+d.getMessage());
}

%>