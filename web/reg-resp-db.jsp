<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl"%>
<%@page import="mx.gearsofcode.proyservsocial.logico.util.DBCreationException"%>
<%@page import="java.security.MessageDigest"%>
<%@page session="false"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="mx.gearsofcode.proyservsocial.logico.usuarios.*" %>

<script src="jquery-1.6.3.min.js"></script>

<%
    try {

        if (!request.getParameter("email").isEmpty()
                && (!request.getParameter("nombre").isEmpty()) && (!request.getParameter("usuario").isEmpty())) {
            String password = request.getParameter("contrasena");
            //String pwdmd5 = AeSimpleMD5.MD5(password);

            String pwdmd5;

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

            Responsable responsable = new ResponsableImpl();
            responsable.registrarse(pwdmd5, request.getParameter("descripcion"), request.getParameter("email"), request.getParameter("telefono"), request.getParameter("nombre"), request.getParameter("sitioweb"), 1, request.getParameter("usuario"));

            response.sendRedirect("index.jsp");
        } else {
            out.println("Falta ingresar datos.<a href='javascript:history.back(1)'>Regresar</a>");
        }
    } catch (DBCreationException e) {
        out.println("Base de datos fuera de servicio. Intentelo más tarde.");
    }
%>