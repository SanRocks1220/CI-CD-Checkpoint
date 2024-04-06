package ps.checkpoint;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.00001);
    }

    @Test
    public void testSubtract() {
        assertEquals(-1.0, calculator.subtract(2.0, 3.0), 0.00001);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.00001);
    }

    @Test
    public void testDivide() {
        assertEquals(0.66667, calculator.divide(2.0, 3.0), 0.00001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(2.0f, 0.0f);
    }

    @Test
    public void testMod() {
        assertEquals(2.0, calculator.mod(5.0f, 3.0f), 0.00001);
    }
}