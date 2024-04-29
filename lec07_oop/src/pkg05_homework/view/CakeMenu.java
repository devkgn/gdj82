package pkg05_homework.view;

import java.util.Scanner;

import pkg05_homework.controller.ChocolateController;
import pkg05_homework.controller.GreenTeaController;

public class CakeMenu {
	private Scanner sc = new Scanner(System.in);
	private ChocolateController cc = new ChocolateController();
	private GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
			System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
			System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
			System.out.println("9. 취소");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			if(num == 1) {
				chocolateMenu();
			} else if(num == 2) {
				greenTeaMenu();
			} else if(num == 9) {
				break;
			} else {
				System.out.println("잘못된 번호입니다.");
			}
		}
	}
	public void chocolateMenu() {
		System.out.println("test");
		cc.backChocolateCake(300, 400, 20, 1000);
	}
	public void greenTeaMenu() {
		gtc.backGreenTeaCake(300, 400, 100, 50);
	}
}
