package practica;

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
public class Fac5yFibo7 {

    private Calculadora1 calc;

    public Fac5yFibo7() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() {
        calc = new Calculadora1(); 
    }

    @After
    public void tearDown() {
        calc = null; 
    }

    @Test
    public void testFactorial() {
        int resultado = calc.factorial(5); // 5! = 120
        assertEquals(120, resultado);
    }

    @Test
    public void testFibonacci() {
        int resultado = calc.fibonacci(7); // Fibonacci(7) = 13
        assertEquals(13, resultado);
    }
}
