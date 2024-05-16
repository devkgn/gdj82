package pkg01_file;

import java.io.File;

public class Practice02 {
	// 재귀함수 : 내가 나를 호출
	// dir : main/sub/2024/05/16
	// parent : main/sub/2024/05
	public void deleteFile(File dir) {
		File parent = dir.getParentFile();
		if(parent == null) {
			return;
		}
		dir.delete();
		deleteFile(parent);
	}
}
