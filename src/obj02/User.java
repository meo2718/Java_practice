package obj02;
//2:userクラスから新しいオブジェクトがうまれ
//そのオブジェクトは@~アドレスにいることがわかり
//id=〇〇で管理されてます

//3:ステップオーバーするともとに戻り、
public class User {
	String userName;
	int amount;
	String ranking;
	// inputメソッドを作って、引数:名前、売上額
	/**
	 * Userの入力用メソッド
	 * @param inputName inputする名前情報
	 * @param inputAmount inputする売上情報　
	 */
//6:ステップインすると
//id=〇〇で管理されたuserオブジェクトの視点にきりかわります
//Mainクラス側からmeo1,5000という引数をひっぱってきて
//inputName,inputAmountというパラメータにセットされる
	int input(String inputName, int inputAmount) {					
		userName = inputName;
		amount = inputAmount;
//public voidではなくint、stringでやるとreturnが必要
//voidのところは戻り値をいれる
		return 0; 
		
//7:ステップオーバーするとid=〇〇のuserオブジェクトに
//たいしてinputメソッドが実行され
//変数のid〇〇の中に引数で定義した値がはいる
	}
/**
* rankJudgeメソッド 
* Userの売上額から、顧客ランク設定を行う
* 
*/
//9:ステップインするとid=〇〇で管理された
//userオブジェクトの視点にきりかわり
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

//thisをみると
//id=〇〇で管理されたuserオブジェクトにはいってます


//10:ステップオーバーするとuser1のrankingが判定される
//id=〇〇で管理されたuserオブジェクトに対してrankJudge
//メソッドが実行されrankJudgeメソッドの条件分けで
//user1は5000なのでお得意様と判定される

	}
/**
* outputメソッド 
* User情報出力用メソッド
* 
*/
//12:ステップインするとid=〇〇で管理された
//userオブジェクトの視点にきりかわり
	void output() {
		System.out.println("名前:" + userName);
		System.out.println("売上:" + amount);
		System.out.println("顧客ランク:" + ranking);
		
	}
	
//thisをみると
//id=〇〇で管理されたuserオブジェクトにはいってます


//13:ステップオーバーするとid=〇〇で管理された
//userオブジェクトに対しイェoutputメソッドが
//順に実行され、名前売上顧客ランクの順で表示される
}