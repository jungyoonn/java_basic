package day2.ex2;

public class AccessTest {
	public static void main(String[] args) {
		A2 a = new A2();
		a.m();
	}
}

class A2 {
	void m() { // 프라이빗을 붙이면 메인에서 사용 불가
		System.out.println("A.m()");
	}
}
