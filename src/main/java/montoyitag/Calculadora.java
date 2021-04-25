package montoyitag;

public class Calculadora {
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int substract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		int result = 0;
		try {
			result = a / b;
		} catch(Exception e) {
			// handle exception
			return -1;
		}
		return result;
	}
	

}
