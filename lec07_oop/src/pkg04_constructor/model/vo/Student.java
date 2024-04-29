package pkg04_constructor.model.vo;

public class Student {
	// 학생 번호 조회
	public void printInfo(int idx) {
		System.out.println("당신의 번호는 "+idx+"입니다.");
	}
	
	// 학생 이름 조회
	public void printInfo(String name) {
		System.out.println("당신의 이름은 "+name+"입니다.");
	}
	// 매개변수 개수, 타입, 순서
	public void printInfo(int idx, String name) {
		
	}
	// 매개변수 이름
//	public void printInfo(int age) {
//		
//	}

}
