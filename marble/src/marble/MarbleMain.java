package marble;

public class MarbleMain {
	public static void main(String[] args) {
		System.out.println("어서오세요 모두의 마블입니다");
		System.out.println();
		
		GameService service = new GameService();
		service.init();
		service.play();
		
		// 구매 가능 : 관광지, 일반
		// 구배 불가 : 시작, 보너스게임, 포춘카드, 무인도, 올림픽, 세계여행, 국세청
		
	}
}
