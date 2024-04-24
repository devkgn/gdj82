package pkg01_condition;

public class MainClass {
	public static void main(String[] args) {
		int number = 10;
		if(number > 5) {
			System.out.println("number는 5보다 큽니다.");
		}
		// 지역 변수
		// 블록 스코프
		int su = 5;
		if(su > 3) {
			int num = 2;
			System.out.println("블록 안 : "+num);
			System.out.println("블록 안 : "+su);
		}
		// System.out.println("블록 밖 : "+num);
		
		int num = -3;
		System.out.println(num);
		if(num > 0) {
			System.out.println("양수입니다.");
		} else { // 음수이거나 0인 경우
			System.out.println("음수입니다.");
		}
		
		int i_num = 500;
		if(i_num >= 400) {
			// 400보다 크거나 같은 수
			System.out.println("1. 400 ~");
		} else if(i_num >= 300) {
			// 400보다 작은 수 중에서
			// if 조건식 결과가 false인 경우 중에서
			// 300보다 크거나 같은 수
			System.out.println("2. 300 ~ 399");
		} else if(i_num >= 200) {
			// 400보다 작은 수 중에서
			// 300보다 작은 수 중에서
			// 200보다 크거나 같은 수
			System.out.println("3. 200 ~ 299");
		} else {
			System.out.println("4. ~ 199");
		}
		
		// 중첩 if문
		int target = -5;
		if(target > 0) {
			System.out.println("양수입니다.");
			if(target % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
				if(target % 3 == 0) {
					System.out.println("3의 배수");
				}
			}	
		} else if(target < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		// 1 ~ 7 사이의 숫자
		// 해당 요일 출력
		int day = 10;
		switch(day) {
			// 같은 기능을 수행하는 조건 여러개
			case 1 : case 2 : 
				System.out.println("화요일");
			break;
//			case 1 :
//				System.out.println("월요일");
//			break;
//			case 2 :
//				System.out.println("화요일");
//			break;
			case 3 :
				System.out.println("수요일");
			break;
			case 4 :
				System.out.println("목요일");
			break;
			case 5 : 
				System.out.println("금요일");
			break;
			case 6 :
				System.out.println("토요일");
			break;
			case 7 :
				System.out.println("일요일");
			break;
			default :
				System.out.println("잘못된 입력입니다.");
			break;
		}
		
		// while문
		int intNum = 1; // 초기값 
		while(intNum <= 10) {
			System.out.println(intNum);
			intNum++; // 증감식
		}
		// for문
		for(int intNum2 = 1 ; intNum2 <= 10 ; intNum2++) {
			System.out.println(intNum2);
		}
		
//		while(true) {
//			if(조건식) {
//				break;
//			}
//		}
		
		
		for(int i = 1 ; i <=5 ; i++) {
			System.out.println("for문 : "+i);
		}
		
		int cnt = 1;
		while(cnt <= 5) {
			System.out.println("while문 : "+cnt);
			cnt++;
		}
		
		int test = 1;
		while(true) {
			System.out.println(test);
			test ++;
			if(test > 5) {
				break;
			}
		}
		
		
		
		
	}
}
