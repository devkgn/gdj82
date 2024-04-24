package pkg01_array;

public class MainClass {
	public static void main(String[] args) {
		// 배열 X
		int score1 = 90;
		int score2 = 40;
		int score3 = 70;
		int score4 = 20;
		int score5 = 100;
		// 배열 O
		int[] scores = {90,40,70,20,100}; 
		
		// 배열 선언
		int[] intArr;
		String[] names;
		
		// 배열 생성
		intArr = new int[4];
		
		// 배열 선언, 생성 동시
		int[] heights = new int[10];
		
		// 배열의 저장 구조
		int[] arr;
		arr = new int[4];
		System.out.println(arr);
		System.out.println(arr[0]);
		
		// 배열의 길이 -> 상수(읽을 수만 있고, 변경 X)
		int[] numArr = new int[3];
		System.out.println(numArr[1]);
		System.out.println(numArr.length);
		// 문자열의 길이
		String str = new String("안녕하세요");
		System.out.println(str.length());
		
		// 배열의 초기화
		// 1. 인덱스를 이용 : 보통 규칙이 없는 경우
		int[] age1 = new int[3];
		System.out.println("초기화 전 : "+age1[1]);
		age1[0] = 30;
		age1[1] = 20;
		age1[2] = 70;
		System.out.println("초기화 후 : "+age1[1]);
		age1[1] = 50;
		System.out.println("재할당 : "+age1[1]);
		String[] fruits = new String[3];
		// 2. 반복문을 이용 : 보통 규칙이 있는 경우
		int[] age2 = new int[4];
		// 10, 11, 12, 13
		// 0, 1, 2, 3
		for(int i = 0 ; i < age2.length ; i++) {
			age2[i] = i+10;
		}
		System.out.println(age2[3]);
		// 3. 선언과 동시에 초기화
		int[] age3 = new int[] {1,2,3,4};
		int[] age4 = {5,6,7};
		// 주의!!
//		int[] age5;
//		age5 = {9,10,11};
		
		
	}
}
