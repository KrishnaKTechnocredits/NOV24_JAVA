package anuja.string;

/*Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]
 "Te4c_hno Credi3ts"*/
public class Assignment23 {	
	public static String getCountOfAlphabetSPaceDigitSpeicalChar(String str) {
		int upperCount = 0;
		int lowerCount = 0; 
		int digitCount = 0;
		int spaceCount = 0;
		int speicalCharCount = 0;	
		int stringLength = str.length();
		
		for(int index = 0 ; index< stringLength; index++ ) {
			char ch = str.charAt(index);
			
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
					upperCount++;
				}
				else {
					lowerCount++;
				}	
			}//end of 1st if
			else if(Character.isDigit(ch)) {
				digitCount++;
			}
			else if(ch == ' ') {
				spaceCount++;
			}
			else {
				speicalCharCount++;
			}//end of nested if else statement.
			
			}//end of for loop.
		return " Numberf of Uppercase char-> " +upperCount+"\n Lowercase-> "+lowerCount+"\n Digits-> " + digitCount +
	             
	      "\n Spaces-> " + spaceCount +
	       "\n Special Characters-> " + speicalCharCount;
		}//end of method
	
	public static void main(String[] args) {
		String result =  getCountOfAlphabetSPaceDigitSpeicalChar("Te4c_hno Credi3ts");
		System.out.print(result);
		
	}
}