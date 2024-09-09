package day2;

public class SingletonTest {
	public static void main(String[] args) {
		// Singleton singleton =  new Singleton(); 은 불가능
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		//싱글톤 : private에서 이미 한 번 생성된 객체만을 쓰겠다
		// 한 개의 객체를 계속 재사용!!
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
