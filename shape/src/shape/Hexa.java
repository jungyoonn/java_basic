package shape;

public class Hexa extends Shape {
	private int a;
	private int b;
	private int c;
	
	public Hexa(int a, int b, int c) {
		super("육면체");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public double length() {
		return 2 * (a * b + b * c + a * c);
	}

	@Override
	public double volume() {
		return a * b * c;
	}
	
	@Override
	public double area() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "가로가 " + a +"이고 세로가 "+ b + "이고 높이가 " + c + "인 육면체의 겉넓이는 " + length() + ", 부피는 " + volume();
	}
}
