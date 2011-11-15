<%@page  session="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
    if(request.getSession(false)== null){
        response.sendRedirect("iniciosesion.jsp");
    }else{
        out.println("Has terminado la sesión con exito");
        request.getSession(false).invalidate();
		response.sendRedirect("iniciosesion.jsp");
    }


%>
