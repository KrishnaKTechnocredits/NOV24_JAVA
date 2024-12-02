/*Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18*/

package sindhu.AsciiPractice;

public class Assignment25 {
	//int sum;
	void sumOfDigits(String str) {  
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				sum = sum+digit;
			}
		}
		System.out.println("Sum of all the digits present in given string is "+sum);
	}
	
	public static void main(String[] args) {
		Assignment25 assign25= new Assignment25();
		String strng = "te1ch2no3cre7dits";
		assign25.sumOfDigits(strng);
		
		strng = "techno";
		assign25.sumOfDigits(strng);
		
		strng = "4563";
		assign25.sumOfDigits(strng);
	}
}
