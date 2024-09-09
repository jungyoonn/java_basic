package day2.ex2;

public class Employee {
	String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	void startWork() {
		System.out.println("출근합니다");
	}
	
	void work() {
		System.out.println("업무합니다");
	}
	
	void endWork() {
		System.out.println("퇴근합니다");
	}
	
	public String toString() {
		return name;
	}
}
