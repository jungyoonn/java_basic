package card;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Card {
	// 숫자 기호, 모양
	private int num; // 234567890JQKA 0~12
	private int kind; // 0 clover, 1 heart, 2 dia, 3 spade
	private boolean jocker = true;
	
	public Card(int num, int kind) {
		this.num = num;
		this.kind = kind;
		jocker = false;
	}
	
	public String toString() {
		String nums = "234567890JQKA";
		String[] kinds = {"CLOVER", "HEART", "DIA", "SPADE"};
		return jocker ? "[JOCKER]" : "[" + kinds[kind] + ", " + nums.charAt(num) + "]";
	}
}
