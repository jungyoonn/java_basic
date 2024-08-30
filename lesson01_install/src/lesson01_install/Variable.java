package lesson01_install;

public class Variable {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		
		System.out.println(num + 30);
		System.out.println(num - 30);
		System.out.println(num * 30);
		System.out.println(num / 30);
		System.out.println(num % 30);
		
		System.out.println();
		System.out.println(num > 30);
		System.out.println(num <= 30);
		System.out.println(num == 30);
		
		char ch = '가';
		System.out.println(ch);
		System.out.println(++ch);
		
		float f = 3.f;
		double d = 3.0;
		System.out.println(f);
		System.out.println(d);
		
		long l = 30L;
		System.out.println(l);
		Boolean bool = null;
	}
}
