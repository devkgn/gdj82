package pkg03_loop;

public class MainClass {
	public static void main(String[] args) {
		// for문
//		for(초기식;조건식;증감식) {
//			반복 회차마다 실행될 구문;
//		}
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		for(int i = 1 ; i <= 2 ; i++) {
			// 1. 초기식 : i = 1;
			// 2. 조건식 : i <= 2 -> true -> 코드 블록 실행
			// 3. 증감식 : i = 2;
			// 4. 조건식 : i <= 2 -> true -> 코드 블록 실행
			// 5. 증감식 : i = 3;
			// 6. 조건식 : i <= 2 -> false -> for문 종료
			System.out.println(i);
		}
		
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");
		System.out.println("Hello, World");

		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i+" :Hello, World");
		}
		
		// 초기식 변수 
		// 1. 블록 안에서만 사용 가능
		// 2. i만 쓸 수 있는 것 아님!!!
		// 3. 실수 변수를 사용 하지 않음
		for(int a = 1 ; a <= 2 ; a++) {
			System.out.println("a : "+a);
		}
		
		// 초기식 생략
		// 변수를 블록 밖에서도 사용하고 싶은 경우
		// 변수의 사용 범위 확장
//		int i = 1;
//		for(; i <= 5 ; i++) {
//			System.out.println("안 : "+i);
//		}
//		System.out.println("밖 : "+i);
		
		// 조건식 생략
		// 1. 조건식을 블록 내부에 작성
		// 2. 무한 루프를 발생 시키고자 하는 경우
		for(int j = 1; ;j++) {
			System.out.println(j);
			if(j >= 10) {
				break;
			}
		}
		
		// 증감식 생략
		// 1. 증감식이 복잡한 경우
//		for(int i = 1 ; i <= 10 ; ) {
//			System.out.println(i);
//			i = (++i) % 2;
//		}
		
		// 2. 다른 변수의 연산에 의해 증감이 결정될 경우
		int target = 10;
		int count = 0;
		// target 변수가 0보다 작은 경우까지 반복
		// target 변수가 0보다 작아질때까지 count 더하기
		for(;target > 0 ;) {
			count++;
			target -= count;
			
		}
		System.out.println("최종 count값 : "+count);
		
		// 중첩 반복문
		for(int i = 0 ; i < 2 ; i++) {
			System.out.println("외부 i : "+i);
			for(int j = 0 ; j < 3 ; j++) {
				System.out.println("내부 i :"+i);
				System.out.println("내부 j :"+j);
			}
			System.out.println("종료 i :"+i);
		}
		
		for(int i = 1 ; i <= 2 ; i++) {
			System.out.println("A");
			for(int j = 1 ; j <= 3 ;j++) {
				System.out.println("B");
			}
			System.out.println("C");
		}
		
		
		for(int i = 1 ; i <= 2 ; i++) {
			System.out.println(1);
			for(int j = 1 ; j <= 3 ; j++) {
				System.out.println(2);
				// 내부 for문에 break 사용
				break;
			}
			System.out.println(3);
			// 외부 for문에 break 사용
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
				
//				while(true) {
//					if(조건식) {
//						break;
//					}
//				}
				
				
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
				
				// while문 
				int count1 = 10;
				while(0 < count1) {
					System.out.println("count1");
					count1 --;
				}
				// while문 비교
				int count2 = 10;
				while(0 < count2 && count2 < 10) {
					System.out.println("count2");
					count2 --;
				}
				// do ~ while문
				int count3 = 10;
				do {
					System.out.println("count3");
					count3 --;
				}while(0 < count3 && count3 < 10);
		
		// break
		// i++ 
		// i = i + 1;
		// i += 1;
		for(int i = 1; i <= 10 ; i++) {
			if(i % 2 == 0) {
				break;
			}
			System.out.println(i);
		}
		for(int i = 1; i <= 10 ; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
