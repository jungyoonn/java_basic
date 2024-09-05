package lesson07_oop;

public class MethodMain {
	public static void main(String[] args) {
		Param p = new Param();
		p.add(10, 20);
		System.out.println(p.add(10, 20));
		System.out.println(new Param().add(40,50));
		
		System.out.println(Param.add2(4, 7));
	}
}

class Param {
	int add(int a, int b) {
		return a + b;
	}
	
	static int add2(int a, int b) {
		return a + b;
	}
}
