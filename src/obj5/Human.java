package obj5;

public class Human extends Animal {
//humanクラスはanimalクラスを継承してる
//cryメソッドはanimalクラスにあり、
//振る舞いが違うので継承先でオーバーライドする
	/**
	 *ジャンプする 
	 */
//humanクラスにはanimalに持ってないものがあるので作成
	public void imagination() {
		System.out.println("想像を働かせた!");
	}
	/**
	 * 泣く
	 */
	@Override
//animalクラスを継承したhumanクラスに切り替わり
//animalクラスを見に行くとcryメソッドはabstract抽象メソッド
//なので必ずオーバーライドする必要があるので
//animalクラスの抽象メソッドであるcryメソッドをオーバーライドしてます
	public void cry() {
		System.out.println("えーん");
	}

}
