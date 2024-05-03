package pkg01_trycatch;

public class MainClass {

	public static void main(String[] args) {
		int a = 3;
		int b = 0;	

		// 1. try블록에서 예외 발생 X
		// -> catch블록 거치지 X 빠져나감
		try {
			System.out.println(a+b);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("=== 예외발생X 끝 ===");
		
		
		// 2. try문에서 오류 발생O
		try {
			System.out.println("=== a/b 전 ===");
			System.out.println(a/b);
			System.out.println("=== a/b 후 ===");
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("=== 예외 발생 O 끝 ===");
		
		// 3. finally
		try {
			// System.out.println(a/b);
			System.out.println("오류 X : "+(a+b));
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("어떤 상황이든 실행");
		}
		
		
	}
}
