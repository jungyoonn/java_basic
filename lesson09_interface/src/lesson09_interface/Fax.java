package lesson09_interface;

public interface Fax { // 인터페이스는 다중 상속이 가능!
					   // 기본적으로 abstract이다
	String FAX_NUMBER = "01-1234-5678";
	void send(String tel);
	void receive(String tel);
}
