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
public class CasodePrueba4 {
    
    public CasodePrueba4() {
    }
    
    private PrimerParcial p;
    
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
        float resultado = p.Temperatura(36.6f);
        assertEquals(97.88f, resultado, 0.01f);
    }

    @Test
    public void testLista() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(-5);
        lista.add(7);
        lista.add(-2);

        int resultado = p.Lista(lista);
        assertEquals(10, resultado);
    }
}
