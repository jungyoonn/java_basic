package lesson06_array;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		//삽입정렬
		int[] arr = new int[7];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50) + 1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("========================");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println(Arrays.toString(arr));		
		}
		
		System.out.println("========================");
		System.out.println(Arrays.toString(arr));		
	}
}
