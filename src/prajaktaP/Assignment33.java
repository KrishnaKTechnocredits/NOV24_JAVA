package prajaktaP;

public class Assignment33 {
	
		public static void main(String[] args) {
	        String input = "AABcBBBAdeddd";
	        int[] frequency = new int[26]; // Array to store frequencies of A-Z

	        // Iterate through each character in the string
	        for (char ch : input.toCharArray()) {
	            if (Character.isUpperCase(ch)) { // Check if the character is uppercase
	                frequency[ch - 'A']++; // Increment the corresponding index
	            }
	        }

	        // Print the results
	        for (int i = 0; i < frequency.length; i++) {
	            if (frequency[i] > 0) { // Print only characters that appear
	                System.out.println((char) (i + 'A') + " -> " + frequency[i]);
	            }
	        }
	    }
	}


//print the frequency of uppercase characters.
//input : AABcBBBAdeddd
//output : 
//A -> 3
//B -> 4