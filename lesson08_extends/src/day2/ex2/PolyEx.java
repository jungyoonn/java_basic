package day2.ex2;

public class PolyEx {
	public static void main(String[] args) {
		Child c = new Child();
		// 다형성 : 조상 타입 객체 = new 자손 생성자();
				
		c.walk();
		c.run();
		c.eat();
		
		System.out.println(c);
		
		// 다형성!! 자동 형변환이 일어난다
		//			좌항이 우항보다 조상이기만 하면 가능
		//			하위 인스턴스를 상위의 자료형으로 사용하는 것이 가능하다
		Parent p = new Child();
		p.walk();
		p.run(); // 재정의된 메서드가 실행된다
		
		// p.eat()가 불가능한 이유 : p의 타입은 Parent이지만 Child로 선언했기 때문에
		// 컴파일러가 틀렸다고 판단한다 그래서 실행이 되지 않는다 (애초에 부모에 정의되어있지도 않음)
		// 가능하게 하려면 
		((Child)p).eat(); // 형변환을 강제로 해 주어야 함
		
		System.out.println(p);
		
		Parent p2 = new Parent();
		// ((Child)p2).eat(); 실행 오류 발생 : 부모는 자식으로 형변환이 불가능
		//									   상속이 되어 있긴 하지만 부모를 자식으로 선언한 것이 아니라
		//									   부모를 부모로 선언했기 때문
		
		// Uncle u = new Child(); 상속되어 있지 않아서 선언 불가능
		Uncle u = new Uncle();
		u.walk();
		// ((Child)u).walk(); 컴파일러가 막는다 : 상속되어 있지 않아서
		
		// 해결 방안은 instanceof를 쓰면 됨
		if(p2 instanceof Parent) { // p2가 Parent의 인스턴스인지
			System.out.println("p2는 Parent의 인스턴스");
		}
		if(p2 instanceof Child) {
			System.out.println("p2는 Child의 인스턴스"); // false
		}
	}
}
