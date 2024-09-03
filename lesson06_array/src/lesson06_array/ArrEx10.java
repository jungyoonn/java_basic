package lesson06_array;

import java.util.Arrays;

public class ArrEx10 {
	public static void main(String[] args) {
		int[] arr = {5,10,20,7,3};
		//최대값
		
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {        // 최대값
				max = arr[i];
			} else if(min > arr[i]) { // 최소값
				min = arr[i];
			}
			sum += arr[i];           // 합계
		}
		avg = sum / (int)arr.length; // 평균
		
		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);
		System.out.println("합계는 " + sum);
		System.out.println("평균은 " + avg);
		
		// 정렬
//		for(int i = 0; i < arr.length-1; i++) { 
//			if(arr[i] > arr[i+1]) {
//				int tmp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = tmp;
//			} else if(arr[i] < arr[i-1] && i > 0) {
//				int tmp = arr[i];
//				arr[i] = arr[i-1];
//				arr[i-1] = tmp;
//			} else continue;
//		}
		
		//System.out.println(Arrays.toString(arr));
	}
}

