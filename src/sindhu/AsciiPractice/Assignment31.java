/*return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2	*/

package sindhu.AsciiPractice;

public class Assignment31 {
	
	int getDiffFromEvenOdd(String str) {
		int evenSum=0;
		int oddSum=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				if(digit%2==0) {
					evenSum= evenSum+digit;
				}else {
					oddSum=oddSum+digit;
				}
			}
		}
		return oddSum-evenSum;
	}
	
	public static void main(String[] args) {
		Assignment31 assign31= new Assignment31();
		String strng = "te1ch2no3cre7dits";
		int output=assign31.getDiffFromEvenOdd(strng);
		System.out.println("The difference of even and odd in String "+strng+" is "+output);
		
		strng = "4563";
		int output1=assign31.getDiffFromEvenOdd(strng);
		System.out.println("The difference of even and odd in String "+strng+" is "+output1);
	}

}
