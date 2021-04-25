package montoyitag;


import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora c = new Calculadora();
	
	@Test
	public void TestSum() {
		int a = 4;
		int b = 7;
		int expectedResult = 11;
		Assert.assertEquals(expectedResult, c.sum(a, b));
	}
	
	@Test
	public void TestDiv() {
		int a = 10;
		int b = 2;
		int expectedResult = 5;
		Assert.assertEquals(expectedResult, c.div(a, b));
	}
	
	@Test(expected = NullPointerException.class)
	public void simpleException() {
	    String test = null;
	    test.length();
	}
	
	@Test
	public void TestDivByZero() {
		int a = 10;
		int b = 2;
		int expectedResult = 5;
		Assert.assertEquals(expectedResult, c.div(a, b));
	}
	
	@Test
	public void TestDivByZeroHandleTryCatch() {
		int a = 10;
		int b = 0;
		int expectedResult = -1;
		Assert.assertEquals(expectedResult, c.div(a, b));
	}
	
	@Test(expected = ArithmeticException.class)
	public void TestDivByZero2() {
		int a = 10;
		int b = 0;
		int result = 0;
		result = a / b;
	}

}
