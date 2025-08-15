/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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
public class CalculoAreaTest {

    public CalculoAreaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void RadioPositivo() {
        assertEquals(Math.PI * 5 * 5, Circulo.Area(5), 0.0001);
    }

    @Test
    public void RadioCero() {
        assertEquals(0, Circulo.Area(0), 0.0001);
    }

    @Test
    public void RadioNegativo() {
        assertEquals(Math.PI * (-3) * (-3), Circulo.Area(-3), 0.0001);
    }

    @Test
    public void RadioGrande() {
        assertEquals(Math.PI * 1000 * 1000, Circulo.Area(1000), 0.0001);
    }

    @Test
    public void RadioDecimal() {
        assertEquals(Math.PI * 3.5 * 3.5, Circulo.Area(3.5), 0.0001);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
