package pkg02_field.model.vo;

public class Car {
	// [접근제한자] [예약어] 자료형 변수명 [= 초기값];
	// 차 이름 -> 전체
	// 인스턴스 변수 -> 클래스 변수
	public static final String name = "avante";
	// 브랜드 -> 전체
	public static String brand;
	// 색깔 -> 다른 패키지X
	protected String color; 
	// 제조년도 -> Car(현재) 클래스 안에서만 O
	private int year;
	// 가격 -> 같은 패키지 까지 O
	int price;
}
