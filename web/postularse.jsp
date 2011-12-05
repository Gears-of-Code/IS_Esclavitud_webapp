<%@page import="mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectoImpl"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBModificationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="java.lang.Integer"%>
<%@page import="java.lang.String"%>
<%@page session="false"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
HttpSession sesion = request.getSession(false);
if(sesion == null){
    response.sendRedirect("iniciosesion.jsp");
}else{
    Alumno al = (Alumno) sesion.getAttribute("user");
    
    try{
        int id_p = Integer.parseInt(request.getParameter("id_p"));
        al.postularseAProyecto(id_p);
        %> <script> alert("Te has postulado a este proyecto"); </script><%
        response.sendRedirect("index.jsp");
        
    }catch(DBModificationException e){
        %> <script> alert("DBModificationException"); </script><%
        out.println("Error: "+e.getMessage());
        
    }catch(DBCreationException d){
        %> <script> alert("DBCreationException"); </script><%
        out.println("Error: "+d.getMessage());
    }
}
%>