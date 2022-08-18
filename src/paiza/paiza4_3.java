package paiza;
//配列の要素をいろいろな方法で取り出してみます。
//配列では、インデックスと呼ばれる番号を使って要素を取り出します。
//また、そのインデックスを変数で指定したり、計算して指定できます。
public class paiza4_3 {
	public static void main(String[] args) {
		int num = 0;
        //String[] team = {"戦士", "忍者"};
        String[] team;//配列の名前を宣言
        team = new String[2];//長さが２の配列を作成しteamへ代入
        team[0] = "戦士";
        team[1] = "忍者";
        System.out.println(team[num + 1]);
        //System.out.println(team[1]);
        team[1] = "侍";
        System.out.println(team[1]);
    }

}
