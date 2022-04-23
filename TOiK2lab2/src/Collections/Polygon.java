package Collections;

import java.util.ArrayList;

public abstract class Polygon {
	ArrayList<Integer> sides = new ArrayList<>();
	
	public int perimeter() {
		int sum = 0;
		for(Integer side:sides) {
			sum += side;
		}
		return sum;
	}
	
	public abstract float area();
	
	public String toString(){  
		return "Sides: "+ sides+ "\n" +"Area: " + this.area() +"\n" + "Perimeter: " + this.perimeter();  
	}  
}
