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
    	int onePlace=0;
    	int tenPlace=0;
    	int hundredPlace=0;
    	int hundredRemainder=0;
    	int thousandPlace=0;
    	int thousandRemainder=0;
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
    	oneList.add("seventeen");
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
    		onePlace = remainder(n,10);//1の位
    		tenPlace = divide(n,10);
    		if(onePlace==0){
    			e = tenList.get(tenPlace);
    		}else{
    		e = tenList.get(tenPlace) + " " + oneList.get(onePlace);
    		}	
    	}else if(n>=100 && n<=999){//100から999まで
    		hundredPlace = divide(n,100);
    		hundredRemainder = remainder(n,100);
    		onePlace = remainder(hundredRemainder,10);
    		tenPlace = divide(hundredRemainder,10);
    		if(onePlace==0 && tenPlace==0){
    			e = oneList.get(hundredPlace) + " hundred";
    		}else if(tenPlace==0){
    			e = oneList.get(hundredPlace) + " hundred " + oneList.get(onePlace);
    		}else if(tenPlace==1){
    			e = oneList.get(hundredPlace) + " hundred " + oneList.get(hundredRemainder);
    		}else if(onePlace==0){
    			e = oneList.get(hundredPlace) + " hundred " + tenList.get(tenPlace);
    		}else{
    		e = oneList.get(hundredPlace) + " hundred " + tenList.get(tenPlace) + " " + oneList.get(onePlace);
    		}
    	
    	}else{
    		
    		thousandPlace = divide(n,1000);//1000の位
    		thousandRemainder = remainder(n,1000);
    		hundredPlace =divide(thousandRemainder,100);
    		hundredRemainder = remainder(thousandRemainder,100);
    		onePlace = remainder(hundredRemainder,10);
    		tenPlace = divide(hundredRemainder,10);
    		if(thousandRemainder==0){
    			e = oneList.get(thousandPlace)+" thousand";
    		}else if(thousandPlace == 1 && hundredPlace >=1){
    			int teenhundred = divide(n,100);
    			int teenhundrerRemainder = remainder(n,100);
    			e = oneList.get(teenhundred) + " hundred "+tenList.get(tenPlace) + " " + oneList.get(onePlace);
    		}else{
    			e = tenList.get(thousandPlace) + " "+oneList.get(hundredPlace)+" hundred "+tenList.get(tenPlace) + " " + oneList.get(onePlace);
    		}
    	}
        return e;
    }
    //割り算をするメソッド
    public static int divide(int h,int d){
    	return h/d;
    }
    //余りを計算するメソッド
    public static int remainder(int h,int r){
    	return h%r;
    }
}
