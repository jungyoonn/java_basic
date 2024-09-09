package day2.ex2;

public class CorpMain {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		int idx = 0;
		
		employees[idx++] = new Programmer("개똥이");
		employees[idx++] = new Programmer("새똥이");
		employees[idx++] = new Designer("소똥이");
		employees[idx++] = new Designer("말똥이");
		
		for(Employee e : employees) {
			System.out.println("==========" + e.name + "의 하루===========");
			e.startWork();
			e.work();
			e.endWork();
		}
	}
}
