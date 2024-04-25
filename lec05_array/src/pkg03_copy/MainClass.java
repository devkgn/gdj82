package pkg03_copy;

public class MainClass {
	public static void main(String[] args) {
		// 얕은 복사
		int[] arr1 = {8,4,1,3};
		int[] arr2 = arr1;
		arr2[3] = 12345;
		for(int num : arr2) {
			System.out.println("arr2 : "+num);
		}
		for(int num : arr1) {
			System.out.println("arr1 : "+num);
		}
		// 깊은 복사
		int[] arr3 = {5,6,7,8};
		int[] arr4 = new int[arr3.length];
		for(int i = 0 ; i < arr3.length ; i++) {
			arr4[i] = arr3[i];
		}
		arr4[3] = 12345;
		for(int num : arr3) {
			System.out.println("arr3 : "+num);
		}
		for(int num : arr4) {
			System.out.println("arr4 : "+num);
		}
		
		
		
		
		
		
	}
}
