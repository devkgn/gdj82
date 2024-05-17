package pkg01_file;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesRun3 {
	public static void main(String[] args) {
		// File file = new File("test.properties");
		File file = new File("test.xml");
		try(FileInputStream fis = new FileInputStream(file)){
			
			Properties prop = new Properties();
			// prop.load(fis);
			prop.loadFromXML(fis);
			System.out.println(prop);
			String name = prop.getProperty("name");
			System.out.println(name);
					
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
