package day2;

public class ToString {
	public String toString() { // 재정의
		return "재정의된 내용";
	}
	public void print() {
		System.out.println(super.toString());
		System.out.println(this.toString()); // this는 인스턴스 내에서만 가능
											 // 클래스에서는 사용할 수 없다
	}
	
	public static void main(String[] args) {
		Object object = 10; // 모든 타입의 데이터 전부 가능
		object.toString(); // 전부 문자열로 표현해 줌

		Object ob = new Object();
		System.out.println(ob);
		System.out.println(ob.toString());
	
		ToString ts = new ToString();
		System.out.println(ts);
		System.out.println(ts.toString());
		
		// toString() : 객체의 내용을 문자열로 확인할 때 자동 호출되는 메서드
		
		ts.print();
	}
}
