/*
 * Assignment - 31 : 2nd Dec'2024 [15 mins]

return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2
 */

package mayur.ascii;

public class Assignment31 {
	
	int getDiffOfSum(String str) {
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int i = 0; i < str.length();i++) {
			if ((Character.isDigit(str.charAt(i))) && ((Character.getNumericValue(str.charAt(i)))%2 == 0)){
				sumEven = sumEven + Character.getNumericValue(str.charAt(i));
			}
		}
		for (int i = 0; i < str.length();i++) {
			if ((Character.isDigit(str.charAt(i))) && ((Character.getNumericValue(str.charAt(i)))%2 != 0)){
				sumOdd = sumOdd + Character.getNumericValue(str.charAt(i));
			}
		}
		int diff = sumOdd - sumEven;
		return diff;
	}
	
	public static void main(String[] args) {
		Assignment31 a31 = new Assignment31();
		System.out.println(a31.getDiffOfSum("te1ch2no3cre7dits"));
		System.out.println(a31.getDiffOfSum("4563"));
	}
}
