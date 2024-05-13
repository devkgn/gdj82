package pkg01_lang.practice04;

public class Practice {
	
	public String deleteBlank(String str) {
		
		str = str.trim();
		str = str.replace(" ", "");
		return str;
	}

}
