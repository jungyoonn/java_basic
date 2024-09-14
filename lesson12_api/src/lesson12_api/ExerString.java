package lesson12_api;

public class ExerString {
	public static void main(String[] args) {
		// 달력 출력
		// 이전달, 다음달, 이전해, 다음해, 특정 연월 입력 시 해당 연월 달력 출력
		
		// url 분석
		// String class만 사용
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%B2%84%EB%B8%94%EC%A0%95%EB%A0%AC";
		String tmpStr = "";
		// 자르기
		// 1. 프로토콜 (https://)
		// 2. 도메인 search.naver.com
		// 3. file name (? 앞까지)
		// 4. 쿼리 스트링 (&로 잘라서)
		// 4-1. 파라미터와 밸류 쌍으로 묶어서 분리
		
	}
}
