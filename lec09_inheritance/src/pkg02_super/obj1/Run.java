package pkg02_super.obj1;

public class Run {
	public static void main(String[] args) {
		// 부모 기본 생성자 
		Parent p1 = new Parent();
		// 부모 매개변수 생성자
		Parent p2 = new Parent(23);
		System.out.println("====================");
		// 자식 생성자(기본, 매개변수)호출
		// 무조건! 부모 기본 생성자
		Child c1 = new Child();
		System.out.println("=== c1,c2 구분 ===");
		Child c2 = new Child(56);
		
		Child c3 = new Child();
		c3.childMethod(400);
	}
}
