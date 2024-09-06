package day2;

public class Circle {
	double r;
	
	public Circle() {}
	
	public Circle(double r) {
		this.r = r;
		// set(R); 도 가능함
	}
	
//	void test() {
//		double r = 0;
//		System.out.println(r);
//		System.out.println(this.r);
//	}
//	
//	void printRound() {
//		System.out.println(Math.PI*r*2);
//	}
//	
//	void printArea() {
//		System.out.println(Math.PI*r*r);
//	}
//	
//	void setR(double r) {
//		this.r = r;
//	}
//	
//	Circle Circle() {}
//	
//	Circle Circle(double r) {
//		this.r = r;
//		// set(R); 도 가능함
//	}
	
	Circle test() {
		double r = 0;
		System.out.println(r);
		System.out.println(this.r);
		return this;
	}
	
	Circle printRound() {
		System.out.println(Math.PI*r*2);
		return this;
	}
	
	Circle printArea() {
		System.out.println(Math.PI*r*r);
		return this;
	}
	
	Circle setR(double r) {
		this.r = r;
		return this;
	}
}
