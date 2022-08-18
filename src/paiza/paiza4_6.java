package paiza;
//ArrayListクラスを使う。ArrayListクラスは、
//配列の要素数を後から変更することができるなど便利な機能がある
import java.util.*;//arraylist宣言
public class paiza4_6 {
	public static void main(String[] args) {
        ArrayList<String> team = new ArrayList<String>();//arraylist宣言

        team.add("勇者");
        team.add("魔法使い");
        for (String member : team) {
            System.out.println(member);
        }
        System.out.println(team.get(0));//getメソッドで配列から個別にとりだす
        System.out.println(team.size());//sizeメソッドで配列のサイズを出力
        //要素を追加
  
        team.add("戦士");
        for (String member : team) {
            System.out.println(member);
        }
        System.out.println(team.size());
        
        team.set(1,"侍");//setメソッドでインデックス１の要素を侍に更新
        for (String member : team) {
            System.out.println(member);
        }
        System.out.println(team.size());
        
        team.remove(2);//removeメソッドでインデックス2の要素を削除
        for (String member : team) {
            System.out.println(member);
        }
        System.out.println(team.size());
    }
}
