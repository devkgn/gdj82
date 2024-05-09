package pkg05_map.study;

import java.util.Objects;

public class Snack {
	private String flavor;
	private int calory;
	
	public Snack() {}
	
	public Snack(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void setCalory(int calory) {
		this.calory = calory;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public int getCalory() {
		return calory;
	}
	
	@Override
	public String toString() {
		return "[맛="+flavor+", 칼로리="+calory+"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(calory,flavor);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Snack) {
			Snack s = (Snack)obj;
			if(s.flavor.equals(flavor) && s.calory == calory)
				result = true;
		}
		return result;
	}
	
	
	
}
