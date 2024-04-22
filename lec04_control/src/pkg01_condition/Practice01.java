package pkg01_condition;

public class Practice01 {
	public static void main(String[] args) {
		/*
		 * 아래와 같이 변수 checkNum을 선언하세요.
		 * int checkNum;
		 * 그리고, 원하는 값으로 초기화합니다.
		 * 만일, checkNum에 할당된 숫자가 양수일 경우
		 * "양수입니다."를 출력하는 프로그램을 만드세요.
		 * 출력 예시)
		 * 숫자 : 2468
		 * 양수입니다.
		 */
		int checkNum;
		checkNum = -2468;
		System.out.println("숫자 : "+checkNum);
		if(checkNum > 0) {
			System.out.println("양수입니다.");
		}
	}
}
