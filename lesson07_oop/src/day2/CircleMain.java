package day2;

public class CircleMain {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.test();
		c.printRound();
		c.printArea();
		
		new Circle()
			.setR(6)
			.printArea()
			.printRound()
			.setR(10)
			.printArea()
			.printRound(); // 체이닝의 형태
	}
}
