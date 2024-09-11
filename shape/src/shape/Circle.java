package shape;

public class Circle extends Shape implements Shape2D {
	private int r;

	public Circle(int r) {
		super("원");
		this.r = r;
	}
	
	public int getR() {
		return r;
	}

	@Override
	public double length() {
		return 2 * r * Math.PI;
	}
	
	@Override
	public double area() {
		return r * r * Math.PI;
	}
	
	@Override
	public String toString() {
		return "반지름이 " + r +"인 원의 둘레는 " + length() + ", 넓이는 " + area();
	}
}
