<%-- 
    Document   : logicoDebugger
    Created on : Nov 6, 2011, 2:23:31 PM
    Author     : filloy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.Mapper" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.Admin" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosFactoryImpl" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Debugging Page</title>
    </head>
    <body>
        <%
        Admin carlos = new UsuariosFactoryImpl().createAdmin();
        carlos = (Admin)carlos.verDetallesUsuario(4);
        String [][] responsables = carlos.dameRespPendientes();
        for(int i = 0; i < responsables.length; i++){
            for(int j =0; j< responsables[i].length;j++){
                out.println(responsables[i][j] + "<br>");
            }
        }
        String [][] alumnos = carlos.dameAlumPendientes();
        for(int i = 0; i < alumnos.length; i++){
            for(int j =0; j< alumnos[i].length;j++){
                out.println(alumnos[i][j] + "<br>");
            }
        }
        %>

    </body>
</html>
