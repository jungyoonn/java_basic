package marble.area;

public class City extends SaleLocal {
	public int building; // 땅, 빌라, 빌딩, 호텔
	public int[] buildCost = {12,4,14,24,24}; // 건설 비용
	public int[] fee = {3,7,17,39,75}; // 통행료

	
	
//	public City(int colorIdx, String name, int idx, int[] buildCost, int[] fee) {
//		super(colorIdx, name, idx);
//		this.buildCost = buildCost;
//		this.fee = fee;
//	}
	
	public City(int colorIdx, String name, int idx) {
		super(colorIdx, name, idx);
	}



	// 통행료 계산
	public int getFee() {
		int cnt = 0;
		int feeResult = fee[cnt++];
		
		int i = building;
		while(i != 0) {
			if(i % 2 == 1) {
				feeResult += fee[cnt];
			}
			cnt++;
			i /= 2;
		}
		System.out.println(feeResult);
		
		return feeResult;
	}
}
