package testpack;
//スライムと戦っている。
//1から10のランダムな数値を出力、
//6未満：出力された数値だけダメージを与えたと表示。
//6以上：クリティカルヒットとして、100のダメージを与えた
public class critical {
	public static void main(String[] args) {
		int hit = (int)(Math.random() * 10 + 1);
		//System.out.println(hit);
		if(hit < 6) {
			System.out.println("meoは" + hit + "ダメージ与えた");
		} else {
			System.out.println("クリティカルヒット!meoは100ダメージ与えた");
		}
	}
}
