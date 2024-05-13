package pkg01_lang;

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
		
	}
}
