package card;

public class CardMain {
	public static void main(String[] args) {
		Deck deck = new Deck();

		deck.shuffle();
		System.out.println("첫 번째 플레이어의 손덱");
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println("두 번째 플레이어의 손덱");
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println(deck.pick());
		System.out.println("덱의 카드");
		deck.print();
	}
}
