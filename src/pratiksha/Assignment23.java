package pratiksha;

public class Assignment23 {
/*
 Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1 */
	
	void displayCharacters(String str) {
		int uCount=0 , sCount= 0,lCount=0, dCount=0,specialCount =0;
		
		for(int i=0;i< str.length();i++) {
			char ch =str.charAt(i);
			
			if(Character.isLetter(ch)) {
				
				if(Character.isUpperCase(ch)) {
					uCount++;
				}else {
					lCount++;
				}
			}else if (Character.isDigit(ch)) {
				dCount++;
			}else if (ch == ' ') {
				sCount++;
			}else {
				specialCount++;
			}
			
		}
		System.out.println("uppercase-->" + uCount);
		System.out.println("lowerCase-->" +lCount);
		System.out.println("Digit count-->" +dCount);
		System.out.println("Space count--> " +sCount);
		System.out.println("Special character --> " +specialCount);
	}
	public static void main(String[] args) {
		
		Assignment23 assign23= new Assignment23();
		assign23.displayCharacters("Te4c_hno Credi3ts");
	}
}
