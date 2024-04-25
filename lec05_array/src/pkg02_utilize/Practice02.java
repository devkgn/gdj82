package pkg02_utilize;

public class Practice02 {
	public static void main(String[] args) {
		int[] ages = {20,18,22,19,21};
		// 최대값
		int maxAge = ages[0];
		int minAge = ages[0];
		for(int i = 0 ; i < ages.length ; i++) {
			if(ages[i] > maxAge) {
				maxAge = ages[i];
			}
			if(ages[i] < minAge) {
				minAge = ages[i];
			}
		}
		System.out.println("가장 나이가 많은 학생 : "+maxAge);
		System.out.println("가장 어린 학생 : "+minAge);
	}
}
