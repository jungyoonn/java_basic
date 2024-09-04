package day2;

import java.util.Arrays;

public class Info {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][1] = 5;
		
		System.out.println(matrix[0][1]);
		
		matrix = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
		
		// 일반 for
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// 향상 for
		for(int[] mat : matrix) {
			System.out.println(Arrays.toString(mat));
		}
		System.out.println();
		
		for(int[] arr1 : matrix) {
			for(int num : arr1) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][][] arrInt = new int[3][3][3];
		
		int value = 0;
		for(int i = 0; i <=2; i++) {
			for(int j = 0; j <= 2; j++) {
				for(int k = 0; k <= 2; k++) {
					arrInt[i][j][k] = value++;
				}
			}
		}
		
		for(int[][] num1 : arrInt) {
			for(int[] num2 : num1) {
				for(int num3 : num2) {
					System.out.printf("%4d", num3);
				}
				System.out.println();
			}
		}
	}
}
