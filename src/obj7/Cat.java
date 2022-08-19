package obj7;

public class Cat extends Animal {
//animalクラスを継承したcatクラスに切り替わり
//cry,jumpメソッドはanimalクラスにあり、それぞれ
//継承先と振る舞いが違うので継承先でオーバーライドする
	/**
	 * 泣く
	 */
//このメソッドをたどるとanimalクラスを継承してます
//animalクラスを見に行くとcryメソッドと同じメソッド
//があるのでcatのcryメソッドは
//animalクラスのcryメソッドをオーバーライドしてます
	@Override
	public void cry() {
		System.out.println("にゃーん");
	}
	/**
	 * ジャンプ
	 */
//このメソッドをたどるとanimalクラスを継承してます
//animalクラスを見に行くとjumpメソッドと同じメソッド
//があるのでcatのjumpメソッドは
//animalクラスのjumpメソッドをオーバーライドしてます
	@Override
	public void jump() {
		System.out.println("1m飛んだ!");
	}
}
