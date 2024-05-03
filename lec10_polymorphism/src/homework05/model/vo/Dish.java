package homework05.model.vo;

public class Dish extends Menu {
    private String ingredients; // 요리의 재료

    public Dish() {
    	super();
    }
    
    // 생성자
    public Dish(String name, int price, String ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	// 메뉴를 제조하는 메서드 구현
    @Override
    public void cook() {
    	System.out.println(super.toString());
        System.out.println("재료는" + ingredients+"입니다.");
    }
}
