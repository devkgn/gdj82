package pkg03_loop;

public class Practice02 {
	// 1부터 시작하여 1씩 증가하는 숫자들을 출력
	// 합이 100을 초과하는 순간 그 합을 출력하고 
	// 프로그램 종료
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; ; i++) {
			System.out.println(i);
			sum += i; 
			// sum = sum + i;
			if(sum > 100) {
				System.out.println("합 : "+sum);
				break;
			}
		}
	}
}
