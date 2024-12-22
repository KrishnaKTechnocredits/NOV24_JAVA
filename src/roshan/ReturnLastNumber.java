package roshan;

public class ReturnLastNumber {
	 static int range(int endRange, int startRange) {
	        for (int num = endRange; num >= startRange; num--) {         //mistake made in loop grster than 
	            if (num % 5 == 0) {
	                    return num;
	               
	                }          
	            }
				return 0;
	 }				
				public static void main(String[] args) {
					System.out.println("In given range last number which is divisable by 5 is " + ReturnLastNumber.range(498,10));
					
	    }
}





/*
 * On user defined range print return the last numbers which is divisible by 5
 * and print the answer in main method. int getLastDivNumber(int startIndex, int
 * endIndex){} Hint : pass start and end index as a parameter. Input : Range ->
 * 10 to 498 Output : 495 is the last number which is div by 5 in the given
 * range
 */