package pkg03_throws;

public class Calculator {
	public void divide(int a, int b) throws ArithmeticException{
		System.out.println(a/b);
//		try {
//			System.out.println(a/b);
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
	}
}
