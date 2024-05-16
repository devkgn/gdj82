package pkg03_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		File file = new File(dir,"sample2.dat");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			// 읽은 데이터 보관용
			byte[] b = new byte[(int)file.length()];
			// 읽을 단위
			byte[] bytes = new byte[5];
			int idx = 0;
			while(true) {
				int readBytes = fis.read(bytes);
				if(readBytes == -1) {
					break;
				}
				System.arraycopy(bytes, 0, b, idx, readBytes);
				idx += bytes.length;
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
