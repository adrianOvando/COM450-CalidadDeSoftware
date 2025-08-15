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
public class Fac3yFibo3 {

    private Calculadora1 calc;

    public Fac3yFibo3() {
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
        int resultado = calc.factorial(3); // 3! = 6
        assertEquals(6, resultado);
    }

    @Test
    public void testFibonacci() {
        int resultado = calc.fibonacci(3); // Fibonacci(3) = 2
        assertEquals(2, resultado);
    }
}
