package pkg02_outputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedTest {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		// 2. 파일 객체 생성
		File file = new File(dir,"sample3.dat");
		
		// 3. FileOutputStream, BufferedOutputStream 모두 선언
		//FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// 4. 생성
			//fos = new FileOutputStream(file);
			//bos = new BufferedOutputStream(fos);
			bos = new BufferedOutputStream(new FileOutputStream(file));
			
			// 5. 정보 구성
			String str1 = "how are you?\n";
			String str2 = "i'm fine thank you and you";
			
			// 6. 정보 출력
			bos.write(str1.getBytes());
			bos.write(str2.getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				//fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
