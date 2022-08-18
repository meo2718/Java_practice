package paiza;

public class paiza5_4 {
	public static void main(String[] args) {
        String[][] teams = {{"勇者", "戦士", "魔法使い"}, {"盗賊", "忍者", "商人"}, {"スライム", "ドラゴン", "魔王"}};
//最初のインデックスを０から配列の要素数分だけ出力
        for (int i = 0; i < teams.length; i++) {
        	//2番めのインデックスを0から配列の要素数分だけ出力
            for(int j = 0;  j < teams[i].length; j++) {
                System.out.print(teams[i][j] + " ");
            }
            System.out.println("");
            System.out.println("---");
        }
	}
}
