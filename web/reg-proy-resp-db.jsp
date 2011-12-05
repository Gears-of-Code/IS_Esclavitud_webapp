<%@page import="java.lang.Integer"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>        
<%@page session="false" %>

<%
HttpSession sesion = request.getSession(false);
if(sesion == null){
    response.sendRedirect("iniciosesion.jsp");
}else{
    Responsable res = (Responsable)sesion.getAttribute("user");
    
        
    try{        
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String direccion = request.getParameter("direccion");
        String email = request.getParameter("email");
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        int maxparticipantes = Integer.parseInt(request.getParameter("maxparticipantes"));
        int[] a = {1,2};
        int[] b = {3,4};
        
        if(nombre == null || descripcion == null || direccion == null || email == null){
               out.println("null!!");         
        }else{
            out.println("not null!");
                       
        }
        
        out.println("Nombre: "+nombre);
        out.println("<br>descripcion: "+descripcion);
        out.println("<br>direccion: "+direccion);
        out.println("<br>email: "+email);
        out.println("<br>telefono: "+telefono);
        out.println("<br>maxparticipantes: "+maxparticipantes);
                
        res.proponerProyecto(nombre, descripcion, direccion, email, telefono, maxparticipantes, a, b);
	%> 
        <script>
            alert("El proyecto se ha registrado. El administrador tiene que autorizarlo antes de aparecer en el listado."); 
        </script>
        <%
	response.sendRedirect("index.jsp");
    }catch(DBCreationException e){
        out.println("Base de datos fuera de servicio. Intentelo más tarde.");
        out.println("<br>Error: "+e.getMessage());
    }
}
%>