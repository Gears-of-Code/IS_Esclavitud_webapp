<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.Admin"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBModificationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosFactoryImpl" %>
        
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false" %>
<div id="info">

<%
try{
HttpSession misesion = request.getSession(false);
String b = request.getParameter("b");

Admin adm = (Admin)misesion.getAttribute("user");
int id = Integer.parseInt(request.getParameter("id_p"));    

    if(b == "0"){
        adm.autorizarProyecto(id);    
        response.sendRedirect("aut-proy-adm.jsp");
    }else{
        adm.rechazarProyecto(id);    
        response.sendRedirect("aut-proy-adm.jsp");
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