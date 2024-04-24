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
		
		
		
	}
}
