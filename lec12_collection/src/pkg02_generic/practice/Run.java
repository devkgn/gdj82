package pkg02_generic.practice;

public class Run {
	public static void main(String[] args) {
		// 기본 생성자
		Pair<String,Integer> p1 = new Pair<String,Integer>();
		p1.setFirst("Apple");
		p1.setSecond(10);
		// 매개변수 생성자 
		Pair<String,Integer> p2 = new Pair<String,Integer>("Apple",10);
		// Pair 값 출력
		System.out.println("First : "+p2.getFirst());
		System.out.println("Second : "+p2.getSecond());
	}
}
