package shape;

public class Rectangle extends Shape implements Shape2D {
	private int a;
	private int b;
	
	public Rectangle(int a, int b) {
		super("사각형");
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}

	@Override
	public double length() {
		return (a + b) * 2;
	}
	
	@Override
	public double area() {
		return a * b;
	}
	
	@Override
	public String toString() {
		return "가로가 " + a +", 세로가 " + b + "인 사각형의 둘레는 " + length() + ", 넓이는 " + area();
	}
}
