package pkg03_throws;

public class MainClass {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		//calc.divide(5, 0);
		try {
			calc.divide(5, 0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
}
