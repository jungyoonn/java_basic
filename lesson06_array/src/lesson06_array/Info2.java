package lesson06_array;

import java.util.Arrays;

public class Info2 {
	public static void main(String[] args) {
		int[] arr = {10, 5, 3, 8, 4};
		arr = new int[10]; // 초기화, 덮어쓰기
		// arr = {1, 2, 3}; new int[]를 반드시 앞에 써 줘야 함
		arr = new int[] {1,2,43};
		// arr.length = 3
		
		char[] cArr = {'A', 'B', '가', '나'};
		String[] strArr = {"가나", "다라"};
		System.out.println(arr); // 출력이 이상함
		System.out.println(cArr); // 출력 가독성이 떨어짐
		System.out.println(strArr); // 출력이 이상함
		
		//배열 내부의 값을 간편하게 확인하는 함수
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(cArr));
		System.out.println(Arrays.toString(strArr));
	}
}
