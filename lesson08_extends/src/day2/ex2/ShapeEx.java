package day2.ex2;

public class ShapeEx {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("넓이 : " + s.area() + ", 둘레 : " + s.length());
		}
	}
}

abstract class Shape {
	String type;
	
	public Shape(String type) {
		this.type = type;
	}
	
	abstract double area();
	abstract double length();
}

class Circle extends Shape {
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return r * r * Math.PI;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circle [type = " + type + ", r = " + r + "]";
	}
}

class Rectangle extends Shape {
	int width, height;
	
	Rectangle(int width, int height) {
		super("사각형");
		this.height = height;
		this.width = width;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}
	
	@Override
	public String toString() {
		return "Rectangle [type = " + type + ", width = " + width + ", height = " + height +  "]";
	}
}