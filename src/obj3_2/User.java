package obj3_2;
// フィールドプロパティ
//userクラスは他から改変できなくさせる
public class User {
	private String userName;
	private int amount;
	private String ranking;
	//引数ありコンストラクタ
	//ステップインすると
	//id=〇〇で管理されたuserオブジェクト視点にうつり
	//main側の引数からパラメータに値をひっぱってきてる
	//ステップオーバーでコンストラクタが実行されます

	/**
	 * Userの入力用メソッド
	 * @param inputName inputする名前情報
	 * @param inputAmount inputする売上情報　
	 */	
	public User (String inputName, int inputAmount) {
//id=〇〇で管理されたuserオブジェクトのuserNameに
//inputNameがはいる
		this.userName = inputName;
//a(id=〇〇のuserオブジェクト)はｂ(自分自身)にたいしてｃ(chkAmount)のメソッドの実行をお願いしました
//必要な情報としてｄ(inputAmount)を渡しました	
		if (this.chkAmount(inputAmount)) {
			this.amount = inputAmount;	
		}else {
			this.amount = 0;
		}
	}
//chkAmountメソッドの定義
//コンストラクタとセッターで2つchkを書いているので
//重複を防ぐためにメソッド化する
	private Boolean chkAmount (int chkAmoumt) {
		if(chkAmoumt > 0) {
			return true;
		}else{
			return false;
		}
	}
//ステップインid=〇〇で管理されたuserオブジェクトの
//setAmountメソッドを実行
//setAmountの値が正しいかどうかチェックする
//オブジェクトがもつデータをオブジェクト内でチェックし信頼性を獲得できる
	public void setAmount(int inputAmount) {
		if (this.chkAmount(inputAmount)) {
			this.amount = inputAmount;	
		}
	}
	//フィールドに対してゲッターセッターを生成すると
	//通常外部から操作できないが外部からお願いでき、
	//自分自身のフィールドを操作できます
	//getter,setterは外部から値を書き換えたり
	//チェックしたりできるメソッド
	//自分自身のフィールドを書き換えるためset
	//値を取得するのがget

	//ステップインするとid=〇〇userオブジェクト
	//の視点に切り替わり、自分自身のuserNameを
	//戻り値でかえした結果
	//ステップオーバーすると=の右側はuserNameの
	//値になり、kakuninsitaiNameにセットされる
	//もう1度すると自分自身の定義にUserNameがはいる
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAmount() {
		return amount;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	//引数なしコンストラクタ
	public User() {

	}


	/**
	 * rankJudgeメソッド 
	 * Userの売上額から、顧客ランク設定を行う
	 * 
	 */
	void rankJudge() {
		if (amount >= 80) {
			ranking = "お得意様";
		} else if (amount >= 60){
			ranking = "常連様";
		} else if (amount >= 40) {
			ranking = "新規顧客";
		} else {
			ranking = "冷やかし客";
		}

	}
	/**
	 * outputメソッド 
	 * User情報出力用メソッド
	 * 
	 */
	void output() {
		System.out.println("名前:" + userName);
		System.out.println("売上:" + amount);
		System.out.println("顧客ランク:" + ranking);

	}
}