package lesson05_control;

import java.util.Scanner;

public class WhileEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		int sum = 0;
		
		while(flag) {
			System.out.println("더할 숫자를 입력하세요 > ");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			sum += num;
			if(num == 0) {
				flag = false;
			}
		}
		System.out.println("합계 : " + sum);
		scanner.close();
	}
}
