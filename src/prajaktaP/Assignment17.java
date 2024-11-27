package prajaktaP;
public class Assignment17 {
	
	static int getLastDivNumber(int startIndex, int endIndex) {
	        for (int num = endIndex; num >= startIndex; num--) {
	           if (num % 5 == 0) {
	                return num; 
	            }
	        }
	        return -1; 
	    }

	    
	    public static void main(String[] args) {
	        int start = 10;
	        int end = 498;
            int lastDivisibleNumber = getLastDivNumber(start, end);
            if (lastDivisibleNumber != -1) {
	            System.out.println(lastDivisibleNumber + " is the last number divisible by 5 in the given range.");
	        } 
            else 
	        {
	            System.out.println("No number in the given range is divisible by 5.");
	        }
	    }
	}
