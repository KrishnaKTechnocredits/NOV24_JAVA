//Assignment - 23 : 26th Nov'2024 [30 mins]
//
//Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]
//
//Input : "Te4c_hno Credi3ts"
//Output : uppercase -> 2
//lowercase -> 11
//digit -> 2
//space -> 1
//special char -> 1

package harshada.string;

public class StringAss5 {
	int upperCnt, lowerCnt, digitCnt, spaceCnt, specailCharCnt;

	void findDiffCountInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					upperCnt++;
				else
					lowerCnt++;
			} else if (Character.isDigit(ch)) {
				digitCnt++;
			} else if (ch == ' ') {
				spaceCnt++;
			} else {
				specailCharCnt++;
			}
		}
	}

	public static void main(String[] args) {
		StringAss5 stringAss5 = new StringAss5();
		stringAss5.findDiffCountInString("Te4c_hno Credi3ts");
		System.out.println("uppercase -> " + stringAss5.upperCnt);
		System.out.println("lowercase -> " + stringAss5.lowerCnt);
		System.out.println("digit -> " + stringAss5.digitCnt);
		System.out.println("space -> " + stringAss5.spaceCnt);
		System.out.println("special char -> " + stringAss5.specailCharCnt);
	}
}
