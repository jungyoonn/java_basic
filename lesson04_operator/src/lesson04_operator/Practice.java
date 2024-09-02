package lesson04_operator;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		// 02
		int var = 7 - 1 * 20 / 5;
		System.out.println(var);
		
		// 03
		int colorPen = 5 * 12;
		int studentCount = 27;
		
		int divColorPen = (int)(colorPen / (double)studentCount);
		System.out.println("학생 당 나눠가지는 색연필 수 : " + divColorPen);
		
		int remainColorPen = colorPen % studentCount;
		System.out.println("똑같이 나눠가지고 남은 색연필 수 : " + remainColorPen);
		
		// 04
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		System.out.print("키를 입력하세요 : ");
		int height = scanner.nextInt();
		
		//boolean parent = isParent.equals("네") ? true : false;
		
		boolean parent = false;
		boolean hearchDease = true;
		boolean result1 = age >= 6 && height >= 120 || height >= 120 && parent && !hearchDease;
		result1 = height >= 120 && (age >=6 || parent) && !hearchDease;
		//System.out.print("심장 질환이 있습니까? : ");
		//String isDease = scanner.nextLine();
		//boolean hearchDease = isDease.equals(isDease) ? true : false;
		//System.out.println(hearchDease);
//		System.out.println(age > 5 ? "탑승 가능" : height >= 120 && parent ? "탑승 가능" : "탑승 불가");
//		System.out.println(height < 120 ? "120cm 이상만 탑승할 수 있습니다" : "탑승 가능");
//		System.out.println(hearchDease ? "탑승 불가" : "탑승 가능");
		System.out.println(result1);
		
		// 05
		int year = 2600;
		
		boolean leapYear = year % 4 != 0 ? false : year % 100 != 0 || year % 400 == 0 ? true : false;
		System.out.println(leapYear);
		
		// 06 
		int price = 187000;
		int oman = (int)(price / 50000d);
		int ilman = (int)((price -= oman*50000) / 10000d);
		int ochun = (int)((price -= ilman*10000) / 5000d);
		int ilchun = (int)((price -= ochun*5000) / 1000d);
		
		System.out.println("5만원권 : " + oman + "장");
		System.out.println("1만원권 : " + ilman + "장");
		System.out.println("5천원권 : " + ochun + "장");
		System.out.println("1천원권 : " + ilchun + "장");
		
		// 07
		int number = 123;
		int result = number - number % 100; 
		System.out.println(result);
	}
}
