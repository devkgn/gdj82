package pkg01_condition;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 성적을 입력 받아서, 
		 * 성적을 기준으로 학점을 출력하는 프로그램 
		 * - 90점보다 높은 경우 A
		   - 80 ~ 90점 사이는 B
		   - 70 ~ 80점 사이는 C
		   - 60 ~ 70점 사이는 D
		   - 나머지는 F
		   출력 예시) 
		   성적 : 85
		   당신의 학점은 B입니다.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		char grade;
		if(90 < score) {
			//System.out.println("당신의 학점은 A입니다.");
			grade = 'A';
		} else if(80 < score) {
			// 80 < score <= 90
			//System.out.println("당신의 학점은 B입니다.");
			grade = 'B';
		} else if(70 < score) {
			// 70 < score <= 80
			//System.out.println("당신의 학점은 C입니다.");
			grade = 'C';
		} else if(60 < score) {
			// 60 < score <= 70
			//System.out.println("당신의 학점은 D입니다.");
			grade = 'D';
		} else {
			// score <= 60
			//System.out.println("당신의 학점은 F입니다.");
			grade = 'F';
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}
}
