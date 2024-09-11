package shape;

public class Hexa extends Shape implements Shape3D {
	private Rectangle rec;
	private int c;
	
	public Hexa(Rectangle rec, int c) {
		super("육면체");
		this.rec = rec;
		this.c = c;
	}

	@Override
	public double volume() {
		return rec.area() * c;
	}
	
	@Override
	public double area() {
		return 2 * (rec.area() + rec.getB() * c + rec.getA() * c);
	}
	
	@Override
	public String toString() {
		return "가로가 " + rec.getA() +"이고 세로가 "+ rec.getB() + "이고 높이가 " + c + "인 " + getName() + "의 겉넓이는 " + area() + 
				", 부피는 " + volume();
	}
}
