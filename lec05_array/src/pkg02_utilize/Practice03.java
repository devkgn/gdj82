package pkg02_utilize;

public class Practice03 {

	public static void main(String[] args) {
		int[] ages = {20,18,22,19,21};
		// 오름차순
		// 1. 20(0)과 18(1) 비교 -> 18,20,22,19,21
		// 2. 18(0)과 22(2) 비교 -> 18,20,22,19,21
		// 3. 18(0)과 19(3) 비교 -> 18,20,22,19,21
		// 4. 18(0)과 21(4) 비교 -> 18,20,22,19,21
		
		// 5. 20(1)과 22(2) 비교 -> 18,20,22,19,21
		// 6. 20(1)과 19(3) 비교 -> 18,19,22,20,21
		// 7. 19(1)과 21(4) 비교 -> 18,19,22,20,21
		
		// 8. 22(2)과 20(3) 비교 -> 18,19,20,22,21
		// 9. 20(2)과 21(4) 비교 -> 18,19,20,22,21
		
		// 10. 22(3)과 21(4) 비교 -> 18,19,20,21,22
		
		// i : 0 ~ 3 => 0 ~ ages.length - 1 보다 작다.
		// j : i+1 ~ 4 => i+1 ~ ages.length 보다 작다.
		for(int i = 0 ; i < ages.length -1 ; i++) {
			for(int j = i+1 ; j < ages.length ;j++) {
				if(ages[i] > ages[j]) {
					int temp = ages[i];
					ages[i] = ages[j];
					ages[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < ages.length ; i++) {
			System.out.println(i+" : "+ages[i]);
		}
		
	}

}
