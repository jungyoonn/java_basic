package lesson12_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("b[a-z]*"); // 정규식
													  // 첫 글자가 b로 시작하고 다음 글자들이 전부 소문자 알파벳이어야 함
		Matcher m;
		
		m = pattern.matcher("bat");
		System.out.println("bat = " + m.matches());
		
		m = pattern.matcher("cat");
		System.out.println("cat = " + m.matches()); // 첫 글자를 b로 설정했기 때문에 false가 출력됨
		
		m = pattern.matcher("bed");
		System.out.println("bed = " + m.matches());
		
		"bat".matches("b[a-z]*"); // 결과가 boolean으로 나온다
	}
}
