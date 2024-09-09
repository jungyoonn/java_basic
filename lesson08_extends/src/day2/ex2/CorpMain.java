package day2.ex2;

public class CorpMain {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		int idx = 0;
		
		employees[idx++] = new Programmer("개똥이");
		employees[idx++] = new Programmer("새똥이");
		employees[idx++] = new Designer("소똥이");
		employees[idx++] = new Designer("말똥이");
		
		for(Employee e : employees) { // 오버라이드 한 경우
			System.out.println("==========" + e.name + "의 하루===========");
			e.startWork();
			e.work();
			e.endWork();
		}
		
		for(Employee e : employees) { // 오버라이드 안 한 경우 (부모 클래스에 work() 메서드가 없는 경우)
			System.out.println("==========" + e.name + "의 하루===========");
			e.startWork();
			if(e instanceof Programmer) {
				((Programmer)e).work();
			} else if (e instanceof Designer) {
				((Designer)e).work();
			}
			e.endWork();
		}
	}
}
