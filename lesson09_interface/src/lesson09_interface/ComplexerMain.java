package lesson09_interface;

public class ComplexerMain {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		
		System.out.println(Printer.INK);
		
		com.print();
		com.scan();
		com.send("01-1234-7878");
		com.receive("02-8765-4321");
		
		Fax fax = new Fax() {

			@Override
			public void send(String tel) {
				// TODO Auto-generated method stub
				System.out.println("fax 송신");
				
			}

			@Override
			public void receive(String tel) {
				// TODO Auto-generated method stub
				System.out.println("fax 수신");
			}
			
		};
		// 다형성에 의해 Fax fax = com; 이 가능해짐
		
		fax.send("abcd");
		
		Complexer com2 = new Complexer() {
			public void scan() {
				System.out.println("com2의 스캔");
			} // 접근제한자와 리턴 타입을 맞춰 주면 인스턴스를 만들면서 오버라이딩이 같이 됨
			  // 이것이 내부 클래스
		};
	}
}
