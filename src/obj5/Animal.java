package obj5;

public abstract class Animal{
//継承元animalクラスにはcry,jumpメソッドを作成してる
//抽象メソッドを定義するにはクラスにabstaractをつける
	/**
	 * 泣く
	 */

//今回は抽象元で抽象クラスcryと具象クラスjumpを定義します
//抽象メソッドのcryは振る舞いが違うので抽象元で処理を記述する必要はない
//実際の振る舞いは継承先のクラスに記述します
//継承先は継承された抽象メソッドを必ず使わなければならない
	
	abstract public void cry();
	/**
	 * ジャンプする
	 */
//ジャンプは具象メソッドで定義
	public void jump() {
		System.out.println("30cm飛んだ!");
	}
}
