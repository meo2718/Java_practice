package obj4;

public class Human extends Animal {
//animalクラスを継承したhumanクラスに切り替わり
//cryメソッドはanimalクラスにあり、
//継承先と振る舞いが違うので継承先でオーバーライドする
	/**
	 *ジャンプする 
	 */
//このメソッドをたどるとanimalクラスを継承してます
//humanクラスには継承先として人間だけがもってる振る舞い
//があるのでimaginationメソッドを実行します
	public void imagination() {
		System.out.println("想像を働かせた!");
	}
	/**
	 * 泣く
	 */

//このメソッドをたどるとanimalクラスを継承してます
//animalクラスを見に行くとcryメソッドと同じメソッド
//があるのでhumanのcryメソッドは
//animalクラスのcryメソッドをオーバーライドしてます
	@Override
	public void cry() {
		System.out.println("えーん");
	}

}
