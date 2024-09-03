package lesson05_control;

public class Gugu2 {
	public static void main(String[] args) {
		point:
		for(int i = 2; i <= 9; i++) {
			System.out.println("[" + i + "단]");
			for (int j = 1; j <=9; j++) {
				if(j == 5) {
					break point;
				}
				System.out.println(i + " * " + j +" = " + i*j);
			}
		}
	}
}
