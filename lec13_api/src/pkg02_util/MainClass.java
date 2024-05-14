package pkg02_util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
		
		Calendar start = Calendar.getInstance();
		// 2024, 4, 17
		start.set(Calendar.YEAR, 2024);
		start.set(Calendar.MONTH, 4-1);
		start.set(Calendar.DATE, 17);
		System.out.println(start.get(Calendar.YEAR)+"년 "
				+ (start.get(Calendar.MONTH)+1)+"월 "
				+ start.get(Calendar.DATE)+"일");
		
		// 문자열을 날짜 형태로 변환
		String toDay = "2024-5-14";
		String[] arr = toDay.split("-");
		Calendar c5 = Calendar.getInstance();
		c5.set(Integer.parseInt(arr[0]), 
				Integer.parseInt(arr[1])-1, 
				Integer.parseInt(arr[2]));
		System.out.println(c5);
		// 날짜 정보 활용
		// 이번달의 마지막 날까지 몇일 남았는지 확인
		int lastDay = c5.getActualMaximum(Calendar.DAY_OF_MONTH);
		int day = c5.get(Calendar.DATE);
		System.out.println("이번달의 마지막 날까지 "+(lastDay-day));
		// 특정 날짜로부터 오늘이 몇일 지났는지 확인
		// 1. 비교하고 싶은 날짜 Calendar 객체 구성
		Calendar last = Calendar.getInstance();
		last.set(Calendar.YEAR, 2004);
		last.set(Calendar.MONTH, 5-1);
		last.set(Calendar.DATE, 7);
		// 2. 오늘 날짜 객체 구성
		Calendar thisDay = Calendar.getInstance();
		// last.getTimeInMillis()
		// 3. 밀리세컨즈 차이 계산
		long diff = thisDay.getTimeInMillis()
				- last.getTimeInMillis();
		// 4. 1000으로 나누기
		diff = diff/1000;
		// 5. 24시간 * 60분 * 60초 나누기
		diff = diff/(24*60*60);
		System.out.println(diff);
		
		// Date
		Date d = new Date();
		System.out.println(d.getDate());
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yy-MM-dd E HH:mm:ss");
		String printData = sdf.format(d);
		System.out.println(printData);
		
		
		
		
	}
}
