package pkg07_reader;

import java.io.File;
import java.io.FileReader;

public class FileTest1 {
	public static void main(String[] args) {
		// 1. 디렉토리 객체 생성
		File dir = new File("\\storage");
		// 2. 파일 객체 생성
		File file = new File(dir,"sample1.txt");
		// 3. 파일 입력 스트림 선언
		FileReader fr = null;
		try {
			// 4. 파일 입력 스트림 생성
			fr = new FileReader(file);
			// 5. 읽을 단위 지정
			int c = 0;
			StringBuilder sb = new StringBuilder();
			// 6. 읽기
			while(true) {
				c = fr.read();
				if(c == -1) {
					break;
				}
				sb.append((char)c);
			}
			System.out.println(sb.toString());
			// 7. 스트림 닫기
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
