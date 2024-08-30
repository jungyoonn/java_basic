package lesson03_variable;

public class ScopeEx {
	int no;
	public static void main(String[] args) {
		String name;
		
		if(true) {
			name = "홍길동";
			String email = "hong@test.com";
		}
		email = "hong@test.com";
	}
}
