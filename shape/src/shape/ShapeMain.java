package shape;

public class ShapeMain {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(4);
		shapes[1] = new Rectangle(5, 6);
		shapes[2] = new Cylinder((Circle) shapes[0], 8);
		shapes[3] = new Hexa((Rectangle) shapes[1], 9);
		
		for(Shape s : shapes) {
			System.out.println(s);
		}
	}
}
