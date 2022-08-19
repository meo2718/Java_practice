package obj7;

public class Mainexe {
//Mainクラスはanimal,cat,humanの３つのクラスがあり
//そのうちanimalが継承元であり継承先としてcat,humanクラスを作成してます
	public static void main(String[] args) {
//Animalクラスを継承したHumanクラスをnewして継承元のanimalクラスに
//アップキャストしてanimalHumanとして代入しanimalHumanOBJを生成
		Animal animalHuman = new Human();
//Animalクラスを継承したCatクラスをnewして継承元のanimalクラスに
//アップキャストしてanimalCatとして代入しanimalCatOBJを生成
		Animal animalCat = new Cat();
//humanをanimalにアップキャストしたanimalHumanはのcryメソッドを実行
//HumanクラスでAnimalクラスのcryメソッドをoverrideしてるのでhumanのcryが実行される
		animalHuman.cry();
		animalHuman.jump();
//animalHumanOBJはAnimalクラスにアップキャストしており
//HumanクラスではなくAnimalクラスとして振る舞っているので実行できない
		//animalHuman.imagination();
		//animalHumanをHumanにダウンキャストすると使える
		Human human = (Human)animalHuman;
		human.imagination();  
		animalCat.cry();
		animalCat.jump();
	}
}
