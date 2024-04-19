package pkg01_arithmetic;

public class MainClass {
	public static void main(String[] args) {
		// 산술 연산자
		int su1 = 10;
		int su2 = 3;
		// 더하기
		int multiple = su1 + su2;
		System.out.println("+ : "+multiple);
		// 빼기
		int diff = su1 - su2;
		System.out.println("- : "+diff);
		// 곱하기
		int product = su1 * su2;
		System.out.println("* : "+product);
		// 나누기 몫
		int quotient = su1 / su2;
		System.out.println("/ : "+quotient);
		// 나누기 나머지
		int remain = su1 % su2;
		System.out.println("% : "+remain);
	}
}
