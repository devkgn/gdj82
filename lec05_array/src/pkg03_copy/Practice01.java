package pkg03_copy;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		// 철수, 영희의 수행 평가 점수를 담고 있는 배열 score가 있습니다.
		// 오늘 길동이도 수행 평가를 모두 끝마치고 점수를 받았습니다. 
		// 철수와 영희의 점수를 포함하고 있는 배열 score를 복사해서
		// 철수, 영희, 길동이의 점수를 모두 포함하고 있는 배열을 구성, 출력
		// 길동이의 점수가 바뀌더라도 기존 배열 score에 영향X
		// 길동이의 점수는 스캐너로 받기!!
		int[] score = {54,23};
		Scanner sc = new Scanner(System.in);
		System.out.print("길동 : ");
		int gildong = sc.nextInt();
		int[] score2 = new int[score.length+1];
		for(int i = 0 ; i < score.length ; i++) {
			score2[i] = score[i];
		}
		score2[score2.length-1] = gildong;
		for(int num : score2) {
			System.out.println(num);
		}
		sc.close();
	}
}
