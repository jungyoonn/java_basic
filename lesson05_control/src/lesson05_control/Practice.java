package lesson05_control;

public class Practice {
	public static void main(String[] args) {
		// 01
		int sum = 0;
		
		for(int i = 0; i <= 100; i += 5) {
			sum += i;
		}
		System.out.println("5의 배수의 합계는 " + sum);
		
		// 02
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}
		System.out.println("짝수의 합계는 " + evenSum);
		System.out.println("홀수의 합계는 " + oddSum);
		
		// 03
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		
		// 04
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i + 1 == j) {
					break;
				} else System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 05
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < 5; j++) {
				if(i == j) {
					break;
				} else System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 06 
		for(int i = 0; i < 5; i ++) {
			for(int j = 5; j > i; j --) {
				System.out.printf(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		// 06 뒤집기
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j <= 5 - i; j++) {
				System.out.printf(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 06 응용
		for(int i = -2; i < 3; i++) {
			for(int j = -2; j < 3; j++) {
				if(i * j <= 1 && i * j >= -1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 07 
		int cnt = 0;
		int dice = 0;
		
		while(dice != 6) {
			dice = (int)(Math.random() * 6) + 1;
			System.out.println("나온 눈의 수는 (" + dice + ")");
			cnt++;
		}
		System.out.println("총 주사위 굴린 횟수는 : " + cnt + "회");
		
		// 04번 수정
		System.out.println();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 05번 수정
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}