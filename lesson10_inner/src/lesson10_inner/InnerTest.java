package lesson10_inner;

public class InnerTest {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner(); // 내부 클래스 객체 생성 (인스턴스로 접근)
		Outer.SInner sInner = new Outer.SInner(); // 클래스 이름으로 직접 접근해야 한다
													// 클래스의 로드가 더 빠르기 때문이다
	}						
}

class Outer {
	int i;
	static int si;
	
	class Inner {
		int i2;
		static int si2;
		
		{
			System.out.println(i);
			System.out.println(si);
		}
	}
	
	static class SInner {
		int i3;
		static int si3;
		
		{
//			System.out.println(i); // static이라서 불가능
			System.out.println(i3);
		}
	}
}
