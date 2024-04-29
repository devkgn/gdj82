package pkg04_constructor.controller;

import pkg04_constructor.model.vo.Cake;
import pkg04_constructor.model.vo.Car;
import pkg04_constructor.model.vo.Person;
import pkg04_constructor.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		// 1. 매개변수 생성자만 있으면 기본 생성자가 자동으로 만들어지지 X
		Car c1 = new Car();
		// 2. 매개변수 생성자 호출
		Car c2 = new Car("Hyundai","Gray",2024);
		
		// 기본 생성자 호출 
		Person p1 = new Person();
		System.out.println("=== p1 ===");
		p1.displayInfo();
		
		// 매개변수 생성자
		Person p2 = new Person("김철수",25);
		System.out.println("=== p2 ===");
		p2.displayInfo();
		
		Cake ca1 = new Cake();
		System.out.println(ca1.flavor);
		System.out.println(ca1.price);
		
		String[] students = {"김철수","이영희"};
		for(int i = 0 ; i < students.length ; i++) {
			Student s = new Student();
			s.printInfo(i);
			s.printInfo(students[i]);
		}
		
	}
}
