package pkg05_homework.controller;

import pkg05_homework.model.vo.Chocolate;

public class ChocolateController {
	Chocolate c = new Chocolate();
	
	public String backChocolateCake(
			double flour, double cream,
			int cherry, int chip) {
		c.setFlour(flour);
		c.setCream(cream);
		c.setCherry(cherry);
		c.setCherry(chip);
		return c.toString();
	}
}
