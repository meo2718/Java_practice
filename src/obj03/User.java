package obj03;

public class User {
	String userName;
	int amount;
	String ranking;
	
//引数なしコンストラクタ
	public User() {
		
    }
	
	/**
	 * Userの入力用メソッド
	 * @param inputName inputする名前情報
	 * @param inputAmount inputする売上情報　
	 */
//引数ありコンストラクタ
//ステップインすると
//id=〇〇で管理されたuserオブジェクト視点にうつり
//main側の引数からパラメータに値をひっぱってきてる
//ステップオーバーすることによりid=〇〇で管理されたuser
//オブジェクトへ値がはいり、自身にamount,
//userNameが入った状態で生成される
	public User (String inputName, int inputAmount) {
//this自分自身のuserNameへinputNameを代入
		this.userName = inputName;
		this.amount = inputAmount;
	}
	
//	int input(String inputName, int inputAmount) {					
//		userName = inputName;
//		amount = inputAmount;
//public voidではなくint、stringでやるとreturnが必要
//voidのところは戻り値をいれる
//		return 0; 
//			}
	
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