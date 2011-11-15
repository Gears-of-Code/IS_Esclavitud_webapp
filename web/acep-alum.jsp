<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.Admin"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBModificationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado"%>
        
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="info">
<%
try{
    HttpSession misesion = request.getSession(false);
    String b = request.getParameter("b");

    Admin adm = (Admin) misesion.getAttribute("user");

    int id = Integer.parseInt(request.getParameter("id_pp"));
    int id_user = Integer.parseInt(request.getParameter("id_u"));    

    if(b == "0"){    
        adm.autorizarAlumnoProyecto(id_user, id);
        response.sendRedirect("aut-alum-adm.jsp");
    }else{
        adm.rechazarAlumnoProyecto(id_user, id);
        response.sendRedirect("aut-alum-adm.jsp");
    }
}catch(DBModificationException e){
    %>
    <script> notifica("mensaje error"); </script>]
    <%
}catch(DBCreationException d){
    %>
    <script> notifica("mensaje error"); </script>]
    <%
}

%>
</div>
    

</body>
</html>