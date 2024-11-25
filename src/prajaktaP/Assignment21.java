package prajaktaP;

public class Assignment21 {
	    static void calculateLengthAndSpaces(String input) {
	        int totalLength = input.length(); 
	        int spaceCount = 0;              
	        for (int i = 0; i < totalLength; i++) {
	            if (input.charAt(i) == ' ') {
	                spaceCount++; 
	            }
	        }

	        int lengthWithoutSpaces = totalLength - spaceCount; 
	        System.out.println("Length without space is " + lengthWithoutSpaces + " and space characters are " + spaceCount + ".");
	    }
	    public static void main(String[] args) {
	        String input = "prem lata gupta";
	        calculateLengthAndSpaces(input);
	    }
	}


//Find the length of the given string excluding space. 
//input : prem lata gupta
//output : length without space is 13 and space characters are 2. 
