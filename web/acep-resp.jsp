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
            String b = request.getParameter("b");

            if (b.compareToIgnoreCase("0") == 0) {
                adm.aceptaResponsable(id);
                response.sendRedirect("aut-resp-adm.jsp");
            } else if (b.compareToIgnoreCase("1") == 0){
                adm.rechazarResponsable(id);
                response.sendRedirect("aut-resp-adm.jsp");
            }

        } catch (DBModificationException e) {
           %>
			<script> notifica("DBModificationException"); </script>
			<%
        } catch (DBCreationException d) {
            %>
			<script> notifica("DBCreationException"); </script>
			<%
        }

    %>    
</div>

</body>
</html>
