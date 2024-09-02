package lesson05_control;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중에 하나를 선택하세요 > ");
		int my = scanner.nextInt();
		
		int com = 	(int)(Math.random() * 3) + 1;
		
		switch(my - com) {
			case -2: case 1:
				System.out.println("승");
				break;
			case 0:
				System.out.println("비김");
				break;
			default:
				System.out.println("패");
		}
		System.out.println("나의 패는 " + my + ", 컴퓨터의 패는 " + com);
	}
}
