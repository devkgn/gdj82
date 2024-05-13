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
		
		
	}
}
