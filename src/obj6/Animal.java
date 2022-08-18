package obj6;
//アニマルインターフェイスにjump,cryメソッドを定義
//そしてanimalインターフェイスをインプリメントしたcat,humanクラスは
//animalインターフェイスが定義したメソッドを必ず使用します
//抽象と違ってインターフェイス側でメソッド中身は定義できない
/**
 * アニマルインターフェイス
 * @author owner
 *
 */
interface Animal{
	/**
	 * ジャンプする
	 */
	void jump();
	/**
	 * 泣く
	 */
	void cry();

}
