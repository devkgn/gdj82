package pkg03_method.study.controller;

import pkg03_method.study.model.vo.Declare;

public class Run {
	public static void main(String[] args) {
		// static 끼리만 호출가능
		// method1();
		// 인스턴스화
		Declare d = new Declare();
		// 1. 리턴X, 매개변수X
		d.method1();
		// new Declare().method1();
		// 2. 리턴X, 매개변수O
		d.method2(4);
		// 3. 리턴O, 매개변수 X
		int num1 = d.method3();
		System.out.println(num1);
		// 4. 리턴O, 매개변수 O
		int num2 = d.method4(2, 5);
		System.out.println(num2);
	}
	
	// 메소드 선언
	// 불필요한 메모리 할당
//	public static void method1() {
//		System.out.println("mehtod1이 실행!!!!!");
//	}
}
