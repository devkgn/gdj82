package pkg01_dimensional;

public class Practice01 {
	public static void main(String[] args) {
		// 2행, 3열짜리 2차원 문자열 배열 arr 선언, 생성
		// 생성된 2차원 배열의 모든 인덱스에 값 부여
		// 출력)
		// (0,0)(0,1)(0,2)
		// (1,0)(1,1)(1,2)
		String[][] arr = new String[2][3];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = "("+i+","+j+")";
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
