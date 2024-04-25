package pkg02_utilize;

public class Practice01 {
	public static void main(String[] args) {
		// 총 10명의 학생들의 출석 여부를 표현한 배열 attend
		// 출석한 경우 = 1
		// 결석한 경우 = 0
		// 출석한 학생의 수와 결석한 학생의 수를 계산, 출력
		// 출력 예시)
		// 출석한 학생 수 : 7
		// 결석한 학생 수 : 3
		int[] attend = {1,1,1,1,1,0,1,0,0,1};
		int sum = 0;
		for(int i = 0 ; i < attend.length ; i++) {
			if(attend[i] == 1) {
				sum += attend[i];
			}
		}
		System.out.println(sum);
		System.out.println(attend.length-sum);
		
		
		
//		int yes = 0; 
//		int no = 0;
//		for(int i = 0 ; i < attend.length ; i++) {
//			System.out.println(attend[i]);
//			조건에 따라 yes, no 변수 변화
//			if(attend[i] == 1) {
//				yes ++;
//			} else {
//				no ++;
//			}
//		}
//		System.out.println("출석한 학생 수 : "+yes);
//		System.out.println("결석한 학생 수 : "+no);
	}
}
