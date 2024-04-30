package pkg02_super.obj1;

public class Child extends Parent{
	private int b = 1;	
	
	public Child() {
		super();
		System.out.println("자식 기본 생성자");
	}
	
	public Child(int b) {
		super(5);
		System.out.println("자식 매개변수 생성자 : "+b);
	}
	
	public void childMethod(int b) {
		System.out.println("b : "+ b);
		System.out.println("this.b : "+ this.b);
		System.out.println("super.b : "+ super.b);
	}
	
}
