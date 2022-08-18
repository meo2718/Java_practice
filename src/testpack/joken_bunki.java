package testpack;
//if文による条件分岐
public class joken_bunki {
	public static void main(String[] args) {
		int time = 14;
		if (time < 12) {
			System.out.println("午前中");
		} else if (time == 12) {
			System.out.println("正午");
		} else if (time > 12){
			System.out.println("午後");
		}
	}
}
//もしtimeが12より小さかったら、午前中と表示
//12と等しかったら、正午と表示
//12より大きかったら、午後と表示

//a < b	    a が b よりも小さい	10 < 15
//a > b	    a が b よりも大きい	10 > 7
//a <= b	a が b 以下である	10 <= 15
//a >= b	a が b 以上である	10 >= 7
//a != b    a と b が等しくない 10 != 1