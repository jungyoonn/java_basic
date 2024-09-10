package lesson09_interface.starcraft;

public class SCV extends GroundUnit implements Repairable {
	void repair(Repairable u) {
		if(!(u instanceof Repairable)) {
			System.out.println("수리 불가 대상");
			return;
		}
		
		// 수리 실행 로직
	}
}
