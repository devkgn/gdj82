package pkg05_objStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class InputTest {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		File file = new File(dir,"sample5.dat");
		
		ObjectInputStream ois = null;
		try {
			
			ois = new ObjectInputStream(new FileInputStream(file));
			
			Employee employee1 = (Employee)ois.readObject();
			List<Employee> empList = (List<Employee>)ois.readObject();
			
			System.out.println(employee1);
			System.out.println(empList.get(0));
			System.out.println(empList.get(1));
			
			ois.close();
			
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
