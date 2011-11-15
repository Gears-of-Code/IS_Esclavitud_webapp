
<%@page import="java.lang.Integer"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBConsultException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.Mapper"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*" %>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.impl.*" %>
<%@page session="false"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

HttpSession sesion = request.getSession(false);
if(sesion == null){
    response.sendRedirect("iniciosesion.jsp");
}else{ 
    try{
        UsuarioRegistrado usr = (UsuarioRegistrado)sesion.getAttribute("user");
        int id_p = Integer.parseInt(request.getParameter("id_p"));
        Proyecto proyecto = usr.verDetallesProyecto(id_p);

        Mapper mapc = new Mapper(proyecto.getCarreras(), 1);
        Mapper mapa = new Mapper(proyecto.getAreaConocimiento(), 0);
        
        mapc.map();
        mapa.map();

        UsuarioRegistrado res = new UsuariosFactoryImpl().createUsuarioRegistrado();
        res = res.verDetallesUsuario(proyecto.getResponsable());

        String[] areasConocimiento = mapa.getTranslated();
        String[] carreras = mapc.getTranslated();

        %>
        <div id="info">
            <br /><span class="titulo">Consultar Proyecto</span><br /><br />


            <div class="bloqueinfo" align="right">Numero de aprobacion: <% out.println(proyecto.getId()); %> </div>
            <div class="bloqueinfo" align="right">Máximo participantes: <% out.println(proyecto.getMaxParticipantes()); %> </div>
            <div class="bloqueinfo" align="left">Responsable: 
                <% out.println("<div class='button button-consultar' pg='perf-res.jsp?id_u="+res.getId()+"'>"+res.getNombre()+"</div>"); %> 
            </div>
            <div class="bloqueinfo" align="left">Area de Conocimiento:<br>
                <% 
                    for(int i = 0; i<areasConocimiento.length; i++){
                        out.println("+ "+areasConocimiento[0]+"<br>"); 
                    }

                %>
            </div>
            
            <div class="bloqueinfo" align="left">Direccion: <% out.println(proyecto.getDireccion()); %></div>
            <div class="bloqueinfo" align="left">Telefono: <% out.println(proyecto.getTelefono()); %></div>
            <div class="bloqueinfo" align="left">Correo: <% out.println(proyecto.getEmail()); %></div>

                                        
            <div class="bloqueinfo" align="left">Carreras participantes:<br>
                <% 
                    for(int i = 0; i<carreras.length; i++){
                        out.println("+ "+carreras[0]+"<br>"); 
                    }

                %>
            </div>

            <div class="bloqueinfo" align="left">Descripción: </div>
                <% out.println(proyecto.getDescripcion()); %> 

            
                <%
                if(usr.getTipo() == 2){
                    //int p_id = proyecto.getId();
                    out.println("<div>POSTULARSE</div>");
                    //out.println("<div class='button-reg' pg='postularse.jsp?id_p="+out.println(p_id)+"'>Postularse</div>");
                }
                %>
            </div>
        </div><%

           
    }catch(DBConsultException e){
		out.println("Por el momento no se encuentra con la información solicitada.<br>");
        out.println("DBConsultException: "+e.getMessage());
		out.println("<br>");
    }catch(DBCreationException d){
		out.println("Base de datos fuera de servicio. Intentelo más tarde.");
        out.println("DBCreationException: "+d.getMessage());
    }catch(UnsupportedOperationException f){
            out.println("UnsupportedOperationException: "+f.getMessage());
        }
}
%>