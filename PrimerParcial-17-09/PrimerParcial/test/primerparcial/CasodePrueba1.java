/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package primerparcial;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adria
 */
public class CasodePrueba1 {

    private PrimerParcial p;

    public CasodePrueba1() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        p = new PrimerParcial(); 
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class PrimerParcial.
     */
    @Test
    public void testTemperatura() {
        float resultado = p.Temperatura(25f);
        assertEquals(77.0f, resultado, 0.01f);
    }

    @Test
    public void testLista() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        int resultado = p.Lista(lista);
        assertEquals(15, resultado);
    }

}
