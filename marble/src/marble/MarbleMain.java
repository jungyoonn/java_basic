package marble;

public class MarbleMain {
	public static void main(String[] args) {
		System.out.println("어서오세요 모두의 마블입니다");
		
		GameService service = new GameService();
		service.play();
	}
}
