package pkg01_condition;

public class Practice02 {
	public static void main(String[] args) {
		/*
		 * 원하는 변수명으로 정수형 변수를 선언하세요.
		 * 그리고, 원하는 값으로 초기화합니다.
		 * 만일 해당 숫자가 짝수일 경우 "짝수입니다."를 출력하고,
		 * 그외의 경우 "홀수입니다."를 출력하는 프로그램을 만드세요.
		 */
		int check = 23;
		int remain = check % 2;
		// 짝수
		boolean isMatch = remain == 0;
		if(check % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
