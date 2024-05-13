package pkg01_lang;

public class Practice07 {
	public static void main(String[] args) {
		// “안녕하세요,입니다.”라는 값을 가진 StringBuilder 객체를 생성하세요. 
		// 문자열 ,을 찾아서 그 뒤에 여러분의 이름을 삽입하세요.
		// 출력 예시)
		// 안녕하세요, 김가남입니다.
		StringBuilder sb = new StringBuilder("안녕하세요,입니다.");
		int idx = sb.indexOf(",")+1;
		sb.insert(idx, "김가남");
		System.out.println(sb);
		
		
	}
}
