package pkg01_lang;

import java.util.ArrayList;
import java.util.List;

public class Practice10 {
	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		students.add("고보경");
		students.add("김란미");
		students.add("김민경");
		students.add("김민재");
		students.add("김채영");
		students.add("도승진");
		students.add("류지현");
		students.add("박병준");
		students.add("박소미");
		students.add("박혜선");
		students.add("서혜원");
		students.add("심민성");
		students.add("심수현");
		students.add("유승열");
		students.add("이미소");
		students.add("이소은");
		students.add("이종담");
		students.add("이종영");
		students.add("임민지");
		students.add("전주영");
		students.add("정채린");
		students.add("조경원");
		students.add("진서형");
		students.add("최종우");
		students.add("허수영");
		students.add("홍순욱");
		// 최소값, 최대값
		// 0, 길이 -1
		int min = 0;
		int max = students.size()-1;
		// 범주 = max - min + 1 
		// 범주 = students.size()-1-0-1
		System.out.println(min + "~" +max);
		int rnd = (int)(Math.random()*(max-min+1))+min;
		rnd = (int)(Math.random()*26);
		System.out.println("오늘의 발표자 "+students.get(rnd)+"님!!");
		
	}
}
