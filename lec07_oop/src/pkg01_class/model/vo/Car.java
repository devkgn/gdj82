package pkg01_class.model.vo;

// [접근제한자] [예약어] class 클래스명
// public : 같은 패키지 내, 전체
// (default) : 같은 패키지 내 
public class Car {
	// 필드(속성)
	private String name;
	private int number;
	
	// 생성자(초기화)
	public Car() {}
	
	// 메소드(행동)
	public void go() {
		System.out.println("앞으로 갑니다.");
	}
}
