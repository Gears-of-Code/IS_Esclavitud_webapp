<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBModificationException"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%

HttpSession sesion = request.getSession(false);
if(sesion == null){
    response.sendRedirect("iniciosesion.jsp");
}else{    
    try {
        Admin adm = (Admin) sesion.getAttribute("user");
                    
        int id = Integer.parseInt(request.getParameter("id_u"));
        String b = request.getParameter("b");

        if (b.compareToIgnoreCase("0") == 0) {
            adm.aceptaResponsable(id);
            %> <script> alert("El responsable ha sido aceptado"); </script><%
            response.sendRedirect("aut-resp-adm.jsp");
        }else if (b.compareToIgnoreCase("1") == 0){
            adm.rechazarResponsable(id);
            %> <script> alert("El responsable ha sido rechazado"); </script><%
            response.sendRedirect("aut-resp-adm.jsp");
        }
    } catch (DBModificationException e) {
            out.print("DBModificationException: "+e.getMessage());
    } catch (DBCreationException d) {
            out.print("DBCreationException");
    }
}

%>
