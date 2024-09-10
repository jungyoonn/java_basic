package shape;

public abstract class Shape {
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	abstract double length();
	abstract double area();
	abstract double volume();
}
