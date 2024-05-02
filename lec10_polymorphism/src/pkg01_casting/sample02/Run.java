package pkg01_casting.sample02;

import pkg01_casting.sample01.Animal;
import pkg01_casting.sample01.Cat;
import pkg01_casting.sample01.Dog;

public class Run {

	public static void main(String[] args) {
		System.out.println("=== 업캐스팅 === ");
		Animal animal = new Dog();
		// 자식의 메소드 우선
		animal.sound();
		// Animal 클래스는 wagTail 메소드 없음
		// animal.wagTail();
		
		// 객체 배열 선언, 생성
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Dog();	//업캐스팅
		animals[2] = new Cat(); //업캐스팅
		
		// 배열을 순회하면 각 객체의 sound 메소드 출력
		for(int i = 0 ; i < animals.length ; i++) {
			System.out.print("동물 "+i+" : ");
			animals[i].sound();
		}
		
	}

}
