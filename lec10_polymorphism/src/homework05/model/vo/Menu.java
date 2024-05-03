package homework05.model.vo;

public abstract class Menu {
    private String name;    // 메뉴 이름
    private int price;      // 메뉴 가격

    protected Menu() {}
    
    // 생성자
    protected Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 메뉴의 이름을 반환하는 메서드
    protected String getName() {
        return name;
    }

    // 메뉴의 가격을 반환하는 메서드
    public int getPrice() {
        return price;
    }

    // 메뉴를 제조하는 추상 메서드
    public abstract void cook();
    
    @Override
    public String toString() {
    	return "메뉴명은 "+name+"이고, 가격은 "+price+"원입니다.";
    }
}
