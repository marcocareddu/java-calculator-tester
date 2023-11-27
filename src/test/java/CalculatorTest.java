import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest{
	
	private Calculator calc;

	@BeforeEach
	public void init() {
        calc = new Calculator();
    }

//	Testing Add Method
    @Test
    public void testAddNumber1Zero() throws Exception {
    	assertThrows(IllegalArgumentException.class, () -> calc.add(0, 10));
    }
    @Test
    public void testAddNumber2Zero() throws Exception {
    	assertThrows(IllegalArgumentException.class, () -> calc.add(10, 0));
    }
    @Test
    public void testAddNumber1Negative() throws Exception {
    	assertThrows(IllegalArgumentException.class, () -> calc.add(-10, 10));
    }
    @Test
    public void testAddNumber2Negative() throws Exception {
    	assertThrows(IllegalArgumentException.class, () -> calc.add(10, -10));
    }

//	Testing Subtract Method
    @Test
    public void testSubtractZero() throws Exception{
    	assertThrows(IllegalArgumentException.class, () -> calc.subtract(10, 0));
    }
    @Test
    public void testSubtractFromZero() throws Exception{
    	assertThrows(IllegalArgumentException.class, () -> calc.subtract(0, 10));
    }
    @Test
    public void testSubtractNumber2GreaterThanNumber1() throws Exception{
    	assertThrows(IllegalArgumentException.class, () -> calc.subtract(5, 10));
    }
    
//	Testing Divide Method
    @Test
    public void testDivideByZero() throws Exception{
        assertThrows(IllegalArgumentException.class, () -> calc.divide(0, 10));
    }
    @Test
    public void testDivideFromZero() throws Exception{
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }

//	Testing Multiply Method
    @Test
    public void testMultiplyNumber1Negative() throws Exception{
        assertThrows(IllegalArgumentException.class, () -> calc.multiply(-5, 10));
    }
    @Test
    public void testMultiplyNumber2Negative() throws Exception{
        assertThrows(IllegalArgumentException.class, () -> calc.multiply(10, -5));
    }
}