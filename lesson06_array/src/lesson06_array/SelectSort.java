package lesson06_array;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		// 선택정렬
		int[] arr = new int[7];
		int num = 0;
		
		// 내림차순
		for(int i = 0; i < arr.length; i++) { // 배열에 난수 넣기
			arr[i] = (int)(Math.random()*50) + 1;
		}
		System.out.println("=======내림차순 시작========");
		System.out.println(Arrays.toString(arr));
		System.out.println("============================");
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i; j++) { // 배열에서 가장 작은 값 찾기
				if(arr[j] < min) {
					min = arr[j];
					num = j;
				}
			}
			int tmp = arr[arr.length - i - 1]; // 값을 배열 오른쪽부터 정렬
			arr[arr.length - i - 1] = min;
			arr[num] = tmp;
			min = 51;
			
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("============================");
		System.out.println(Arrays.toString(arr));
		System.out.println("============================");
		
		// 오름차순
//		arr = new int[7];
//		num = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*50) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
//		int max = arr[0];
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length - i; j++) { // 배열에서 가장 큰 값 찾기
//				if(max < arr[j]) {
//					max = arr[j];
//					num = j;
//				}
//			}
//			int tmp = arr[arr.length - i - 1]; // 값을 배열 오른쪽부터 정렬
//			arr[arr.length - i - 1] = max;
//			arr[num] = tmp;
//			max = 0;
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println("============================");
		
		// 오름차순
		for(int i = 0; i < arr.length; i++) { // 배열에 난수 넣기
			arr[i] = (int)(Math.random()*50) + 1;
		}
		System.out.println("=======오름차순 시작========");
		System.out.println(Arrays.toString(arr));
		int min2 = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) { 
				if(arr[j] < min2) {
					min2 = arr[j];
					num = j;
				}
			}
			// System.out.println(min2 + ", " + num);
			int tmp = arr[i]; 
			arr[i] = min2;
			arr[num] = tmp;
			min2 = 51;
			
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("============================");
		
		System.out.println(Arrays.toString(arr));
	}
}
