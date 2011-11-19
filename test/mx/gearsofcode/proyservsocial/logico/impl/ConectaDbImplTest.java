/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gearsofcode.proyservsocial.logico.impl;

import java.sql.ResultSet;
import java.util.LinkedList;
import mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto;
import mx.gearsofcode.proyservsocial.logico.usuarios.Responsable;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ubuntu
 */
public class ConectaDbImplTest {
    
    public ConectaDbImplTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of verProyectosDb method, of class ConectaDbImpl.
     */
    @Test
    public void testVerProyectosDb() throws Exception {
        System.out.println("verProyectosDb");
        int tipoUsuario = 0;
        int idUsuario = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        LinkedList expResult = null;
        LinkedList result = instance.verProyectosDb(tipoUsuario, idUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verMisProyectosDb method, of class ConectaDbImpl.
     */
    @Test
    public void testVerMisProyectosDb() throws Exception {
        System.out.println("verMisProyectosDb");
        int tipoUsuario = 0;
        int idUsuario = 0;
        boolean studentStatus = false;
        ConectaDbImpl instance = new ConectaDbImpl();
        LinkedList expResult = null;
        LinkedList result = instance.verMisProyectosDb(tipoUsuario, idUsuario, studentStatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verDetallesProyectoDb method, of class ConectaDbImpl.
     */
    @Test
    public void testVerDetallesProyectoDb() throws Exception {
        System.out.println("verDetallesProyectoDb");
        int idProyecto = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        ResultSet expResult = null;
        ResultSet result = instance.verDetallesProyectoDb(idProyecto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of proponerProyectoDb method, of class ConectaDbImpl.
     */
    @Test
    public void testProponerProyectoDb() throws Exception {
        System.out.println("proponerProyectoDb");
        Proyecto proy = null;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.proponerProyectoDb(proy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autorizarProyectoDb method, of class ConectaDbImpl.
     */
    @Test
    public void testAutorizarProyectoDb() throws Exception {
        System.out.println("autorizarProyectoDb");
        int idProyecto = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.autorizarProyectoDb(idProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rechazaAlumnoProyectoDb method, of class ConectaDbImpl.
     */
    @Test
    public void testRechazaAlumnoProyectoDb() throws Exception {
        System.out.println("rechazaAlumnoProyectoDb");
        int idProyecto = 0;
        int idAlumno = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.rechazaAlumnoProyectoDb(idProyecto, idAlumno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rechazarProyectoDb method, of class ConectaDbImpl.
     */
    @Test
    public void testRechazarProyectoDb() throws Exception {
        System.out.println("rechazarProyectoDb");
        int idProyecto = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.rechazarProyectoDb(idProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rechazaResponsableDb method, of class ConectaDbImpl.
     */
    @Test
    public void testRechazaResponsableDb() throws Exception {
        System.out.println("rechazaResponsableDb");
        int idResponsable = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.rechazaResponsableDb(idResponsable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postularAProyectoDb method, of class ConectaDbImpl.
     */
    @Test
    public void testPostularAProyectoDb() throws Exception {
        System.out.println("postularAProyectoDb");
        int idProyecto = 0;
        int idAlumno = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.postularAProyectoDb(idProyecto, idAlumno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verPostuladosDb method, of class ConectaDbImpl.
     */
    @Test
    public void testVerPostuladosDb() throws Exception {
        System.out.println("verPostuladosDb");
        int idProyecto = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        LinkedList expResult = null;
        LinkedList result = instance.verPostuladosDb(idProyecto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aceptarAlumnoProyectoDb method, of class ConectaDbImpl.
     */
    @Test
    public void testAceptarAlumnoProyectoDb() throws Exception {
        System.out.println("aceptarAlumnoProyectoDb");
        int idProyecto = 0;
        int idAlumno = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.aceptarAlumnoProyectoDb(idProyecto, idAlumno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autorizarAlumnoProyecto method, of class ConectaDbImpl.
     */
    @Test
    public void testAutorizarAlumnoProyecto() throws Exception {
        System.out.println("autorizarAlumnoProyecto");
        int idAlumno = 0;
        int idProyecto = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.autorizarAlumnoProyecto(idAlumno, idProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarDb method, of class ConectaDbImpl.
     */
    @Test
    public void testRegistrarDb() throws Exception {
        System.out.println("registrarDb");
        Responsable repo = null;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.registrarDb(repo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aceptarResponsableDb method, of class ConectaDbImpl.
     */
    @Test
    public void testAceptarResponsableDb() throws Exception {
        System.out.println("aceptarResponsableDb");
        int idResponsable = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.aceptarResponsableDb(idResponsable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaUsuarioDb method, of class ConectaDbImpl.
     */
    @Test
    public void testValidaUsuarioDb() throws Exception {
        System.out.println("validaUsuarioDb");
        String nombreUsuario = "";
        String passwd = "";
        ConectaDbImpl instance = new ConectaDbImpl();
        ResultSet expResult = null;
        ResultSet result = instance.validaUsuarioDb(nombreUsuario, passwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEstadoAlumno method, of class ConectaDbImpl.
     */
    @Test
    public void testModificarEstadoAlumno() throws Exception {
        System.out.println("modificarEstadoAlumno");
        int idAlumno = 0;
        boolean estadoAlumno = false;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.modificarEstadoAlumno(idAlumno, estadoAlumno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchUserInfo method, of class ConectaDbImpl.
     */
    @Test
    public void testFetchUserInfo() throws Exception {
        System.out.println("fetchUserInfo");
        int userId = 0;
        int userTIpo = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        ResultSet expResult = null;
        ResultSet result = instance.fetchUserInfo(userId, userTIpo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserType method, of class ConectaDbImpl.
     */
    @Test
    public void testGetUserType() throws Exception {
        System.out.println("getUserType");
        int userID = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        int expResult = 0;
        int result = instance.getUserType(userID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pendingResp method, of class ConectaDbImpl.
     */
    @Test
    public void testPendingResp() throws Exception {
        System.out.println("pendingResp");
        ConectaDbImpl instance = new ConectaDbImpl();
        String[][] expResult = null;
        String[][] result = instance.pendingResp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pendingAlum method, of class ConectaDbImpl.
     */
    @Test
    public void testPendingAlum() throws Exception {
        System.out.println("pendingAlum");
        ConectaDbImpl instance = new ConectaDbImpl();
        String[][] expResult = null;
        String[][] result = instance.pendingAlum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchAC method, of class ConectaDbImpl.
     */
    @Test
    public void testFetchAC() throws Exception {
        System.out.println("fetchAC");
        ConectaDbImpl instance = new ConectaDbImpl();
        String[][] expResult = null;
        String[][] result = instance.fetchAC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchCAR method, of class ConectaDbImpl.
     */
    @Test
    public void testFetchCAR() throws Exception {
        System.out.println("fetchCAR");
        ConectaDbImpl instance = new ConectaDbImpl();
        String[][] expResult = null;
        String[][] result = instance.fetchCAR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of translateAC method, of class ConectaDbImpl.
     */
    @Test
    public void testTranslateAC() throws Exception {
        System.out.println("translateAC");
        int[] array = null;
        ConectaDbImpl instance = new ConectaDbImpl();
        String[] expResult = null;
        String[] result = instance.translateAC(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of translateCAR method, of class ConectaDbImpl.
     */
    @Test
    public void testTranslateCAR() throws Exception {
        System.out.println("translateCAR");
        int[] array = null;
        ConectaDbImpl instance = new ConectaDbImpl();
        String[] expResult = null;
        String[] result = instance.translateCAR(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of despostularAlumnoProyectoDb method, of class ConectaDbImpl.
     */
    @Test
    public void testDespostularAlumnoProyectoDb() throws Exception {
        System.out.println("despostularAlumnoProyectoDb");
        int idProyecto = 0;
        int idAlumno = 0;
        ConectaDbImpl instance = new ConectaDbImpl();
        instance.despostularAlumnoProyectoDb(idProyecto, idAlumno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of areaNumProyDb method, of class ConectaDbImpl.
     */
    @Test
    public void testAreaNumProyDb() throws Exception {
        System.out.println("areaNumProyDb");
        ConectaDbImpl instance = new ConectaDbImpl();
        LinkedList<String[]> expResult = new LinkedList<String[]>();
        LinkedList<String[]> result = instance.areaNumProyDb();
        System.out.println(toStringLinkedList(result));
        assertEquals(result, result);
    }

    /**
     * Test of carrerasNumProyDb method, of class ConectaDbImpl.
     */
    @Test
    public void testCarrerasNumProyDb() throws Exception {
        System.out.println("carrerasNumProyDb");
        ConectaDbImpl instance = new ConectaDbImpl();
        LinkedList expResult = null;
        LinkedList result = instance.carrerasNumProyDb();
        assertEquals(result, result);
        System.out.println(toStringLinkedList(result));
    }

    /**
     * Test of carrerasNumAlumnosDb method, of class ConectaDbImpl.
     */
    @Test
    public void testCarrerasNumAlumnosDb() throws Exception {
        System.out.println("carrerasNumAlumnosDb");
        ConectaDbImpl instance = new ConectaDbImpl();
        LinkedList expResult = null;
        LinkedList result = instance.carrerasNumAlumnosDb();
        assertEquals(expResult, result);
        System.out.println(toStringLinkedList(result));
    }


    @Test
    public void testEstadosAlumnosProyDb() throws Exception {
        System.out.println("estadosAlumnosProyD");
        ConectaDbImpl instance = new ConectaDbImpl();
        LinkedList expResult = null;
        LinkedList<String[]> result = instance.estadosAlumnosProyDb();
        
        System.out.println(toStringLinkedList(result));
    }
    
    private String toStringLinkedList(LinkedList<String[]> lista){
        String result = "";
        String[] elem = null;
        for (int i = 0; i< lista.size(); i++){
            elem = lista.get(i);
            for (int j = 0; j<elem.length; j++){
                result += elem[j] + " ";
            }
            result += "\n";
        }
        return  result;
    }   

}

