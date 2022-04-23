package Collections;

public class Rectangle extends Polygon{
	
	Rectangle(int side1, int side2){
		sides.add(side1);
		sides.add(side2);
	}
	
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return (float)(sides.get(0) * sides.get(1));
	}
	
	@Override
	public int perimeter() {
		int sum = 0;
		for(Integer side:sides) {
			sum += 2 * side;
		}
		return sum;
	}

}
