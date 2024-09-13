package marble;

import java.util.Arrays;

import marble.area.City;
import marble.area.Local;
import marble.area.NonSaleLocal;
import marble.area.Resort;

public class GameService {
	Local[] locals = new Local[32];
	Player[] players = new Player[3];
	
	{
		int idx = 0;
		players[idx++] = new Player("길동이");
		players[idx++] = new Player("새똥이");
		players[idx++] = new Player("소똥이");
	}
	
	public void printMap() {
		String[] icons = {"★", "○", "●"};
		String[] playerPos = new String[32];
		Arrays.fill(playerPos, "");
		for(int i = 0; i < players.length; i++) {
			playerPos[players[i].idx] += icons[i];
		}
		
		for(int i = 0; i < locals.length; i++) {
			System.out.printf("%-10s", locals[i] + playerPos[i]);
			if(i % 8 == 7) {
				System.out.println();
			}
		}
	}
	
	public void play() {
		for (int i = 0; ; i++) {
			printMap();
			int seq = i%players.length;
			Player p = players[seq];
			
			System.out.println();
			System.out.println("===============================================");
			CommomUtils.nextLine(p.name + "의 차례입니다. 엔터를 누르면 주사위를 굴립니다."); // 턴을 번갈아 가면서 순환
			
			for(int j = 0; j < 3; j++) {
				int dice1 = (int)(Math.random() * 6) + 1;
				int dice2 = (int)(Math.random() * 6) + 1;
				
				System.out.println("======= 주사위의 눈은 " + dice1 + ", " + dice2 + "입니다");
				int tmpPos = p.idx + dice1 + dice2;

				// 3연속 더블이면 무인도
				if(j == 2) {
					System.out.println("세 번 연속 더블입니다 무인도로 이동합니다");
					p.idx = 8;
					break;
				}
				
				if(tmpPos > 31) {
					System.out.println("시작점 통과! 보너스 지급 [30만 원]");
					p.money += 300_000;
				}
				p.idx = tmpPos % 32;
				
				// 더블이 아니면 다음 턴으로
				if(dice1 != dice2) {
					break;
				}
				
				CommomUtils.nextLine("더블입니다! 주사위를 한 번 더 굴립니다.");
			}
			System.out.println(p.name + " 님이 " + locals[p.idx] + "(으)로 떠납니다!");
			System.out.println();
		}
	}
	
	public void init() {
		String names = "시작 > 방콕 > 동전던지기 > 베이징 > 포츈카드 > 독도 > 두바이 > 카이로 > 무인도 > 발리 > 도쿄 > 시드니 > 포츈카드 > 퀘백 > 하와이 > 상파울루 > 올림픽 > 프라하 > 푸켓 > 베를린 > 포츈카드 > 모스크바 > 제네바 > 로마 > 세계여행 > 타히티 > 런던 > 파리 > 포츈카드 > 뉴욕 > 국세청 > 서울";
		String[] ns = names.split(" > ");
		int cnt = 0;
		locals[cnt] = new NonSaleLocal(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(1, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(2, ns[cnt], cnt++);
		locals[cnt] = new Resort(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		
		locals[cnt] = new NonSaleLocal(3, ns[cnt], cnt++);
		locals[cnt] = new Resort(1, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(4, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new Resort(2, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		
		locals[cnt] = new NonSaleLocal(4, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new Resort(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(2, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		
		locals[cnt] = new NonSaleLocal(5, ns[cnt], cnt++);
		locals[cnt] = new Resort(1, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(2, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(6, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		
	}
}
