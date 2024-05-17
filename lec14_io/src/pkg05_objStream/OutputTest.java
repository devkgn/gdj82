package pkg05_objStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OutputTest {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"sample5.dat");
		
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream(file));
			
			// 1. 객체
			Employee e = new Employee(1,"홍길동");
			// 2. List<Employee>
//			List<Employee> list = new ArrayList<Employee>();
//			list.add(new Employee(2,"김철수"));
//			list.add(new Employee(3,"이영희"));
			List<Employee> list = Arrays.asList(new Employee(2,"김철수"),
					new Employee(3,"이영희"));
			
			out.writeObject(e);
			out.writeObject(list);
			
			out.close();
			
			System.out.println(file.length()+"바이트의 "
								+file.getName()+"이(가) 생성되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
