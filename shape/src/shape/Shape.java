package shape; // 최고 조상 클래스

public abstract class Shape {
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	abstract double length(); 수평 관계(평면)는 인터페이스로 따로 분리
	abstract double area();
//	abstract double volume(); 수평 관계(입체)는 인터페이스로 따로 분리
}
