package marble.area;

public abstract class Local {
	String name; // 도시 이름
	int idx; // 위치 정보 관리 목적
	
	public Local() {}
	
	public Local(String name, int idx) {
		this.name = name;
		this.idx = idx;
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}
}
