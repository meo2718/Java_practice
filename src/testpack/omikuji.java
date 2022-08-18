package testpack;
//おみくじを作る
//比較演算子  ==  >  <   >=  <=  !=
//大吉  中吉  小吉  凶  大凶
public class omikuji {
	public static void main(String[] args) {
		int omikuji = (int)(Math.random() * 10 + 1);
		//1~10をランダムで出力
		System.out.println(omikuji);
		if (omikuji == 1) {
			System.out.println("大吉");
		} else if (omikuji == 2) {
			System.out.println("中吉");
		} else if (omikuji <= 4) {
			System.out.println("小吉"); //3,4
		} else if (omikuji <= 7) {
			System.out.println("凶"); //5,6,7
		} else {
			System.out.println("大凶"); // 8,9,10
		}
	}
}

//omikuji変数が1と等しかったら大吉、2と等しかったら中吉
//4以下、小吉、7以下、凶、それ以外、凶