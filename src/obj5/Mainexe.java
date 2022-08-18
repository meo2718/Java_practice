package obj5;

public class Mainexe {
//Mainクラスはanimal,cat,humanの３つのクラスがあり
//そのうちanimalが抽象元/継承元であり具象先/継承先として
//cat,humanクラスを作成してます
	public static void main(String[] args) {
//今回は抽象化してるのでanimalオブジェクトをnewすることはできない
//抽象クラスの継承先の(具象クラス)でしかnewできない。

		//Animal animal = new Animal();
//catとhumanクラスをnewしてanimalクラスを継承してインスタンス化されmainに存在させる
		Cat cat = new Cat();	
		Human human = new Human();
		
//catクラスのcryメソッドを実行
//これはabstract抽象メソッドなので、継承先で必ずオーバーライドする必要がある
		cat.cry();
//抽象メソッドなので、継承先で必ずオーバーライドする必要がある
		human.cry();
		//animal.cry();
//animalクラスの具象メソッドであるjumpメソッドをオーバーライド
		cat.jump();
//humanにはjumpが定義されてないので継承元の具象メソッド
//で実行されます
		human.jump();
		//animal.jump();
//imaginationはhumanにしかないメソッドなのでそのまま実行される
		human.imagination();
	}
}
