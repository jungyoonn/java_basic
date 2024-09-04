package lesson06_array;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		//버블정렬
		int[] arr = new int[7];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
