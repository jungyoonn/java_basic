package day2.ex2;

public class CorpMain {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		int idx = 0;
		
		employees[idx++] = new Programmer("개똥이");
		employees[idx++] = new Programmer("새똥이");
		employees[idx++] = new Designer("소똥이");
		employees[idx++] = new BuyManager("말똥이");
		
		Employee emp = new Employee("미정사원") {
			
			@Override
			void work() {
				// TODO Auto-generated method stub
				System.out.println("업무진행");
			}
		}; // 생성자 호출 후 클래스 구간 생성 => 인스턴스화 => emp.work()를 사용할 수 있게 됨
		
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
			} else if (e instanceof BuyManager) {
				((BuyManager)e).work();
			}
			e.endWork();
		}
	}
}
