package pkg03_inputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedTest {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		File file = new File(dir,"sample3.dat");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			// 정보 가져오기
			byte[] b = new byte[(int)file.length()];	// 정보 담을 통
			byte[] bytes = new byte[3];	// 정보 꺼내올 그릇
			int idx = 0; 
			while(true) {
				int readByte = bis.read(bytes);
				if(readByte== -1) {
					break;
				}
				System.arraycopy(bytes, 0, b, idx, readByte);
				idx += bytes.length;
			}
			String str = new String(b);
			System.out.println(str);
			bis.close();
			fis.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
