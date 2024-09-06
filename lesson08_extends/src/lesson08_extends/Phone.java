package lesson08_extends;

public class Phone {
	String name;
	String color;
	String company;
	
	public Phone() {}
	
	public Phone(String name, String color, String company) {
		this.name = name;
		this.color = color;
		this.company = company;
	}
	
	
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", color=" + color + ", company=" + company + "]";
	}



	void call() {
		System.out.println("전화하기");
	}
	
	void receive() {
		System.out.println("전화받기");
	}
}
