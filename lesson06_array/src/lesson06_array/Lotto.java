package lesson06_array;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		int idx = 0;
		while(true) {
			int number = (int)(Math.random()*45) + 1;
			boolean insert = true;
			for(int i = 0; i <= idx; i++) { // 중복 검사
				if(lotto[i] == number) {
					insert = false;
					break;
				}
			}
			if(insert == true) {
				lotto[idx] = number;
				idx++;
			}
			if(idx ==  6) {
				break;
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
