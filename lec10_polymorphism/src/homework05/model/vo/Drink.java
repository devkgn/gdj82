package homework05.model.vo;

public class Drink extends Menu {
    private String recipe; // 음료의 제조법

    public Drink() {
    	super();
    }
    
    // 생성자
    public Drink(String name, int price, String recipe) {
        super(name, price);
        this.recipe = recipe;
    }
    

    public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	// 메뉴를 제조하는 메서드 구현
    @Override
    public void cook() {
    	System.out.println(super.toString());
        System.out.println("레시피는" + recipe+"입니다.");
    }
}
