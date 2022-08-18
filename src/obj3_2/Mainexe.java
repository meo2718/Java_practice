package obj3_2;
import java.util.ArrayList;
import java.util.List;
public class Mainexe {
	/**
	 * 今回はUserのリストを作って回す
	 * ①コンストラクタ(newをするタイミングで処理を行う)
	 * ②Userのリストを回す→①②ができたらメインクラスとuserクラスの役割がわかれる
	 * ③アクセス修飾子(private,public)とBean,カプセル化を理解する
	 * @param args
	 */
//<カプセル化説明>
//オブジェクト内のクラスやメソッド、フィールドに対して
//外部からアクセスできない仕組みのことで
//フィールドはprivateにしてそれぞれの
//フィールドに対してgetter,setterをつくることで
//カプセル化という概念を実現できます
//privateで定義されたフィールドとgetter,setterが存在する
//カプセル化の仕組みを実現した入れ物をbeanというオブジェクトで呼ぶ
//これをすることでUserクラスのオブジェクトは外部から勝手に改変できない
//またはオブジェクトがもつデータをオブジェクト内でチェックできるので
//オブジェクトの信頼性が高まります
	public static void main(String[] args) {
//コンストラクタ
//オブジェクトが生成newされてから実行されるメソッド

		User user1 = new User("meo1", 5000);		
		User user2 = new User("meo2", -1);
		User user3 = new User("meo3", 65);
//カプセル化の概念に乗っ取るとフィールドは
//直接書き換えれないのでこのように書いてはいけない
//後、フィールドにprivateをいれたので書き換えれない		
		//user1.amount = 1000000;
//↑をカプセル化の概念で実行するには
//userクラスにゲッターセッターを定義します
//setterを使いamountを変更する
		user1.setAmount(11);
		user2.setAmount(-11);
//getterを使うことでデバッグで
//user1に登録されてる値を変数にいれて確認することができる
//(たーくんが市役所から住民票の情報をみたいとき)
//今回はstring型のuserNameを確認したいので
//A(mainクラス)はB(user1の参照先であるid=〇〇のオブジェクト)に
//対してC(getUserName)という振る舞いをお願いします→ｽﾃｯﾌﾟｲﾝ
		String aaa  = user1.getUserName();
		
//MainクラスはArrayListクラスにnewをしたいので
//ステップインするとArrayListクラスのなかにはいります
//id=〇〇という管理番号でArrayListオブジェクトができる		
//このmainクラスではuserListをUser型の配列として
//扱うと決めています
//ステップオーバーして戻るとuserListの中にid=〇〇の
//ArrayListオブジェクトのアドレスがはいっている
		List<User> userList = new ArrayList<>();
//userListに入っているid=〇〇で管理されたArrayListオブジェクト
//に対してaddメソッドを実行するので
//ステップインするとid=〇〇で管理されたArrayListクラスの
//視点に切り替わります。
//main側の引数からパラメータに値をひっぱってきてる
//eには引数で定義したuser1のアドレスがはいっていることがわかる
//id=〇〇のarrayListオブジェクトに対してaddメソッドを実行する
//ステップオーバー×２していき
//thisをみると[0]がはいり
//user1の参照先であるid=〇〇のuserオブジェクト
//のアドレスがはいっていることがわかる
//もう一度ステップオーバーするとuserListに配列[0]がはいる
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
//Userランク設定+output
//2:追加したUserListをforで順番にまわすには
//User型のtaruserという変数に
//userListの配列[user1,user2,user3]から1つずつ
//要素をとりだして、変数tarUserへ代入し出力させます
		for(User tarUser : userList) {
//ステップオーバーすると、変数tarUserにuserListの[0]がはいり、
//id=〇〇で管理されたuserオブジェクトに対してrankjudgeメソッドが実行される
//ステップインするとそのオブジェクトの中にはいり、id=〇〇のuser
//オブジェクトのメソッドが実行されてることがわかる
			tarUser.rankJudge();
//もう1度ステップオーバーで値が出力される
			tarUser.output();
		}
	}
}
