package paiza;
//拡張for文で配列を出力する
public class paiza4_5 {
	public static void main(String[] args) {
        String[] team = {"勇者", "戦士", "魔法使い","忍者"};
        System.out.println(team.length);//配列の長さをしらべる
        //teamの配列から１つずつ要素をとりだしてmemberへ代入し出力
	for (String member : team) {
	    System.out.println(member);
	    }
    }
}
