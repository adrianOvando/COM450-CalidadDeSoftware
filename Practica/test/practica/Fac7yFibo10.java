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
public class Fac7yFibo10 {

    private Calculadora1 calc;

    public Fac7yFibo10() {
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
        int resultado = calc.factorial(7); // 7! = 5040
        assertEquals(5040, resultado);
    }

    @Test
    public void testFibonacci() {
        int resultado = calc.fibonacci(10); // Fibonacci(10) = 55
        assertEquals(55, resultado);
    }
}
