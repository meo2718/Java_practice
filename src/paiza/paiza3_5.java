package paiza;
//年齢を1歳から100歳まで表示
public class paiza3_5 {
	public static void main(String[] args) {
        System.out.println("<select name='age'>");
        for(int i = 1; i<=10; i++) {
        System.out.println("<option>"+i+"歳</option>");
        }
        System.out.println("</select>");
    }
}
