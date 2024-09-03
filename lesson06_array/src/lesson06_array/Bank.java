package lesson06_array;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		//입금, 출금, 잔고, 종료
		Scanner scanner = new Scanner(System.in);
		
		int balance = 0;
		while(true) {
			System.out.println("===================================");
			System.out.println("= 1. 입금 2. 출금 3. 잔고 4. 종료 =");
			System.out.println("===================================");
			
			int input = Integer.parseInt(scanner.nextLine());
			switch (input) {
			case 1: {
				System.out.println("입금할 금액 입력 > ");
				int in = Integer.parseInt(scanner.nextLine());
				balance += in;
				break;
				}
			case 2: {
				System.out.println("출금");
				System.out.println("출금할 금액 입력 > ");
				int out = Integer.parseInt(scanner.nextLine());
				if(out <= balance) {
					balance -= out;
				} else {
					System.out.println("잔고가 부족합니다 " + (out - balance) + "원 부족");
				}
				break;
				}
			case 3: {
				System.out.println("잔고 > " + balance);
				break;
				}
			case 4: {
				System.out.println("종료. 안녕히 가세요");
				return;
				}
			}
		}
	}
}
