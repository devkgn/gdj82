package pkg01_condition;

public class MainClass {
	public static void main(String[] args) {
		int number = 10;
		if(number > 5) {
			System.out.println("number는 5보다 큽니다.");
		}
		// 지역 변수
		// 블록 스코프
		int su = 5;
		if(su > 3) {
			int num = 2;
			System.out.println("블록 안 : "+num);
			System.out.println("블록 안 : "+su);
		}
		// System.out.println("블록 밖 : "+num);
	}
}
