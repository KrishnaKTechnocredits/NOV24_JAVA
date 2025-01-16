/*Assignment - 23 : 26th Nov'2024 [30 mins]

Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods.
 * */
package nitesh.string;

public class PrintUperLowerDigit {
	int ucount;
	int lcount;
	int dcount;
	int scount;
	int spacecount;

	void getDigitUpperLower(String str) {
		for(int num =0; num<=str.length()-1;num++) {
			if(Character.isLetter(str.charAt(num))) {
				if(Character.isUpperCase(str.charAt(num))) {
					ucount++;
				}
				else {
					lcount++;
				}
			}
			else if(Character.isDigit(str.charAt(num))) {
				dcount++;
			}
			else {
				if(str.charAt(num)==' ') {
					spacecount++;
				}
				else {
					scount++;
				}
			}
		}
		System.out.println(ucount);
		System.out.println(lcount);
		System.out.println(scount);
		System.out.println(spacecount);
	}
	public static void main(String[] args) {
		PrintUperLowerDigit printuperlowerdigit =new  PrintUperLowerDigit();
		printuperlowerdigit.getDigitUpperLower("Te4c_hno Credi3ts");
	}
}
