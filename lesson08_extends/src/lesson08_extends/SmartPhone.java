package lesson08_extends;

public class SmartPhone extends Phone {
	public SmartPhone() {}
	
	public SmartPhone(String name, String color, String company) {
		super(name, color, company);
	}

	public void installApp() {
		System.out.println("앱 설치");
	}
}
