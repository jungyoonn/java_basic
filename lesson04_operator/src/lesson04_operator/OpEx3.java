package lesson04_operator;

public class OpEx3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
//		System.out.println(++a);
//		System.out.println(a++);
//		System.out.println(a);
		
		int c = ++a;
		int d = b++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int i = 0, sum = 0;
		while(i <=10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		int x = 3;
		double y = 3;
		boolean z = x==y;
		
		System.out.println(z);
	}
}
