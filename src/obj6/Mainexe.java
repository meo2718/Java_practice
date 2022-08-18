package obj6;

public class Mainexe {
	public static void main(String[] args) {
//mainクラスはhuman,catクラスをnewしてhuman,cat,objを作成
		Human human = new Human();
		Cat cat = new Cat();
//そしてメソッドを実行させる↓
//catクラスのcryメソッドを実行
		cat.cry();
		human.cry();
		
		human.jump();
		cat.jump();
		human.imagination();
	}

}
