package paiza;
//配列を作成する
public class paiza4_2 {
	public static void main(String[] args) {
		String player_1 = "ナイト";
		String player_2 = "黒魔道士";
        
		System.out.println(player_1);
		System.out.println(player_2);
//配列を作るにはデータの種類を宣言、カギカッコつけて、配列の名前をかく
		String[] team = {"戦士","忍者",player_1};
		System.out.println(team[0]);
		System.out.println(team[1]);
		System.out.println(team[2]);
    }

}
