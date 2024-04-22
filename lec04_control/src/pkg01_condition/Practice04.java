package pkg01_condition;

public class Practice04 {
	public static void main(String[] args) {
		/*
		 * 철수네 학교는 두발 검사가 있는 학교입니다. 
		 * 여학생은 귀밑 7cm, 남학생은 귀밑 3cm 원칙!
		 * 학생의 성별과 머리 길이를 나타내는 변수 선언, 초기화
		 * 통과, 불통과 여부를 출력
		 * 출력 예시)
		 * 성별(F/M) : F
		 * 머리(cm) : 3
		 * 합격입니다.
		 * */
		String gender = "F";
		int hair = 3;
		boolean isPass = false;
		if("F".equals(gender)) {
			// 여성
			if(hair <= 7) {
//				System.out.println("합격입니다.");
				isPass = true;
			} 
//			else {
//				System.out.println("불합격입니다.");
// 				isPass = false;
//			}
		} else if("M".equals(gender)) {
			// 남성
			if(hair <= 3) {
//				System.out.println("합격입니다.");
				isPass = true;
			} 
//			else {
//				System.out.println("불합격입니다.");
// 				isPass = false;
//			}
		} else {
			// 알 수 없음
			System.out.println("알 수 없는 성별입니다.");
// 			isPass = false;
		}
	
		if(isPass == true) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
