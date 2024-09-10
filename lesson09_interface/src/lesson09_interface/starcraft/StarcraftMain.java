package lesson09_interface.starcraft;

public class StarcraftMain {
	static String s = "adcd";
	@SuppressWarnings({"unused", "deprecation"})
	public static void main(String[] args) {
		SCV scv = new SCV();
		Marine marine = new Marine();
		
//		scv.repair(marine);
		
		Tank tank = new Tank();
		tank.toggleSiege();
		
		scv.repair(tank);
		
		Repairable r = new Wraith();
		Repairable r2 = new SCV();
		
		Unit[] units = new Unit[12];
		
		Repairable.sm();
		tank.dm(); // 디폴트 메서드는 구상 클래스에서 생성된 객체 이름으로 호출해야 함
		
		FInter finter = s -> "abcd";
	}
}
