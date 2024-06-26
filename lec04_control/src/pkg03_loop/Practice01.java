package pkg03_loop;

public class Practice01 {
	public static void main(String[] args) {
		// 1. 정수형 변수 i가 1일때부터 시작 -> 초기식 i = 1
		// 2. i가 9보다 작거나 같을 때까지 반복 -> 조건식 i <= 9
		// 3. i는 1씩 커지면서 반복 -> 증감식 i++
		// 4. 반복 횟수마다 i와 7을 곱한 값을 출력
		/*
		 * === 7단 ===
		 * 7 * 1 = 7
		 * 7 * 2 = 14
		 * 7 * 3 = 21
		 * 7 * 4 = 28
		 * 7 * 5 = 35
		 * 7 * 6 = 42 
		 * 7 * 7 = 49 
		 * 7 * 8 = 56
		 * 7 * 9 = 63
		 */
		System.out.println("=== 7단 ===");
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println("7 * "+i+" = "+(7 * i));
		}
	}
}
