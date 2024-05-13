package pkg02_util;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class MainClass {

	public static void main(String[] args) {
		// 사용 불가능
		// Calendar c = new Calendar();
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		System.out.println(c2);
		Calendar c3 = Calendar.getInstance(Locale.KOREA);
		System.out.println(c3);

		// Calendar 클래스 이용하기
		System.out.println("년 : "+c1.get(Calendar.YEAR));
		System.out.println("월 : "+(c1.get(Calendar.MONTH)+1));
		System.out.println("일 : "+c1.get(Calendar.DATE));
		System.out.println("시 : "+c1.get(Calendar.HOUR));
		System.out.println("분 : "+c1.get(Calendar.MINUTE));
		System.out.println("초 : "+c1.get(Calendar.SECOND));
	}

}
