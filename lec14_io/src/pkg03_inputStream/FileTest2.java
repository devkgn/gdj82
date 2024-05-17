package pkg03_inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		File file = new File(dir,"애국가1.dat");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			// 읽은 데이터 보관용
			byte[] b = new byte[(int)file.length()];
			// 읽을 단위
			byte[] bytes = new byte[3];
			int idx = 0;
			while(true) {
				int readBytes = fis.read(bytes);
				if(readBytes == -1) {
					break;
				}
				System.arraycopy(bytes, 0, b, idx, readBytes);
				idx += bytes.length;
			}
			
			String str = new String(b);
			System.out.println(str);
			fis.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
