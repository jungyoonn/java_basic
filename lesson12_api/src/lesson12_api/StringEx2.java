package lesson12_api;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "a";
		str += "b";
		System.out.println(str);
		// "a" "b" "ab"가 생김
		
		
		String str2 = "1" + "2" + "3";
		System.out.println(str2);
		// "1" "2" "3" "12" "123" 생김
		// 배열이기 때문이다
		
		str = "";
		StringBuffer sb2 = new StringBuffer("abcd");
		sb2.append("e"); // 버퍼에 문자 붙이기
		System.out.println(sb2);
		
		long start = System.currentTimeMillis();
		for(int i = 0; i <100_000; i++) {
			str+= "0";
		}
		long end = System.currentTimeMillis();
		System.out.println(str.length() + " ::: " + (end - start) + "ms");
		
		// cache, hash, buffer => 성능 향상의 목적으로 사용
		//
		StringBuffer sb = new StringBuffer("");
		long startBuffer = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			sb.append("0");
		}
		long endBuffer = System.currentTimeMillis();
		System.out.println(sb.length() + " ::: " + (endBuffer - startBuffer) + "ms");
		
		// 스트링버퍼를 스트링으로
		str = sb.toString();
		sb = new StringBuffer(str);
		
		String s = "abcde";
		sb = new StringBuffer(s);
		sb.insert(3, "123"); // 3의 위치에 "123" 넣기
		sb.deleteCharAt(sb.indexOf("c")); // 특정 문자만 지우기
		System.out.println(sb);
		
		// StringBuffer : Thread safe
		// StringBuilder : Thread unsafe
		
		// ArrayList : Thread unsafe
		// Vector : Thread safe
		
		// unsafe가 더 빨라서 많이 씀
	}
}
