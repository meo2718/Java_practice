package obj03;
//オラクル社が用意しているAPIをインポート
import java.util.ArrayList;
public class Mainexe {
	/**
	 * 今回はUserのリストを作って回す
	 * ①コンストラクタ(newをするタイミングで処理を行う)
	 * ②Userのリストを回す→①②ができたらメインクラスとuserクラスの役割がわかれる
	 * ③アクセス修飾子(private,public)とBean,カプセル化を理解する
	 * @param args
	 */
	public static void main(String[] args) {
//コンストラクタ
//オブジェクトが生成されてから実行されるメソッド
//newされてから初めて実行されるメソッド
//今まではnewしてからinputしてた値をnewしたときに引数をいれる
//インスタンス化する段階でinputName,inputAmountを入れることができる
//mainクラスはuserクラスに対してnewをおねがいして必要な値として	
		User user1 = new User("meo1", 5000);		
		User user2 = new User("meo2", 2);
		User user3 = new User("meo3", 65);
		
		//user1.input("meo1", 5000);
		//user2.input("meo2", 2);
		//user3.input("meo3", 65);
		
//MainクラスはArrayListクラスにnewをしたいので
//ステップインするとArrayListクラスのなかにはいります
//id=〇〇という管理番号でArrayListオブジェクトができる
//<E>は型引数でクラスがはいっておりArrayListを様々な型
//(int,string)を含めたリストとして表現できます
//このmainクラスではuserListをUser型の配列として
//扱うと決めています
//ステップオーバーして戻るとuserListの中にid=〇〇の
//ArrayListオブジェクトのアドレスがはいっている
		
		ArrayList<User> userList = new ArrayList<>();
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

		//user1.rankJudge();
		//user2.rankJudge();
		//user3.rankJudge();
	
		//user1.output();
		//user2.output();
		//user3.output();
	}
}
