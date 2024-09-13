package marble;

public class MarbleMain {
	public static void main(String[] args) {
		String names = "시작 > 방콕 > 동전던지기 > 베이징 > 포츈카드 > 독도 > 두바이 > 카이로 > 무인도 > 발리 > 도쿄 > 시드니 > 포츈카드 > 퀘백 > 하와이 > 상파울루 > 올림픽 > 프라하 > 푸켓 > 베를린 > 포츈카드 > 모스크바 > 제네바 > 로마 > 세계여행 > 타히티 > 런던 > 파리 > 포츈카드 > 뉴욕 > 국세청 > 서울";
		String[] ns = names.split(" > ");
//		System.out.println(Arrays.toString(ns)); 확인용
		
		System.out.println("어서오세요 모두의 마블입니다");
		System.out.println();
		
		GameService service = new GameService();
		service.init();
		service.play();
		
		// 구매 가능 : 관광지, 일반
		// 구배 불가 : 시작, 보너스게임, 포춘카드, 무인도, 올림픽, 세계여행, 국세청
		
	}
}
