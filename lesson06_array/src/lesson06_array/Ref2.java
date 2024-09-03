package lesson06_array;

public class Ref2 {
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "ABCD";
		String str3 = new String("ABCD");
		
		System.out.println(str1.charAt(2));
		System.out.println(str2.charAt(2));
		System.out.println(str3.charAt(2));
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);		
		System.out.println(str1.equals(str3));		
	}
}
