package pkg01_file;

import java.io.File;

public class MainClass {
	
	public static void main(String[] args) {
		// 디렉토리 생성
		// 1. File 객체 선언
		// 2. File 객체 생성 -> 매개변수로 경로
		// 3. mkdir(), mkdirs()
		File dir = new File("\\storage\\test1");
		// mkdir() : 상위 디렉토리 X -> 생성 불가능
		// dir.mkdir();
		// dir.mkdirs();
		// 디렉토리 삭제
		// dir.delete();
		// dir.deleteOnExit();
		// 디렉토리 존재유무 확인
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		if(dir.exists() == true) {
			dir.delete();
		}
		
		if(dir.exists()) {
			dir.delete();
		} else {
			dir.mkdirs();
		}
			
		
		
		
	}
	
}
