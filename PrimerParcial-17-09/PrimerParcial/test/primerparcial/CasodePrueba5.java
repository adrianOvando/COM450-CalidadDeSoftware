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
public class CasodePrueba5 {
    
    public CasodePrueba5() {
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
        float resultado = p.Temperatura(1000f);
        assertEquals(1832f, resultado, 0.01f);
    }

    @Test
    public void testLista() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(42);

        int resultado = p.Lista(lista);
        assertEquals(42, resultado);
    }
}
