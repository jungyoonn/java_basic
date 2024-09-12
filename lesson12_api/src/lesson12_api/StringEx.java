package lesson12_api;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcdeabcde";
		System.out.println(str.charAt(3));
		System.out.println();
		
		System.out.println(str.equals(new String("abcdeabcde")));
		
		System.out.println(str.indexOf("b"));
		System.out.println(str.indexOf("b", 3)); // 3번 인덱스에서부터 찾기 시작
		
		// 끝에서부터 찾기 시작
		System.out.println(str.lastIndexOf("b", 3));
		System.out.println(str.lastIndexOf("b"));
		
		// 문자열 자르기
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		
		// 첫 번째로 만나는 "c" 문자열에서 마지막으로 만나는 "d" 문자열까지 자르기
		System.out.println(str.substring(str.indexOf("c"), str.lastIndexOf("d")));
		
		System.out.println(str.toUpperCase());
		
		String s = "     [안녕하세요]      ";
		// 공백 제거
		System.out.println(s.trim());
		System.out.println(s.trim().replaceAll(" ", ""));
		
		System.out.println(str.endsWith("de"));
		System.out.println(str.endsWith("cd"));
		
		System.out.println(str.indexOf("cd")); // c의 위치가 나온다 (없으면 -1)
		
		System.out.println(str.replaceFirst("a", "f")); // 첫 번째 a만 f로 바꿈
														// First를 안 붙이면 다 바뀐다
		
		System.out.println(Arrays.toString(str.split("")));
		System.out.println(Arrays.toString(str.split("b")));
		
		System.out.println("abc".compareTo("abc")); // 같으면 0, 다르면 차이 나는 갯수를 음수로 리턴
	}
}
