package prajaktaP;

public class Assignment20 {
	static int getCharFreq(String str, char ch) {
	        int count = 0; 
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ch) {
	                count++; 
	            }
	        }
            return count;
	    }
		public static void main(String[] args) {
	        String input = "aakanskha";
	        char charToCount = 'a';
	        int frequency = getCharFreq(input, charToCount);
	        System.out.println("Count of '" + charToCount + "' in \"" + input + "\" is " + frequency + ".");
	    }
	}

//Find the given character count from given string. 
//input : aakanskha, a
//output : Count of a in aakanskha is 4.  		 
//hint : 
//int getCharFreq(String str, char ch){
     //return count;
