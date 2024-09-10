package mart;

public class Aircon extends Product {
	public Aircon() { // 조상 클래스의 변수들이 프라이빗이므로 this를 쓸 수 없음(접근할 수 없음)
		setName("에어컨");
		setPrice(300);
	}
}