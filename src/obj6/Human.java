package obj6;
//humanクラスはanimalクラスをインプリメントし
//インプリメント先としてcry,jumpメソッドを必ず作成し
//humanだけのメソッドとしてimagiantionを作成
//想像したと30cm飛んだ、えーんを出力
class Human implements Animal {
	/**
	 * 想像した
	 */
	public void imagination() {
		System.out.println("想像した");
	}
	/**
	 * ジャンプ
	 */
	public void jump() {
		System.out.println("30cm飛んだ");
	}
	/**
	 * 泣く
	 */
	public void cry() {
		System.out.println("えーん");
	}
	

}
