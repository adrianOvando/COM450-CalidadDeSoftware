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
public class CasodePrueba2 {
    
    private PrimerParcial p;
    
    public CasodePrueba2() {
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

        @Test
    public void testTemperatura() {
        float resultado = p.Temperatura(-10f);
        assertEquals(14.0f, resultado, 0.01f);
    }

    @Test
    public void testLista() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(-1);
        lista.add(-2);
        lista.add(-3);

        int resultado = p.Lista(lista);
        assertEquals(-6, resultado);
    }
}
