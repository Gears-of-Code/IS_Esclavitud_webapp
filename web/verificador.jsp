
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBConsultException"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.InicioDeSesionFactoryImpl"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionFactory"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion"%>
<%@page import="java.security.MessageDigest"%>

<% 

    String nombre = request.getParameter("nombre"); //nombre de usuario que nos pasa login
    String password = request.getParameter("password"); //password que nos pasa login 
     
        String pwdmd5;
        int id, tipo;
	
        /***** Algoritmo MD5 *****/               
        MessageDigest mdAlgorithm = MessageDigest.getInstance("MD5");
        mdAlgorithm.update(password.getBytes());

        byte[] digest = mdAlgorithm.digest();
        StringBuffer hexString = new StringBuffer();
                
        for (int i = 0; i < digest.length; i++) {
            password = Integer.toHexString(0xFF & digest[i]);

            if (password.length() < 2) {
                password = "0" + password;
            }
            hexString.append(password);
        }
        pwdmd5 = hexString.toString();
		
	//    imprimimos la version MD5 de la cadena que le pasamos
	out.println("user is: " + nombre + "<br>");                                       
        //out.println("passwd with MD5 is: " + pwdmd5 + "<br>");
       /***** FIN de Algoritmo MD5 *****/               
        Sesion sesion;
        sesion = new InicioDeSesionFactoryImpl().createSesion(); 
        
                               
        UsuarioRegistrado usuario;
        try {
            usuario = sesion.autenticar(nombre,pwdmd5);
            if( usuario != null) {
                session.setAttribute("id", usuario.getId());
                session.setAttribute("nombre", nombre);
                session.setAttribute("tipo", usuario.getTipo());
                session.setAttribute("user", usuario);
                
                response.sendRedirect("index.jsp");
            }else{
                out.println("El usuario o contraseña es incorrecto.");
            }
        }catch(DBConsultException e){
            if(e.getErrorCode() == 7){
                out.println("<br>Usuario no autorizado por administrador");
            }else{
                //out.println("Primera exception");     
                out.println("<br>Usuario no registrado:<br>"+e.getMessage());
            }
        }catch(DBCreationException d){            
            out.println("Base de datos fuera de servicio. Intentelo más tarde.");
        }        
%>
