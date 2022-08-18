package obj02;

public class Mainexe {
	public static void main(String[] args) {
//1:userインスタンスの生成（新しいuserができる）
//new userを実行するのでステップインしてみていきます
		User user1 = new User();
//4:もう1回することでさっき生まれたオブジェクトの
//アドレスがuser1にセットされ
//変数user1に入ってるアドレスを通してid=〇〇の
//userオブジェクトを参照できるようになり、
//amount,ranking,userNameがはいった状態で変数user1が生成され
//インスタンス化される
		
		User user2 = new User();
		User user3 = new User();
//1~3は別々のuserでそれぞれがamount,ranking,userNameをもってる
		
//5:Mainクラスがuser1の参照先であるid=〇〇で管理され
//たuserオブジェクトに対してinputメソッドを実行する
//user1にはid=〇〇で管理されたuserオブジェクトのアドレスがはいってる
		user1.input("meo1", 5000);
		user2.input("meo2", 2);
		user3.input("meo3", 65);
//8:Mainクラスがuser1の参照先であるid=〇〇で管理され
//たuserオブジェクトに対してrankJudgeメソッドを実行する	
		user1.rankJudge();
		user2.rankJudge();
		user3.rankJudge();
//11:Mainクラスがuser1の参照先であるid=〇〇で管理され
//たuserオブジェクトに対してoutputメソッドを実行する		
		user1.output();
		user2.output();
		user3.output();
	}
}
