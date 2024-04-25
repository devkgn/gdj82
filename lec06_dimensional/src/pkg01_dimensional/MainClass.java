package pkg01_dimensional;

public class MainClass {
	public static void main(String[] args) {
		// 2차원 배열 선언
		int[][] arr;
		// 생성
		arr = new int[2][3];
		// 선언과 동시 생성
		double[][] doArr = new double[4][4];
		// 인덱스를 이용한 초기화
		int[][] arr1 = new int[2][3];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3; 
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		// for문을 이용한 초기화
		int[][] arr2 = new int[2][3];
		int count = 1;
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr2[i].length; j++) {
				arr2[i][j] = count;
				count = count + 1;
			}
		}
		// 선언과 동시에 초기화
		int[][] arr3 = {{1,2,3},
						{4,5,6}};
		int[][] arr4 = new int[][] {{1,2,3},{4,5,6}};
		
		// 인덱스를 이용한 출력
		System.out.println(arr1[1][1]);
		
		// for문을 이용한 출력
		for(int i = 0 ; i < arr1.length ; i++) {
			for(int j = 0 ; j < arr1[i].length ; j++) {
				System.out.println(arr1[i][j]);
			}
		}
		
	}
}
