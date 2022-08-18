package paiza;
//条件によるくり返し処理1 - while
public class paiza3_1 {
	public static void main(String[] args) {
        int i =0;// カウンタ変数の初期化
        while (i<=10) {
            System.out.println("meo"+i);// 繰り返し処理
            i=i+1;// カウンタ変数の更新
        }
        System.out.println("last"+i);
    }
}
