package pkg03_loop;

public class Practice06 {
	public static void main(String[] args) {
//		반복 횟수: 1
//		반복 횟수: 2
//		반복 횟수: 3
//		반복 횟수: 4
//		반복 횟수: 5
//		반복 종료!
//		int count = 1;
//		while(count <= 5) {
//			System.out.println("반복 횟수 : "+count);
//			count++;
//		}
//		System.out.println("반복 종료!");
		
		int count = 1;
		while(true) {
			System.out.println("반복 횟수 : "+count);
			count++;
			if(count > 5) {
				System.out.println("반복 종료!");
				break;
			}
		}
		
	}
}
