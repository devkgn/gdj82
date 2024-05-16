package pkg01_file;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice01 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
//		int year = today.getYear();
//		int month = today.getMonthValue();
//		int day = today.getDayOfMonth();
		DateTimeFormatter dtf 
			= DateTimeFormatter.ofPattern("yyyy\\MM\\dd");
		String date = dtf.format(today);
		File dir = new File("\\main\\sub\\"+date);
		
//		File dir = new File("\\main\\sub\\"+year+"\\"+month+"\\"+day);
//		if(dir.exists() == false) {
//			dir.mkdirs();
//		}
		
		Practice02 p2 = new Practice02();
		p2.deleteFile(dir);
	}
}
