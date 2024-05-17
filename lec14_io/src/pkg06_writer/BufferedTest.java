package pkg06_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedTest {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		// 2. 파일 객체 생성
		File file = new File(dir,"sample2.txt");
		// 3. 파일 출력 스트림 선언
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// 4. 파일 출력 스트림 생성 -> 추가 모드
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			
			// 5. 출력
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저는 김가남입니다");
			
			// 6. 파일 스트림 닫기
			bw.close();
			fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
