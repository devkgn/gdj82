package pkg02_type;

public class Practice02 {

	public static void main(String[] args) {
		/*
		 * 자바의 이해를 수강하고 있는 “황보솔”학생의
		 * 풀네임에서 이름만 추출하는 프로그램을 작성해주세요.
		 * 황보솔 학생은 성이 “황보”이고, 이름이 “솔”입니다.
		 */
		String name1 = "황보솔";
		String name2 = new String("황보솔");
		// 이름만 가져오기
		char first = name1.charAt(0);
		char second = name1.charAt(1);
		char third = name1.charAt(2);
		System.out.println("제 이름은 \""+third+"\"이라구요!!");
		System.out.println("성이 "+first+second+"입니다.");
	}

}
