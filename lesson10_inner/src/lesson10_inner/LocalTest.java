package lesson10_inner;

public class LocalTest {
	
	static MyInter create() {
		class MyClass implements MyInter { // 지역 클래스 (메서드 내부에서 선언했기 때문)
			public MyClass() {} // 생성자 
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("MyClass.run()");
			}
		}
		return new MyClass();
	}
	
	static MyInter create2() {
		return new MyInter() {
			// 익명 클래스라서 이름이 없어서 생성자를 만들 수 없다

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("create2().run()");
			}
		};
	}
	
	static MyInter create3() {
		return () -> System.out.println("lamda.run()"); // 람다식
	}
	
	public static void main(String[] args) {
		MyInter mi = create();
		mi.run();
		
		create2().run();
		create3().run();
	}
}

interface MyInter {
	void run();
}
