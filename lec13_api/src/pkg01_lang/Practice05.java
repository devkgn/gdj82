package pkg01_lang;

public class Practice05 {
	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog";
		sentence = "caramel coated brown chocolate";
		// 1. 만일 brown 문자열이 있을 경우
		String toFind = "brown";
		int idx = sentence.indexOf(toFind);
		if(idx != -1) {
			// 2. brown 위치 출력
			System.out.println("위치 : "+idx);
			// 3. brown 문자열 잘라와서 출력
			int nextWordStartIdx = sentence.indexOf(" ",idx+toFind.length());
			System.out.println("문자열 : "+(sentence.substring(idx,nextWordStartIdx)));	
		}
		
		
		// 출력 예시)
		// 위치 : 10
		// 문자열 : brown
	}
}
