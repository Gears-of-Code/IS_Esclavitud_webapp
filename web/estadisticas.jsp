<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBConsultException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.Admin"%>
<%@page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    
<%
HttpSession sesion = request.getSession(false);

Admin adm = (Admin)sesion.getAttribute("user");
String[][] apc, ppc, ppa;

try{
    out.println("<br><br><strong>Alumnos por carrera</strong><br>");
    apc = adm.alumnosPorCarreraDb ();
    for(int i=0; i<apc.length; i++){
         out.println(apc[i][0]+": "+apc[i][1]+"<br>");
    }


    out.println("<br><br><strong>Proyectos por carrera</strong><br>");
    ppc = adm.proyectosPorCarrerasDb();
    for(int i=0; i<ppc.length; i++){
         out.println(ppc[i][0]+": "+ppc[i][1]+"<br>");
    }


    out.println("<br><br><strong>Proyectos por área</strong><br>");
    ppa = adm.proyectosPorAreaDb();
    for(int i=0; i<ppa.length; i++){
         out.println(ppa[i][0]+": "+ppa[i][1]+"<br>");
    }
}catch(DBConsultException e){
        out.println("Base de datos fuera de servicio. Intentelo más tarde.");
    out.println("<br>DBConsultException "+e.getMessage());
}catch(DBCreationException d){
        out.println("Base de datos fuera de servicio. Intentelo más tarde.");
    out.println("<br>DBCreationException: "+d.getMessage());
}

%>