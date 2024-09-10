package mart; 

// 조상 클래스 => 공통된 사항들 정의
public abstract class Product {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "[" + name + ", " + price + "]";
	}
}
