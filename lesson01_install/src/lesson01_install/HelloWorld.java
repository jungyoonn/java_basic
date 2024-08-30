package lesson01_install;

public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("Hello, World!");
//		System.out.println("!");
//		System.out.println("한글 테스트");
		
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%2d *%2d = %2d   ",i, j, i*j);
			}
			System.out.println();
		}
	}
}
