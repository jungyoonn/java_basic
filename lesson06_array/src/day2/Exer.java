package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//지폐, 동전 세기
		int money = 123456;
		int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] counts = new int[10];
		
		System.out.println(money + "원은");
		for(int i = 0; i < units.length; i++) {
			counts[i] = money / units[i];
			money = money - units[i]*counts[i]; 
			System.out.print(units[i] + "원이 " + counts[i] + "개, ");
		}
		System.out.println();
		System.out.println(Arrays.toString(counts));
		System.out.println();
		
		// 사람 이름을 입력받기
		// 입력 글자 중 q를 입력하면 루프 종료
		// 사람 이름을 문자열 배열로 만들어서 (배열의 확장)
		// 프로그램 종료 직전 확인
		String[] names = new String[2];
		String[] printNames = {}; 
		int cnt = 0;
		
//		while(true) {
//			System.out.print("이름 입력 > ");
//			String inputName = scan.nextLine();
//			if(inputName .equals("q")) {
//				System.out.println("입력을 종료합니다");
//				break;
//			}
//			names[cnt] = inputName;
//			cnt++;
//			
//			if(cnt > names.length) {
//				names = new String[cnt * 2];
//				String[] tmp = new String[cnt];
//				printNames = names;
//				//System.arraycopy(names, 0, printNames, 0, cnt);
//				
//			}
//		}

//		String[] printName = new String[cnt];
//		System.arraycopy(names, 0, printName, 0, cnt);
//		System.out.println(Arrays.toString(printName));
//		

		while(true) {
			System.out.print("이름 입력 > ");
			String inputName = scan.nextLine();
			if(inputName.equals("q")) {
				System.out.println("입력을 종료합니다");
				break;
			}
			// 배열 늘리기
			if(names.length == cnt) {
				names = Arrays.copyOf(names, cnt*2);
			}
			names[cnt] = inputName;
			cnt++;
		}
		
		for(String name : names) {
			if(name == null) {
				break;
			}
			System.out.print(name + "  ");
		}
	}
}
