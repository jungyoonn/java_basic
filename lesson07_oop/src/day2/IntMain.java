package day2;

import java.util.Arrays;

public class IntMain {
	int nnum = 10;
	int[] arr = new int[10];
	static int[] arr2 = new int[10];
	
	public IntMain() {
		System.out.println("생성자");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	
	{
		System.out.println("초기화 블럭");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr)); // 객체를 생성할 때마다 새로 생김
	}
	
	static {
		System.out.println("클래스 초기화 블럭");
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr2)); // 객체를 계속 생성해도 값은 쭉 고정됨
	}
	public static void main(String[] args) {
		System.out.println("메인 시작");
		IntMain intMain = new IntMain();
		IntMain intMain2 = new IntMain();
		new IntMain();
		System.out.println("메인 끝");
	}
}
