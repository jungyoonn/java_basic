package day2;

public class Init {
	private static Init init = new Init(); // static을 붙이면 스택 오버플로우 익셉션 발생
								   // 인스턴스 초기화가 반복되기 때문에 발생한다
								   // static이 붙으면 클래스 변수가 되기 때문에 한 번만 초기화됨
	
	public Init() {
		System.out.println("초기화");
	}
	
	public static void main(String[] args) {
//		new Init(); // new를 위에서 한 번, 여기서 한 번 하므로 초기화가 두 번 프린트됨
	}
	
	static int fact(int i) {
		if(i == 1) {
			return 1;
		}
		return fact(i-1) * i;
	}
}
