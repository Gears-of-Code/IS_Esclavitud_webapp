

<%@page import="java.lang.Integer"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>        
<%@page session="false" %>

<%
HttpSession sesion = request.getSession(false);
if(sesion == null){
    response.sendRedirect("iniciosesion.jsp");
}else{
%>
<html>
    <head>    
    <link href="estilo.css" rel="stylesheet" type="text/css" />
    <title>Index</title>

    <script src="jquery-1.6.3.min.js"></script>
    <script>
        $(document).ready(function(){
            $.getScript("funciones.js");
            $("#contenido").append("<div id='info'></div>");
            $("#info").load('bienvenida.jsp');            
        });
    </script>
    </head>

    <body>
        <div id="wrapper" align="center">
            <div class="container">
            <div id="menu" align="left">
            <div id="logo" align="center"></div> 
            
            <%
            Integer t = (Integer)sesion.getAttribute("tipo");
            if(t == null){
                    response.sendRedirect("iniciosesion.jsp");//TODO really fix this
            }
            int tipo = t.intValue();
            %>
    <%@include file="menu.jsp" %>
        </div>
        
        <div id="right">
            <div id="topbar" align="right" pg="salir.jsp">Finalizar Sesión</div>            
            <div id="contenido">
                
            </div>
        </div>
        
        <div id="notificacion">Notificacion</div>
            </div>
    </div>
        
<script>
    $('#topbar').click(function(){
        document.location.href= $(this).attr('pg');
    });    
</script>
        
   </body>
</html>
<%
}
%>