package day2.ex2;

public class Programmer extends Employee {
	public Programmer(String name) {
		super(name); // 생성자는 상속되지 않기 때문에 super를 써서 가져옴
		
	}
	
	void work() {
		System.out.println("코딩합니다");
	} // 오버라이딩
}
