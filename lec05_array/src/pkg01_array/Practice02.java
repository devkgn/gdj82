package pkg01_array;

public class Practice02 {
	public static void main(String[] args) {
		// -62, 107, -12, 89, -35
		// 위 숫자를 활용하여 정수 배열을 구성하세요.
		// 50을 넘는 숫자만 출력
		// (for each문 활용)
		// 107 89
		////////////////////////////////////
		// 1 : 107
		// 2 : 89
		int[] numbers = {-62, 107, -12, 89, -35};
		int count = 1;
		for(int num : numbers) {
			if(num > 50) {
				// System.out.print(num+" ");
				System.out.println(count+" : "+num);
				count = count + 1;
			}
		}
	}
}
