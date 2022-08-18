package paiza;

public class paiza5_3 {
	public static void main(String[] args) {
		//String[] teamC = {"勇者", "戦士", "魔法使い"};
        //String[] teamD = {"盗賊", "忍者", "商人"};
        //String[] teamE = {"スライム", "ドラゴン", "魔王"};
        
        //String[][] teams = {teamC, teamD, teamE};
		//2次元配列を直接作成
        String[][] teams = {{"勇者", "戦士", "魔法使い"}, {"盗賊", "忍者", "商人"}, {"スライム", "ドラゴン", "魔王"}};
        System.out.println(teams[2][0]);
        System.out.println(teams[2][1]);
        System.out.println(teams[2][2]);
        
        teams[0][0] = "魔導士";

        System.out.println(teams[0][0]);
        System.out.println(teams[0][1]);
        System.out.println(teams[0][2]);
        
        System.out.println(teams.length);//teams配列は要素が3つある
        System.out.println(teams[0].length);//teams要素のインデックス0の要素である配列は要素が3つある

	}

}
