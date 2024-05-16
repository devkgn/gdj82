package pkg01_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class FileClass2 {
	public static void main(String[] args) {
		// 파일 배열
		File dir = new File("\\main\\sub");
		File[] files = dir.listFiles();
		for(File f : files) {
			System.out.println(f);
		}
		
		// 유형
		File test = new File("\\main\\sub\\test.txt");
		boolean type1 = test.isDirectory();
		boolean type2 = test.isFile();
		String strType = test.isDirectory() ? "디렉토리" :"파일";
		System.out.println("유형 : "+strType);
		
		// 상위 디렉토리
		String parent = test.getParent();
		System.out.println("상위 : "+parent);
		
		// 파일명
		String name = test.getName();
		System.out.println("이름 : "+name);
		
		// 디렉토리 + 파일명
		String path = test.getPath();
		System.out.println("경로 : "+path);
	
		// 마지막 수정된 날짜
		long millis = test.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(millis);
		System.out.println(date);
		
		// 크기
		long byteSize = test.length();
		double kbSize = (byteSize/1024.0);
		System.out.println("크기 : "+kbSize);
		
		// UUID 버전 3
		String yrem = "john";
		String uuid = UUID.nameUUIDFromBytes(yrem.getBytes()).toString();
		System.out.println("UUID(1) : "+uuid);
		
		// UUID 버전 4
		uuid = UUID.randomUUID().toString();
		System.out.println("UUID(2) : "+uuid);
		
	}
}
