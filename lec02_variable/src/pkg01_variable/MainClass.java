package pkg01_variable;

public class MainClass {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		// PI = 2.14;
		System.out.println(PI*10*2);
		final int MAX_SIZE = 100;
		
		// 변수의 선언
		// 종류 변수명;
		// 정수 : 소수점이 없는 숫자
		// 정수형 변수 number 선언하기
		int number;
		// 변수의 초기화
		// 변수명 = 리터럴;
		number = 7 ;
		// 선언과 초기화 동시
		int age = 100;
		// 1. 변수 표준출력
		System.out.println(age);
		System.out.println("age");
		// 2. age 변수에 새로운값 90 재할당
		age = 90;
		System.out.println(age);
		// 3. 변수로 할당
		int num = age;
		System.out.println(num);
		System.out.println(90);
		// 변수 사용X
		System.out.println(2*3.141592653589793*10);
		System.out.println(3.141592653589793*10*10);
		System.out.println(3.14653589792*10*10*20);
		System.out.println(3.141592653589793*30);
		// 변수 사용O
		// 1. 가독성이 좋아짐
		// 2. 재사용성이 증가
		// 3. 코드량 감소
		// 4. 유지보수 용이
		// 실수 : 소수점이 있는 숫자
		double pi = 3.141592653589793;
		int r = 10;
		System.out.println(2*pi*r);
		System.out.println(pi*r*r);
		System.out.println(pi*r*r*20);
		System.out.println(pi*30);
		// 예약어
		int n_int;
		// 의미없는 변수명
		int a = 18;
		int b = a+7;
		System.out.println(a);
		System.out.println(b);
		// 의미있는 변수명
		/*
		 * 작성자 : 김가남 
		 * 작성일 : 2024-04-18 
		 * 목적 : 다음주 같은 요일 계산
		 */
		int today = 18;
		int oneWeekAfterDay = today + 7;
		
		
		
		
		
		
		
	}

}
