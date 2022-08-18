package paiza;
//Javaのfor命令と配列を組み合わせる
public class paiza4_4 {
	public static void main(String[] args) {
        String[] team = {"勇者", "戦士", "魔法使い","忍者"};
        System.out.println(team.length);//配列の長さをしらべる
        //0からその配列の長さまで1ずつ出力
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i]);
        }
    }
}
