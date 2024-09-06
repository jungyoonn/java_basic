package day2;

public class Main {
	int i;
	static int si;
	void run() {
		System.out.println(si); // 인스턴스 내에서 클래스 변수를 호출 가능
								// 클래스 변수의 초기화가 먼저 일어나기 때문
		System.out.println(Main.si);
		System.out.println(this);
	}
	
	static void sRun() {
		//System.out.println(i); // 클래스 내에서 인스턴스 변수 호출 불가능
							   // 인스턴스 생성이 일어나기 전이기 때문 / this도 사용 불가
 	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(IntMain.arr2.length);
	
//		Class cls = IntMain.class; // 클래스 리터럴
		Class cls = Class.forName("day2.IntMain");
	}
}
