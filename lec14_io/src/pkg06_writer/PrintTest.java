package pkg06_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintTest {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		// 2. 파일 객체 생성
		File file = new File(dir,"sample3.html");
		
		// 3. PrintWriter 객체 선언
		PrintWriter pw = null;
		
		try {
			// 4. 스트림 객체 생성
			pw = new PrintWriter(file);
			// 5. 출력
			pw.println("<script>");
			pw.println("alert('안녕하세요');");
			pw.println("</script>");
			
			// 6. 스트림 닫기
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
				
	}
}
