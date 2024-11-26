//Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]
//
//Input : "Te4c_hno Credi3ts"
//Output : uppercase -> 2
//lowercase -> 11
//digit -> 2
//space -> 1
//special char -> 1
//
//Hint : use Character class static methods.
package fazrana.string;

public class FAssignment23 {
	
	int upperCaseCount;
	int lowerCaseCount;
	int digitCount;
	int spaceCount;
	int specialCount;
	
	void getCount(String srt) {
		for (int i=0;i< srt.length();i++) {
			char cr= srt.charAt(i);
			if (Character.isLetter(cr)==true) {
				if(Character.isUpperCase(cr)==true) {
					upperCaseCount++;
				}else {
					lowerCaseCount++;
				}
			}else if(Character.isDigit(cr)==true) {
				digitCount++;
			}else if(cr==' ') {
				spaceCount++;
			}else {
				specialCount++;
			}		
		}
		System.out.println("Uppercase: "+upperCaseCount);
		System.out.println("Lowercase: "+lowerCaseCount);
		System.out.println("Digit: "+digitCount);
		System.out.println("Space: "+spaceCount);
		System.out.println("Special Character: "+specialCount);
	}
	
	public static void main(String[] args) {
		FAssignment23 fassignment23=new FAssignment23();
		fassignment23.getCount("Te4c_hno Credi3ts");
	}
}
