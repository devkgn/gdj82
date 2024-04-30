package pkg02_super.obj1;

public class Child extends Parent{
	private int b;
	
	public Child() {
		System.out.println("자식 기본 생성자");
	}
	
	public Child(int b) {
		System.out.println("자식 매개변수 생성자 : "+b);
	}
}
