package pkg04_constructor.model.vo;

public class Car {
	private String brand;
	private String color;
	private int year;
	
	// 기본 생성자
	public Car(){}
	
	// 매개변수 생성자
	public Car(String brand, String color, int year) {
		// 필드의 초기값 설정
		this.brand = brand;
		this.color = color;
		this.year = year;
	}
}
