package pkg02_utilize;

public class MainClass {
	public static void main(String[] args) {
		// 총합과 평균
		int[] score = {85,93,100,100,50};
		int sum = 0; 
		for(int i = 0 ; i < score.length ; i++) {
			sum += score[i];
		}
		System.out.println("총합 : "+sum);
		int avg1 = sum / score.length;
		System.out.println("평균1 : "+avg1);
		double avg2 = sum / (double)score.length;
		System.out.println("평균2 : "+avg2);
		
		// 최대값
		int[] arr = {20,3,5,7,16};
		int max = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : "+max);
		
		// 최솟값
		int min = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최솟값 : "+min);
		
	}
}
