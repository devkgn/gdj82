package pkg03_inputStream.homework;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practice {
	public void method1() {
		File dir = new File("\\storage");
		File file = new File(dir,"애국가1.dat");
		
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			byte[] b = new byte[(int)file.length()];
			int idx = 0 ;
			int c;
			while(true) {
				c = in.read();
				if(c == -1) {
					break;
				}
				b[idx++] = (byte)c;
			}
			String str = new String(b);
			//System.out.println(str);
			in.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void method2() {
		File dir = new File("\\storage");
		File file = new File(dir,"애국가1.dat");
		
		FileInputStream in = null;
		BufferedInputStream bis = null;
		try {
			in = new FileInputStream(file);
			bis = new BufferedInputStream(in);
			byte[] b = new byte[(int)file.length()];
			int idx = 0 ;
			int c;
			while(true) {
				c = in.read();
				if(c == -1) {
					break;
				}
				b[idx++] = (byte)c;
			}
			String str = new String(b);
			//System.out.println(str);
			in.close();
			bis.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
