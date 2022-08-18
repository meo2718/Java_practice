package paiza;

public class paiza3_3 {
	public static void main(String[] args) {
        int hp =30;
        int hit;// カウンタ変数の初期化,初期値の0からスタート
        while (hp>0) {
        	hit = (int)(Math.random()*10+1);//1~10までランダム
            System.out.println("meoは"+hit+"のダメージを与えた");
            hp-=hit;// 1~10までランダムで出した値をhpからマイナスさせ0になるまで繰り返す
        }
        System.out.println("meoは力尽きた");
    }

}

//+=	a += 1	a変数の値を1増加させる。	a = a + 1と同じ
//-=	a -= 1	a変数の値を1減少させる。	a = a - 1と同じ