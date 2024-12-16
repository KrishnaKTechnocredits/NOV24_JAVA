package sachinarray;

public class Assignment46 {


	    void getMiddleChar() {
	        String[] names = {"Rohan", "Premlata", "Anuja", "Fazrana"};
	        
	        for (int index = 0; index < names.length; index++) {
	            String name = names[index];
	            int len = name.length();
	            
	            // Find and print the middle character(s)
	            if (len % 2 == 0) {
	                // If length is even, print the two middle characters
	                char m = name.charAt(len / 2 - 1);
	             //   char m1 = name.charAt(len / 2);
	                System.out.println(name + " --> " + m );
	            } else {
	                // If length is odd, print the single middle character
	                char middle = name.charAt(len / 2);
	                System.out.println(name + " --> " + middle);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Assignment46 assignment = new Assignment46();
	        assignment.getMiddleChar();
	    }
	}




			
		   
		   


