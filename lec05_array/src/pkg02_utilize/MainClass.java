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
	}
}
