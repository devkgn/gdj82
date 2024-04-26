package pkg03_method.practice01.controller;

import pkg03_method.practice01.model.vo.Car;
import pkg03_method.practice01.model.vo.ParamClass;
import pkg03_method.practice01.model.vo.ReturnClass;

public class Run {
	public static void main(String[] args) {
		ReturnClass rc = new ReturnClass();
		// rc.greet();
		rc.generateNumber();	// 45;
		int num1 = rc.generateNumber();
		System.out.println(num1);
		rc.createArray();	// [I@7c30a502;
		System.out.println(rc.createArray());
		int[] arr = rc.createArray();
		for(int num : arr) {
			System.out.println(num);
		}
		rc.createCar();
		// 반환형 -> 메소드 호출구문
		
		ParamClass pc = new ParamClass();
		pc.greet();
		pc.add(200, 34);
		pc.printArray(new int[] {1,2});
		pc.printCar(new Car());
		pc.mixParam(3, "Hello");
		
		Car c = new Car();
		c.run();
	}

}
