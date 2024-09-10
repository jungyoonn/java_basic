package mart;

public class Tv extends Product {
	public Tv() { // 조상 클래스의 변수들이 프라이빗이므로 this를 쓸 수 없음(접근할 수 없음)
		setName("TV");
		setPrice(100);
	}
}
