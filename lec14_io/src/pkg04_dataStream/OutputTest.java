package pkg04_dataStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class OutputTest {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		// 2. 파일 객체 생성
		File file = new File(dir,"sample4.dat");
		
		// 3. 스트림 객체 선언
		DataOutputStream dos = null;
		
		try {
			// 4. 스트림 객체 생성
			dos = new DataOutputStream(new FileOutputStream(file));
			
			// 5. 출력할 데이터 구성
			String name = "gildong";
			int age = 10; 
			double height = 140.5;
			boolean isAdult = (age >= 20);	// false
			char gender = 'M';
			
			// 6. 출력
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeDouble(height);
			dos.writeBoolean(isAdult);
			dos.writeChar(gender);
			
			// 7. 플러시
			dos.flush();
			
			// 8. 스트림 닫기
			dos.close();
			
			System.out.println(file.length()+"크기의 "
					+file.getName()+" 파일이 생성되었습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
