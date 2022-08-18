package obj4;

public class Mainexe {
//Mainクラスはanimal,cat,humanの３つのクラスがあり
//そのうちanimalが継承元であり継承先としてcat,humanクラスを作成してます
	public static void main(String[] args) {
//・animaruクラスをnewしてアニマルObjを作成	
//ステップオーバーするとanimalクラスにanimalオブジェクトができる
		Animal animal = new Animal();
//・animaruクラスを継承した、猫クラスをnewした、猫Obj		
		Cat cat = new Cat();
//・animaruクラスを継承した、人間クラスをnewした、人間Obj	
		Human human = new Human();
//catクラスのcryメソッドを実行したいのでステップイン		
		cat.cry();
		human.cry();
		animal.cry();
		
		cat.jump();
//humanにはjumpは実装されてないが継承元のanimalで実装されてる
		human.jump();
//このメソッドは継承元なのでanimalクラスのjumpメソッドが実行されます
		animal.jump();
		
		human.imagination();
	}
}
