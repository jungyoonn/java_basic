package lesson06_array;

import java.util.Scanner;

public class Exer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 01 주사위를 굴려 이동할 칸의 수 구하기
		int dice1 = 0, dice2 = 0;
		int result = 0;
		System.out.println("굴린 주사위는 ");
		
		do {
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;
			System.out.println(dice1 + ", " + dice2);
			result += dice1 + dice2;
			//System.out.printf("더블! 보너스 굴리기 > %d, %d\n", dice1, dice2);
		} while(dice1 == dice2);
		
		System.out.println("이동할 거리는 " + result + "칸");
		System.out.println();
		
		// 02 입력받은 두 수 사이의 합계
		System.out.print("두 수를 입력하세요 > ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int sum = 0;
		
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println("합계는 " + sum);
		System.out.println("=======================");
		System.out.println();
		
		// 03 입력받은 두 수의 최대공약수 
		System.out.print("두 수를 입력하세요 > ");
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int min = 0;
		
		if(num3 < num4) {
			min = num3;
		} else {
			min = num4;
		}
		
		for(int i = min; i > 0; i--) {
			if(num3 % i == 0 && num4 % i == 0) {
				System.out.println("두 수의 최대공약수는 " + i);
				break;
			}
		}
		System.out.println();
		
		// 04 소수 여부 확인
		int num5 = (int)(Math.random()*100) + 1;
		boolean isPrime = true;
		
		for(int i = 2; i <= 100; i++) {
			if(num5 % i == 0 && num5 != i) {
				System.out.println(num5 + " : 소수가 아닙니다");
				isPrime = false;
				break;
			} 
		}
		if(isPrime) {
			System.out.println(num5 + " : 소수입니다");
		}
		System.out.println();
		
		// 05 회문수
		int num6 =  123321;
		int tmp = num6;
		int palindromic = 0;
		
		while(tmp != 0) {
			palindromic = palindromic * 10 + tmp % 10;
			tmp /= 10;
			System.out.println("palindromic = " + palindromic + ", tmp = " + tmp);
		}
		System.out.println();
		
		if(palindromic == num6) {
			System.out.println(num6 + " : 회문수입니다");
		} else {
			System.out.println("회문수가 아닙니다");
		}
	}
}
