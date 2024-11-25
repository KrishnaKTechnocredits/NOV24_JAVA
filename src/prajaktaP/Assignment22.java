package prajaktaP;

public class Assignment22 {
	 
	int getTotalNumDigit(String str) {
	        int count = 0; 
	        for (int i = 0; i < str.length(); i++) {
	            boolean isStrDigit = Character.isDigit(str.charAt(i));
	            if (isStrDigit) {
	                count++; 
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Assignment22 assign22 = new Assignment22();
	        String input = "aa1kan33ks4h5a";
	        int digit = assign22.getTotalNumDigit(input);
	        System.out.println("Total " + digit + " digits are there in given input.");
	    }
	}




//write a method to return total number of digits from the given input.
//print the count in main method.
//input : aa1kan33ks4h5a
//output : total 5 digits are there in given input.
//Hint : boolean Character.isDigit(ch)
 












