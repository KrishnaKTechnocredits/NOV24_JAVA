//Assignment - 25 : 2nd Dec'2024 [20 mins]
//
//Sum of all the digits present in a given String. 
//
//input : "te1ch2no3cre7dits"
//output : 13
//
//input : "techno"
//output : 0
//
//input : "4563"
//output : 18

package fazrana.ascii;

public class FAssignment25 {

	void sumOfDigit(String str) {
		int sum=0;
		for (int i=0;i<str.length();i++) {
			char cr= str.charAt(i);
			if (Character.isDigit(cr)) {
				int characterValue=Character.getNumericValue(cr);
				sum=sum+ characterValue;
			}
		}
		System.out.println("Sum of numbers are "+sum);	
	}
	
	public static void main(String[] args) {
		FAssignment25 fassignment25=new FAssignment25();
		fassignment25.sumOfDigit("te1ch2no3cre7dits");
		fassignment25.sumOfDigit("techno");
		fassignment25.sumOfDigit("4563");
	}
}
