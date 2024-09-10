package shape;

public class Hexa extends Rectangle {
	private int c;
	
	public Hexa(int c) {
		super("육면체");
		this.c = c;
	}
	
	@Override
	public double length() {
		return 0;
	}

	@Override
	public double volume() {
		return super.area() * c;
	}
	
	@Override
	public double area() {
		return 2 * (super.area() + getB() * c + getA() * c);
	}
	
	@Override
	public String toString() {
		return "가로가 " + getA() +"이고 세로가 "+ getB() + "이고 높이가 " + c + "인 육면체의 겉넓이는 " + area() + ", 부피는 " + volume();
	}
}
