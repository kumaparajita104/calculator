package calculator;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    private Calculator calculator;
    
    @Before
    public void setUp() {
    	
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        double a = 15;
        double b = 20;
        double expectedResult = 35;
        double result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result,DELTA);;
    }
    
    @Test
    public void testSubtract() {
        double a = 25;
        double b = 20;
        double expectedResult = 5;
        double result = calculator.subtract(a, b);
        Assert.assertEquals(expectedResult, result,DELTA);;
    }
    
    @Test
    public void testMultiply() {
        double a = 10;
        double b = 25;
        double expectedResult = 250;
        double result = calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result,DELTA);;
    }
    
    @Test
    public void testDivide() {
        double a = 56;
        double b = 10;
        double expectedResult = 5.6;
        double result = calculator.divide(a, b);
        Assert.assertEquals(expectedResult, result,DELTA);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        double a = 15;
        double b = 0;
        calculator.divide(a, b);
    }
}

