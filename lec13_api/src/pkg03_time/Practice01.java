package pkg03_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Practice01 {
	public static void main(String[] args) {
		// 오늘 아침 8시 10분 50초와 
		// 현재의 분(minute) 차이를 도출하여 출력하세요.
		// LocalDateTime과 ChoronoUnit을 활용하세요.
		LocalTime morning = LocalTime.of(8, 10,50);
		LocalTime now = LocalTime.now();
		long result = ChronoUnit.MINUTES.between(morning, now);
		//System.out.print(result);
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf 
			= DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E HH:mm:ss");
		System.out.println(dtf.format(ldt));
		
		
		
		
		
		
		
		
		

	}
}
