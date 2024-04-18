package pkg01_variable;

public class MainClass {

	public static void main(String[] args) {
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
		
		
	}

}
