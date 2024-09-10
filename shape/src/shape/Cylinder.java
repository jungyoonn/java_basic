package shape;

public class Cylinder extends Shape {
	private int r;
	private int h;
	
	public Cylinder(int r, int h) {
		super("원기둥");
		this.r = r;
		this.h = h;
	}
	
	@Override
	public double length() {
		return 0;
	}
	
	@Override
	public double volume() {
		return r * r * Math.PI * h;
	}
	
	@Override
	double area() {
		return (2 * r * Math.PI * h) + (2 * Math.PI * r * r);
	}

	@Override
	public String toString() {
		return "반지름이 " + r +"이고 높이가 "+ h + "인 원기둥의 겉넓이는 " + area() + ", 부피는 " + volume();
	}
}
