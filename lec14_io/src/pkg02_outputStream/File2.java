package pkg02_outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File2{
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("\\storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		// 2. 파일 객체 선언
		File file = new File(dir,"sample2.dat");
		FileOutputStream fos= null;
		try {
			// 추가모드 
			// O : 정보 추가
			// X : 파일 생성
			// 3. FileOutputStream 생성
			fos = new FileOutputStream(file,true);
			
			// 4. 출력
			fos.write("안녕하세요 반갑습니다\n".getBytes());
			
			// 5. 플러싱
			fos.flush();
			
			// 6. 닫기
			fos.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}