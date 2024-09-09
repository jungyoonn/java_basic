package day2.ex2;

abstract class Employee {
	String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	void startWork() {
		System.out.println("출근합니다");
	}
	
//	void work() {
//		System.out.println("업무합니다");
//	} 추상 메서드로 대체 가능
	
	abstract void work(); // 클래스 앞에도 abstract를 붙여야 함
						  // 오버라이드를 강제로 하는 목적의 추상 메서드 (상속 목적)
						  // 추상 메서드가 하나라도 있으면 추상 클래스가 된다
	
	void endWork() {
		System.out.println("퇴근합니다");
	}
	
	public String toString() {
		return name;
	}
}
