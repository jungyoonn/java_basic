package mart;

public class MartMain {
	public static void main(String[] args) {
		Product p = new Tv();
		System.out.println(p);
		
		Product p2 = new Computer();
		System.out.println(p2);
		
		Product p3 = new Aircon();
		System.out.println(p3);
		
		System.out.println();
		
		Buyer buyer = new Buyer(500);
		
		while(true) {
			int input = CommonUtils.nextInt("1. 상품 선택 2. 결제하기");
			switch(input) {
			case 1:
				int i2 = CommonUtils.nextInt("1. 테레비(100) 2. 컴퓨터(200) 3. 에어컨(300)");
				switch(i2) {
				case 1: 
					buyer.buy(new Tv());
					break;
				case 2: 
					buyer.buy(new Computer());
					break;
				case 3: 
					buyer.buy(new Aircon());
					break;
				}
				break;
			case 2: 
				buyer.purchase();
				break;
			default: 
				break;
			}
		}
	}
}
