package pkg01_lang;

public class Practice01 {
	public static void main(String[] args) {
		// 1,2,3,4,5를 값으로 가지는 int형 배열 src
		int[] src = {1,2,3,4,5};
		// 길이가 10인 int형 배열 dst
		int[] dst = new int[10];
		// src배열의 3번째 요소부터 3개의 요소를 dst 배열의 4번째 위치부터 복사
		System.arraycopy(src, 2, dst, 3, 3);
		// 공백없이 dst의 모든 요소의 값 순서대로 한 줄에 출력
		for(int i = 0 ; i < dst.length ; i++) {
			System.out.print(dst[i]);
		}
		// 0003450000
	}
}
