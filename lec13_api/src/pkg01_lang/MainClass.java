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
	}
}
