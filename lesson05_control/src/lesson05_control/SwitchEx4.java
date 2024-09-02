package lesson05_control;

public class SwitchEx4 {
	public static void main(String[] args) {
		String peopleNum = "980502-2123456";
		String birth = peopleNum.substring(0, 6);
		System.out.println(birth);
		char gender = peopleNum.charAt(7);
		System.out.println(gender);
		
		switch(gender) {
			case '1': case '3':
				System.out.println("남자");
				break;
			case '2': case '4':
				System.out.println("여자");
				break;
			default:
				System.out.println("잘못된 성별입니다");
		}
		
		int num1 = Integer.parseInt(peopleNum.substring(0, 1));
		int num2 = Integer.parseInt(peopleNum.substring(1, 2));
		int num3 = Integer.parseInt(peopleNum.substring(2, 3));
		int num4 = Integer.parseInt(peopleNum.substring(3, 4));
		int num5 = Integer.parseInt(peopleNum.substring(4, 5));
		int num6 = Integer.parseInt(peopleNum.substring(5, 6));
		int num7 = peopleNum.charAt(7) - '0';
		int num8 = peopleNum.charAt(8) - '0';
		int num9 = peopleNum.charAt(9) - '0';
		int num10 = peopleNum.charAt(10) - '0';
		int num11 = peopleNum.charAt(11) - '0';
		int num12 = peopleNum.charAt(12) - '0';
		int num13 = peopleNum.charAt(13) - '0';
		System.out.printf("%d%d%d%d%d%d-%d%d%d%d%d%d%d\n", num1, num2, num3, num4, num5,
				num6, num7, num8, num9, num10, num11, num12, num13);
		
		int sum = 
				num1 *2 +
				num2 *3 +
				num3 *4 +
				num4 *5 +
				num5 *6 +
				num6 *7 +
				num7 *8 +
				num8 *9 +
				num9 *2 +
				num10 *3 +
				num11 *4 +
				num12 *5;
		System.out.println(sum);
		int result = (11 - sum % 11) % 10;
		System.out.println(result == num13);
		
	}
}
