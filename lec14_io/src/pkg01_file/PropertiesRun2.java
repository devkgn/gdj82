package pkg01_file;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesRun2 {
	public static void main(String[] args) {
		// 파일 출력
		Properties prop = new Properties();
		prop.setProperty("name", "Alex");
		prop.setProperty("age", "10");
		prop.setProperty("height", "140");	
		
		// 파일 객체 생성
		// File file = new File("test.properties");
		File file = new File("test.xml");
		
		// 파일 스트림 생성
		try(FileOutputStream fos = new FileOutputStream(file)){
			
			// store 메소드 사용
			// prop.store(fos,"propertiesTest");
			prop.storeToXML(fos, "propertiesTest");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
