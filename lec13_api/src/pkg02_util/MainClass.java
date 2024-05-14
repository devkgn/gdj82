package pkg02_util;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class MainClass {
	public static void main(String[] args) {
		// Calendar 클래스
		// Calendar c = new Calendar(); -> new 연산자 X
		// 1. 기본
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		// 2. 직접 TimeZone 설정
		Calendar c2 
			= Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		//System.out.println(c2);
		// 3. 직접 Locale 설정
		Calendar c3 = Calendar.getInstance(Locale.ITALY);
		//System.out.println(c3);
		// 4. 직접 TimeZone, Locale 설정
		Calendar c4 
			= Calendar.getInstance(TimeZone.getTimeZone("Europe/London"), Locale.ENGLISH);
		//System.out.println(c4);
		
		// 주요 필드
		System.out.println("년 : "+c1.get(Calendar.YEAR));
		System.out.println("월 : "+(c1.get(Calendar.MONTH)+1));
		System.out.println("일 : "+ c1.get(Calendar.DATE));
		System.out.println("요일 : "+c1.get(Calendar.DAY_OF_WEEK));
		System.out.println("시(1) : "+c1.get(Calendar.HOUR));
		System.out.println("시(2) : "+c1.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : "+c1.get(Calendar.MINUTE));
		System.out.println("초 : "+c1.get(Calendar.SECOND));
		
		
		
	}
}
