package pkg03_loop;

public class Practice05 {
	public static void main(String[] args) {
//		중첩 for문을 사용하여 구구단을 출력하다가 값이 27이 나오면 
//		"계산 결과가 27입니다."라는 메시지를 출력하고 반복문을 중단하세요.
		 int result = 0;
		 for (int i = 2; i <= 9; i++) {
			if (result > 27) {
				System.out.println("27을 만족하는 값이 나왔습니다!");
				break;
			}
			System.out.println("=== "+i+" 단===");
	        for (int j = 1; j <= 9; j++) {
	          result = i * j;
	          System.out.println(i + " * " + j + " = " + result);
	        }
	      }
	    }
}
