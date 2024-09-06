package lesson08_extends;

public class SmartPhoneMain {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.name = "전화기";
		p.color = "현대";
		p.company = "화이트";
		System.out.println(p);
		p.call();
		p.receive();
		
		SmartPhone sp = new SmartPhone("갤럭시", "삼성", "블랙");
		System.out.println(sp);
		sp.call();
		sp.receive();
		sp.installApp();
	}
}
