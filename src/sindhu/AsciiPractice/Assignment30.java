/*Sum of all the even digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 2

input : "techno"
output : 0

input : "4563"
output : 10*/

package sindhu.AsciiPractice;

public class Assignment30 {
	
	void getSumOfEvenDigits(String str) {
		int evenSum=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				if(digit%2==0) {
					evenSum= evenSum+digit;
				}
			}
		}
		System.out.println("The sum of even numbers present in "+str+" is "+evenSum);
	}
	
	
	public static void main(String[] args) {
		Assignment30 assign30= new Assignment30();
		String strng = "te1ch2no3cre7dits";
		assign30.getSumOfEvenDigits(strng);
		
		strng = "techno";
		assign30.getSumOfEvenDigits(strng);
		
		strng = "4563";
		assign30.getSumOfEvenDigits(strng);
	}
}
