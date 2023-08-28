package StreamsEntity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class test3 {
	private static final DecimalFormat df=new DecimalFormat("0.000000");
	public static void main(String[] args) {
		
		List<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		//System.out.println(arr.get(0));
		
		//plusMinus(arr);
		miniMaxSum(arr);
		String S="santhosh";
		System.out.println(S.substring(S.length()-2));
		
		String hours=timeConversion("06:40:03AM");
		System.out.println(hours);
	}
	
	public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	        double negativeCount=0;
	        double positiveCount=0;
	        double zeroCount=0;
	        
	        for(Integer list:arr){
	            if(list<0){
	                negativeCount++;
	            }else if(list>0){
	                positiveCount++;
	            }else{
	                zeroCount++;
	            }
	        }

	        System.out.println(df.format(positiveCount/arr.size()));
	        System.out.println(df.format(negativeCount/arr.size()));
	        System.out.println(df.format(zeroCount/arr.size()));
	    }
	
	public static void miniMaxSum(List<Integer> arr) {
	    Integer sum=0;
	    Integer max=arr.get(0);
	    for(Integer i:arr){
	        sum=sum+i;
	        if(max<i){
	            max=i;
	        }
	    }
	        System.out.println((sum-max)+" "+sum);
	    }
	
	public static String timeConversion(String s) {
	    // Write your code here
	    String Modified = null;
	    System.out.println(s.substring(s.length()-2));
	    if(s.substring(s.length()-2).equals("PM")){
	        int hours=Integer.parseInt(s.substring(0, 2));
	        if(hours==12){
	            Modified="00";
	        }else{
	            Modified=String.valueOf(hours+12);
	        }
	        
	    }
	    if(s.substring(s.length()-2).equals("AM")){
	        int hours=Integer.parseInt(s.substring(0, 2));
	        if(hours==12){ 
	            Modified="00";
	        }else{
	            Modified=String.valueOf(hours);
	        }
	    }
	    String finalS= Modified+s.substring(2, 8);
	    return finalS;

	    }

}
