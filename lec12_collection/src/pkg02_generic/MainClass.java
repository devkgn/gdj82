package pkg02_generic;

public class MainClass {
	public static void main(String[] args) {
		// 1. 제네릭 클래스 인스턴스화
		Container<Integer> c1 
			= new Container<Integer>();
		Container<String> c2 
			= new Container<String>();
		// 2. 제네릭 메소드
		c1.setItem(50);
		System.out.println(c1.getItem());
		c2.setItem("안녕하세요.");
		System.out.println(c2.getItem());
	}
}
