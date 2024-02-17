package calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
     public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result, "3 + 5 should be 8");
    }
}
