package pkg03_method.practice01.model.vo;

public class ParamClass {
	// 매개변수가 없는 메소드
	public void greet() {
		System.out.println("Hello");
	}
	// 기본자료형 매개변수
	public void add(int num1, int num2) {
		System.out.println("합 : "+(num1+num2));
	}
	// 배열 매개변수
	public void printArray(int[] arr) {
		for(int num : arr) {
			System.out.println("배열 : "+num);
		}
	}
	// 클래스 매개변수
	public void printCar(Car c) {
		System.out.println(c);
	}
	
	// 짬뽕 매개변수
	public void mixParam(int a, String b) {
		System.out.println(a+" : "+b);
	}
	
	
}
