package marble;

public class Player {
	String name;
	int money = 2_000_000;
	int idx;
	
	public Player(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + "가 " + idx + "번째 위치에 존재합니다. 자산은 " + money + " 원입니다.";
	}
	
}
