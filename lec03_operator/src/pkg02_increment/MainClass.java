package pkg02_increment;

public class MainClass {
	
	public static void main(String[] args) {
		
		int num = 5;
		// 전위 증가 연산자
		System.out.println("== 전위 연산 ==");
		System.out.println("1 : "+num);
		System.out.println("2 : "+ (++num));
		System.out.println("3 : "+num);
		
		int su = 3;
		System.out.println("== 후위 연산 ==");
		System.out.println("1 : "+su);
		System.out.println("2 : "+(su++));
		System.out.println("3 : "+su);
		
		// 두개의 변수 전위, 후위 연산
		int a = 2, b = 0;
		System.out.println("최초 a : "+a);
		System.out.println("최초 b : "+b);
	}

}
