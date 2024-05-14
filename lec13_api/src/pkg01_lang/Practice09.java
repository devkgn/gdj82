package pkg01_lang;

public class Practice09 {
	public static void main(String[] args) {
		// 변수를 선언하고, 실수형 숫자 5.13824를 변수에 초기값으로 셋팅합니다.
		double num = 5.13824;
		// 실수를 소수점 첫째자리까지, 둘째자리까지, 셋째자리까지 반올림하여 출력하세요.
		// 제곱값 식(pow)을 활용하세요.
		// 첫째자리
		double onePow = Math.pow(10, 1);
		double one = Math.round(num*onePow)/onePow;
		// 둘째자리
		double twoPow = Math.pow(10, 2);
		double two = Math.round(num*twoPow)/twoPow;
		// 셋째자리
		double threePow = Math.pow(10, 3);
		double three = Math.round(num*threePow)/threePow;
		System.out.println("소수점 첫째자리까지 반올림 : "+one);
		System.out.println("소수점 둘째자리까지 반올림 : "+two);
		System.out.println("소수점 셋째자리까지 반올림 : "+three);
		/*
		 * 소수점 첫째자리까지 반올림 : 5.1 
		 * 소수점 둘째자리까지 반올림 : 5.14 
		 * 소수점 셋째자리까지 반올림 : 5.138
		 */
	}
}
