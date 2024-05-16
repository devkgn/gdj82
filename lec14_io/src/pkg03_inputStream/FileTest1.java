package pkg03_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileTest1 {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		File file = new File(dir,"sample1.dat");
		// 1. 파일 입력 스트림 선언
		FileInputStream fis = null;
		try {
			// 2. 파일 입력 스트림 생성
			fis = new FileInputStream(file);
			
			// 3. 읽은 데이터 보관함 생성
			byte[] b = new byte[(int)file.length()];
			// fis.read();
			while(true) {
				int c = fis.read();
				if(c == -1) {
					break;
				}
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
