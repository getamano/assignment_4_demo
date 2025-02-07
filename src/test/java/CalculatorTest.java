


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.aman.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5.0, Calculator.add(2.0, 3.0));
        assertEquals(-1.0, Calculator.add(-2.0, 1.0));
        assertEquals(0.0, Calculator.add(0.0, 0.0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, Calculator.subtract(3.0, 2.0));
        assertEquals(-3.0, Calculator.subtract(-2.0, 1.0));
        assertEquals(0.0, Calculator.subtract(0.0, 0.0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, Calculator.multiply(2.0, 3.0));
        assertEquals(-2.0, Calculator.multiply(-2.0, 1.0));
        assertEquals(0.0, Calculator.multiply(0.0, 3.0));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, Calculator.divide(6.0, 3.0));
        assertEquals(-2.0, Calculator.divide(-4.0, 2.0));
        assertEquals(1.0, Calculator.divide(3.0, 3.0));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(1.0, 0.0);
        });
    }
}