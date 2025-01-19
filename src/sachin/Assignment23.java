package sachin;


public class Assignment23 {

		//Input : "Te4c_hno Credi3ts"
		//Output : uppercase -> 2
		//lowercase -> 11
		//digit -> 2
		//space -> 1
		//special char -> 1

		//Hint : use Character class static methods.
	
		
	

	    void getCount(String name) {
	        int ucount = 0;
	        int lcount = 0;
	        int dcount = 0;
	        int spacecount = 0;
	        int specialcount=0;
       
	        // Loop through each character in the string
	        for (int index = 0; index < name.length(); index++) {
	            char ch = name.charAt(index);

	            // Check if character is a letter
	            if (Character.isLetter(ch)) {
	                if (Character.isUpperCase(ch)) {
	                    ucount++; // Count uppercase letters
	                } else {
	                    lcount++; // Count lowercase letters
	                }
	            } 
	            // Check if character is a digit
	            else if (Character.isDigit(ch)) {
	                dcount++; // Count digits
	            } 
	            // Else, it must be a special character
	            else if(ch==' '){
	            	
	                spacecount++;// Count special characters
	                
	            }else {
	            	
	            	specialcount++;
	            }
	            
	        }

	        // Output the counts
	        System.out.println("Upper count is: " + ucount);
	        System.out.println("Lower count is: " + lcount);
	        System.out.println("Digit count is: " + dcount);
	        System.out.println("Space count is: " + spacecount);
	        System.out.println("Special count is: " + specialcount);
	    }

	    public static void main(String[] args) {
	        // Directly call the static method from main
	        Assignment23 assignment23 = new Assignment23();
	        assignment23.getCount("Te4c_hno Credi3ts");
	    }}

