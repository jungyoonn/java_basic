package day2.ex2;

public class PolyEx {
	public static void main(String[] args) {
		Child c = new Child();
				
		c.walk();
		c.run();
		c.eat();
		
		// 다형성!! 자동 형변환이 일어난다
		//			좌항이 우항보다 조상이기만 하면 가능
		//			하위 인스턴스를 상위의 자료형으로 사용하는 것이 가능하다
		Parent p = new Child();
		p.walk();
		p.run(); // 재정의된 메서드가 실행된다
	}
}
