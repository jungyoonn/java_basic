package mart;

import java.util.Arrays;

public class Buyer {
	private int money;
	private Product[] cart = new Product[3];
	private int cnt;
	
	public Buyer(int money) {
		this.money = money;
	}
	
	public void buy(Product p) {
		if(cnt == cart.length) {
			cart = Arrays.copyOf(cart, cnt*2);
		}
		cart[cnt++] = p;
	}
	
	public void purchase() {
		int sum = 0;
		String names = "";
		
		for(int i = 0; i < cnt; i++) {
			sum += cart[i].getPrice();
			names += cart[i].getName() + " ";
		}
		
		int remain = money - sum;
		if(remain < 0) {
			System.out.println("결제 실패 : 잔액을 추가하거나 상품을 줄이세요");
			System.out.println();
			return;
		}
		
		money = remain;
		System.out.print("구매한 상품은 ");
		System.out.println(names + ", 지불할 가격은 " + sum + "원");
		System.out.println("잔액은 " + money + "입니다");
		System.out.println();
		
		cnt = 0;
	}
}
