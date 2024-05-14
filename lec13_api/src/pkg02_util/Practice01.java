package pkg02_util;

import java.util.Calendar;

public class Practice01 {
	public static void main(String[] args) {
		// 2024년 5월 14일 화요일
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		int date = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(date);
		String strDate;
		switch(date) {
			case 2 : strDate = "월";break;
			case 3 : strDate = "화";break;
			case 4 : strDate = "수";break;
			case 5 : strDate = "목";break;
			case 6 : strDate = "금";break;
			case 7 : strDate = "토";break;
			default : strDate = "일";break;
		}
		System.out.println(year+"년 "+month+"월 "+day+"일 "+strDate+"요일");
	}
}
