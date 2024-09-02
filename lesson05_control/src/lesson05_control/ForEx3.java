package lesson05_control;

public class ForEx3 {
	public static void main(String[] args) {
		System.out.printf("%5s %5s %5s %5s %5s %5s %5s\n", 
				"i", "2*i", "2*i+1", "i*i", "10-i", "i%3", "i/3");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%5d %5d %5d %5d %5d %5d %5d\n", 
					i, 2*i, 2*i+1, i*i, 10-i, i%3, i/3);
		}
	}
}
