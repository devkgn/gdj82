package pkg02_super.obj1;

public class Parent {
	private int a;
	protected int b = 58;
	
	public Parent() {
		System.out.println("부모 기본 생성자");
	}
	
	public Parent(int a) {
		System.out.println("부모 매개변수 생성자 : "+a);
	}
}
