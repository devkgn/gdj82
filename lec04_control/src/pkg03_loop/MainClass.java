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
	}
}
