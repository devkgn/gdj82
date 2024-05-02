package pkg03_override.practice;

public class Run {
	public static void main(String[] args) {
		// Pizza 인스턴스화
		// printInfo 메소드 호출 -> "Buono!" 출력
		Pizza p = new Pizza();
		p.printInfo();
		
		String str = new String("나비");
		
		if(str.equals("나비")) {
			System.out.println("나비 입니다.");
		}
	}
}
