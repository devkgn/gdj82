package homework05.run;

import homework05.model.vo.Dish;
import homework05.model.vo.Drink;
import homework05.model.vo.Menu;

public class MenuManger {
	public static void main(String[] args) {
        // 추상 클래스를 이용하여 다양한 종류의 음식과 음료를 주문하는 예제
		Menu[] arr = new Menu[5];
		for(int i = 0 ; i < arr.length ; i++) {
			int num = (int)(Math.random()*2);
			if(num == 0) {
				arr[i] = new Dish("스테이크", 30000, "소고기, 소금, 후추");
			} else {
				arr[i] = new Drink("아메리카노", 5000, "에스프레소 1샷, 물");
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("========== "+(i+1)+" ==========");
			arr[i].cook();
		}

    }
}
