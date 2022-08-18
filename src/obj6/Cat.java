package obj6;
//catクラスはアニマルクラスをインプリメントし
//インプリメント先としてcry,jumpメソッドを必ず作成し
//1m飛ぶとにゃーを出力
class Cat implements Animal {
	/**
	 * ジャンプ
	 */
	public void jump() {
		System.out.println("1m飛んだ");
	}
	/**
	 * 泣く
	 */
	public void cry() {
		System.out.println("にゃー");
	}

}
