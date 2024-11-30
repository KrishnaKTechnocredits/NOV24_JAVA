package prajaktaP;

public class Assignment19 {
	static void printReverseCharacters(String input) {
	        for (int i = input.length() - 1; i >= 0; i--) {
	            System.out.println(input.charAt(i)); 
	        }
	    }
	
     public static void main(String[] args) {
	        String input = "te ch3no";
            printReverseCharacters(input);
	    }
	}



//Print all the characters of given string in reverse order. 
//input :te ch3no
//output : o
         //n
         //3
         //h
         //c
		 
         //e 
         //t 	