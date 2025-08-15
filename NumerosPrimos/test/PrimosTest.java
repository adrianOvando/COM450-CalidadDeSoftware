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
public class PrimosTest {

    public PrimosTest() {
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
    public void NumeroPrimo() {
        assertTrue(Primo.Numero(7));
    }

    @Test
    public void NumeroNoPrimo() {
        assertFalse(Primo.Numero(6));
    }

    @Test
    public void NumeroNegativo() {
        assertFalse(Primo.Numero(-3));
    }

    @Test
    public void NumeroGrande() {
        assertTrue(Primo.Numero(997));
    }

    @Test
    public void NumeroCero() {
        assertFalse(Primo.Numero(0));
    }
}
