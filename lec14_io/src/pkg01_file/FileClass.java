package pkg01_file;

import java.io.File;
import java.io.IOException;

public class FileClass {
	public static void main (String[] args) {
		// 1. 디렉토리 작업
		File dir = new File("\\storage\\test1");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		// 2. 파일 객체 추가
		File file = new File(dir,"sample.txt");
		if(file.exists() == false) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			file.delete();
		}
		
		// 3. 파일 삭제
		
	}
}
