package pkg02_field.controller;

import pkg02_field.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		// 인스턴스화
		Car c1 = new Car();
		// 필드에 값 대입
		// 변수명 = 값;
		// c1 인스턴스의 이름을 소방차로 대입
		// c1.name = "소방차";
		// 필드에 값 호출
		// 변수명
		System.out.println(c1.name);
		
		// 필드 예약어 static
		Car c2 = new Car();
		Car c3 = new Car();
		System.out.println("재할당 전 : "+c1.brand);
		c2.brand = "Hyundai";
		System.out.println("c1 : "+c1.brand);
		System.out.println("c2 : "+c2.brand);
		System.out.println("c3 : "+c3.brand);
		
		// System.out.println(c1.year);
		
	}
}
