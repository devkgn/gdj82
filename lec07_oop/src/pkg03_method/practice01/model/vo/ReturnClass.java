package pkg03_method.practice01.model.vo;

public class ReturnClass {
	// 1. void (반환형X)
	public void greet() {
		System.out.println("안녕하세요.");
	}
	// 2. 기본 자료형 반환
	public int generateNumber() {
		return 45;
	}
	// 3. 배열 반환
	public int[] createArray() {
		int[] arr = {1,2,3};
		return arr;
	}
	
	// 4. 클래스 반환
	public Car createCar() {
		return new Car();
	}
}
