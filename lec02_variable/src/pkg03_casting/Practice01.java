package pkg03_casting;

public class Practice01 {

	public static void main(String[] args) {
		/*
		 * 아래의 변수들을 선언, 초기값을 할당하고 
		 * 출력하는 프로그램을 작성하세요. 
		 * 1. 변수 num1에는 정수형 데이터 10을 저장합니다. 
		 * 2. 변수 num2에는 실수형 데이터 5.7을 저장합니다. 
		 * 3. num1과num2를 더한 결과를 출력합니다.
		 * 
		 * 출력 예시)
		 * 정수 : 15
		 * 실수 : 15.7
		 */
		int num1 = 10;
		double num2 = 5.7;
		// 변수 선언 
		int num3 = num1 + (int)num2;
		double num4 = num1 + num2;
		System.out.println("정수 : "+num3);
		System.out.println("실수 : "+num4);
		// 바로 표준출력 
		System.out.println("정수 : "+(num1+(int)num2));
		System.out.println("실수 : "+(num1+num2));

	}

}
