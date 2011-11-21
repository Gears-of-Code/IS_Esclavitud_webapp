<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.Admin"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBModificationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="info">
    <%
        try {
            HttpSession misesion = request.getSession(false);
            Admin adm = (Admin) misesion.getAttribute("user");

            int id = Integer.parseInt(request.getParameter("id_u"));
            String confirm = request.getParameter("b");

            if (confirm.compareToIgnoreCase("0") == 0) {
                out.println("El Responsable ha sido Aceptado");
                adm.aceptaResponsable(id);
                response.sendRedirect("aut-resp-adm.jsp");
            } else if (confirm.compareToIgnoreCase("1") == 0){
                adm.rechazarResponsable(id);
                out.println("El Responsable ha sido Rechazado");
                response.sendRedirect("aut-resp-adm.jsp");
            }

        } catch (DBModificationException e) {
            out.print(e.getMessage());
        } catch (DBCreationException d) {
            out.print(d.getMessage());
        }

    %>    
</div>

</body>
</html>