package pkg03_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class MainClass {
	public static void main(String[] args) {
		// 1. 날짜 생성
		System.out.println("=== LocalDate ===");
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2023, 10, 25);
		System.out.println(date2);
		// 2. 특정 필드 조회
		System.out.println("년 : "+date1.getYear());
		System.out.println("월 : "+date1.getMonthValue());
		System.out.println("일 : "+date1.getDayOfMonth());
		System.out.println("요일 : "+date1.getDayOfWeek().getValue());
		// 3. 변경
		LocalDate other = date1.withYear(2000);
		System.out.println(other);
		other = other.withMonth(3);
		System.out.println(other);
		// 4. 증가
		date1 = date1.plusYears(10);
		System.out.println(date1);
		// 5. 감소
		date1 = date1.minusMonths(3);
		System.out.println(date1);
		
		System.out.println("=== LocalTime ===");
		// 생성, 필드 조회, 변경, 증가, 감소
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(14, 30, 45);
		System.out.println(time2);
		System.out.println("시 : "+time1.getHour());
		time1 = time1.withMinute(23);
		System.out.println(time1);
		time1 = time1.plusHours(2);
		System.out.println(time1);
		time1 = time1.minusHours(1);
		System.out.println(time1);
		
		System.out.println("=== LocalDateTime ===");
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt2 
			= LocalDateTime.of(2023, 10, 25, 14, 30, 45);
		
		long result1 = ChronoUnit.DAYS.between(ldt2, ldt);
		System.out.println(result1);
		long result2 = ChronoUnit.MONTHS.between(ldt2, ldt);
		System.out.println(result2);
		
	}
}
