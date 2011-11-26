<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.Admin"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBModificationException"%>
        
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false" %>
<div id="info">
	<%
	try{
		HttpSession misesion = request.getSession(false);
		String b = request.getParameter("b");

		Admin adm = (Admin)misesion.getAttribute("user");
		int id = Integer.parseInt(request.getParameter("id_p"));    

		if(b.compareToIgnoreCase("0") == "0"){
		    adm.autorizarProyecto(id);    
		    response.sendRedirect("aut-proy-adm.jsp");
		}else if(b.compareToIgnoreCase("1") == "0"){
		    adm.rechazarProyecto(id);    
		    response.sendRedirect("aut-proy-adm.jsp");
		}
	}catch(DBModificationException e){
		%>
		<script> notifica("DBModificationException"); </script>
		<%
	}catch(DBCreationException d){
		%>
		<script> notifica("DBCreationException"); </script>
		<%
	}

	%>
</div>

</body>
</html>
