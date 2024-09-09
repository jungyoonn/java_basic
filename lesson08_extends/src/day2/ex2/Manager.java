package day2.ex2;

public abstract class Manager extends Employee {
	public Manager(String name) {
		super(name);
	}
	
//	void work() { // 부모에 추상 메서드가 있으므로 반드시 구현해야 함 or 얘도 abstract가 되면 됨
//		
//	}
	
// 추상 메서드가 하나라도 있으면 추상 클래스가 되어야 하지만 
// 추상 클래스가 추상 메서드를 꼭 가져야 할 필요는 없다
// 추상 클래스는 인스턴스 생성 목적 보다는 공통 조상 정의의 목적이다
}
