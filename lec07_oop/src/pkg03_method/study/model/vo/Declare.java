package pkg03_method.study.model.vo;

public class Declare {
	public void run() {
		// 동일 클래스 내부 메소드 호출
		// 1. 리턴 X, 매개변수 X
		method1();
		// 2. 리턴X, 매개변수 O
		method2(3);
		// 3. 리턴 O, 매개변수 X
		int num1 = method3();
		// 4. 리턴 O, 매개변수 O
		int num2 = method4(5,7);
		// public
		Access a = new Access();
		a.accessMethod1();
		// protected
		a.accessMethod2();
		// (default)
		a.accessMethod3();
		// private
		// a.accessMethod4();
	}
	
	
	// 메소드의 표현식
	// [접근제한자] [예약어] 반환형 메소드명([매개변수]){}
	
	// 1. 리턴 X, 매개변수 X 
	public void method1() {
		System.out.println("메소드1이 실행됩니다.");
	}
	
	// 2. 리턴 X, 매개변수 O
	public void method2(int x) {
		System.out.println(x+"를 이용하는 함수 메소드2");
	}
	
	// 3. 리턴 O, 매개변수 X
	public int method3() {
		System.out.println("method3이 실행됩니다.");
		return 10;
	}
	
	// 4. 리턴 O, 매개변수 O
	public int method4(int a, int b) {
		System.out.println("method4가 실행!!");
		return a+b;
	}
	
	// 가변인자 매개변수
	public void method5(int...num) {
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println("기본 for문 : "+num[i]);
		}
		for(int n : num) {
			System.out.println("for each문 : "+n);
		}
	}
	
	// 다른 매개변수와 함께 가변인자 매개변수
	// 가변인자는 매개변수의 가장 끝에만!!
	public void method6(String str, int...num) {
		for(int n : num) {
			System.out.println(str+" : "+n);
		}
	}
	
	public static void staticMethod() {
		System.out.println("정적 메소드");
	}
	
	
	
	
	
}
