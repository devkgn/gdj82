package pkg01_lang.practice02;

public class Practice {
	
	public boolean searchStr(String str1, String str2, String str3) {
		// str1 = "2024", str2 = "05", str3="13"
		// result 변수에 str1과 str2 합치기 -> 202405
		String result = str1.concat(str2);
		// result 변수에 result와 str3 합치기 -> 20240513
		result = result.concat(str3);
		// result 변수에 40 문자열 포함 여부 
		// return (result.contains("40") ? true : false);
		return result.contains("40");
//		if(result.contains("40")) {
//			return true;
//		}else {
//			return false;
//		}
	}
	
	// 매개변수 true 전달
	public void printSentence(boolean isTrue) {
		// 매개변수 값 기준 출력문 달라짐
		if(isTrue) {
			System.out.println("40을 찾으셨네요!!");
		} else {
			System.out.println("40이 없나봐요");
		}
	}
}
