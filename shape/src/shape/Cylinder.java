package shape;

public class Cylinder extends Shape implements Shape3D {
	private Circle circle;
	private int h;
	
	public Cylinder(Circle circle, int h) {
		super("원기둥");
		this.circle = circle;
		this.h = h;
	}
	
	public Cylinder(int r, int h) {
		super("원기둥");
		circle = new Circle(r);
		this.h = h;
	}
	
	@Override
	public double volume() {
		return circle.area() * h;
	}
	
	@Override
	public double area() {
		return (circle.length() * h) + (2 * circle.area());
	}

	@Override
	public String toString() {
		return "반지름이 " + circle.getR() +"이고 높이가 "+ h + "인 " + getName() + "의 겉넓이는 " + area() + 
				", 부피는 " + volume();
	}
}
