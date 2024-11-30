package kavita;

/*Print count of uppercase, lowercase, digit, space and special characters in given input string.
"Te4c_hno Credi3ts"*Time: 25m*/

public class Assignment23 {
	void printChar(String str) {
		int uCount=0;
		int lCount=0;
		int dCount=0;
		int sCount=0;
		int spCunt=0;
		int index=0;
		int stringLength=str.length();
		for(index=0;index<stringLength;index++) {
			char ch=str.charAt(index);
			
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
				uCount++;
				}
				else{ 
				lCount++;
				}
			}
		
			else if(Character.isDigit(ch)) {
				dCount++;
			}
			else if(Character.isWhitespace(ch)) {
				sCount++;
			}
			else {
				spCunt++;
			}
		}
		System.out.println("Upper case count is "+uCount);
		System.out.println("Lower case count is "+lCount);
		System.out.println("Digit count is "+dCount);
		System.out.println("Spaces count is "+sCount);
		System.out.println("Specialcharacter count is "+spCunt);
	}
	
	public static void main(String[] args) {
		Assignment23 assignment23=new Assignment23();
		assignment23.printChar("Te4c_hno Credi3ts");
	}
}
