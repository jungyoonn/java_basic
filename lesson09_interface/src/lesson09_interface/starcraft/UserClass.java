package lesson09_interface.starcraft;

@UserAnno(value = "hey")
public class UserClass {
	@UserAnno("hi") // value인 경우에는 value를 생략 가능 (다른 건 생략할 수 x)
	void m() {
		
	}
	
	@UserAnno(value = "world", number = 10)
	@SuppressWarnings(value = "unused") // ("unused")로 표현 가능
	void m2 () {
		
	}
	
	@UserAnno // 밸류를 인터페이스에서 설정해 줬으므로 괄호 생략 가능
	int i;
}
