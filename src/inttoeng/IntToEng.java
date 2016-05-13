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
    	ArrayList<String> oneList = new ArrayList<String>();//１の位
    	ArrayList<String> tenList = new ArrayList<String>();//10の位
    	
    	String e = "";
    	//1の位の配列
    	oneList.add("zero");
    	oneList.add("one");
    	oneList.add("two");
    	oneList.add("three");
    	oneList.add("four");
    	oneList.add("five");
    	oneList.add("six");
    	oneList.add("seven");
    	oneList.add("eight");
    	oneList.add("nine");
    	oneList.add("ten");
    	oneList.add("eleven");
    	oneList.add("twelve");
    	oneList.add("thirteen");
    	oneList.add("fourteen");
    	oneList.add("fifteen");
    	oneList.add("sixteen");
    	oneList.add("eightteen");
    	oneList.add("nineteen");
    	
    	//10の位の配列
    	tenList.add("");
    	tenList.add("");
    	tenList.add("twenty");
    	tenList.add("thirty");
    	tenList.add("forty");
    	tenList.add("fifty");
    	tenList.add("sixty");
    	tenList.add("seventy");
    	tenList.add("eighty");
    	tenList.add("ninety");
    
    	if(n>=0 && n<20){
    		e = oneList.get(n);
    	}else{
    		int oneP = n % 10;
    		int tenP = n / 10;
    		if(oneP==0){
    			e = tenList.get(tenP);
    		}else{
    		e = tenList.get(tenP) + " " + oneList.get(oneP);
    		}
    	}
        return e;
    }
}
