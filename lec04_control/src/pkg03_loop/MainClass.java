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
		
		// 초기식 생략
		// 변수를 블록 밖에서도 사용하고 싶은 경우
		// 변수의 사용 범위 확장
		int i = 1;
		for(; i <= 5 ; i++) {
			System.out.println("안 : "+i);
		}
		System.out.println("밖 : "+i);
		
		// 조건식 생략
		// 1. 조건식을 블록 내부에 작성
		// 2. 무한 루프를 발생 시키고자 하는 경우
		for(int j = 1; ;j++) {
			System.out.println(j);
			if(j >= 10) {
				break;
			}
		}
	}
}
