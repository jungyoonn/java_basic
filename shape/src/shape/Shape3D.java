package shape;

public abstract class Shape3D extends Shape {
	public Shape3D(String name) {
		super(name);
	}

	abstract double volume();
}
