package marble;

public class GameService {
	int[] lands = new int[32];
	Player[] players = new Player[3];
	
	{
		int idx = 0;
		players[idx++] = new Player("길동이");
		players[idx++] = new Player("새똥이");
		players[idx++] = new Player("소똥이");
	}
	
	public void play() {
		for (int i = 0; ; i++) {
			int seq = i%players.length;
			Player p = players[seq];
			System.out.println();
			System.out.println("===============================================");
			CommomUtils.nextLine(p.name + "의 차례입니다. 엔터를 누르면 주사위를 굴립니다."); // 턴을 번갈아 가면서 순환
			
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
			System.out.println("======= 주사위의 눈은 " + dice1 + ", " + dice2 + "입니다");
			
			int tmpPos = p.idx + dice1 + dice2;
			
			
			if(tmpPos > 31) {
				System.out.println("시작점 통과! 보너스 지급 [30만 원]");
				p.money += 300_000;
			}
			p.idx = tmpPos % 32;
			System.out.println(p);
		}
	}
}
