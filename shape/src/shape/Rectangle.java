package shape;

public class Rectangle extends Shape {
	private int a;
	private int b;
	
	public Rectangle(int a, int b) {
		super("사각형");
		this.setA(a);
		this.setB(b);
	}

	public Rectangle(String string) {
		super("사각형");
		
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
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
	public double volume() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "가로가 " + a +", 세로가 " + b + "인 사각형의 둘레는 " + length() + ", 넓이는 " + area();
	}
}
