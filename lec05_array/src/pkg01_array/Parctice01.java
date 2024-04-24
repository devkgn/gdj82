package pkg01_array;

public class Parctice01 {
	public static void main(String[] args) {
		// 철수의 친구 5명 이름을 담고 있는 배열 friends
		// 선언, 생성한 다음 친구들의 이름 초기화
		// 박지영, 김태우, 이지훈, 최유진, 정승호
		// 크기 5짜리 문자열형 배열 구성
		String[] friends1;
		friends1 = new String[5];
		friends1[0] = "박지영";
		friends1[1] = "김태우";
		friends1[2] = "이지훈";
		friends1[3] = "최유진";
		friends1[4] = "정승호";
		
		String[] friends2 
		= new String[] {"박지영","김태우","이지훈","최유진","정승호"};
		
		String[] friends3 = {"박지영","김태우","이지훈","최유진","정승호"};
		
		System.out.println(friends1[3]);
		
//		1 : 박지영
//		2 : 김태우
//		3 : 이지훈
//		4 : 최유진
//		5 : 정승호
		for(int i = 0 ; i < friends1.length ;i++) {
			System.out.println((i+1)+" : "+friends1[i]);
		}
		
//		5 : 박지영
//		4 : 김태우
//		3 : 이지훈
//		2 : 최유진
//		1 : 정승호
		
		// 0 1 2 3 4
		// 5 4 3 2 1
		int base = 5;
		for(int i = 0 ; i < friends1.length ; i++) {
			System.out.println((-(i-5))+" : "+friends1[i]);
			System.out.println(base-i);
		}
		
	}
}
