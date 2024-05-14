package pkg01_lang;

import java.util.StringTokenizer;

public class Practice08 {
	// 철수의 컴퓨터가 고장났습니다. 
	// 철수의 컴퓨터가 보이는 현상은 다음과 같습니다.
	// 문자열을 입력하면 해당 문자열의 각 문자를 반대로 입력
	// 각 문자 사이에 ! 추가
	// hello -> o!l!l!e!h!
	// "o!l!l!e!h!"문자열을 "hello"로 바꾸기
	public static void main(String[] args) {
		// 방식(1)
//		String str = "o!l!l!e!h!";
//		StringTokenizer st = new StringTokenizer(str,"!");
//		StringBuilder sb = new StringBuilder();
//		while(st.hasMoreTokens()) {
//			String s = st.nextToken();
//			sb.append(s);
//		}
//		sb.reverse();
//		System.out.println(sb);
	
		// 방식(2)
//		StringBuilder sb = new StringBuilder("o!l!l!e!h!");
//		sb.reverse();
//		for(int i = 0 ; i < sb.length() ; i++) {
//			if(sb.charAt(i) == '!') {
//				sb.deleteCharAt(i);
//			}
//		}
//		System.out.println(sb);
		
		// 방식(3)
		String str = "o!l!l!e!h!";
		String[] arr = str.split("!");
		String result = "";
		for(int i = (arr.length-1) ; i >= 0 ; i--) {
			result += arr[i];
		}
		System.out.println(result);
	}
	
}
