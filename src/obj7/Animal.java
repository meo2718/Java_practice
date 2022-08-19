package obj7;

public class Animal{
//継承元animalクラスにはcry,jumpメソッドを作成してる
	/**
	 * 泣く
	 */
//継承元のアニマルクラスの視点に切り替わり
//このメソッドは継承元なのでanimalクラスのcryメソッドが実行されます
	public void cry() {
		System.out.println("うおおおん");
	}
	/**
	 * ジャンプする
	 */
//継承元のアニマルクラスの視点に切り替わり
//humanにはjumpは実装されてないが継承元のanimalで実装されてるので
//Animalクラスのjumpメソッドが実行されます
	public void jump() {
		System.out.println("30cm飛んだ!");
	}

}
