package marble.area;

public class Resort extends SaleLocal{
	public static final int BUILD_COST = 10; // 상수(절대 변하지 않는 값)
	public static final int FEE1 = 8;
	public static final int FEE2 = 16;
	public static final int FEE3 = 32;
	public static final int SALE_PRICE = 5;
	
	public Resort(int colorIdx, String name, int idx) {
		super(colorIdx, name, idx);
	}
}
