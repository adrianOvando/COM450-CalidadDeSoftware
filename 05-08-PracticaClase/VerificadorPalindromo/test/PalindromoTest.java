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
public class PalindromoTest {

    public PalindromoTest() {
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
    public void testEsPalindromoConPalabraSimple() {
        assertTrue(Palindromo.esPalindromo("reconocer"));
    }

    @Test
    public void testNoEsPalindromo() {
// Se espera que "hola" no sea un palíndromo
        assertFalse(Palindromo.esPalindromo("hola"));
    }

    @Test
    public void testEsPalindromoConFrase() {
// Se espera que la frase sea un palíndromo ignorando espacios y puntuación
        assertTrue(Palindromo.esPalindromo("anita lava la tina"));
    }

    @Test
    public void testEsPalindromoConMayusculasYPuntuacion() {
// Se espera que la frase con mayúsculas y signos de puntuación sea un palíndromo
        assertTrue(Palindromo.esPalindromo("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testEsPalindromoConFraseVacia() {
// La cadena vacía se considera un palíndromo
        assertTrue(Palindromo.esPalindromo(""));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
