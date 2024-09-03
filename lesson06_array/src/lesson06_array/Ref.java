package lesson06_array;

public class Ref {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int[] arr2 = arr;
		arr[0] = 10;
		System.out.println(arr2[0]);
	}
}
