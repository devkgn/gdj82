package pkg02_outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		// 파일 생성
		// 1. 디렉토리 생성
		File dir = new File("\\storage");
		if(dir.exists() == false){
			dir.mkdirs();
		}
		// 2. 파일 객체 선언
		File file = new File(dir,"sample1.dat");
		// 3. 파일 출력 스트림 선언, 생성
		FileOutputStream fos = null;
		try {
			// FileOutputStream fos = new FileOutputStream(file);
			fos = new FileOutputStream(file);
			// 4. 출력할 데이터 구성
			String str = "hello";
			byte[] b = str.getBytes();
			// 5. 출력
			fos.write(b);
			// 6. 플러싱(선택)
			fos.flush();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 7. 파일 출력 스트림 닫기
			try {
				if(fos != null) {
					fos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
