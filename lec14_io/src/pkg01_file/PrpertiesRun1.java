package pkg01_file;

import java.util.Properties;

public class PrpertiesRun1 {
	public static void main(String[] args) {
		// 1. 생성
		Properties prop = new Properties();
		// 2. 요소 추가
		prop.setProperty("name", "Alex");
		prop.setProperty("age", "10");
		prop.setProperty("height", "140");
		// 3. 요소 조회
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("height"));
	}
}
