<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBModificationException"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="info">
    <%
    	out.print("1");
        try {
            HttpSession misesion = request.getSession(false);
            Admin adm = (Admin) misesion.getAttribute("user");
			out.print("2");
            int id = Integer.parseInt(request.getParameter("id_u"));
            String b = request.getParameter("b");

			out.print("3");
            if (b.compareToIgnoreCase("0") == 0) {
            	out.print("aceptando");
                adm.aceptaResponsable(id);
                //response.sendRedirect("aut-resp-adm.jsp");
            }else if (b.compareToIgnoreCase("1") == 0){
            	out.print("rechazando");
                adm.rechazarResponsable(id);
                //response.sendRedirect("aut-resp-adm.jsp");
            }
        } catch (DBModificationException e) {
           	out.print("DBModificationException: "+e.getMessage());
        } catch (DBCreationException d) {
			out.print("DBCreationException");
        }

    %>    
</div>

</body>
</html>
