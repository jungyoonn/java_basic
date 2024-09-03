package lesson06_array;

public class Info {
	public static void main(String[] args) {
		int num;
		int[] arr = new int[5];
		double[] arr2;
		String[] strings;
		
		// 기본값 0 false
		// String str = null;
		
		System.err.println(arr);
		int[] arr3;
		arr3 = new int[5];
		// 순번 index로 접근
		
		arr[0] = 10;
		arr[1] = 30;
		arr[3] = 50;
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		String[] strs = {"홍길동", "이순신", "김유신"};
		System.out.println(strs[1]);
		
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
