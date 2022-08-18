package testpack;

public class calc {
	public static void main(String[] args) {
		int number = 100 - 20 * 3;
		System.out.println(number);
		int apple_price = 350; //りんごの単価
		int apple_num = (int)(Math.random() * 10 + 1); //りんごを買う個数
		System.out.println("りんごの単価" + apple_price + "円");
		System.out.println("りんごの個数" + apple_num + "個");
		
		int total = apple_price * apple_num;
		System.out.println("合計金額" + total + "円");
	}
}