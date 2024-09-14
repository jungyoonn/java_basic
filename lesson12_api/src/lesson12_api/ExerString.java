package lesson12_api;

import java.util.Arrays;

public class ExerString {
	public static void main(String[] args) {
		// url 분석, String class만 사용
		// 자르기
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%B2%84%EB%B8%94%EC%A0%95%EB%A0%AC";
		String tmpStr = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%B2%84%EB%B8%94%EC%A0%95%EB%A0%AC";
		
		System.out.println("자르려는 URL");
		System.out.println(str);
		System.out.println("================================================\n");
		
		// 1. 프로토콜 (https://)
		int sl = str.indexOf('/') + 1;
		String pro = str.substring(0, sl + 1);
		System.out.println("프로토콜 : " + pro);
		
		tmpStr = str.substring(sl + 1);
		
		// 2. 도메인 search.naver.com
		sl = tmpStr.indexOf('/');
		String dom = tmpStr.substring(0, sl);
		System.out.println("도메인 : " +dom);
		
		tmpStr = tmpStr.substring(sl + 1);
		
		// 3. file name (? 앞까지)
		sl = tmpStr.indexOf('?');
		String fn = tmpStr.substring(0, sl);
		System.out.println("파일 네임 : " + fn);
		
		tmpStr = tmpStr.substring(sl + 1);
		
		// 4. 쿼리 스트링 (&로 잘라서)
		System.out.println("쿼리 스트링 : " + tmpStr);
		
		// 4-1. 파라미터와 밸류 쌍으로 묶어서 분리
		String q1 = "";
		String[] qr = tmpStr.split("&");
//		System.out.println(Arrays.toString(tmpStr.split("&")));
		for(int i = 0; i < qr.length; i++) {
			System.out.print((i + 1) + "번째 쿼리 순서쌍 : ");
			System.out.print("[" + qr[i].substring(0, qr[i].indexOf("=")) + ", ");
			System.out.printf("%-2s\n", qr[i].substring(qr[i].indexOf("=") + 1) + "]");
		}
	}
}
