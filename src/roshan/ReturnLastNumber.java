package roshan;

public class ReturnLastNumber {
	 static int range(int endRange, int startRange) {
                int count=0;
	        for (int num = endRange; num >= startRange; num--) {         //mistake mide in loop grster than 
	            if (num % 5 == 0) {
	            	count++;
	            	if (count==1){
	                    return num;
	            	}
	               
	                }          
	            }
				return 0;
	 }				
				public static void main(String[] args) {
					System.out.println(ReturnLastNumber.range(100, 1));
					
	    }
}
