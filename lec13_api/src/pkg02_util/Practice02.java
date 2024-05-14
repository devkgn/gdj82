package pkg02_util;

import java.util.Calendar;
import java.util.Locale;

public class Practice02 {

	public static void main(String[] args) {
		// 여러분의 생일을 아래와 같은 형태로 담고 있는 변수 선언하세요.
		String birthDay = "2004-5-7";
		// 생일로부터 오늘이 몇 일 지났는지 출력하기
		// 태어난지 : 8737 일
		String[] arr = birthDay.split("-");
		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(arr[0]),
				Integer.parseInt(arr[1])-1,
				Integer.parseInt(arr[2]));
		Calendar today = Calendar.getInstance();
		long diff = today.getTimeInMillis()-c.getTimeInMillis();
		diff = diff/1000;
		diff = diff/(24*60*60);
		System.out.println(diff);
	}

}
