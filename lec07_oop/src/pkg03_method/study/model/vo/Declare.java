package pkg03_method.study.model.vo;

public class Declare {
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
}
