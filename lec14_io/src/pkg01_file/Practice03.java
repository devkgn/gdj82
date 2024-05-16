package pkg01_file;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Practice03 {
	public static void main(String[] args) {
		// \storage 아래에 파일을 생성하세요.
		// 파일명은 버전 4 UUID로 구성하세요.
		// 확장자는 .dat입니다
		File dir = new File("\\storage");
		String uuid = UUID.randomUUID().toString();
		File file = new File(dir,uuid+".dat");
		try {
			if(file.exists() == false) {
				file.createNewFile();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
