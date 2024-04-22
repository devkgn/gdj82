package pkg03_loop;

public class MainClass {
	public static void main(String[] args) {
		// for문
//		for(초기식;조건식;증감식) {
//			반복 회차마다 실행될 구문;
//		}
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		for(int i = 1 ; i <= 2 ; i++) {
			// 1. 초기식 : i = 1;
			// 2. 조건식 : i <= 2 -> true -> 코드 블록 실행
			// 3. 증감식 : i = 2;
			// 4. 조건식 : i <= 2 -> true -> 코드 블록 실행
			// 5. 증감식 : i = 3;
			// 6. 조건식 : i <= 2 -> false -> for문 종료
			System.out.println(i);
		}
		
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");

		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i+" :Hello, World");
		}
		
		// 초기식 변수 
		// 1. 블록 안에서만 사용 가능
		// 2. i만 쓸 수 있는 것 아님!!!
		// 3. 실수 변수를 사용 하지 않음
		for(int a = 1 ; a <= 2 ; a++) {
			System.out.println("a : "+a);
		}
		
		
		
		
		
	}
}
