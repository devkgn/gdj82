package pkg01_lang;

import java.util.StringTokenizer;


public class MainClass {
	public static void main(String[] args) {
		int[] src = {10,15,20,25,30};
		int[] dst = new int[src.length];
//		for(int i = 0 ; i < src.length ; i++) {
//			dst[i] = src[i];
//		}

		// src[1] 부터 4개의 요소 dst[0] 복사
//		dst[0] = src[1];
//		dst[1] = src[2];
		
		// src의 인덱스 1번을 dst 인덱스 0번에 4개 복사
		System.arraycopy(src, 1, dst, 0, 4);
		for(int i : dst) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		
		System.out.println("=== identityHashCode() ===");
		String h1 = "수박";
		String h2 = "수박";
		String h3 = new String("수박");
		
		System.out.println("** hashCode() **");
		System.out.println("h1 : "+h1.hashCode());
		System.out.println("h2 : "+h2.hashCode());
		System.out.println("h3 : "+h3.hashCode());
		
		System.out.println("** identityHashCode() **");
		System.out.println("h1 : "+System.identityHashCode(h1));
		System.out.println("h2 : "+System.identityHashCode(h2));
		System.out.println("h3 : "+System.identityHashCode(h3));
		
		System.out.println("=== 불변 객체 ===");
		String str = "Hello";
		System.out.println("초기 주소값 : "+System.identityHashCode(str));
		str += ",World";
		System.out.println("변경후주소값 : "+System.identityHashCode(str));
		
		System.out.println("=== 문자열 리터럴 ===");
		// 1. 값이 똑같다면 똑같은 해시코드 가짐
		// 2. 값이 변경되면 새로운 리터럴 생성
		System.out.println("참외 되기 전 : "+(h1 == h2));
		h2 += ", 참외";
		System.out.println("h1 : "+System.identityHashCode(h1));
		System.out.println("h2 : "+System.identityHashCode(h2));
		// 3. 값만 동일하면 주소값 동일 -> == 사용
		System.out.println("참외 된 후 : "+(h1 == h2));
		
		System.out.println("=== 문자열 객체 ===");
		// String h3 = new String("수박");
		String h4 = new String("수박");
		System.out.println("h3 : "+System.identityHashCode(h3));
		System.out.println("h4 : "+System.identityHashCode(h4));
		System.out.println("비교(1) : "+(h3 == h4));
		System.out.println("비교(2) : "+(h3.equals(h4)));
		
		System.out.println("=== 1. concat ===");
		String test = "GDJ82";
		test = test.concat("할 수 있다!");
		System.out.println(test);
		
		System.out.println("=== 2. indexOf ===");
		// int num = test.indexOf("GD");
		System.out.println(test.indexOf("GD"));
		if(test.indexOf("0") != -1) {
			System.out.println("0 문자열 포함");
		} else {
			System.out.println("0 문자열 포함X");
		}
		test = "안녕. 나는 김가남이야. 호호";
		System.out.println(test.indexOf(".",3));
		System.out.println(test.indexOf(".",(test.indexOf(".")+1)));
		
		System.out.println("=== lastIndexOf ===");
		System.out.println(test.lastIndexOf("."));
		System.out.println(test.lastIndexOf(".",3));
		
		str ="봄-여름-가을-겨울";
		String[] seasons = str.split("-");
		for(String s : seasons) {
			System.out.println(s);
		}
		
		System.out.println("=== replace ===");
		String sentence = "나는 코딩을 못해";
		sentence = sentence.replace("못해", "잘해");
		System.out.println(sentence);
		
		System.out.println("=== isBlank() ===");
		String empty1 = "";
		String empty2 = " ";
		System.out.println(empty1.isBlank());
		System.out.println(empty2.isBlank());
		System.out.println("=== isEmpty() ===");
		System.out.println(empty1.isEmpty());
		System.out.println(empty2.isEmpty());
		if(empty2.isBlank()) {
			if(empty2.isEmpty()) {
				// 두개 같이 쓰기
			}
		}
		System.out.println("=== .length() == 0 ===");
		System.out.println(empty1.length() == 0);
		System.out.println(empty2.length());
		
		System.out.println("=== trim() ===");
		String str3 = "                안녕하세요";
		str3 = str3.trim();
		System.out.println(str3);
		str3 = " 안 녕 하 세 요 ";
		str3 = str3.trim();
		System.out.println(str3);
		str3 = str3.replace(" ", "");
		System.out.println(str3);
		
		System.out.println("=== join ===");
		// String.join("기준값",배열)
		String[] strArr = {"봄","여름","가을","겨울"};
		String changedStr = String.join("-", strArr);
		System.out.println(changedStr);
		
		System.out.println("=== substring() ===");
		String cutTest = "hello world";
		System.out.println(cutTest.substring(6));
		System.out.println(cutTest.substring(0,5));
		// substring 종료인덱스는 적어도 시작 인덱스보다 큰값
		System.out.println(cutTest.substring(3,4));
		
		System.out.println("=== 문자열 자르기 활용===");
		String file = "test.jpg";
		// file.substring(4);
		// file.substring(4+1);
		// file.substring(file.lasIndexOf(".")+1)
		String extension = file.substring(file.lastIndexOf(".")+1);
		System.out.println("확장자 :"+extension);
		String name = file.substring(0,file.lastIndexOf("."));
		System.out.println("파일명 :"+name);
		
		System.out.println("=== 문자열 대문자, 소문자 바꾸기 ===");
		String big = "hello world";
		System.out.println(big.toUpperCase());
		String small = "HELLO WORLD";
		System.out.println(small.toLowerCase());
		
		if(str.equals("n")|| str.equals("N")) {
			// 멈춤
		}
		
		if(str.toUpperCase().equals("N")) {
			// 멈춤
		}
		if(str.toLowerCase().equals("n")){
			// 멈춤
		}
			
		int intValue = 10;
		System.out.println(intValue+20);
		String intStr = String.valueOf(intValue);
		System.out.println(intStr+20);
		
		double doubleValue = 3.14;
		String doubleStr = String.valueOf(doubleValue);
		
		// StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(",World");
		System.out.println("StringBuilder : "+sb);
		System.out.println("=== insert ===");
		sb.insert(6, " Java ");
		System.out.println(sb);
		
		System.out.println("=== delete ===");
		sb.delete(11, 17);
		System.out.println(sb);
		System.out.println("=== deleteCharAt ===");
		int idx = sb.indexOf(",");
		sb.deleteCharAt(idx);
		System.out.println(sb);
		
		System.out.println("=== reverse ===");
		sb.reverse();
		System.out.println(sb);
		
		test = "AA||BB||CC";
		String[] testArr = test.split("\\|\\|");
		for(String testOne : testArr) {
			System.out.println("split : "+testOne);
		}
		
		StringTokenizer st = new StringTokenizer(test,"\\|\\|");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("st : "+token);
		}
		
