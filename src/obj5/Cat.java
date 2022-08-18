package obj5;

public class Cat extends Animal {
//catクラスはanimalクラスを継承してる
//cry,jumpメソッドはanimalクラスにあり、それぞれ
//振る舞いが違うので継承先でオーバーライドする
	/**
	 * 泣く
	 */

//animalクラスを継承したcatクラスに切り替わり
//animalクラスを見に行くとcryメソッドは抽象メソッド
//abstractなので必ずオーバーライドする必要があるので
//animalクラスの抽象メソッドであるcryメソッドをオーバーライドしてます
    @Override
	public void cry() {
		System.out.println("にゃーん");
	}
	/**
	 * ジャンプ
	 */
//animalクラスを継承したcatクラスに切り替わり
//抽象クラスであるanimalクラスを見に行くと
//具象クラスとしてjumpメソッドが実装されてるので
//animalクラスの具象メソッドであるjumpメソッドをオーバーライドしてます
	public void jump() {
		System.out.println("1m飛んだ!");
	}
}
