package inttoeng;
import java.util.Scanner;
import java.util.ArrayList;
public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        ArrayList<String> oneList = new ArrayList<String>();//１の位
    	ArrayList<String> tenList = new ArrayList<String>();//10の位

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
    
    	if(n>=0 && n<20){//0から20まで
    		e = oneList.get(n);
    	}else if(n>=21 && n<=99){//21から99まで
    		int onePlace = n % 10;//1の位
    		int tenPlace = divide(n,10);
    		if(onePlace==0){
    			e = tenList.get(tenPlace);
    		}else{
    		e = tenList.get(tenPlace) + " " + oneList.get(onePlace);
    		}	
    	}else if(n>=100 && n<=999){//100から999まで
    		int hundredPlace = divide(n,100);
    		int hundredRemainder = n % 100;//100で割った余り
    		int onePlace = hundredRemainder % 10;
    		int tenPlace = divide(hundredRemainder,10);
    		if(onePlace==0){
    			e = oneList.get(hundredPlace) + " hundred";
    		}else{
    		e = oneList.get(hundredPlace) + " hundred " + tenList.get(tenPlace) + " " + oneList.get(onePlace);
    		}
    	
    	}else{
    		
    		int thousandPlace = divide(n,1000);//1000の位
    		int thousandRemainder = n % 1000;//100で割った余り
    		int hundredPlace =divide(thousandRemainder,100);
    		int hundredRemainder = thousandRemainder % 100;
    		int onePlace = hundredRemainder % 10;
    		int tenPlace = divide(hundredRemainder,10);
    		if(thousandRemainder==0){
    			e = oneList.get(thousandPlace)+" thousand";
    		}else if(thousandPlace == 1 && hundredPlace >=1){
    			int teenhundred = divide(n,100);
    			int teenhundredRemainder = n % 100;
    			e = oneList.get(teenhundred) + " hundred "+tenList.get(tenPlace) + " " + oneList.get(onePlace);
    		}else{
    			e = tenList.get(thousandPlace) + " "+oneList.get(hundredPlace)+" hundred "+tenList.get(tenPlace) + " " + oneList.get(onePlace);
    		}
    	}
        return e;
    }
    public static int divide(int h,int d){
    	int divided = h / d;
    	return divided;
    }
}
