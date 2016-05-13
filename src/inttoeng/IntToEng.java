package inttoeng;
import java.util.Scanner;
import java.util.ArrayList;
public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	ArrayList<String> eng = new ArrayList<String>();
    	eng.add("zero");
    	eng.add("one");
    	eng.add("two");
    	eng.add("three");
    	eng.add("four");
    	eng.add("five");
    	eng.add("six");
    	eng.add("seven");
    	eng.add("eight");
    	eng.add("nine");
    	eng.add("ten");
    	eng.add("eleven");
    	eng.add("");
    	eng.add("");
    	eng.add("");
    	eng.add("");
    	eng.add("");
    	
    	
        return "";
    }
}
