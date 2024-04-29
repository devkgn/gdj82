package pkg04_constructor.model.vo;

public class Person {
	private String name;
	private int age;
	
	public Person(){
		// 이름, 나이 기본값 설정
//		name = "미정";
//		age = 20;
		this("미정",20);
	}
	
	public Person(String name, int age) {
		// 1. 매개변수 name을 필드 name에 초기화
		// 2. 필드 name = 매개변수 name;
		// 3. this.name : Person의 name 필드
		this.name = name;
		this.age = age;
	}
	
	// 객체의 정보를 출력하는 메소드
	public void displayInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
	
	
	
	
}
