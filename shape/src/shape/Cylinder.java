package shape;

public class Cylinder extends Circle {
	private int h;
	
	public Cylinder(int h) {
		super("원기둥");
		this.h = h;
	}
	
	@Override
	public double length() {
		return 0;
	}
	
	@Override
	public double volume() {
		return super.area() * h;
	}
	
	@Override
	public double area() {
		return (super.length() * h) + (2 * super.area());
	}

	@Override
	public String toString() {
		return "반지름이 " + getR() +"이고 높이가 "+ h + "인 원기둥의 겉넓이는 " + area() + 
				", 부피는 " + volume();
	}
}
