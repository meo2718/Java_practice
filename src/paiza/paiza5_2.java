package paiza;
//2次元配列を作成する
public class paiza5_2 {
	public static void main(String[] args) {
		String[] teamC = {"勇者", "戦士", "魔法使い"};
        String[] teamD = {"盗賊", "忍者", "商人"};
        String[] teamE = {"スライム", "ドラゴン", "魔王"};
        
        String[][] teams = {teamC, teamD, teamE};
        System.out.println(teams[2][0]);
        System.out.println(teams[2][1]);
        System.out.println(teams[2][2]);

	}

}