		StringTokenizer st1 = new StringTokenizer("AeeBeeC","ee");
		while(st1.hasMoreTokens()) {
			String value = st1.nextToken();
			System.out.println("value : "+value);
		}
		
		System.out.println("=== abs ===");
		int number = -37;
		// number = Math.abs(number);
		number = number < 0 ? -number : number;
		System.out.println(number);
		
		System.out.println("=== pow ===");
		System.out.println(5*5*5);
		int count = 7;
		int result = 1;
		for(int i = 0 ; i < count ; i++) {
			result *= 5;
		}
		System.out.println(result);
		System.out.println(Math.pow(5, 7));
		
		System.out.println("=== round ===");
		double pi = 3.14159265;
		System.out.println(Math.round(pi));
		// 세번째 자리까지 반올림
		// 1. 원하는 자리수만큼 10의 지수 곱하기
		double multiple = pi * 1000;
		System.out.println(multiple);
		// 2. 반올림
		long up = Math.round(multiple);
		System.out.println(up);
		// 3. 10의 지수만큼 나누기
		double div = up / 1000.0;
		System.out.println(div);
		// 정리
		// 1000 -> Math.pow(10,3);
		double powNum = Math.pow(10, 3);
		double after = Math.round(pi*powNum)/powNum;
		System.out.println("after : "+after);
		
		double height = 179.8654;
		System.out.println(Math.round(height));
		// 100 -> 10의 2승 -> Math.pow(10,2)
		height = Math.round(height*(Math.pow(10, 2)))/(Math.pow(10, 2));
		System.out.println(height);
		
	}
}
