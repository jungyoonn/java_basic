package mart;

public class Computer extends Product {
	public Computer() { // 조상 클래스의 변수들이 프라이빗이므로 this를 쓸 수 없음(접근할 수 없음)
		setName("컴퓨터");
		setPrice(200);
	}
}