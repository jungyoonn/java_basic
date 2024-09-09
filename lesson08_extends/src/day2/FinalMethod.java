package day2;

public class FinalMethod {
// final은 클래스, 메서드, 필드에 모두 사용할 수 있다
// 클래스에 붙으면 "이 클래스에 대한 상속은 여기까지! 더 이상 상속 불가능"
// ㄴ 대표적으로 String 클래스가 있다
// 메서드에 붙으면 재정의(오버라이딩)가 불가능하도록
// ㄴ 추상 메서드 같은 경우 반드시 재정의가 필요하므로 final을 붙일 수 없다
// 변수에 붙으면 다른 값을 대입하지 말도록
	
	final int i;
	public FinalMethod(int i) {
		this.i = i;
	}
	
	void method() {
		
	}
	
	final void finalMethod() { // 재정의가 필요하지 않을 때 final
		
	}
	
	public static void main(String[] args) {
		
	}
}
