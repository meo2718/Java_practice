package testpack;

public class saikoro {
	public static void main(String[] args) {
		double rand = Math.random() * 100 + 1;
		//rand変数をdouble型で定義、1から101までのランダムな数
		System.out.println(rand);
		//randを出力する
		int number = (int)rand;
		//小数点以下をとるにはrand変数の値を整数に変換してnumber変数へ代入する
		//System.out.println(number);
		System.out.println("meoは" + number + "ダメージ受けた");
		//小数点以下を切り捨てた値がでる
	}
}
//ランダムメソッドMath.random() ：0から1までのランダムな数値を出力する
//System.out.println(data) ：指定したデータを出力する（改行あり）
//System.out.print(data) ：指定したデータを出力する（改行なし）
//double型は、小数点以下の数値を扱うことのできるデータ型
//double型のデータをint型のデータにする際には小数点以下が切り捨てられる
//rand変数の値を整数に変換してnumber変数へ代入する
//double型のrandのデータをint型の整数へ変換してnumber変数へ代入してる
