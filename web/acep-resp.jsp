<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.Admin"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBModificationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado"%>
        
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="info">
<%
try{
HttpSession misesion = request.getSession(false);
Admin adm = (Admin)misesion.getAttribute("user");

int id = Integer.parseInt(request.getParameter("id_p"));    
String confirm = request.getParameter("b");

if(confirm == "0"){
    out.println("El Responsable ha sido Aceptado");
    adm.aceptaResponsable(id);
    response.sendRedirect("aut-resp-adm.jsp");
}else{
    adm.rechazarResponsable(id);
    out.println("El Responsable ha sido Rechazado");
    response.sendRedirect("aut-resp-adm.jsp");
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