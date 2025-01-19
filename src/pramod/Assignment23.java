/*Assignment - 23 : 26th Nov'2024 [30 mins]

Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods. */

package pramod;
class Assignment23 {
	int uCase=0;
	int lCase=0;
	int digit=0;
	int space=0;
	void getCases(String str) {
		for (int index=0;index<str.length();index++) {
			Character ch = str.charAt(index);
				if(ch==' ') {
				    space++;
				}else if(Character.isDigit(ch)) {
				    digit++;
				}else if(Character.isUpperCase(ch)) {
				    uCase++;
				}else if(Character.isLowerCase(ch)) {
				    lCase++;
				}
		}
		System.out.println("Orignal string is: " + str);
		System.out.println("Upper case count is: " + uCase);
		System.out.println("Lower case count is: " + lCase);
		System.out.println("Digit case count is: " + digit);
		System.out.println("Space case count is: " + space);
	}
	
	public static void main(String[] args) {
		Assignment23 st = new Assignment23();
		st.getCases("TechNo1 Classes2");
	}
}