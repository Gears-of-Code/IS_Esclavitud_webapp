<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.Admin"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBModificationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado"%>
        
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

HttpSession sesion = request.getSession(false);
if(sesion == null){
    response.sendRedirect("iniciosesion.jsp");
}else{ 
    try{

        String b = request.getParameter("b");

        Admin adm = (Admin) sesion.getAttribute("user");
        int id = Integer.parseInt(request.getParameter("id_p"));
        int id_user = Integer.parseInt(request.getParameter("id_u"));    
            
       
        if(b.compareToIgnoreCase("0") == 0){    
            adm.autorizarAlumnoProyecto(id_user, id);
            %><script> alert("Alumno autorizado en proyecto"); </script><%
            response.sendRedirect("aut-alum-adm.jsp");
        }else if(b.compareToIgnoreCase("1") == 0){
            adm.rechazarAlumnoProyecto(id_user, id);
            %><script> alert("Alumno rechazado en proyecto"); </script><%
            response.sendRedirect("aut-alum-adm.jsp");
        }
    }catch(DBModificationException e){
        %>
        <script> alert("DBModificationException"); </script>
        <%
    }catch(DBCreationException d){
        %>
        <script> alert("DBCreationException"); </script>
        <%
    }
}

%>